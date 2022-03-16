package com.silverminer.randomseedgui;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Random;

public class GenerateController {
   public TextArea output;
   protected Random random = new Random();
   public TextField min_value;
   public TextField max_value;
   public Button generate;

   public void onGenerate() {
      int minValue = Integer.parseInt(min_value.getText());
      int maxValue = Integer.parseInt(max_value.getText());
      int randomNumber = random.nextInt(maxValue - minValue) + minValue;
      output.setText(String.valueOf(randomNumber));
   }

   public void onMinValueChanged() {
      generate.setDisable(invalidateValues());
   }

   public void onMaxValueChanged() {
      generate.setDisable(invalidateValues());
   }

   protected boolean invalidateValues() {
      try {
         int minValue = Integer.parseInt(min_value.getText());
         Integer.parseInt(max_value.getText());
         return minValue < 0;
      } catch(NumberFormatException e) {
         return true;
      }
   }
}