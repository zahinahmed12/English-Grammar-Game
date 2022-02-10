package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Gender2 {
    @FXML
    private ImageView image;
    @FXML
    private Button b1,b2;

    Client c;


    Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("Gender2.png"));
        image.setImage(img);
    }
    @FXML
    public void b2clicked(){
        try{
           // cp.setMode(2);
            c.oos.writeObject("Gender Correct");
            main.showCongratsPage(2,c);
        }catch(Exception e){
            System.out.println("error");
        }
    }
    @FXML
    public void b1clicked(){
        try{
            c.oos.writeObject("Gender Incorrect");
           // op.setMode(2);
            main.showOopsPage(2,c);
        }catch(Exception e){
            System.out.println("error");
        }
    }

}
