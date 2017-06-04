
package Dominio;

public class Chofer {

    String nombre;
    int cedula;

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Chofer(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String mostrarChofer(){
        return "Nombre: "+ nombre + "CI: "+ cedula;
    }
}
