package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class InsertPage {
    Main main;
    Client c;
    @FXML
    private ImageView image;
    @FXML
    private TextField textField;
    @FXML
    private void textEntered(){
        while(true) {
            try {
                //String name = textField.getText();
                if(textField.getText()!=null) {
                    c.oos.writeObject(textField.getText());
                    main.showScoresPage(c);
                    break;
                }
                else{
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("insert.png"));
        image.setImage(img);
    }
}
