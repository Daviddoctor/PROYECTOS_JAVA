package archivoencriptado;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encrypt {
    public void encriptarTexto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto a encriptar (Ctrl+D para finalizar): ");
        StringBuilder textoEncriptado = new StringBuilder();

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            textoEncriptado.append(encriptar(linea)).append("\n");
        }

        try {
            FileWriter writer = new FileWriter("arqcomp.txt");
            writer.write(textoEncriptado.toString());
            writer.close();
            System.out.println("Texto encriptado guardado en arqcomp.txt");
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo " + e.getMessage());
        }
    }

    private String encriptar(String texto) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            //Añadir +1 al código ASCII de cada caracter
            char caracterEncriptado = (char) (caracter + 1);
            textoEncriptado.append(caracterEncriptado);
        }
        return textoEncriptado.toString();
    }
}
