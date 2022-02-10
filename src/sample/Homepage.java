package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Homepage {
    Main main;
    Client c;

    @FXML
    private ImageView image;
    private int finalmode = 0;

    @FXML
    private Button b1,b2,b3,b4;

    @FXML
    private void b3clicked(){
        try{
            main.showArticle1(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void b4clicked(){
        try{
            main.showGender1(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void b1clicked(){
        try{
            main.showPosStart(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void b2clicked(){
        try{
            main.showNumbersStart(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("FirstMain.png"));
        image.setImage(img);
    }
}
