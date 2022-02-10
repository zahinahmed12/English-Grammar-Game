package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Congrats {
    @FXML
    private Button b1;
    @FXML
    private ImageView image;
    @FXML
    private Label label;

    public int mode = 0;
    Main main;
    Client c;

    public void setMain(Main main){
        this.main = main;
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
        Image img = new Image(Main.class.getResourceAsStream("GreatJob.png"));
        image.setImage(img);
        try {
            label.setText("SCORES : " + c.ois.readObject() );
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
