module com.silverminer.randomseedgui {
   requires javafx.controls;
   requires javafx.fxml;


   opens com.silverminer.randomseedgui to javafx.fxml;
   exports com.silverminer.randomseedgui;
}