package com.example.localizationdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ResourceBundle;

public class HelloController {

    public Button button1;
    public Button button2;
    public Button button3;

   /* public void initialize(){
        ResourceBundle bundle = ResourceBundle.getBundle("bundle2");
       button1.setText(bundle.getString("button1.text"));
       button2.setText(bundle.getString("button2.text"));
       button3.setText(bundle.getString("button3.text"));

    }
*/
    @FXML
    private Label welcomeText;

    public void onFinnishClick(ActionEvent event) {

        welcomeText.setText("Moi, Tervetuloa JavaFX ResourceBundleen!!");
    }

    public void onEnglishClick(ActionEvent event) {

        welcomeText.setText("Hi,  Welcome to JavaFX ResourceBundle!");
    }

    public void onSwedishClick(ActionEvent event) {

        welcomeText.setText("Hej, Välkommen till JavaFX ResourceBundle!!");
    }
}