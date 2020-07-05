The covered topics, syntax and etc from this video;

FileChooser, DirectoryChooser, WebEngine

What is FileChooser?

A FileChooser can be used to invoke file open dialogs for selecting single file (showOpenDialog), file open dialogs for selecting multiple files (showOpenMultipleDialog) and file save dialogs (showSaveDialog). The configuration of the displayed dialog is controlled by the values of the FileChooser properties set before the corresponding show*Dialog method is called. This configuration includes the dialog's title, the initial directory displayed in the dialog and the extension filter(s) for the listed files. For configuration properties which values haven't been set explicitly, the displayed dialog uses their platform default values. A call to a show dialog method is blocked until the user makes a choice or cancels the dialog. The return value specifies the selected file(s) or equals to null if the dialog has been canceled.

Example:

          FileChooser fileChooser = new FileChooser();

          fileChooser.setTitle("Open Resource File");

          fileChooser.getExtensionFilters().addAll(
 
          new ExtensionFilter("Text Files", "*.txt"),
         
          new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
         
          new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
         
          new ExtensionFilter("All Files", "*.*"));

          File selectedFile = fileChooser.showOpenDialog(mainStage);

          if (selectedFile != null) {
              mainStage.display(selectedFile);

          }
          
src: https://docs.oracle.com/javase/8/javafx/api/javafx/stage/FileChooser.html

What is DirectoryChooser?

Provides support for standard directory chooser dialogs. These dialogs have look and feel of the platform UI components which is independent of JavaFX. On some platforms where file access may be restricted or not part of the user model (for example, on some mobile or embedded devices), opening a directory dialog may always result in a no-op (that is, null file being returned).

src: https://docs.oracle.com/javase/8/javafx/api/javafx/stage/DirectoryChooser.html

What is WebEngine?
WebEngine is a non-visual object capable of managing one Web page at a time. It loads Web pages, creates their document models, applies styles as necessary, and runs JavaScript on pages. It provides access to the document model of the current page, and enables two-way communication between a Java application and JavaScript code of the page.

read more:
src: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/web/WebEngine.html

another good source to read more;
src: https://o7planning.org/en/11129/javafx-filechooser-and-directorychooser-tutorial
