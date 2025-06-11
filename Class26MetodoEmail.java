//necesitamos un programa que pedira un email al usuario y validaresmos si es correcto o no 
//mediante a un metodo que validara el mail, debemos indicar si es true/false el email.
//Adaptamos el codigo que tenemos de validar un mail a este ejemplo.
// En el main() principal, un Scaner para pedir un mail y mostar si es correcto o no 

import java.util.Scanner;

public class Class26MetodoEmail {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su email: ");
        String dato = teclado.nextLine();
        String valEmail = metodoEmail()
        
    }
    public static  String metodoEmail(String email){
        String email = "";
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
        }
    }
}
