package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//import javafx.event.ActionEvent; | import java.awt.event.ActionEvent; ❎ .event vs .awt.event <- wrong
//import javafx.fxml.FXML; | import javafx.fxml.FXML; ✔
//import javafx.scene.control.Button; | import javafx.scene.control.Button; ✔
//import javafx.scene.control.TextField; | import javafx.scene.control.TextField; ✔

public class Controller {

    @FXML
    private TextField nameField;

    @FXML
    private Button helloButton;

    @FXML
    private Button byeButton;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Label label;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)) {
            System.out.println("Hey " + nameField.getText());
        } else if (e.getSource().equals(byeButton)) {
            System.out.println("Cee-ya " + nameField.getText());
        }

        /*
        * A useful way to debug code is to print out a message in the console, such as;
        *
        * String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
        * System.out.println("I'm going to sleep now." + s);
        *
        * this is a good way to keep track of what's going on, and when*/

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I'm going to sleep now." + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I'm going to sleep now." + s);
                            label.setText("We did something");
                        }
                    });
                } catch (InterruptedException e) {
                    //we don't care about this
                }
            }
        };

        new Thread(task).start();

        if (checkBox.isSelected()) {
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = this.nameField.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty(); //trim gets rid of white space
        this.helloButton.setDisable(disableButton);
        this.byeButton.setDisable(disableButton);
    }

    public void handleChange() {
        System.out.println("The CheckBox is " + (checkBox.isSelected() ?
                "checked" : "not checked"));
    }

}
