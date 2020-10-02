package model;

import java.sql.Timestamp;
import java.util.Date;

public class Orden {
    public static int sigIdOrden = 1;
    private int id;
    private Cliente cliente;
    private ItemOrden item1;
    private ItemOrden item2;
    private Date fechaOrden;
    private double precioEnvio;
    private double total;
    private String tipoEnvio;
    private String estado;
    private int diasEnvio;

    public Orden(){
        this.id = sigIdOrden++;
        this.total = 0.0;
        this.fechaOrden = new Date();
    }

    public Orden(Date pFecha) {
        this.fechaOrden = pFecha;
    }

    public Orden(int pCliente, Date pFecha) {

    }

    public double getTotalOrden() {
        return 0;
    }




    private Timestamp ActualDateTime(){
        Date date = new Date();
        return new Timestamp(date.getTime());
    }

}
