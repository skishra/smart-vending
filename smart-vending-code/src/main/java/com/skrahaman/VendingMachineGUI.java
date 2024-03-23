package com.skrahaman;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VendingMachineGUI extends Application {
    private VendingMachine vm1 = new VendingMachine(5,10,10);

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root =new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
