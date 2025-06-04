import java.util.Scanner;

public class Class03SumarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //pedimois el primer numero al usuario
        System.out.println("Introduzca número 1");
        //Almacenamos el primer numero
        //como lo que quiero con el numero es sumar, lo debemos almacenar como un entero
        // voy a capturar el dato como sting de lo que el usuario me ha mandado
        String dato = teclado.nextLine();
        //convertimos el dato en int
        int numero1 = Integer.parseInt(dato);
        //pedimos el numero 2
        System.out.println("Introduzca número 2");
        //Volvemos a utilizar la variable dato
        dato = teclado.nextLine();
        //convertimos el dato a int
        int numero2 = Integer.parseInt(dato);
        //Realizamos la suma
        int suma = numero1 + numero2;
        //dibujamos la suma
        System.out.println("La suma es " + suma);
        System.out.println("Fin del programa");
        teclado.close();

        
    }
}
