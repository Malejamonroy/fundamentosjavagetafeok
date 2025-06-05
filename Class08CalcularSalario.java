import java.util.Scanner;

public class Class08CalcularSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //pedimos los datos
        System.out.println("Introduzca Horas Semanales ");
        String dato = teclado.nextLine();
        int hSemanasle = Integer.parseInt(dato);

        System.out.println("Introduzca Horas Trabajadas");
        dato = teclado.nextLine();
        int hTrabajadas = Integer.parseInt(dato);

        System.out.println("Introduzca Kilometros ");
        dato = teclado.nextLine();
        int kilometros = Integer.parseInt(dato);

        int salarioBase = (36 * 24);
        int precioHora = (24);
        String dieta;


        // if (hSemanasle > 36){
        //     hExtras += 2;
        // }

        if(kilometros < 900){
            dieta = "NACIONAL";
        }else if(kilometros > 900 ){
            dieta = "INTERNACIONAL";
        }else if(kilometros > 101){
            dieta = "PROVICIONAL";
        }
        System.out.println("Horas semanales" + hSemanasle);
        System.out.println("Horas Extras" + hTrabajadas);
        System.out.println("Distancia en Kilometros" + kilometros);


    }
}
