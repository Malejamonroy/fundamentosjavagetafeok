import java.util.Scanner;

public class Class05Estaciones {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero del 1 al 4");
        String dato = teclado.nextLine();
        //convertimos el numero en int
        int numero = Integer.parseInt(dato);
        if (numero == 1)
        {
            System.out.println("Primavera");
        }else if(numero == 2)
        {
            System.out.println("Verano");
        }else if(numero == 3)
        {
            System.out.println("Invierno");
        }else if(numero == 4)
        {
            System.out.println("Otoño");
        }else{
            System.out.println("Numero incorrecto");
        }
        teclado.close();
    }
}
