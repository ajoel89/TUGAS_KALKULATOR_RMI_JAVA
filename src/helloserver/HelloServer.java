package helloserver;

import HelloApi.Hello;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements Hello{

    public HelloServer() throws RemoteException {
    }

    @Override
    public double Tambah(double num1, double num2) throws RemoteException {
        return num1+num2;
    }

    @Override
    public double Kurang(double num1, double num2) throws RemoteException {
        return num1-num2;
    }

    @Override
    public double Kali(double num1, double num2) throws RemoteException {
        return num1*num2;
    }

    @Override
    public double Bagi(double num1, double num2) throws RemoteException {
        return num1/num2;
    }
    
    
    
}
