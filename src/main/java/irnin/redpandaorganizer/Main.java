package irnin.redpandaorganizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String programName = "Red Panda Organizer";

    public static void Main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("MainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle(programName);
        stage.setScene(scene);
        stage.show();
    }
}
