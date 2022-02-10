package Numbers;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import sample.*;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;

public class Numbers2 {
    Main main;
    Client c;
    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("/Numbers/Numbers2.png"));
        image.setImage(img);
    }
    @FXML
    private Label label;
    @FXML
    private ImageView image;
    @FXML
    private Button b1,b2,b3;
    @FXML
    private Rectangle rect1,rect2;
    @FXML
    private Text text1,text2;
    @FXML
    private void b3clicked(){
        try {
            main.showNumbers3(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void b1clicked(){
        try {
            rect2.setVisible(true);
            text2.setVisible(true);
            b3.setDisable(false);
            b1.setDisable(true);
            b2.setDisable(true);

            c.oos.writeObject("Numbers Incorrect");
            URL resource = getClass().getResource("oops.wav");
            AudioClip clip = new AudioClip(resource.toString());
            clip.play();

            label.setText("SCORE : " + c.ois.readObject());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void b2clicked(){
        try {
            rect1.setVisible(true);
            text1.setVisible(true);
            b1.setDisable(true);
            b2.setDisable(true);
            b3.setDisable(false);

            c.oos.writeObject("Numbers Correct");
            URL resource = getClass().getResource("congrats.wav");
            AudioClip clip = new AudioClip(resource.toString());
            clip.play();
            label.setText("SCORE : " + c.ois.readObject());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
