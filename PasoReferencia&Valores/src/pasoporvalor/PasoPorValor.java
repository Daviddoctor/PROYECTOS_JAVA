package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        /*var x = 9;
        System.out.println("x = " + x);
        cambioValor(x);*/
//        var x = 10;
//        System.out.println("x = " + x);
//        cambioValor(x);
//        System.out.println("El nuevo valor de x = " + x);
//***************************
    var x = 10;
        System.out.println("x = " + x);
        x = cambioValor(x);
        System.out.println("El valor nuevo de x = " + x);
    }
//    public static void cambioValor (int arg1){
//        //System.out.println("arg1 = " + arg1);
//        System.out.println("arg1 = " + arg1);
//        arg1 = 15;
//    }
    //********************* Tercera Forma
    public static int cambioValor (int arg1){
        System.out.println("arg1 = " + arg1);
        return arg1 = 15;
    }  
}
