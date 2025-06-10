import java.util.Scanner;

public class Class17ValidarIsbn {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca Numero de ISBN: ");
        String isbn = teclado.nextLine(); //lo que entra por teclado es un string
        
        if (isbn.length()==10){
            int suma = 0;
            for(int i = 0; i < isbn.length() ;i++){
                char letra = isbn.charAt(i); //este recorre cada letra o numero
                String aux= String.valueOf(letra); // este convierte el valor de num a un string con el valueOf (la_variable que va a convertir)
                int numero = Integer.parseInt(aux);//cogemos el numero y lo convetimos a string
            
                //hacemos la operacion
                int operacion = numero * (i+1);
                //las operaciones las vamos sumando
                suma += operacion;
            }
            //ahora lo dividimos entre 11
            if(suma%11== 0){
                System.out.println("El número ISBN es correcto!!!");
            }else{
                System.out.println("El número ISBN es Incorrecto!!!");
            }
        }else{
            System.out.println("El número ISBN debe ser de 10 caracteres");
            
        }teclado.close();
    }
}
