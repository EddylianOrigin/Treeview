package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * wir haben gelernt,wie wir treeView pane erstellen koennen
 */
public class Main extends Application {

        @Override
        public void start(Stage primaryStage) {
            try {
                AnchorPane root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/TreeView.fxml"));
                Scene scene = new Scene(root,500,500);
                primaryStage.setScene(scene);
                primaryStage.show();
            }catch(Exception e){
                e.printStackTrace();
            }
    }


    public static void main(String[] args) {
        launch(args);}
    }

