package dominio;

public class Persona {
    //Atributos de la clase
    private String nombre; 
    private double sueldo;
    private boolean eliminado;
    
 // Consotructor   
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    //Metods Get and Set
    public String getNombre(){
    return this.nombre;
}
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //Con el boolean nos e utilizan metodos Get en su lugar Is
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
       
//    public String toString(){
//        return "Persona[ nombre: " + this.nombre +
//                ", Sueldo: " + this.sueldo + 
//                ", Eliminado: " + this.eliminado + " ]"; 
//    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    
}
