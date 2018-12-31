package helloserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainSever {
    public static void main(String[] args) throws RemoteException {
        Registry server = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        
        HelloServer hello = new HelloServer();
        server.rebind("hello", hello);
        
        System.err.println("Server Telah berjalan");
        
    }
    
}
