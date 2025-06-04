import java.util.Scanner;

public class Class06MayorTresNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pedimos los numeros
        System.out.println("Introduzca número 1");
        String dato = teclado.nextLine();
        int num1 = Integer.parseInt(dato);
        System.out.println("Introduzca número 2");
        dato = teclado.nextLine();
        int num2 = Integer.parseInt(dato);
        System.out.println("Introduzca número 3");
        dato = teclado.nextLine();
        int num3 = Integer.parseInt(dato);
        //necesitamos saber el numero mayor
        //int mayor; //instanciar un objeto es inicializarlo
        //toda variable siempre debe ser instanciada anres de poder utilizarla
         int mayor = 0;
         //PREGUNTAMOSPOR LAS CONDICIONES 
         if( num1 > num2 && num1 > num3){
            mayor = num1;
         } else if(num2 > num1 && num2 > num3){
            mayor = num2;
         }else{
            mayor= num3;
        }
        System.out.println("El número mayir es " + mayor);
        teclado.close();
    }
}
