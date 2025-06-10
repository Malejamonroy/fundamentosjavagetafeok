import java.util.Scanner;

public class Class16PacoNarcisista {
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca Número");//pedimos un numero
        String textoNumero = teclado.nextLine();//captiramos como string
        int longitud = textoNumero.length();// es lo que vamos a elevera
        int suma= 0;
        for(int i=0; i< textoNumero.length();i++){
            char letra = textoNumero.charAt(i);
            String aux = String.valueOf(letra);
            int numero= Integer.parseInt(aux);
            int operacion =(int) Math.pow(numero,longitud);//la suma de las potencias debemos que compararla para almacenarla
            suma +=operacion;
            

        }
        //ahora comparamos los vamores pero como es string y el otro es int
        if (suma == Integer.parseInt(textoNumero)){ //lo convertimos a entero
            System.out.println("El nùmero" + textoNumero + "es narcisista");
        }else{
            System.out.println("El número No es narcisista");
        }teclado.close();

    }

}
