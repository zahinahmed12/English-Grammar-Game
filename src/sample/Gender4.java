package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Gender4 {
    Client c;
    @FXML
    private ImageView image;
    @FXML
    private Button b1,b2;

    Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("Gender4.png"));
        image.setImage(img);
    }
    @FXML
    public void b2clicked(){
        try{
           // cp.setMode(4);
            c.oos.writeObject("Gender Correct");
            main.showCongratsPage(4,c);
        }catch(Exception e){
            System.out.println("error");
        }
    }
    @FXML
    public void b1clicked(){
        try{
            //op.setMode(4);
            c.oos.writeObject("Gender Incorrect");
            main.showOopsPage(4,c);
        }catch(Exception e){
            System.out.println("error");
        }
    }

}
