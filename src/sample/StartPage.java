package sample;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StartPage {
    Main main;
    Client c;
    URL resource = getClass().getResource("music.mp3");
    Media media = new Media(resource.toString());
    MediaPlayer mediaPlayer = new MediaPlayer(media);
    @FXML
    private ImageView start,imageview1, imageview2, imageview3;
    @FXML
    private CheckBox musicButton;

    @FXML
    private Button button,b2;
    @FXML
    private void buttonClicked(){
        try{
            c = new Client();
            main.showHomePage(c);

        }catch(Exception e){
            System.out.println("Error loading start page");
        }
    }
    @FXML
    private void musicButtonPressed(){
        try{
            if (musicButton.isSelected()==false) {
                mediaPlayer.pause();
            }else {
                mediaPlayer.play();
            }
        }catch(Exception e){
            System.out.println("Error loading start page");
        }
    }
    /*@FXML
    private void b2clicked(){
        try{
            main.showScoresPage(0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/
    public void setMain(Main main){
        this.main = main;
    }

    public void init() {
        Image img = new Image(Main.class.getResourceAsStream("Start.png"));
        start.setImage(img);
        Image img2 = new Image(Main.class.getResourceAsStream("b1.png"));
        imageview1.setImage(img2);
        Image img3 = new Image(Main.class.getResourceAsStream("b2.png"));
        imageview2.setImage(img3);
        Image img4 = new Image(Main.class.getResourceAsStream("b3.png"));
        imageview3.setImage(img4);
        mediaPlayer.play();

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(4));
        transition.setToY(-472);
        transition.setAutoReverse(true);
        transition.setCycleCount(Animation.INDEFINITE);
        transition.setNode(imageview1);
        transition.play();
        TranslateTransition transition1 = new TranslateTransition();
        transition1.setDuration(Duration.seconds(4));
        transition1.setToY(-472);
        transition1.setAutoReverse(true);
        transition1.setCycleCount(Animation.INDEFINITE);
        transition1.setNode(imageview2);
        transition1.play();
        TranslateTransition transition2 = new TranslateTransition();
        transition2.setDuration(Duration.seconds(4));
        transition2.setToY(-472);
        transition2.setAutoReverse(true);
        transition2.setCycleCount(Animation.INDEFINITE);
        transition2.setNode(imageview3);
        transition2.play();
    }

}
