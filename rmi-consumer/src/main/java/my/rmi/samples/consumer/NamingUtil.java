package my.rmi.samples.consumer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class NamingUtil {
    private static int    port = 2020;
    private static String ip   = "127.0.0.1";

    public static Remote lookup(Class<?> service) throws MalformedURLException, RemoteException, NotBoundException {
        return  Naming.lookup(String.format("rmi://%s:%d/%s", ip, port, service.getName()));
    }
}
