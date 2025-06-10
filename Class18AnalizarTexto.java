import java.util.Scanner;

public class Class18AnalizarTexto {

    // Debemos utilizar la clase Character. Pedimos cualquier texto al usuario y debemos indicar los 
    // siguientes datos sobre el texto escrito:

    // Texto: Hoy es martes 10 de junio de 25
   
    // Numeros de letras :9
    // Números de dígitos:4
    // Número de vocales:6
    // Número de consonantes: 3
    // Mayúsculas: 1

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca texto: ");
        String texto = teclado.nextLine();//nos guardamos el texto 

        int letras = 0;
        int digitos = 0;
        int vocales = 0;
        int consonantes = 0;
        int mayusculas = 0;

         // Numeros de letras :9
         for(int i = 0; i < texto.length(); i++){//recorrecomos caracter a carecter el texto
            char letra = texto.charAt(i);
            if(Character.isDigit(letra) == true){
                digitos += 1;//numero de digito que va sumando
            }else if (Character.isLetter(letra) == true){
            letras +=1;
                if(Character.isUpperCase(letra)== true){
                    mayusculas += 1 ;//si la letras es letra y si es en mayuscula
                }
                if (Character.toLowerCase(letras) == 'a'
                ||Character.toLowerCase(letras) == 'e'
                ||Character.toLowerCase(letras) == 'i'
                ||Character.toLowerCase(letras) == 'u'
                ||Character.toLowerCase(letras) == 'o'){
                    vocales += 1;
                }else{
                    consonantes +=1;
                }
            }
        }
        System.out.println("Número de letras: " + letras);
        System.out.println("Número de dígitos: " + digitos);
        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        teclado.close();
    }
    
}
