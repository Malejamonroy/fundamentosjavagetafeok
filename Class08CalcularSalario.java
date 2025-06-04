import java.util.Scanner;

public class Class08CalcularSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //pedimos los datos
        System.out.println("Introduzca Horas Semanales ");
        String dato = teclado.nextLine();
        int hSemanasle = Integer.parseInt(dato);
    }
}
