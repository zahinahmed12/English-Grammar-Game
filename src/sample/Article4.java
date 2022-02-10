package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.net.URL;

public class Article4 {
    Main main;
    Client c;

    @FXML
    private ImageView image;

    @FXML
    private Button b1,b2,b3;
    @FXML
    private Text text1,text2;
    @FXML
    private Rectangle rect1,rect2;
    @FXML
    private Label label;

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("Article4.png"));
        image.setImage(img);
    }
    public  void setMain(Main main){
        this.main = main;

    }
    @FXML
    public void b2Clicked(){//right
        try{
            rect1.setVisible(true);
            text1.setVisible(true);
            b3.setDisable(false);
            b1.setDisable(true);
            b2.setDisable(true);
            c.oos.writeObject("Article Correct");
            URL resource = getClass().getResource("congrats.wav");
            AudioClip clip = new AudioClip(resource.toString());
            clip.play();
            label.setText("SCORE : " + c.ois.readObject());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    public void b1Clicked(){//wrong
        try{
            rect2.setVisible(true);
            text2.setVisible(true);
            b3.setDisable(false);
            b1.setDisable(true);
            b2.setDisable(true);
            c.oos.writeObject("Article Incorrect");
            URL resource = getClass().getResource("oops.wav");
            AudioClip clip = new AudioClip(resource.toString());
            clip.play();
            label.setText("SCORE : " + c.ois.readObject());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    public void b3Clicked(){
        try{
            main.showArticle5(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
