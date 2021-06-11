package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TreeView<String> treeView;

    Image icon = new Image(getClass().getResourceAsStream("/img/icon.png"));
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
        root.setExpanded((true));//derouler chaque treeview

        TreeItem<String> nodeA = new TreeItem<>("nodeA", new ImageView(icon));
        TreeItem<String> nodeB = new TreeItem<>("nodeB", new ImageView(icon));
        TreeItem<String> nodeC = new TreeItem<>("nodeC" , new ImageView(icon));
        root.getChildren().addAll(nodeA,nodeB,nodeC);
        nodeA.setExpanded((true));
        //root.getChildren().add(nodeA);
        //root.getChildren().add(nodeB);
        //root.getChildren().add(nodeC);
        TreeItem<String> nodeA1 = new TreeItem<>("nodeA 1", new ImageView(icon));
        TreeItem<String> nodeB1 = new TreeItem<>("nodeB 1", new ImageView(icon));
        TreeItem<String> nodeC1 = new TreeItem<>("nodeC 1", new ImageView(icon));
        nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);

        treeView.setRoot(root);
    }

    public void mouseClick(MouseEvent mouseEvent){
        if(mouseEvent.getClickCount()==2) {
            TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }
    }
}
