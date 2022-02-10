package sample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;


class Server extends Thread{
    HashMap<String, Integer> hash = new HashMap<>();
    private ServerSocket serverSocket;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    int score[] = new int[4];
    int totalScore = 0;
    private static String INPUT_FILE_NAME = "users.txt";
    Socket s=null;

    public Server(Socket s){
        this.s=s;
    }

    public void run(){
        try {
            //ServerSocket ss = new ServerSocket(33333);

            while (true) {
                //Socket s = ss.accept();
                oos = new ObjectOutputStream(s.getOutputStream());
                ois = new ObjectInputStream(s.getInputStream());
                while (true) {
                    String sr = (String) ois.readObject();
                    if (sr.equalsIgnoreCase("Gender Correct")) {
                        score[3] += 10;
                        if(score[3] < 0) {
                            score[3] = 0;
                        }
                        oos.writeObject(score[3]);
                    } else if (sr.equalsIgnoreCase("Gender Incorrect")) {
                        score[3] -= 10;
                        if(score[3] < 0){
                            score[3] = 0;
                        }
                        oos.writeObject(score[3]);
                    } else if (sr.equalsIgnoreCase("GenderScore")) {
                        oos.writeObject(score[3]);
                        totalScore += score[3];
                        score[3] = 0;
                    } else if (sr.equalsIgnoreCase("NumberScore")) {
                        oos.writeObject(score[1]);
                        totalScore += score[1];
                        score[1] = 0;
                    } else if (sr.equalsIgnoreCase("ArticleScore")) {
                        oos.writeObject(score[2]);
                        totalScore += score[2];
                        score[2] = 0;
                    } else if (sr.equalsIgnoreCase("PosScore")) {
                        oos.writeObject(score[0]);
                        totalScore += score[0];
                        score[0] = 0;
                    } else if (sr.equalsIgnoreCase("Article Correct")) {
                        score[2] += 10;
                        if(score[2] < 0){
                            score[2] = 0;
                        }
                        oos.writeObject(score[2]);
                    } else if (sr.equalsIgnoreCase("Article Incorrect")) {
                        score[2] -= 10;
                        if(score[2] < 0){
                            score[2] = 0;
                        }
                        oos.writeObject(score[2]);
                    } else if (sr.equalsIgnoreCase("Numbers Correct")) {
                        score[1] += 10;
                        if(score[1] < 0){
                            score[1] = 0;
                        }
                        oos.writeObject(score[1]);
                    } else if (sr.equalsIgnoreCase("Numbers Incorrect")) {
                        score[1] -= 10;
                        if(score[1] < 0){
                            score[1] = 0;
                        }
                        oos.writeObject(score[1]);
                    } else if (sr.equalsIgnoreCase("Pos Correct")) {
                        score[0] += 10;
                        if(score[0] < 0){
                            score[0] = 0;
                        }
                        oos.writeObject(score[0]);
                    } else if (sr.equalsIgnoreCase("Pos Incorrect")) {
                        score[0] -= 10;
                        if(score[0] < 0){
                            score[0] = 0;
                        }
                        oos.writeObject(score[0]);
                    } else {
                        try {
                            hash.put(sr, totalScore);
                            FileWriter fw = new FileWriter(INPUT_FILE_NAME,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            for(String name: hash.keySet()){
                                bw.write(name + " = " + hash.get(name));
                                bw.write("\n");
                            }

                            bw.close();
                            fw.close();
                            oos.writeObject(sr + " = " + totalScore);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }


                }
            }
        } catch(Exception e){
            System.out.println("Connection Ended....");
        }finally {
            try {
                ois.close();
                oos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }

}
class ServerTest {
    public static int i = 1;
    public static void main(String args[]){

        Socket s=null;
        ServerSocket ss2=null;
        System.out.println("Server Listening......");
        try{
            ss2 = new ServerSocket(33333); // can also use static final PORT_NUM , when defined
        }
        catch(IOException e){
            System.out.println("Server error");

        }


        while(true){
            try{
                s= ss2.accept();
                System.out.println("Connection Established : " + i );
                Server st=new Server(s);
                st.start();
                i++;

            }

            catch(Exception e){
                System.out.println("Connection Error");

            }
        }

    }

}
