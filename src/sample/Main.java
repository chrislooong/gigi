package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Main extends Application {

    /*
    public static void main (String args []) {
        launch(args);

        Menu menu = new Menu();
        menu.initialize();
        menu.firstMenu();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    */

    public static void main(String args[]) {
        launch(args);

//        Menu menu = new Menu();
//        menu.initialize();
//        menu.firstMenu();

    }

    @Override
    public void start(Stage stage) {
        Image image = new Image("https://scontent-bos3-1.xx.fbcdn.net/v/t1.0-9/93519321_10157160953745976_2933191917019594752_o.jpg?_nc_cat=109&_nc_sid=cdbe9c&_nc_ohc=VrLvZes1KeEAX8eDJDN&_nc_ht=scontent-bos3-1.xx&oh=b725e413cb5e312a803a77afdd08d6d3&oe=5F38A28D");
        //Setting the image view
        ImageView imageView = new ImageView(image);

//Setting the position of the image
        imageView.setX(100);
        imageView.setY(70);

//setting the fit height and width of the image view
        imageView.setFitHeight(800);
        imageView.setFitWidth(400);

//Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);

        Glow glow = new Glow();
        glow.setLevel(0.5);
        imageView.setEffect(glow);

        //Creating a Group object
        Group root = new Group(imageView);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 800);

        //Setting title to the Stage
        stage.setTitle("Drawing an arc through a path");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
}
