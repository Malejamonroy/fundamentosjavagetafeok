import java.util.Scanner;

public class Class25PacoMetodoPositivoNegativo {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero");
        String dato = teclado.nextLine();
        int valor = Integer.parseInt(dato);
        String data=evaluarNumero(valor);
        System.out.println(data);
        teclado.close();
    }
    
    public static String evaluarNumero(int numero){
        String respuesta = "";
        
        if (numero > 0){
            System.out.println("POSITIVO");
        }else if(numero == 0){
            System.out.println("CERO");
        }else {
            System.out.println("NEGATIVO");
        }
        return respuesta;
    
    }
}
