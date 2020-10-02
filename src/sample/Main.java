package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import model.Cliente;
import model.Empresas;
import model.Individual;
import model.DataSistema;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Cliente cliente =  new Cliente();
        //System.out.println(Cliente.class.getSimpleName());
        //System.out.println(cliente.toString());
        //Empresas em = new Empresas("Cesar","Morales","Zona 13","Guatemala","78954555",10);
        //System.out.println(em.toString());
        //Individual per = new Individual("Julio","Ramirez",
          //      "Zona 12","Guatemala","26789844866");
        //System.out.println(per.toString());

        DataSistema.clientes.add(new Empresas("Cesar", "Morales", "Zona 13", "Guatemala","cmoralesm29@miumg.edu",10));
        DataSistema.clientes.add(new Empresas("Carlos", "Juarez", "Zona 12", "Guatemala","carlosjua@testcontact.com",20));
        DataSistema.clientes.add(new Individual("Julio","Marroquin", "Zona 10", "Guatemala", "1234564879855"));
        DataSistema.clientes.add(new Individual("Maria", "Ruiz", "Zona 21", "Guatemala","98785464660101"));


        //DataSistema.clientes[0] = em;
        //DataSistema.clientes[1] = per;
        //DataSistema.clientes.add(em);
        //DataSistema.clientes.add(per);

        Date date = new Date();
        System.out.println(date);
        System.out.println(new Timestamp(date.getTime()));

        System.out.println("DATA LENGHT >> " + DataSistema.clientes.size());
        //System.out.println("DATA LENGHT >> " + DataSistema.clientes[0].toString());
        System.out.println("DATA LENGHT >> " + DataSistema.clientes.get(0).toString());

        Pane root = (Pane) FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 393, 199));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
