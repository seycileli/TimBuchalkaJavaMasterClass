How to stylize JavaFX Application with CSS

If you want to target a specific syntax in the FXML, make sure to give the FXML syntax an fx:id name,

for example;
    <Button fx:id="button_three" text="Button Three" GridPane.rowIndex="0" GridPane.columnIndex="2"/>

then you can call the fx:id name from the css file, by applying the hash symbol, before the fx:id name.
for example;

#button_three {

    -fx-background-color: blue;
    -fx-text-fill: white;

}

If you want to target ALL syntax (in this case all buttons) you can do as by placing a dot before the syntax name in the css file
for example;

.button {

    -fx-background-color: green;
    -fx-text-fill: white;

}

Also, JavaFX by default is stylized with Modena, you can change the JavaFX theme by typing in the follow;

        setUserAgentStylesheet(STYLESHEET_CASPIAN);

under the Parent root = FXMLLoader in Main Class
