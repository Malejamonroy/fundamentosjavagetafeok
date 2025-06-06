// Necesito un programa para validar un Email. Class14ValidarEmail.java
// Debemos indicar cada error del Email.
// No podemos utilizar bucles, solamente IF.
// Vamos a comprobar una serie de elementos:

// Exista una @
// @ no esté ni al inicio ni al final
// Solamente una @
// Exista un punto
// Exista un punto después de la @
// Dominio de 2 a 3 caracteres

// If (email.contains(“@”) == false)
// 	Mensaje de No existe @
// Else if …..


import java.util.Scanner;

public class Class14ValidarEmail {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca Email: ");
        String email = teclado.nextLine();
        //comprobamos que exista un @
        if(email.contains("@") == false){
            System.out.println("EL EMAIL NO EXISTE");
        }else if(email.startsWith("@" ) || email.endsWith("@") ){//que el @ no este ni al inicio ni al final
            System.out.println("ERROR, intentelo de nuevo");
        }else if(email.indexOf("@") != email.lastIndexOf("@")){//que solamente tenga un @
            System.out.println("Erro Fatal, email incorrecto");
        }else if(email.contains(".") == false){//Exista un punto
            System.out.println("Falta el punto");
        }else if(email.indexOf("@") > email.indexOf(".")){//Exista un punto despues del @
            System.out.println("mal");
        }else if(email.lastIndexOf(".") != email.length()-3 && email.lastIndexOf(".") != email.length()-4 ){//Dominio de 2 a 3 caracteres
            System.out.println("Dominio incorrecto");
        }else{
            System.out.println("EL "+ " "+ email+" " + "ES CORRECTO");
        }teclado.close();


    }
}
