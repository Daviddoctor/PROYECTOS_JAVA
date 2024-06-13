
package invertirtexto;

public class Pila {
    Nodo tope;
    
    public Pila(){
        tope = null;
    }
    
    boolean pVacia(){
        return tope == null;
    }
    
    void inDato (char x){//char x
        Nodo nuevo = new Nodo(x);
        if(pVacia())
            tope = nuevo;
        else{
            nuevo.sig = tope;
            tope = nuevo;
        }
    }
    int retirarValor(){
        char x = 0;//char
        if(!pVacia()){
            x = tope.info;
            tope = tope.sig;           
        }
        return x;
    }
    
    String mostrarPila(){
        String salida ="";
        Nodo aux = tope;
        while(aux!= null){
            salida += aux.info+" ";//""
            aux = aux.sig;
        }
        return salida;
    }
    
    boolean palindromo(String p){
        p = p.replaceAll("\\s+","").toLowerCase();
        int i=0;
        int j= p.length()-1;
        while(i < j){
            if (p.charAt(i) != p.charAt(j)){ 
                return false;
            }
            i++;
            j--;        
        }
        return true;
    }

}
