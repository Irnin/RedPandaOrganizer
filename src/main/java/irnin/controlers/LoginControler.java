package irnin.controlers;

import irnin.redpandaorganizer.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class LoginControler {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    private MainControler mainControler;

    @FXML
    void login(ActionEvent e){
        System.out.println("Login");
        System.out.println("Password: " + email.getText());
        System.out.println("Login: " + password.getText());

        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("Program.fxml"));
        try {
            Pane pane = fxmlLoader.load();

            ProgramControler programControler = fxmlLoader.getController();
            programControler.setMainControler(mainControler);
            mainControler.setScreen(pane);
        } catch (IOException er) {
            throw new RuntimeException(er);
        }
    }

    @FXML
    void initialize() {
    }

    public void setMainControler(MainControler mainControler){
        this.mainControler = mainControler;
    }
}