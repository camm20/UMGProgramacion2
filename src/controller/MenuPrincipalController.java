package controller;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import javafx.application.Platform;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import model.*;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuPrincipalController {
    public MenuBar menu;
    public TableView<Individual> tblClientesIndividuales;
    public TextField txtAltaClienteIndividualNombre;
    public TextField txtAltaClienteIndividualApellido;
    public TextField txtAltaClienteIndividualDireccion;
    public TextField txtAltaClienteIndividualDepartamento;
    public TextField txtAltaClienteIndividualDpi;
    public TableColumn tfIndividualId;
    public TableColumn tfIndividualnombre;
    public TableColumn tfIndividualApellido;
    public TableColumn tfIndividualDireccion;
    public TableColumn tfIndividualDepartamento;
    public TableColumn tfIndividualDPI;
    public GridPane gridClienteIndividual;


    public MenuButton mbReportClientes;
    public MenuItem miReportClienteIndividual;
    public MenuItem miReportClienteEmpresa;
    public MenuItem miReportClienteAmbos;
    public Button btnAddClienteIndividual;
    public Button btnDeleteClienteIndividual;
    public Button btnEditClienteIndividual;
    public Button btnClearClienteIndividual;
    public TextField txtAltaClienteEmpresaNombre;
    public TextField txtAltaClienteEmpresaApellido;
    public TextField txtAltaClienteEmpresaDireccion;
    public TextField txtAltaClienteEmpresaDepartamento;
    public TextField txtAltaClienteEmpresaContacto;
    public Button btnClearClienteEmpresa;
    public Button btnEditClienteEmpresa;
    public Button btnDeleteClienteEmpresa;
    public Button btnAddClienteEmpresa;
    public TextField txtAltaClienteEmpresaDescuento;
    public TableView<Empresas> tblClientesEmpresa;
    public TableColumn tfEmpresaId;
    public TableColumn tfEmpresaNombre;
    public TableColumn tfEmpresaApellido;
    public TableColumn tfEmpresaDireccion;
    public TableColumn tfEmpresaDepartamento;
    public TableColumn tfEmpresaContacto;
    public TableColumn tfEmpresaDescuento;
    public GridPane gridClienteEmpresa;



    public GridPane gpProductos;
    public TextField txtProductosNombre;
    public TextField txtProductosPrecio;
    public Label lblProductoAddNombre;
    public Label lblProductoAddPrecio;
    public Button btnProductosAgregar;
    public TextField txtEditProductosNombre;
    public TextField txtEditProductosPrecio;
    public Button btnProductosModificar;
    public Button btnProductosEliminar;
    public TableView<Producto> tblProductos;
    public TableColumn tfProductosNombre;
    public TableColumn tfProductosPrecio;
    public TableColumn tfProductosId;


    public Pane pReportProductos;

    public GridPane gpReporteClientesAmbos;
    public GridPane gpReporteClientesIndividuales;
    public Pane pReportClientes;
    public GridPane gpReporteClientesEmpresas;
    public GridPane gpReportesProductos;
    public Pane pReportesOrdenesdeCompra;
    public TextField txtReportesSearchOC;
    public GridPane gpReportesOCCliente;
    public GridPane gpReportesOCItems;


    public TextField txtOrdenesdeCompraAltaIdCliente;
    public GridPane gpOrdenesdeCompraAltaCliente;
    public TextField txtOrdenesdeCompraAltaIdProducto;
    public TextField txtOrdenesdeCompraAltaCantidadProducto;
    public Pane pOrdenesdeCompraAltas;
    public TextField txtOrdendeCompraCodigoOC;
    public GridPane gpOrdenesdeCompraAltaItems;
    public Button btnOrdenesdeCompraAltaSearchCliente;
    public Button btnOrdenesdeCompraAltaAddProducto;
    public Button btnOrdenesdeCompraAltaClear;
    public GridPane gpOrdenesdeCompraBajasProductos;
    public GridPane gpOrdenesdeCompraBajasCliente;
    public Button btnOrdenesdeCompraBajasClear;
    public Button btnOrdenesdeCompraBajasDeleteOC;
    public TextField txtOrdenesdeCompraBajaCodigoOC;
    public Pane pOrdenesdeComprasBajas;
    public Button btnOrdenesdeCompraBajasSearch;

    /*ORDENES DE COMPRA - CAMBIOS*/
    public Pane pOrdenesdeCompraCambios;
    public TextField txtOrdenesdeCompraCambiosIdOC;
    public Button btnOrdenesdeCompraCambiosSearchOC;
    public TextField txtOrdenesdeCompraCambiosIdProducto;
    public TextField txtOrdenesdeCompraCambiosCantidad;
    public Button btnOrdenesdeCompraCambiosAdd;
    public Button btnOrdenesdeCompraCambiosEdit;
    public Button btnOrdenesdeCompraCambiosDelete;
    public GridPane gpOrdenesdeCompraCambios;
    public TextField txtOrdenesdeCompraCambiosLinea;
    public Button btnOrdenesdeCompraCambiosClean;
    public Button btnOrdenesdeCompraCambiosEndOperation;

    @FXML
    public void initialize() {

        tfIndividualId.setCellValueFactory(new PropertyValueFactory<Individual, Integer>("id"));
        tfIndividualnombre.setCellValueFactory(new PropertyValueFactory<Individual, String>("nombres"));
        tfIndividualApellido.setCellValueFactory(new PropertyValueFactory<Individual, String>("apellidos"));
        tfIndividualDireccion.setCellValueFactory(new PropertyValueFactory<Individual, String>("direccion"));
        tfIndividualDepartamento.setCellValueFactory(new PropertyValueFactory<Individual, String>("departamento"));
        tfIndividualDPI.setCellValueFactory(new PropertyValueFactory<Individual, String>("DPI"));

        tfEmpresaId.setCellValueFactory(new PropertyValueFactory<Empresas, Integer>("id"));
        tfEmpresaNombre.setCellValueFactory(new PropertyValueFactory<Empresas, String>("nombres"));
        tfEmpresaApellido.setCellValueFactory(new PropertyValueFactory<Empresas, String>("apellidos"));
        tfEmpresaDireccion.setCellValueFactory(new PropertyValueFactory<Empresas, String>("direccion"));
        tfEmpresaDepartamento.setCellValueFactory(new PropertyValueFactory<Empresas, String>("departamento"));
        tfEmpresaContacto.setCellValueFactory(new PropertyValueFactory<Empresas, String>("contacto"));
        tfEmpresaDescuento.setCellValueFactory(new PropertyValueFactory<Empresas, Integer>("descuento"));

        tfProductosId.setCellValueFactory(new PropertyValueFactory<Producto, Integer>("id"));
        tfProductosNombre.setCellValueFactory(new PropertyValueFactory<Producto, String>("nombre"));
        tfProductosPrecio.setCellValueFactory(new PropertyValueFactory<Producto, Integer>("precio"));
    }



    public void altaClienteIndividual(ActionEvent actionEvent) {
        try {
            if(!txtAltaClienteIndividualNombre.getText().equals("") || !txtAltaClienteIndividualApellido.getText().equals("") || !txtAltaClienteIndividualDireccion.getText().equals("") ||
                    !txtAltaClienteIndividualDepartamento.getText().equals("") || !txtAltaClienteIndividualDpi.getText().equals("")) {
                DataSistema.clientes.add(new Individual(txtAltaClienteIndividualNombre.getText(), txtAltaClienteIndividualApellido.getText(), txtAltaClienteIndividualDireccion.getText(),
                        txtAltaClienteIndividualDepartamento.getText(), txtAltaClienteIndividualDpi.getText()));
            }

            //showTablaClientesBy(Individual.class);
            ObservableList<Individual> data =
                    FXCollections.observableArrayList(showTablaClientesIndividual(Individual.class));
            tblClientesIndividuales.setItems(data);
            tblClientesIndividuales.getSelectionModel().clearSelection();
            clearInputsClienteIndividual();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clearClienteIndividual(ActionEvent actionEvent) {
        tblClientesIndividuales.getSelectionModel().clearSelection();
        clearInputsClienteIndividual();
        individualActionBtns(true);
    }

    public void editClienteIndividual(ActionEvent actionEvent) {
        actionEditClienteIndividual();
        tblClientesIndividuales.getSelectionModel().clearSelection();
        clearInputsClienteIndividual();
        individualActionBtns(true);
        tblClientesIndividuales.refresh();
        tblClientesIndividuales.setItems(null);
        ObservableList<Individual> data =
                FXCollections.observableArrayList(showTablaClientesIndividual(Individual.class));
        tblClientesIndividuales.setItems(data);
        tblClientesIndividuales.getSelectionModel().clearSelection();

    }

    public void deleteClienteIndividual(ActionEvent actionEvent) {
        actionDeleteSelectTableRow();
        ObservableList<Individual> data =
                FXCollections.observableArrayList(showTablaClientesIndividual(Individual.class));
        tblClientesIndividuales.setItems(data);
        clearInputsClienteIndividual();
        individualActionBtns(true);
    }

    private List<Individual> showTablaClientesIndividual(Class<Individual> tipoCliente) {
        List<Individual> filtroClientes = new ArrayList<>();

        for(int i=0; i<DataSistema.clientes.size(); i++){
            if(Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass()) == Utilerias.getNombreClase(tipoCliente)){
                filtroClientes.add((Individual) DataSistema.clientes.get(i));
            }
        }
        return filtroClientes;
    }

    public void close(MouseEvent actionEvent) {
        Platform.exit();
        System.exit(0);
    }


    public void showClientesIndividuales(ActionEvent actionEvent) {
        showTablaClientesIndividual(Individual.class);
        ObservableList<Individual> data =
                FXCollections.observableArrayList(showTablaClientesIndividual(Individual.class));
        tblClientesIndividuales.setItems(data);
        tblClientesIndividuales.setOnMouseClicked(e -> {selectTableRow();});
        gridClienteIndividual.setVisible(true);
        gridClienteEmpresa.setVisible(false);
        gpProductos.setVisible(false);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);
    }

    private void selectTableRow(){
        for(Individual cliente : tblClientesIndividuales.getSelectionModel().getSelectedItems()){
            for(int i=1; i <=1; i++){
                txtAltaClienteIndividualNombre.setText(cliente.getNombres());
                txtAltaClienteIndividualApellido.setText(cliente.getApellidos());
                txtAltaClienteIndividualDireccion.setText(cliente.getDireccion());
                txtAltaClienteIndividualDepartamento.setText(cliente.getDepartamento());
                txtAltaClienteIndividualDpi.setText(cliente.getDPI());
                individualActionBtns(false);
            }
        }
    }

    private void actionDeleteSelectTableRow(){
        Cliente cliente = tblClientesIndividuales.getSelectionModel().getSelectedItem();
        DataSistema.clientes.remove(cliente);
    }

    private void actionEditClienteIndividual(){
        Individual editClient = null;
        for(Individual cliente : tblClientesIndividuales.getSelectionModel().getSelectedItems()){
            for(int i=1; i <=1; i++){
                editClient = cliente;
                int index = DataSistema.clientes.indexOf(cliente);
                editClient.setNombres(txtAltaClienteIndividualNombre.getText());
                editClient.setApellidos(txtAltaClienteIndividualApellido.getText());
                editClient.setDireccion(txtAltaClienteIndividualDireccion.getText());
                editClient.setDepartamento(txtAltaClienteIndividualDepartamento.getText());
                editClient.setDPI(txtAltaClienteIndividualDpi.getText());
                individualActionBtns(false);
                DataSistema.clientes.set(index,editClient);
            }
        }
    }

    private void individualActionBtns(boolean change) {
        btnClearClienteIndividual.setDisable(change);
        btnDeleteClienteIndividual.setDisable(change);
        btnEditClienteIndividual.setDisable(change);
    }

    private void clearInputsClienteIndividual(){
        txtAltaClienteIndividualNombre.setText("");
        txtAltaClienteIndividualApellido.setText("");
        txtAltaClienteIndividualDireccion.setText("");
        txtAltaClienteIndividualDepartamento.setText("");
        txtAltaClienteIndividualDpi.setText("");
    }

    /* ALTA, BAJA, CAMBIOS DE CLIENTES --> EMPRESAS */

    public void showClientesEmpresas(ActionEvent actionEvent) {
        ObservableList<Empresas> data =
                FXCollections.observableArrayList(showTablaClientesEmpresas(Empresas.class));
        tblClientesEmpresa.setItems(data);
        tblClientesEmpresa.setOnMouseClicked(e -> {selectEmpresaTableRow();});
        gpProductos.setVisible(false);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(true);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);
    }

    private List<Empresas> showTablaClientesEmpresas(Class<Empresas> tipoCliente) {
        List<Empresas> filtroClientes = new ArrayList<>();

        for(int i=0; i<DataSistema.clientes.size(); i++){
            if(Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass()) == Utilerias.getNombreClase(tipoCliente)){
                filtroClientes.add((Empresas) DataSistema.clientes.get(i));
            }
        }
        return filtroClientes;
    }


    public void altaClienteEmpresa(ActionEvent actionEvent) {
        try {
            if(!txtAltaClienteEmpresaNombre.getText().equals("") || !txtAltaClienteEmpresaApellido.getText().equals("") || !txtAltaClienteEmpresaDireccion.getText().equals("") ||
                    !txtAltaClienteEmpresaDepartamento.getText().equals("") || !txtAltaClienteEmpresaContacto.getText().equals("") || !txtAltaClienteEmpresaDescuento.getText().equals("")) {
                DataSistema.clientes.add(new Empresas(txtAltaClienteEmpresaNombre.getText(), txtAltaClienteEmpresaApellido.getText(), txtAltaClienteEmpresaDireccion.getText(),
                        txtAltaClienteEmpresaDepartamento.getText(), txtAltaClienteEmpresaContacto.getText(), Integer.parseInt(txtAltaClienteEmpresaDescuento.getText())));
            }

            //showTablaClientesBy(Individual.class);
            ObservableList<Empresas> data =
                    FXCollections.observableArrayList(showTablaClientesEmpresas(Empresas.class));
            tblClientesEmpresa.setItems(data);
            tblClientesEmpresa.getSelectionModel().clearSelection();
            clearInputsClienteEmpresas();

        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR! Debe de llenar el campo descuento obligatoriamente.", "Error",JOptionPane.ERROR_MESSAGE);
        }
        clearInputsClienteEmpresas();
    }

    public void deleteClienteEmpresa(ActionEvent actionEvent) {
        actionDeleteEmpresasSelectTableRow();
        ObservableList<Empresas> data =
                FXCollections.observableArrayList(showTablaClientesEmpresas(Empresas.class));
        tblClientesEmpresa.refresh();
        tblClientesEmpresa.setItems(data);
        clearInputsClienteEmpresas();
        empresasActionBtns(true);
    }

    public void editClienteEmpresa(ActionEvent actionEvent) {
        actionEditClienteEmpresa();
        tblClientesEmpresa.getSelectionModel().clearSelection();
        clearInputsClienteEmpresas();
        empresasActionBtns(true);
        tblClientesEmpresa.refresh();
        tblClientesEmpresa.setItems(null);
        ObservableList<Empresas> data =
                FXCollections.observableArrayList(showTablaClientesEmpresas(Empresas.class));
        tblClientesEmpresa.setItems(data);
        tblClientesEmpresa.getSelectionModel().clearSelection();

    }

    public void clearClienteEmpresa(ActionEvent actionEvent) {
        tblClientesEmpresa.getSelectionModel().clearSelection();
        clearInputsClienteEmpresas();
        empresasActionBtns(true);
    }



    private void actionDeleteEmpresasSelectTableRow(){
        Cliente cliente = tblClientesEmpresa.getSelectionModel().getSelectedItem();
        DataSistema.clientes.remove(cliente);
    }

    private void actionEditClienteEmpresa(){
        Empresas editClient = null;
        for(Empresas cliente : tblClientesEmpresa.getSelectionModel().getSelectedItems()){
            for(int i=1; i <=1; i++){
                editClient = cliente;
                int index = DataSistema.clientes.indexOf(cliente);
                editClient.setNombres(txtAltaClienteEmpresaNombre.getText());
                editClient.setApellidos(txtAltaClienteEmpresaApellido.getText());
                editClient.setDireccion(txtAltaClienteEmpresaDireccion.getText());
                editClient.setDepartamento(txtAltaClienteEmpresaDepartamento.getText());
                editClient.setContacto(txtAltaClienteEmpresaContacto.getText());
                editClient.setDescuento(Integer.parseInt(txtAltaClienteEmpresaDescuento.getText()));
                individualActionBtns(false);
                DataSistema.clientes.set(index,editClient);
            }
        }
    }

    private void selectEmpresaTableRow(){
        for(Empresas cliente : tblClientesEmpresa.getSelectionModel().getSelectedItems()){
            for(int i=1; i <=1; i++){
                txtAltaClienteEmpresaNombre.setText(cliente.getNombres());
                txtAltaClienteEmpresaApellido.setText(cliente.getApellidos());
                txtAltaClienteEmpresaDireccion.setText(cliente.getDireccion());
                txtAltaClienteEmpresaDepartamento.setText(cliente.getDepartamento());
                txtAltaClienteEmpresaContacto.setText(cliente.getContacto());
                txtAltaClienteEmpresaDescuento.setText(String.valueOf(cliente.getDescuento()));
                empresasActionBtns(false);
            }
        }
    }


    private void empresasActionBtns(boolean action){
        btnClearClienteEmpresa.setDisable(action);
        btnDeleteClienteEmpresa.setDisable(action);
        btnEditClienteEmpresa.setDisable(action);
    }

    private void clearInputsClienteEmpresas(){
        txtAltaClienteEmpresaNombre.setText("");
        txtAltaClienteEmpresaApellido.setText("");
        txtAltaClienteEmpresaDireccion.setText("");
        txtAltaClienteEmpresaDepartamento.setText("");
        txtAltaClienteEmpresaContacto.setText("");
        txtAltaClienteEmpresaDescuento.setText("");
    }





    /* END ALTAS, BAJAS, CAMBIOS CLIENTES --> EMPRESAS */


    /* START PRODUCTOS */

    public void showProductosAltas(ActionEvent actionEvent) {

        lblProductoAddNombre.setVisible(true);
        lblProductoAddPrecio.setVisible(true);
        txtProductosNombre.setVisible(true);
        txtProductosPrecio.setVisible(true);
        txtEditProductosNombre.setVisible(false);
        txtEditProductosPrecio.setVisible(false);
        btnProductosAgregar.setVisible(true);
        btnProductosEliminar.setVisible(false);
        btnProductosModificar.setVisible(false);

        gpProductos.setVisible(true);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);

        ObservableList<Producto> data =
                FXCollections.observableArrayList(DataSistema.productos);
        tblProductos.refresh();
        tblProductos.setItems(data);
        tblProductos.setOnMouseClicked(e -> {selectProductosTableRow();});
        tblProductos.getSelectionModel().clearSelection();

    }



    public void showProductosBajas(ActionEvent actionEvent) {

        lblProductoAddNombre.setVisible(false);
        lblProductoAddPrecio.setVisible(false);
        txtProductosNombre.setVisible(false);
        txtProductosPrecio.setVisible(false);
        txtEditProductosNombre.setVisible(false);
        txtEditProductosPrecio.setVisible(false);
        btnProductosAgregar.setVisible(false);
        btnProductosEliminar.setVisible(true);
        btnProductosModificar.setVisible(false);

        gpProductos.setVisible(true);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);

        ObservableList<Producto> data =
                FXCollections.observableArrayList(DataSistema.productos);
        tblProductos.refresh();
        tblProductos.setItems(data);
        tblProductos.setOnMouseClicked(e -> {selectProductosTableRow();});
        tblProductos.getSelectionModel().clearSelection();
    }

    public void showProductosCambios(ActionEvent actionEvent) {

        lblProductoAddNombre.setVisible(true);
        lblProductoAddPrecio.setVisible(true);
        txtProductosNombre.setVisible(false);
        txtProductosPrecio.setVisible(false);
        txtEditProductosNombre.setVisible(true);
        txtEditProductosPrecio.setVisible(true);
        txtEditProductosNombre.setText("");
        txtEditProductosPrecio.setText("");
        btnProductosAgregar.setVisible(false);
        btnProductosEliminar.setVisible(false);
        btnProductosModificar.setVisible(true);
        btnProductosModificar.setDisable(true);

        gpProductos.setVisible(true);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pReportProductos.setVisible(false);
        pReportClientes.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);

        ObservableList<Producto> data =
                FXCollections.observableArrayList(DataSistema.productos);
        tblProductos.refresh();
        tblProductos.setItems(data);
        tblProductos.setOnMouseClicked(e -> {selectProductosTableRow();});
        tblProductos.getSelectionModel().clearSelection();
    }

    public void addProducto(ActionEvent actionEvent) {
        try {
            if(!txtProductosNombre.getText().equals("") || !txtProductosPrecio.getText().equals("")) {
                DataSistema.productos.add(new Producto(txtProductosNombre.getText(),Double.parseDouble(txtProductosPrecio.getText())));
            }

            ObservableList<Producto> data =
                    FXCollections.observableArrayList(DataSistema.productos);
            tblProductos.setItems(data);
            tblProductos.getSelectionModel().clearSelection();
            txtProductosPrecio.setText("");
            txtProductosNombre.setText("");

        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR! Debe de llenar el campo precio obligatoriamente.", "Error",JOptionPane.ERROR_MESSAGE);
        }

    }

    public void editProducto(ActionEvent actionEvent) {
        Producto editProducto = null;
        for(Producto producto : tblProductos.getSelectionModel().getSelectedItems()){
            for(int i=1; i <=1; i++){
                editProducto = producto;
                int index = DataSistema.productos.indexOf(producto);
                editProducto.setNombre(txtEditProductosNombre.getText());
                editProducto.setPrecio(Double.parseDouble(txtEditProductosPrecio.getText()));
                DataSistema.productos.set(index,editProducto);
            }
        }
        ObservableList<Producto> data =
                FXCollections.observableArrayList(DataSistema.productos);
        tblProductos.setItems(data);
        tblProductos.getSelectionModel().clearSelection();
        tblProductos.refresh();
        txtEditProductosPrecio.setText("");
        txtEditProductosNombre.setText("");
        btnProductosModificar.setDisable(true);


    }

    public void deleteProducto(ActionEvent actionEvent) {
        Producto producto = tblProductos.getSelectionModel().getSelectedItem();
        DataSistema.productos.remove(producto);
        ObservableList<Producto> data =
                FXCollections.observableArrayList(DataSistema.productos);
        tblProductos.refresh();
        tblProductos.setItems(data);
    }
    private void selectProductosTableRow(){
        for(Producto producto : tblProductos.getSelectionModel().getSelectedItems()){
            for(int i=1; i <=1; i++){
                txtEditProductosNombre.setText(producto.getNombre());
                txtEditProductosPrecio.setText(String.valueOf(producto.getPrecio()));
            }
        }
        btnProductosModificar.setDisable(false);
    }

    public void reportProductos(ActionEvent actionEvent) {

        gpReportesProductos.getChildren().remove(3,gpReportesProductos.getChildren().size());

        for (int i = 0; i < DataSistema.productos.size(); i++) {

            Label lblCod = new Label(String.valueOf(DataSistema.productos.get(i).getId()));
            Label lblNom = new Label(DataSistema.productos.get(i).getNombre());
            Label lblPrec = new Label(String.valueOf(DataSistema.productos.get(i).getPrecio()));
            gpReportesProductos.addRow(i+1, lblCod,lblNom,lblPrec);
            gpReportesProductos.prefHeight(40);
        }

        pReportClientes.setVisible(false);
        pReportProductos.setVisible(true);
        gpProductos.setVisible(false);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);
    }

    /* START REPORTE CLIENTES */
    public void reportClientes(ActionEvent actionEvent) {
        pReportClientes.setVisible(true);
        pReportProductos.setVisible(false);
        gpProductos.setVisible(false);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);

        gpReporteClientesIndividuales.setVisible(false);
        gpReporteClientesEmpresas.setVisible(false);
        gpReporteClientesAmbos.setVisible(false);
    }

    public void showReporteClienteInidividual(ActionEvent actionEvent) {
        mbReportClientes.setText("Individual");
        gpReporteClientesIndividuales.setVisible(true);
        gpReporteClientesEmpresas.setVisible(false);
        gpReporteClientesAmbos.setVisible(false);
        gpReporteClientesIndividuales.getChildren().remove(7,gpReporteClientesIndividuales.getChildren().size());
        Individual individual = null;
        for (int i = 0; i < DataSistema.clientes.size(); i++) {

            if(Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass()) == Utilerias.getNombreClase(Individual.class)){
                individual = (Individual) DataSistema.clientes.get(i);
                Label lblType = new Label("Individual");
                Label lblId = new Label(String.valueOf(individual.getId()));
                Label lblNombre = new Label(individual.getNombres());
                Label lblApellido = new Label(individual.getApellidos());
                Label lblDireccion = new Label(individual.getDireccion());
                Label lblDepartamento = new Label(individual.getDepartamento());
                Label lblDPI = new Label(individual.getDPI());
                gpReporteClientesIndividuales.addRow(i+1, lblType,lblId,lblNombre,lblApellido,lblDireccion,lblDepartamento,lblDPI);
                gpReporteClientesIndividuales.prefHeight(40);
            }



        }
    }

    public void showReporteClienteEmpresa(ActionEvent actionEvent) {
        mbReportClientes.setText("Empresa");
        gpReporteClientesIndividuales.setVisible(false);
        gpReporteClientesEmpresas.setVisible(true);
        gpReporteClientesAmbos.setVisible(false);
        //gpReporteClientesEmpresas.getRowConstraints().remove(1,gpReporteClientesEmpresas.getRowCount()-1);
        gpReporteClientesEmpresas.getChildren().remove(8,gpReporteClientesEmpresas.getChildren().size());

        Empresas empresas = null;
        for (int i = 0; i < DataSistema.clientes.size(); i++) {

            if(Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass()) == Utilerias.getNombreClase(Empresas.class)){
                empresas = (Empresas) DataSistema.clientes.get(i);
                Label lblType = new Label("Empresas");
                Label lblId = new Label(String.valueOf(empresas.getId()));
                Label lblNombre = new Label(empresas.getNombres());
                Label lblApellido = new Label(empresas.getApellidos());
                Label lblDireccion = new Label(empresas.getDireccion());
                Label lblDepartamento = new Label(empresas.getDepartamento());
                Label lblContacto = new Label(empresas.getContacto());
                Label lblDescuento = new Label(String.valueOf(empresas.getDescuento()));

                gpReporteClientesEmpresas.addRow(i+1, lblType,lblId,lblNombre,lblApellido,lblDireccion,lblDepartamento,lblContacto,lblDescuento);
                gpReporteClientesEmpresas.prefHeight(40);
            }
        }
    }

    public void showReporteClienteAmbos(ActionEvent actionEvent) {
        mbReportClientes.setText("Ambos");
        gpReporteClientesIndividuales.setVisible(false);
        gpReporteClientesEmpresas.setVisible(false);
        gpReporteClientesAmbos.setVisible(true);
        gpReporteClientesAmbos.getChildren().remove(9,gpReporteClientesAmbos.getChildren().size());
        Individual individual = null;
        Empresas empresas = null;
        Label lblType = new Label("");
        Label lblId = new Label("");
        Label lblNombre = new Label("");
        Label lblApellido = new Label("");
        Label lblDireccion = new Label("");
        Label lblDepartamento = new Label("");
        Label lblDPI = new Label("");
        Label lblContacto = new Label("");
        Label lblDescuento = new Label("");
        for (int i = 0; i < DataSistema.clientes.size(); i++) {

            if(Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass()) == Utilerias.getNombreClase(Individual.class)){
                individual = (Individual) DataSistema.clientes.get(i);
                lblType = new Label("Individual");
                lblId = new Label(String.valueOf(individual.getId()));
                lblNombre = new Label(individual.getNombres());
                lblApellido = new Label(individual.getApellidos());
                lblDireccion = new Label(individual.getDireccion());
                lblDepartamento = new Label(individual.getDepartamento());
                lblDPI = new Label(individual.getDPI());
                lblContacto = new Label("");
                lblDescuento = new Label("");
            }else if(Utilerias.getNombreClase(DataSistema.clientes.get(i).getClass()) == Utilerias.getNombreClase(Empresas.class)){
                empresas = (Empresas) DataSistema.clientes.get(i);
                lblType = new Label("Empresas");
                lblId = new Label(String.valueOf(empresas.getId()));
                lblNombre = new Label(empresas.getNombres());
                lblApellido = new Label(empresas.getApellidos());
                lblDireccion = new Label(empresas.getDireccion());
                lblDepartamento = new Label(empresas.getDepartamento());
                lblDPI = new Label("");
                lblContacto = new Label(empresas.getContacto());
                lblDescuento = new Label(String.valueOf(empresas.getDescuento()));
            }

            gpReporteClientesAmbos.addRow(i+1, lblType,lblId,lblNombre,lblApellido,lblDireccion,lblDepartamento,lblDPI,lblContacto,lblDescuento);
            gpReporteClientesAmbos.prefHeight(40);

        }
    }

    /* END REPORTE CLIENTES */

    /* START REPORTE DE ORDEN DE COMPRA*/

    public void reportesOrdenesdeCompra(ActionEvent actionEvent) {
        pReportesOrdenesdeCompra.setVisible(true);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        gpProductos.setVisible(false);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);

    }


    public void btnReporteSearchOC(ActionEvent actionEvent) {


        gpReportesOCCliente.getChildren().remove(5,gpReportesOCCliente.getChildren().size());
        gpReportesOCItems.getChildren().remove(4,gpReportesOCItems.getChildren().size());

        Individual individual = null;
        Empresas empresas = null;
        Label clNombre = new Label("");
        Label clApellido = new Label("");
        Label clDireccion = new Label("");
        Label clDepartamento = new Label("");
        Label clDescuento = new Label("");

        Label pCantidad = new Label("");
        Label pNombre = new Label("");
        Label pPrecio = new Label("");
        Label pTotal = new Label("");

        Label ocTotal = new Label("");
        Label ocSubtotal = new Label("");
        Orden oc = null;
        Empresas clEmpresa = null;
        Individual clIndividual = null;
        for (int i=0; i < DataSistema.ordenes.size(); i++){
            if(Integer.parseInt(txtReportesSearchOC.getText()) == DataSistema.ordenes.get(i).getId()){
                oc = DataSistema.ordenes.get(i);

                if(Utilerias.getNombreClase(oc.getCliente().getClass()) == Utilerias.getNombreClase(Individual.class)){
                    clIndividual = (Individual) oc.getCliente();
                    clNombre = new Label(clIndividual.getNombres());
                    clApellido = new Label(clIndividual.getApellidos());
                    clDireccion = new Label(clIndividual.getDireccion());
                    clDepartamento = new Label(clIndividual.getDepartamento());
                    clDescuento = new Label("");


                }else if(Utilerias.getNombreClase(oc.getCliente().getClass()) == Utilerias.getNombreClase(Empresas.class)){
                    clEmpresa = (Empresas) oc.getCliente();
                    clNombre = new Label(clEmpresa.getNombres());
                    clApellido = new Label(clEmpresa.getApellidos());
                    clDireccion = new Label(clEmpresa.getDireccion());
                    clDepartamento = new Label(clEmpresa.getDepartamento());
                    clDescuento = new Label(String.valueOf(clEmpresa.getDescuento()));
                }

                gpReportesOCCliente.addRow(1, clNombre, clApellido, clDireccion, clDepartamento, clDescuento);
                gpReportesOCCliente.prefHeight(40);

                for (int io=0; io<oc.getItems().size(); io++){
                    pCantidad = new Label(String.valueOf(oc.getItems().get(io).getCantidad()));
                    pNombre = new Label(oc.getItems().get(io).getProducto().getNombre());
                    pPrecio = new Label(String.valueOf(oc.getItems().get(io).getProducto().getPrecio()));
                    pTotal = new Label(String.valueOf(oc.getItems().get(io).getProducto().getPrecio() * oc.getItems().get(io).getCantidad()));

                    gpReportesOCItems.addRow(io+1, pCantidad, pNombre, pPrecio, pTotal);
                    gpReportesOCItems.prefHeight(40);
                }

                gpReportesOCItems.addRow(oc.getItemLine()+1,new Label(""), new Label("SUBTOTAL:"), new Label(""), new Label(String.valueOf(oc.getTotal())));
                gpReportesOCItems.addRow(oc.getItemLine()+2,new Label(""), new Label("TOTAL:"), new Label(""), new Label(String.valueOf(oc.getTotalOrden())));

            }
        }
    }



    /* END REPORTE DE ORDENES DE COMPRA*/

    public void ordenesDeCompraAlta(ActionEvent actionEvent) {
        pOrdenesdeCompraAltas.setVisible(true);
        pReportesOrdenesdeCompra.setVisible(false);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        gpProductos.setVisible(false);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);

        gpOrdenesdeCompraAltaCliente.getChildren().remove(5,gpOrdenesdeCompraAltaCliente.getChildren().size());
        if(gpOrdenesdeCompraAltaItems.getChildren().size() > 2) {
            gpOrdenesdeCompraAltaItems.getChildren().remove(3, gpOrdenesdeCompraAltaItems.getChildren().size());
        }

        txtOrdenesdeCompraAltaIdProducto.setText("");
        txtOrdenesdeCompraAltaCantidadProducto.setText("");
        txtOrdenesdeCompraAltaIdProducto.setDisable(true);
        txtOrdenesdeCompraAltaCantidadProducto.setDisable(true);
        txtOrdendeCompraCodigoOC.setText("");
        txtOrdenesdeCompraAltaIdCliente.setText("");
        txtOrdenesdeCompraAltaIdCliente.setDisable(false);
        btnOrdenesdeCompraAltaSearchCliente.setDisable(false);
        btnOrdenesdeCompraAltaAddProducto.setDisable(true);
        btnOrdenesdeCompraAltaClear.setDisable(true);
    }

    public void ordenesdeCompraSerachCliente(ActionEvent actionEvent) {
        gpOrdenesdeCompraAltaCliente.getChildren().remove(5,gpOrdenesdeCompraAltaCliente.getChildren().size());
        for (int i=0; i<DataSistema.clientes.size(); i++){
            if(Integer.parseInt(txtOrdenesdeCompraAltaIdCliente.getText()) == DataSistema.clientes.get(i).getId()){
                Orden orden = new Orden(DataSistema.clientes.get(i).getId(),new Date());
                DataSistema.ordenes.add(orden);
                Label lblCode = new Label(String.valueOf(orden.getId()));
                Label lblNombre = new Label(DataSistema.clientes.get(i).getNombres());
                Label lblApellido = new Label(DataSistema.clientes.get(i).getApellidos());
                Label lblDireccion = new Label(DataSistema.clientes.get(i).getDireccion());
                Label lblDepartamento = new Label(DataSistema.clientes.get(i).getDepartamento());

                txtOrdendeCompraCodigoOC.setText(String.valueOf(orden.getId()));
                gpOrdenesdeCompraAltaCliente.addRow(1,lblCode,lblNombre,lblApellido,lblDireccion,lblDepartamento);
                txtOrdenesdeCompraAltaIdCliente.setDisable(true);
                btnOrdenesdeCompraAltaSearchCliente.setDisable(true);
                txtOrdenesdeCompraAltaCantidadProducto.setDisable(false);
                txtOrdenesdeCompraAltaIdProducto.setDisable(false);
                btnOrdenesdeCompraAltaAddProducto.setDisable(false);
                btnOrdenesdeCompraAltaClear.setDisable(false);
            }
        }
    }


    public void ordenesdeCompraAddProducto(ActionEvent actionEvent) {
        System.out.println(Integer.parseInt(txtOrdendeCompraCodigoOC.getText()));
        Orden orden = null;
        if(gpOrdenesdeCompraAltaItems.getChildren().size() > 2) {
            gpOrdenesdeCompraAltaItems.getChildren().remove(3, gpOrdenesdeCompraAltaItems.getChildren().size());
        }
        for (int i=0; i < DataSistema.ordenes.size(); i++){
            if(Integer.parseInt(txtOrdendeCompraCodigoOC.getText()) == DataSistema.ordenes.get(i).getId()){
                orden = DataSistema.ordenes.get(i);
                orden.addItems(Integer.parseInt(txtOrdenesdeCompraAltaCantidadProducto.getText()), Integer.parseInt(txtOrdenesdeCompraAltaIdProducto.getText()));

                for (int io=0; io < orden.getItems().size(); io++){
                    Label lblCantidad = new Label(String.valueOf(orden.getItems().get(io).getCantidad()));
                    Label lblProducto = new Label(orden.getItems().get(io).getProducto().getNombre());
                    Label lblPrecio = new Label(String.valueOf(orden.getItems().get(io).getProducto().getPrecio()));

                    gpOrdenesdeCompraAltaItems.addRow(io+1,lblCantidad,lblProducto,lblPrecio);
                }
            }
        }
        txtOrdenesdeCompraAltaIdProducto.setText("");
        txtOrdenesdeCompraAltaCantidadProducto.setText("");
    }


    public void ordenesdeCompraAltaClear(ActionEvent actionEvent) {
        gpOrdenesdeCompraAltaCliente.getChildren().remove(5,gpOrdenesdeCompraAltaCliente.getChildren().size());
        if(gpOrdenesdeCompraAltaItems.getChildren().size() > 2) {
            gpOrdenesdeCompraAltaItems.getChildren().remove(3, gpOrdenesdeCompraAltaItems.getChildren().size());
        }

        txtOrdenesdeCompraAltaIdProducto.setText("");
        txtOrdenesdeCompraAltaCantidadProducto.setText("");
        txtOrdenesdeCompraAltaIdProducto.setDisable(true);
        txtOrdenesdeCompraAltaCantidadProducto.setDisable(true);
        txtOrdendeCompraCodigoOC.setText("");
        txtOrdenesdeCompraAltaIdCliente.setText("");
        txtOrdenesdeCompraAltaIdCliente.setDisable(false);
        btnOrdenesdeCompraAltaSearchCliente.setDisable(false);
        btnOrdenesdeCompraAltaAddProducto.setDisable(true);
        btnOrdenesdeCompraAltaClear.setDisable(true);
    }

    /* END ORDENES DE COMPRAS ALTAS */

    /* START ORDENTES DE COMPRAS BAJAS */

    public void ordenesdeComprasBajas(ActionEvent actionEvent) {
        pOrdenesdeComprasBajas.setVisible(true);
        pOrdenesdeCompraAltas.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        gpProductos.setVisible(false);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);
        pOrdenesdeCompraCambios.setVisible(false);

        btnOrdenesdeCompraBajasClear.setDisable(true);
        btnOrdenesdeCompraBajasDeleteOC.setDisable(true);
        txtOrdenesdeCompraBajaCodigoOC.setDisable(false);
        txtOrdenesdeCompraBajaCodigoOC.setText("");
        btnOrdenesdeCompraBajasSearch.setDisable(false);
    }

    public void ordenesdeCompraBajasClear(ActionEvent actionEvent) {
        gpOrdenesdeCompraBajasCliente.getChildren().remove(5,gpOrdenesdeCompraBajasCliente.getChildren().size());
        if(gpOrdenesdeCompraBajasProductos.getChildren().size() > 3) {
            gpOrdenesdeCompraBajasProductos.getChildren().remove(4, gpOrdenesdeCompraBajasProductos.getChildren().size());
        }

        btnOrdenesdeCompraBajasClear.setDisable(true);
        btnOrdenesdeCompraBajasDeleteOC.setDisable(true);
        txtOrdenesdeCompraBajaCodigoOC.setDisable(false);
        txtOrdenesdeCompraBajaCodigoOC.setText("");
        btnOrdenesdeCompraBajasSearch.setDisable(false);
    }

    public void ordenesdeComprasBajasDeleteOC(ActionEvent actionEvent) {
        gpOrdenesdeCompraBajasCliente.getChildren().remove(5,gpOrdenesdeCompraBajasCliente.getChildren().size());
        if(gpOrdenesdeCompraBajasProductos.getChildren().size() > 3) {
            gpOrdenesdeCompraBajasProductos.getChildren().remove(4, gpOrdenesdeCompraBajasProductos.getChildren().size());
        }



        for (int i=0; i<DataSistema.ordenes.size(); i++){
            if(Integer.parseInt(txtOrdenesdeCompraBajaCodigoOC.getText()) == DataSistema.ordenes.get(i).getId()){
                DataSistema.ordenes.remove(DataSistema.ordenes.get(i));
            }
        }
        btnOrdenesdeCompraBajasClear.setDisable(true);
        btnOrdenesdeCompraBajasDeleteOC.setDisable(true);
        txtOrdenesdeCompraBajaCodigoOC.setDisable(false);
        txtOrdenesdeCompraBajaCodigoOC.setText("");
        btnOrdenesdeCompraBajasSearch.setDisable(false);
    }

    public void ordenesdeCompraBajasBuscarOC(ActionEvent actionEvent) {

        gpOrdenesdeCompraBajasCliente.getChildren().remove(5,gpOrdenesdeCompraBajasCliente.getChildren().size());
        gpOrdenesdeCompraBajasProductos.getChildren().remove(4,gpOrdenesdeCompraBajasProductos.getChildren().size());

        Individual individual = null;
        Empresas empresas = null;
        Label clNombre = new Label("");
        Label clApellido = new Label("");
        Label clDireccion = new Label("");
        Label clDepartamento = new Label("");
        Label clDescuento = new Label("");

        Label pCantidad = new Label("");
        Label pNombre = new Label("");
        Label pPrecio = new Label("");
        Label pTotal = new Label("");

        Label ocTotal = new Label("");
        Label ocSubtotal = new Label("");
        Orden oc = null;
        Empresas clEmpresa = null;
        Individual clIndividual = null;
        for (int i=0; i < DataSistema.ordenes.size(); i++){
            if(!txtOrdenesdeCompraBajaCodigoOC.getText().equals("") && Integer.parseInt(txtOrdenesdeCompraBajaCodigoOC.getText()) == DataSistema.ordenes.get(i).getId()){
                txtOrdenesdeCompraBajaCodigoOC.setDisable(true);
                btnOrdenesdeCompraBajasSearch.setDisable(true);
                btnOrdenesdeCompraBajasClear.setDisable(false);
                btnOrdenesdeCompraBajasDeleteOC.setDisable(false);
                oc = DataSistema.ordenes.get(i);

                if(Utilerias.getNombreClase(oc.getCliente().getClass()) == Utilerias.getNombreClase(Individual.class)){
                    clIndividual = (Individual) oc.getCliente();
                    clNombre = new Label(clIndividual.getNombres());
                    clApellido = new Label(clIndividual.getApellidos());
                    clDireccion = new Label(clIndividual.getDireccion());
                    clDepartamento = new Label(clIndividual.getDepartamento());
                    clDescuento = new Label("");


                }else if(Utilerias.getNombreClase(oc.getCliente().getClass()) == Utilerias.getNombreClase(Empresas.class)){
                    clEmpresa = (Empresas) oc.getCliente();
                    clNombre = new Label(clEmpresa.getNombres());
                    clApellido = new Label(clEmpresa.getApellidos());
                    clDireccion = new Label(clEmpresa.getDireccion());
                    clDepartamento = new Label(clEmpresa.getDepartamento());
                    clDescuento = new Label(String.valueOf(clEmpresa.getDescuento()));
                }

                gpOrdenesdeCompraBajasCliente.addRow(1, clNombre, clApellido, clDireccion, clDepartamento, clDescuento);
                gpOrdenesdeCompraBajasCliente.prefHeight(40);

                for (int io=0; io<oc.getItems().size(); io++){
                    pCantidad = new Label(String.valueOf(oc.getItems().get(io).getCantidad()));
                    pNombre = new Label(oc.getItems().get(io).getProducto().getNombre());
                    pPrecio = new Label(String.valueOf(oc.getItems().get(io).getProducto().getPrecio()));
                    pTotal = new Label(String.valueOf(oc.getItems().get(io).getProducto().getPrecio() * oc.getItems().get(io).getCantidad()));

                    gpOrdenesdeCompraBajasProductos.addRow(io+1, pCantidad, pNombre, pPrecio, pTotal);
                    gpOrdenesdeCompraBajasProductos.prefHeight(40);
                }

                gpOrdenesdeCompraBajasProductos.addRow(oc.getItemLine()+1,new Label(""), new Label("SUBTOTAL:"), new Label(""), new Label(String.valueOf(oc.getTotal())));
                gpOrdenesdeCompraBajasProductos.addRow(oc.getItemLine()+2,new Label(""), new Label("TOTAL:"), new Label(""), new Label(String.valueOf(oc.getTotalOrden())));

            }
        }


    }

    /* END ORDENES DE COMPRAS BAJAS */


    /* START ORDNES DE COMPRAS CAMBIOS */

    public void searchOrdenesdeCompraCambios(ActionEvent actionEvent) {
        searchOrdenesdeCompraCambiosGeneral();
    }

    private void searchOrdenesdeCompraCambiosGeneral(){
        gpOrdenesdeCompraCambios.getChildren().remove(6,gpOrdenesdeCompraCambios.getChildren().size());
        for(int i=0; i < DataSistema.ordenes.size(); i++){
            if (!txtOrdenesdeCompraCambiosIdOC.getText().equals("") && Integer.parseInt(txtOrdenesdeCompraCambiosIdOC.getText()) == DataSistema.ordenes.get(i).getId()) {
                txtOrdenesdeCompraCambiosIdOC.setDisable(true);
                btnOrdenesdeCompraCambiosSearchOC.setDisable(true);
                btnOrdenesdeCompraCambiosEndOperation.setDisable(false);
                txtOrdenesdeCompraCambiosIdProducto.setDisable(false);
                txtOrdenesdeCompraCambiosCantidad.setDisable(false);
                for (int c = 0; c < DataSistema.ordenes.get(i).getItems().size(); c++) {

                    String textlinea = String.valueOf(DataSistema.ordenes.get(i).getItems().get(c).getNoLinea());
                    String textcodprd = String.valueOf(DataSistema.ordenes.get(i).getItems().get(c).getProducto().getId());
                    String textcantidad = String.valueOf(DataSistema.ordenes.get(i).getItems().get(c).getCantidad());

                    Label linea = new Label(String.valueOf(DataSistema.ordenes.get(i).getItems().get(c).getNoLinea()));
                    Label codprd = new Label(String.valueOf(DataSistema.ordenes.get(i).getItems().get(c).getProducto().getId()));
                    Label nameprd = new Label(DataSistema.ordenes.get(i).getItems().get(c).getProducto().getNombre());
                    Label priceprd = new Label(String.valueOf(DataSistema.ordenes.get(i).getItems().get(c).getProducto().getPrecio()));
                    Label cantidad = new Label(String.valueOf(DataSistema.ordenes.get(i).getItems().get(c).getCantidad()));

                    Button button = new Button("Editar");

                    button.setOnAction(value -> {
                        txtOrdenesdeCompraCambiosLinea.setText(textlinea);
                        txtOrdenesdeCompraCambiosIdProducto.setText(textcodprd);
                        txtOrdenesdeCompraCambiosCantidad.setText(textcantidad);

                        btnOrdenesdeCompraCambiosAdd.setDisable(true);
                        btnOrdenesdeCompraCambiosDelete.setDisable(false);
                        btnOrdenesdeCompraCambiosEdit.setDisable(false);
                        btnOrdenesdeCompraCambiosClean.setDisable(false);
                    });

                    gpOrdenesdeCompraCambios.addRow(c + 1, linea, codprd, nameprd, priceprd, cantidad, button);
                    gpOrdenesdeCompraCambios.prefHeight(40);
                }
                break;
            }
        }
    }

    public void btnOrdenesdeCompraCambiosClean(ActionEvent actionEvent) {
        txtOrdenesdeCompraCambiosLinea.setText("");
        txtOrdenesdeCompraCambiosIdProducto.setText("");
        txtOrdenesdeCompraCambiosCantidad.setText("");

        btnOrdenesdeCompraCambiosAdd.setDisable(false);
        btnOrdenesdeCompraCambiosEdit.setDisable(true);
        btnOrdenesdeCompraCambiosDelete.setDisable(true);
        btnOrdenesdeCompraCambiosClean.setDisable(true);
    }

    public void btnOrdenesdeCompraCambiosEndOperation(ActionEvent actionEvent) {

        txtOrdenesdeCompraCambiosIdOC.setDisable(false);
        txtOrdenesdeCompraCambiosIdOC.setText("");
        btnOrdenesdeCompraCambiosSearchOC.setDisable(false);
        btnOrdenesdeCompraCambiosEndOperation.setDisable(true);

        txtOrdenesdeCompraCambiosIdProducto.setDisable(true);
        txtOrdenesdeCompraCambiosCantidad.setDisable(true);

        btnOrdenesdeCompraCambiosAdd.setDisable(true);
        btnOrdenesdeCompraCambiosEdit.setDisable(true);
        btnOrdenesdeCompraCambiosDelete.setDisable(true);
        btnOrdenesdeCompraCambiosClean.setDisable(true);

        txtOrdenesdeCompraCambiosLinea.setText("");
        txtOrdenesdeCompraCambiosIdProducto.setText("");
        txtOrdenesdeCompraCambiosCantidad.setText("");

        gpOrdenesdeCompraCambios.getChildren().remove(6,gpOrdenesdeCompraCambios.getChildren().size());

    }

    public void btnOrdenesdeCompraCambiosAdd(ActionEvent actionEvent) {
        if(!txtOrdenesdeCompraCambiosCantidad.getText().equals("") && !txtOrdenesdeCompraCambiosIdProducto.getText().equals("")) {
            for (int i = 0; i < DataSistema.ordenes.size(); i++) {
                if (!txtOrdenesdeCompraCambiosIdOC.getText().equals("") && Integer.parseInt(txtOrdenesdeCompraCambiosIdOC.getText()) == DataSistema.ordenes.get(i).getId()) {
                    DataSistema.ordenes.get(i).addItems(Integer.parseInt(txtOrdenesdeCompraCambiosCantidad.getText()), Integer.parseInt(txtOrdenesdeCompraCambiosIdProducto.getText()));
                    txtOrdenesdeCompraCambiosIdProducto.setText("");
                    txtOrdenesdeCompraCambiosCantidad.setText("");
                    searchOrdenesdeCompraCambiosGeneral();
                    break;
                }
            }
        }
    }

    public void btnOrdenesdeCompraCambiosEdit(ActionEvent actionEvent) {
        if(!txtOrdenesdeCompraCambiosCantidad.getText().equals("") && !txtOrdenesdeCompraCambiosIdProducto.getText().equals("")) {
            for (int i = 0; i < DataSistema.ordenes.size(); i++) {
                if (!txtOrdenesdeCompraCambiosIdOC.getText().equals("") && Integer.parseInt(txtOrdenesdeCompraCambiosIdOC.getText()) == DataSistema.ordenes.get(i).getId()) {
                    Producto producto = null;

                    for (int p=0; p < DataSistema.productos.size(); p++) {
                        if(Integer.parseInt(txtOrdenesdeCompraCambiosIdProducto.getText()) == DataSistema.productos.get(p).getId()){
                            producto = DataSistema.productos.get(p);
                            break;
                        }
                    }

                    DataSistema.ordenes.get(i).getItems().get(Integer.parseInt(txtOrdenesdeCompraCambiosLinea.getText())-1).setCantidad(Integer.parseInt(txtOrdenesdeCompraCambiosCantidad.getText()));
                    DataSistema.ordenes.get(i).getItems().get(Integer.parseInt(txtOrdenesdeCompraCambiosLinea.getText())-1).setProducto(producto);


                    txtOrdenesdeCompraCambiosLinea.setText("");
                    txtOrdenesdeCompraCambiosIdProducto.setText("");
                    txtOrdenesdeCompraCambiosCantidad.setText("");
                    searchOrdenesdeCompraCambiosGeneral();
                    break;
                }
            }
        }
    }

    public void btnOrdenesdeCompraCambiosDelete(ActionEvent actionEvent) {
        if(!txtOrdenesdeCompraCambiosLinea.getText().equals("")) {
            ItemOrden itemOrden = null;
            for (int i = 0; i < DataSistema.ordenes.size(); i++) {
                if (!txtOrdenesdeCompraCambiosIdOC.getText().equals("") && Integer.parseInt(txtOrdenesdeCompraCambiosIdOC.getText()) == DataSistema.ordenes.get(i).getId()) {
                    itemOrden = DataSistema.ordenes.get(i).getItems().get(Integer.parseInt(txtOrdenesdeCompraCambiosLinea.getText())-1);
                    DataSistema.ordenes.get(i).getItems().remove(itemOrden);

                    txtOrdenesdeCompraCambiosLinea.setText("");
                    txtOrdenesdeCompraCambiosIdProducto.setText("");
                    txtOrdenesdeCompraCambiosCantidad.setText("");
                    searchOrdenesdeCompraCambiosGeneral();
                    break;
                }
            }
        }

    }

    public void menuOrdenesdeCompraCambios(ActionEvent actionEvent) {
        pOrdenesdeComprasBajas.setVisible(false);
        pOrdenesdeCompraAltas.setVisible(false);
        pReportesOrdenesdeCompra.setVisible(false);
        pReportClientes.setVisible(false);
        pReportProductos.setVisible(false);
        gpProductos.setVisible(false);
        gridClienteIndividual.setVisible(false);
        gridClienteEmpresa.setVisible(false);

        pOrdenesdeCompraCambios.setVisible(true);
    }

    public void menuHelpAbout(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "CAMM - DEV | v 1.0.1");
    }
    
    /* END ORDNES DE COMPRAS CAMBIOS */


}
