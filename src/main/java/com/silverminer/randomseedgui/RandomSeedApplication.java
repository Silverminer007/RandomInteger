package com.silverminer.randomseedgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RandomSeedApplication extends Application {
   @Override
   public void start(Stage stage) throws IOException {
      FXMLLoader fxmlLoader = new FXMLLoader(RandomSeedApplication.class.getResource("RandomSeedGenerator.fxml"));
      Scene scene = new Scene(fxmlLoader.load(), 600, 400);
      stage.setTitle("Random Seed Generator");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args) {
      launch();
   }
}