package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import model.*;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        DataSistema.clientes.add(new Empresas("Cesar", "Morales", "Zona 13", "Guatemala","cmoralesm29@miumg.edu",10));
        DataSistema.clientes.add(new Empresas("Carlos", "Juarez", "Zona 12", "Guatemala","carlosjua@testcontact.com",20));
        DataSistema.clientes.add(new Individual("Julio","Marroquin", "Zona 10", "Guatemala", "1234564879855"));
        DataSistema.clientes.add(new Individual("Maria", "Ruiz", "Zona 21", "Guatemala","98785464660101"));

        DataSistema.productos.add(new Producto("Tenis",100));
        DataSistema.productos.add(new Producto("Arroz",25.5));
        DataSistema.productos.add(new Producto("Tomate",35));
        DataSistema.productos.add(new Producto("Pan",2.5));
        DataSistema.productos.add(new Producto("Coca-Cola",12));
        DataSistema.productos.add(new Producto("Pepsi",9));
        DataSistema.productos.add(new Producto("Tortrix Limon",1));
        DataSistema.productos.add(new Producto("Jamon",30));


        DataSistema.ordenes.add(new Orden(1,new Date()));

        DataSistema.ordenes.get(0).addItems(5, 2000);
        System.out.println(DataSistema.ordenes.get(0).getItemLine());
        DataSistema.ordenes.get(0).addItems(2, 2000);
        System.out.println(DataSistema.ordenes.get(0).getItemLine());

        System.out.println(DataSistema.ordenes.get(0).getId());

        Date date = new Date();
        System.out.println(date);
        System.out.println(new Timestamp(date.getTime()));

        System.out.println("DATA LENGHT >> " + DataSistema.clientes.size());


        Pane root = (Pane) FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 393, 199));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
