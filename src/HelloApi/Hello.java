package HelloApi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    
    double Tambah (double num1,double num2) throws RemoteException;
    double Kurang (double num1,double num2) throws RemoteException;
    double Kali (double num1,double num2) throws RemoteException;
    double Bagi (double num1,double num2) throws RemoteException;
}
