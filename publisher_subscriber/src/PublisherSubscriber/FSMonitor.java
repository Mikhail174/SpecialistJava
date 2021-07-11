
package PublisherSubscriber;


public interface FSMonitor {
    
    static final int CREATE = 1;
    static final int REMOVE =2;
    
    void event(String fname,int kind); // имя файла и код события
    
}
