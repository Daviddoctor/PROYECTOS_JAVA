//Formas de concatenación

public class Concat {

    public static void main(String[] args) {
        var usuario = "juan";
        var titulo = " ingeniero";
        var union = usuario+titulo;
        System.out.println("union = " + union);
        
        var i=3;
        var j=4;
        System.out.println(i+j);
        System.out.println(i+j+usuario);
        System.out.println(usuario+(i+j));
        System.out.println(usuario+i+j);

    }
}
