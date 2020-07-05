package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    @FXML
    private WebView webView;

    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClicked() {
        /* This will create a pop up window, and will give user a choice
        * to navigate and pick a file they'll like to choose to upload & etc
        FileChooser chooser = new FileChooser();
        chooser.showOpenDialog(gridPane.getScene().getWindow());

        /* if you'll like to give user the option to select from directory,
        * make sure to use directory chooser instead,
        * DirectoryChooser chooser = new DirectoryChooser();
        * chooser.showDialog(gridPane.getScene().getWindow());

        DirectoryChooser chooser = new DirectoryChooser();
        File file = chooser.showDialog(gridPane.getScene().getWindow());

        if (file != null) {
            //this will print out the path of the path
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }

        Giving user the option to save to their desktop,
        you can do so as below
        */

        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                /* giving the user the option to save the application with the following
                 * datatype, such as text, or pdf, word doc and etc */
                new FileChooser.ExtensionFilter("Text", ".txt"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Zip", "*.zip"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg",
                        "*.png", "*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        File file = chooser.showSaveDialog(gridPane.getScene().getWindow());
        if (file != null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }

        //for multiple files
        List<File> multiFiles = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());

        if (multiFiles != null) {
            for (int i = 0; i < multiFiles.size(); i++) {
                System.out.println(multiFiles.get(i));
            }
        } else {
            System.out.println("Chooser was cancelled");
        }

    }

    @FXML
    public void handleLinkClick() {
//        try {
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//    }

        /*
        * this will display the web page in the same window application
        * instead of popping up and using the users web browser option
        * such as the link directing you to a new chrome window, or safari and etc */

        WebEngine engine = webView.getEngine();
        engine.load("http://www.javafx.com");
    }

}
