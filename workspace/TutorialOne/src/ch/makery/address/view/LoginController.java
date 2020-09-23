package ch.makery.address.view;

import ch.makery.address.controller.MainApp;
import ch.makery.address.model.Person;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;


public class LoginController {
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private Button btnLogin;
    @FXML
    private Label errorLabel;

    public void login(javafx.collections.ObservableList<ch.makery.address.model.Person> users){

        //Action for btnLogin
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String checkUser = tfFirstName.getText();
                String checkPw = tfLastName.getText();
                //boolean para controlar si ha acertado
                boolean bLogin=false;
                //loop lista de usuarios para ver si ha acertado
                for(int i=0; i<users.size(); i++){
                    if(checkUser.equals(users.get(i).getFirstName()) && checkPw.equals(users.get(i).getLastName()))//si coincide
                        bLogin=true;
                }
                if(bLogin){
                    errorLabel.setText("Genial");
                    errorLabel.setTextFill(Paint.valueOf("green"));
                }
                else{
                    errorLabel.setText("Error, datos erroneos.");
                }
                tfFirstName.setText("");
                tfLastName.setText("");
            }
        });
    }

    // Reference to the main application.
    private MainApp mainApp;
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        //listado de usuarios
        ObservableList<Person> users =mainApp.getPersonData();
        //pasamos el listado
        login(users);
    }

}
