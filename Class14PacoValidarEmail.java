import java.util.Scanner;

public class Class14PacoValidarEmail {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un Email");
        String email = teclado.nextLine();
        // •	Exista una @
        // •	@ no esté ni al inicio ni al final
        // •	Solamente una @
        // •	Exista un punto
        // •	Exista un punto después de la @
        // •	Dominio de 2 a 3 caracteres
        if (email.contains("@") == false){
            System.out.println("No existe @");
        }else if (email.indexOf("@") == 0
        || email.endsWith("@")){
            System.out.println("@ al inicio o al final");
        }else if (email.indexOf("@") != email.lastIndexOf("@")){
            System.out.println("Existe más de una @");
        }else if (email.indexOf(".") == -1){
            System.out.println("No existe punto");
        }else if (email.lastIndexOf(".") < email.indexOf(("@"))){
            System.out.println("Necesitamos punto después de @");
        }else{
            int ultimoPunto = email.lastIndexOf(".");
            String dominio = email.substring(ultimoPunto + 1);
            if (dominio.length() >= 2 && dominio.length() <= 3){
                System.out.println("El email es CORRECTO!!!");
            }else{
                System.out.println("El dominio debe ser de 2 a 3 caracteres");
            }teclado.close();
        }
    }
}
