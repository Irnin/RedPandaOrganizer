package irnin.controlers;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class ProgramControler {

    private MainControler mainControler;
    @FXML
    public void logOut() {
        mainControler.loadLogin();
    }

    public void exit() {
        Platform.exit();
    }

    public void setMainControler(MainControler mainControler){
        this.mainControler = mainControler;
    }
}
