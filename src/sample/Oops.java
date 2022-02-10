package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class Oops {
    Client c;
    @FXML
    private Button b1;
    @FXML
    private ImageView image;
    @FXML
    private Label label;

    private int mode = 0;

    Main main;
    public void setMain(Main main){
        this.main = main;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    @FXML
    private void buttonClicked(){
        if(mode == 1){
            try {
                main.showGender2(c);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(mode == 2){
            try{
                main.showGender3(c);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        else if(mode == 3){
            try {
                main.showGender4(c);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(mode == 4){
            try {
                main.showGender5(c);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(mode == 5){
            try {
                c.oos.writeObject("GenderScore");
                main.showTopicFinal(c,4,(Integer)c.ois.readObject());
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }


    public void init(int x, Client c){
        this.c = c;
        mode = x;
        Image img = new Image(Main.class.getResourceAsStream("Oops.png"));
        image.setImage(img);
        try {
            label.setText("SCORES : " + c.ois.readObject());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
