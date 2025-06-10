import java.util.Scanner;

public class Class20ArrayNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]numero = new int[8]; //declaramosa un array de numeros enteros
        int mayor =0;
        int menor = 0;
        int suma = 0;
        int media = 0;


       for(int i=0; i < numero.length;i++)
       {
            System.out.println("Ingrese números: ");
            String dato = teclado.nextLine();
            numero[i]=Integer.parseInt(dato);//guardo el numero dentro de la posicion del array
            if (numero[i] > mayor){ //comprobamos cual  el mayor
                mayor = numero[i];
            }
            if (numero[i] < menor || i==0){//sacamos el menor
                menor = numero[i];

            }
            suma += numero[i];
        }
        media =suma/numero.length;
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("la media de los numeros es: " + media);
        System.out.println("la suma de los números es: " + suma);
        teclado.close();
    }

       
}
