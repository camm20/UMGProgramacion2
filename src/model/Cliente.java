package model;

public class Cliente {
    private static int sigIdCliente = 1;
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String departamento;
    //private String nit;
    //private String mail;
    //private String telefono;

    public Cliente(){
        this.id = sigIdCliente++;
    }

    public Cliente(String nombres, String apellidos, String direccion, String departamento) {
        this.id = new Cliente().getId();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
