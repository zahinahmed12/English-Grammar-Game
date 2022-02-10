package sample;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;



public class Client implements Runnable {
    Thread t;
    public ObjectInputStream ois;
    public ObjectOutputStream oos;

    Client(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        try {
            Socket s = new Socket("127.0.0.1", 33333);
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());
        }catch(Exception e){
            System.out.println(e);
        }

    }
}

