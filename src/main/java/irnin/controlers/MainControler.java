package irnin.controlers;

import irnin.redpandaorganizer.Login;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainControler {

    @FXML
    private StackPane mainStackPane;

    @FXML
    public void initialize() throws IOException {

        loadLogin();
    }

    public void loadLogin() {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("Login.fxml"));

        try {
            Pane pane = fxmlLoader.load();

            LoginControler loginControler = fxmlLoader.getController();
            loginControler.setMainControler(this);
            setScreen(pane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);
    }
}
