package model;

public class ItemOrden {
    protected int noLinea;
    protected int cantidad;
    protected Producto producto;

    public ItemOrden(int pNoLinea, int pCantidad, int pIdProducto) {
        this.noLinea = pNoLinea;
        this.cantidad = pCantidad;
        //this.producto = producto;
    }

    @Override
    public String toString() {
        return "[" + Utilerias.getNombreClase(this.getClass()) + "] " +
                "noLinea=" + noLinea +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }

    public double getTotalItem(){
        return this.producto.getPrecio() * cantidad;
    }
}
