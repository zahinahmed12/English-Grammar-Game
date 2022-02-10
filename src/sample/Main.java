package sample;
import Numbers.*;
import POS.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.net.URL;


public class Main extends Application {

    Stage stage;
    public int soundMode = 1;

    @Override
    public void start(Stage primaryStage) throws Exception{

        stage = primaryStage;
        showStartPage();
    }

    public void showStartPage() throws Exception{
        // XML Loading using FXMLLoader

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Startpage.fxml"));
        Parent root = loader.load();

        // Loading the controller
        StartPage controller = loader.getController();
        controller.init();
        controller.setMain(this);


        // Set the primary stage
        stage.setTitle("Start Page");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();

    }
    public void showScoresPage(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("scores.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Scores controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Scores");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 1;
    }
    public void showNumbersStart(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Numbers/Numbers.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Numbers controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;

    }
    public void showNumbers1(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Numbers/Numbers1.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Numbers1 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showNumbers2(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Numbers/Numbers2.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Numbers2 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showNumbers3(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Numbers/Numbers3.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Numbers3 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showNumbers4(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Numbers/Numbers4.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Numbers4 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showNumbers5(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Numbers/Numbers5.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Numbers5 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showTopicFinal(Client c,int x,int y) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("topicFinal.fxml"));
        Parent root = loader.load();

        // Loading the controller
        TopicFinal controller = loader.getController();
        controller.init(c,x,y);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 1;
    }
    public void showInsertPage(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("insertPage.fxml"));
        Parent root = loader.load();

        // Loading the controller
        InsertPage controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Numbers");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 1;
    }
    public void showPosStart(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos1(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos1.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos1 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos2(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos2.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos2 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos3(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos3.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos3 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos4(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos4.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos4 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos5(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos5.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos5 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos6(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos6.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos6 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos7(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos7.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos7 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showPos8(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/POS/pos8.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Pos8 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Parts of Speech");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showHomePage(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Homepage.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Homepage controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Homepage");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 1;
    }
    public void showArticle1(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Article1.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Article1 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Article1");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showArticle2(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Article2.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Article2 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Article2");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showArticle3(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Article3.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Article3 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Article3");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showArticle4(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Article4.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Article4 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Article4");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showArticle5(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Article5.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Article5 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Article5");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showGender1(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Gender1.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Gender1 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Gender1");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showGender2(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Gender2.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Gender2 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Gender2");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showGender3(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Gender3.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Gender3 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Gender3");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showGender4(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Gender4.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Gender4 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Gender4");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showGender5(Client c) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Gender5.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Gender5 controller = loader.getController();
        controller.init(c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Gender5");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
    }
    public void showCongratsPage(int x,Client c) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Congrats.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Congrats controller = loader.getController();
        controller.init(x,c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Congrats");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 2;
        if (soundMode == 2) {
            URL resource = getClass().getResource("congrats.wav");
            AudioClip clip = new AudioClip(resource.toString());
            clip.play();
        }
    }
    public void showOopsPage(int x,Client c) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Oops.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Oops controller = loader.getController();
        controller.init(x,c);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Oops");
        stage.setScene(new Scene(root, 630, 482));
        stage.show();
        soundMode = 3;
        if (soundMode == 3) {
            URL resource = getClass().getResource("oops.wav");
            AudioClip clip = new AudioClip(resource.toString());
            clip.play();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
