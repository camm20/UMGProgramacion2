package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class LoginController {
    public TextField txtUsuario;
    public PasswordField txtContrasenia;

    public void validarIngreso(ActionEvent actionEvent) throws IOException {
        //validar el ingreso al usuario
        //usuario=admin , password=admin
        if( txtUsuario.getText().equals("admin") && txtContrasenia.getText().equals("admin") ){
            //tiene acceso
            //((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            //----------------------------------------------------------------------->>> JOptionPane.showMessageDialog(null, "Ingreso Correcto");
            //VariablesGlobales.umg = new Universidad("Universidad Mariano Gálvez");
            Stage stagelogin = (Stage) txtUsuario.getScene().getWindow();
            stagelogin.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/MenuPrincipal.fxml"));
            Pane root = (Pane) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Proyecto 2");
            stage.setScene(new Scene(root,900,500));
            stage.show();
            /*
            Pane root = (Pane) FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Proyecto 2 APP");
            stage.show();*/
        }else{
            //acceso restringido
            txtUsuario.setText("");
            txtContrasenia.setText("");
            JOptionPane.showMessageDialog(null, "ERROR! usuario o password incorrectos.", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
