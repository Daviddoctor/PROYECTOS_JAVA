package dominio;

public class Persona {
  protected String nombre;  
  protected char genero;
  protected int edad;
  protected String direccion;
  
  public Persona(){
  //Para crear atributos de la clase Persona sin inicializar
  }
  public Persona(String nombre){
      this.nombre = nombre; //La referencia this es para inicializar la variable
  }
    //Constructor que inicializa todas las variables de la clase padre
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    //Metodos Getter y setter

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Metodo toString para exportar la información de este documento 
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", genero = " + genero + ", edad = " + edad + ", direccion = " + direccion + '}';
    }
    
}
