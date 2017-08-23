package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public LoginModel LoginModel = new LoginModel();

    @FXML
    private Label isConnected;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginModel.isDbConnected()) {
            isConnected.setText("Connected");
        } else {
            isConnected.setText("Not Connected");


        }
    }
}
