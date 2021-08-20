public class publisher_subscriber {
    
    public static void main(String[] args) {
        
        FSServer server = new FSServer(".");
        server.addClient(new FSMonitor () {
            @Override
            public void event(String fname, int kind) {
                switch(kind) {
                    case FSMonitor.CREATE: System.out.println("File created "+ fname);
                        break;
                    case FSMonitor.REMOVE: System.out.println("File removed "+fname);
                        break;
                    default: System.out.println("Unknown event!");
                }
            }
        });
        server.start();
 
    }
    
}
