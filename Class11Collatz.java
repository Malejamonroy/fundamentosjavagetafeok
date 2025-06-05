import java.util.Scanner;

public class Class11Collatz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Número para collatz: ");
        String dato = teclado.nextLine();
        int num = Integer.parseInt(dato);
        
        while (num != 1) {
            if (num % 2 == 0) { //si el numero es par
                num = num / 2;
            } else { //esto es si es numero impar
                num = num * 3 + 1;
            }
            System.out.println(num);
        
        }teclado.close();
    }
    
}
