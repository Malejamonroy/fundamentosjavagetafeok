//necesito un programa para mostrar si un numero es narcisista o no es.
//Un número narcisista es aquel que la suma d elas potencias de su longitud es el mismo resultado que el numero introducido

//Este numero es nacisista: 153
//Longitud: 3 (potencia de 3)
//1x1x1= 1
//5x5x5=125
//3x3x3= 27
// 1+125+27=153!!!
import java.util.Scanner;

public class Class16Narcisista {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca Número");
        String textoNumero = teclado.nextLine();
        int suma=0;
        //convertir el int a String
       for(int i = 0; i < textoNumero.length();i++){ //con esto sabemos la longitud del texto, el numero de caracteres
        char num = textoNumero.charAt(i);//nos devuelve el numero de la posicion i
        String aux= String.valueOf(num); // pasamos el numero a string
        int numeroString = Integer.parseInt(aux);//pasamos el numero a entero
        suma += Math.pow(numeroString,textoNumero.length());//la operacion 
        } 
        int resuteclado = Integer.parseInt(textoNumero); //atrapamos el texto que introducimos por teclado
        if(resuteclado == suma){ //comparamos la suma del for con lo que metemos por teclado
            System.out.println("El numero es Narcisista");
        }else{
            System.out.println("El numero no es narcisista");
        }
    }

}
