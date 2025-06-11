//Necesitamos un sencillo programa que tenga un metodo que reciba un numero y nos devolvera si el numero es positivo
// o negativo o cero.
//en el main() principal, tendremos un Scaner que pedira un numero al usuario y llegaremos al metodo para comprobar 
//su funcionalidad.

import java.util.Scanner;

public abstract class Class25MetodoPositivoNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int dato = teclado.nextInt();
        numero(dato);
        teclado.close();
    }
    public static void numero( int num){
    
        if (num > 0){
            System.out.println("el numero es POSITIVO");
        }else if(num == 0){
            System.out.println("El numero es CERO");
        }else {
            System.out.println("El numero es NEGATIVO");
        }
    
    }
}
