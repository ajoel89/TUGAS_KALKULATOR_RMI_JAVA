package helloclient;

import HelloApi.Hello;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class HelloClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        
        String host = JOptionPane.showInputDialog(null,"Host Server : ","input Host Server", 
                JOptionPane.QUESTION_MESSAGE);
        Registry registry = LocateRegistry.getRegistry(host, Registry.REGISTRY_PORT);
        
        Hello hello = (Hello) registry.lookup("hello");
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Form form = new Form(hello);
                form.setVisible(true);
            }
        });
        
    }
    
}
