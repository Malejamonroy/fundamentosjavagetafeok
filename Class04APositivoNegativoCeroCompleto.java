import java.util.Scanner;

public class Class04APositivoNegativoCeroCompleto {
    

    public static void main(String[] args) {
        //podemos convertir con scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        String dato = teclado.nextLine();
        //convertimos dato en int
        int numero = Integer.parseInt(dato);
        if (numero > 0)
        {
            System.out.println("El número es  POSITIVO");
        }
            else if(numero ==0)
            {
                System.out.println("El numero es CERO");
            }else
                    {
                    System.out.println("El numero es NEGATIVO");
                    }
        System.out.println("Fin de programa");;
        teclado.close();
    }
   
}
