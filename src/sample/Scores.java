package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Scores {
    Main main;
    @FXML
    private ImageView image;
    @FXML
    private Button b1;
    @FXML
    private Label label1;
    Client c;

    @FXML
    private void b1clicked(){
        try{
            System.exit(1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setMain(Main main){
        this.main = main;
    }

    public void init(Client c) {
        Image img = new Image(Main.class.getResourceAsStream("Scores.png"));
        image.setImage(img);
        this.c = c;
       /* try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            while (true) {
                String s = br.readLine();
                if (s == null) break;
                System.out.println(s);
                label1.setText(s);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }*/
        try {
            label1.setText((String) c.ois.readObject());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
