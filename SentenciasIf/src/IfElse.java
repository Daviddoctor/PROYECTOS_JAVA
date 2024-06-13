
public class IfElse {
    public static void main(String[] args) {
        var num = 5;
        var numText = "Numero Desconocido";
        
        switch (num) {
            case 1:
                numText = "Numero uno";
                break;
            case 2:
                numText = "Numero dos";
                break;
            case 3:
                numText = "Numero tres";
                break;
            case 4:
                numText = "Numero cuatro";
                break;
            default:
                System.out.println("Numero no encontrado");
                break;
        }
        System.out.println(numText);
    }
}
