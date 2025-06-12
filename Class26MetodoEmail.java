//necesitamos un programa que pedira un email al usuario y validaresmos si es correcto o no 
//mediante a un metodo que validara el mail, debemos indicar si es true/false el email.
//Adaptamos el codigo que tenemos de validar un mail a este ejemplo.
// En el main() principal, un Scaner para pedir un mail y mostar si es correcto o no 

import java.util.Scanner;

public class Class26MetodoEmail {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su email: ");
        String email = teclado.nextLine();
        
        String valEmail = metodoEmail(email);
        System.out.println(valEmail);
        teclado.close();
        
    }
    public static  String metodoEmail(String email){
        String respuesta = "";
        if(email.contains("@") == false){
           respuesta = "EL EMAIL NO EXISTE";
        }else if(email.startsWith("@" ) || email.endsWith("@") ){//que el @ no este ni al inicio ni al final
            respuesta = "ERROR, intentelo de nuevo";
        }else if(email.indexOf("@") != email.lastIndexOf("@")){//que solamente tenga un @
            respuesta = "Erro Fatal, email incorrecto";
        }else if(email.contains(".") == false){//Exista un punto
            respuesta = "Falta el punto";
        }else if(email.indexOf("@") > email.indexOf(".")){//Exista un punto despues del @
            respuesta = "mal no existe el punto despues del @";
        }else if(email.lastIndexOf(".") != email.length()-3 && email.lastIndexOf(".") != email.length()-4 ){//Dominio de 2 a 3 caracteres
            respuesta = "Dominio incorrecto";
        }else{
            respuesta = "EL "+ " "+ email+" " + "ES CORRECTO";
        }return respuesta;
    }
}
