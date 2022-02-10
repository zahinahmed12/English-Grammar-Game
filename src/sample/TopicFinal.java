package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TopicFinal {
    @FXML
    private Button b1,b2;
    @FXML
    private ImageView image;
    @FXML
    private Label label;


    Main main;
    Client c;
    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c, int x, int score) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("TopicFinal.png"));
        image.setImage(img);
        label.setText(String.valueOf(score));

    }
    @FXML
    private void b1clicked(){
        try{
            main.showInsertPage(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void b2clicked(){
        try{
            main.showHomePage(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
