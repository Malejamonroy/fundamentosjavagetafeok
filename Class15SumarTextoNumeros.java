import java.util.Scanner;

public class Class15SumarTextoNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una serie de números");
        String textoNumeros = teclado.nextLine();
        //digamos que el usuario metio 1234
        int suma = 0;
        //hacemos el bucle
        for(int i = 0; i<textoNumeros.length();i++){ // textoNumeros.length() longitud del texto
            //capturamos cada letra del texto
            //int num = Integer.parseInt(String.valueOf(textoNumeros.charAt(i)));
            char letra = textoNumeros.charAt(i);
            //convertimos el chart a int (el texto a numero)
            //'1' --> es el 49 char en el ascii
            //"1" --> 1 es un string
            String aux = String.valueOf(letra);
            int numero = Integer.parseInt(aux);
            suma += numero;

            // int numero = Character.getNumericValue(letra);
            // //sumamos cada numeros que extraemos
            // suma += numero;
        }System.out.println("la suma de " + textoNumeros + " es: " + suma);
        teclado.close();
    }
    
}
