package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Controller2 {
    public Button check;
    @FXML
    private PasswordField name;
    @FXML
    private PasswordField value;
    @FXML
    private RadioButton small;
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton large;
    @FXML
    private Button save;

    private final ToggleGroup sizeToggleGroup;

    public Controller2() {
        sizeToggleGroup = new ToggleGroup();
    }

    @FXML
    public void initialize() {
        small.setToggleGroup(sizeToggleGroup);
        medium.setToggleGroup(sizeToggleGroup);
        large.setToggleGroup(sizeToggleGroup);
    }

    @FXML
    public void onSaveClicked() {
        String nameInput = name.getText();
        String valueInput = value.getText();
        String size = "";
        if (small.isSelected()) {
            size = "Small";
        } else if (medium.isSelected()) {
            size = "Medium";
        } else if (large.isSelected()) {
            size = "Large";
        }
        String data = "Name: " + nameInput + ", Value: " + valueInput + ", Size: " + size;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/INFO.txt"));
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onCheckClicked() throws IOException {
        //code to read data from the info.txt file and perform check operation

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/window3.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) check.getScene().getWindow(); // get current window
        stage.setScene(scene); // set new scene
        stage.setTitle("Window3");
        stage.show();
        System.out.println("Check clicked");
    }
}