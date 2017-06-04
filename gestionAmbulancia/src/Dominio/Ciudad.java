package Dominio;

public class Ciudad {

    static int codigoAutoNum = 0;
    int codigo;
    String nombre;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad(String nombre) {
        codigoAutoNum++;
        codigo=codigoAutoNum;
        this.nombre = nombre;
    }
    
    public String mostrarCiudades(){
        return "Nombre: "+nombre+" "+ "ID: "+codigo+"\n";
    }

}
