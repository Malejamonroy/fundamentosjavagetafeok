import java.util.ArrayList;
import java.util.Scanner;

public class Class23ArrayListNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> coleccionNumeros = new ArrayList<Integer>();
        String num = "";
        int suma = 0;
        while (num.equalsIgnoreCase("-1" ) == false) {
            System.out.println("Introduzca Números: ");
            num = teclado.nextLine();
            System.out.println("Numeros almacendos: " + coleccionNumeros.size());

            if(coleccionNumeros.indexOf(Integer.parseInt(num))== -1){//que no sea repetido
                int aux = Integer.parseInt(num);//convertimos el String en numero con el Integer.parseInt por el metodo estatico
                coleccionNumeros.add(aux);
            }else {
                System.out.println("Error:numero repetido");
            }
            System.out.println("---------------------");
            
        } 
        coleccionNumeros.remove(coleccionNumeros.size() -1);
    
        for (int numero: coleccionNumeros) {
            suma += numero;
            System.out.println(numero);
            
        }
        
        System.out.println("la suma de los numeros es: " + suma);
        teclado.close();
    }   
    
}
