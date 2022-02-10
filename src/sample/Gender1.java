package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Gender1{
    @FXML
    private ImageView image;
    @FXML
    private Button b1,b2;


    Main main;
    Client c;


    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("Gender1.png"));
        image.setImage(img);
    }
    @FXML
    public void b1clicked(){
        try{
            c.oos.writeObject("Gender Correct");
            main.showCongratsPage(1,c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    public void b2clicked(){
        try{
            c.oos.writeObject("Gender Incorrect");
            main.showOopsPage(1, c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
