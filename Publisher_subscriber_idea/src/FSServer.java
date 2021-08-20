import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FSServer {
    
    private String dir; // дирректория
    private ArrayList<FSMonitor> clients;   // список клиентов
    private volatile boolean canWork;

    public FSServer(String dir) {
        this.dir = dir;
        clients = new ArrayList<>();
    }
    
    public void addClient (FSMonitor client) {
        clients.add(client);
    }
    
    public void removeClient (FSMonitor client) {
        clients.remove(client);
    } 
    
     public void start () {
     canWork = true;
     run (); // переделать на запуск потока
     
        
    }
     public void  stop () {
     canWork = false;
    }
    
    public void run () {
    
        try {
        WatchService watch = FileSystems.getDefault().newWatchService();
        Paths.get(dir).register(watch, 
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE);
        
        while (canWork) {
            WatchKey key = watch.take(); //interrupted exception потому что take - блокирующий метод
            for (WatchEvent event :key.pollEvents()) {
                String fName = event.context().toString();      //METAДАННЫЕ - данные о данных, Context - данные вокруг данных (то, что данные сопровождает, дополнительные данные)
                                                                // что является контекстом события? - файл, с которым это событие произошло
                                                                //toString() сам по себе вызывается только в println
                int kind = 0;
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE)
                    kind = FSMonitor.CREATE;
                else kind = FSMonitor.REMOVE;

                for (FSMonitor client : clients) {
                    client.event(fName, kind);
                }
                
                        
            
                };
                key.reset();
             }
        watch.close();
        
        
        
        } catch (IOException ex) {
        
        //...
        } catch (InterruptedException ex) {
        // ...
        }
    }
   
    
    
    
}
