package ec.edu.espoch.gymbros.modelo;

import java.util.ArrayList;

public class Persona {
    //Atributos
    private String nombre;
    private Integer edad;
    private String cedula;
    private String tpSangre;
    private String tpSuscripcion;
    //Constructor
    public Persona() {
    }
    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getTpSangre() {
        return tpSangre;
    }
    public void setTpSangre(String tpSangre) {
        this.tpSangre = tpSangre;
    }
    public String getTpSuscripcion() {
        return tpSuscripcion;
    }
    public void setTpSuscripcion(String tpSuscripcion) {
        this.tpSuscripcion = tpSuscripcion;
    }
    //Metodos
    public String ingresarDatos(){
         return Archivo.anexarArchivo(this.nombre, this.edad, this.cedula, this.tpSangre, this.tpSuscripcion);
    }
    public ArrayList<Persona> mostrarDatos(){
        return Archivo.leerArchivo();
    }
}
