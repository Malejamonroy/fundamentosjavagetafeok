import java.util.Scanner;

public class Class13CalcularDni {
    public static void main(String[] args) {
        //CUAL ES LA LETRA QUE LE CORRESPONDE AL DNI 
        // Scanner teclado = new Scanner(System.in);
        // System.out.println("Introduzca su DNI: ");
        // String dato = teclado.nextLine();
        // int numeroDni = Integer.parseInt(dato);
        // String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        // //(Nº DNI -(Ent(nº DNI / 23)*23))
        // //dentro de java tenemos una clase para realizar operaciones ,atematicas con numeros super util: Math
        // int resultado = (numeroDni -(numeroDni/23)*23);
        // char letra = letrasDni.charAt(resultado);
        // System.out.println("Su letra de DNI es" + letra);


        //COMPROVAMOS SI EL DNI ES VALIDO
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Comnprobar NIF: ");
        System.out.println("2. Averiguar letra NIF: ");
        String dato = teclado.nextLine();
        
        int opcion = Integer.parseInt(dato);
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        if(opcion == 1){
            System.out.println("Introduzca su NIF (12345678X)");
            String dni = teclado.nextLine();
            //para reaclizar el calculo, necesitamos dividir el numero de la letra
            //comenzamos recuperando la letra
            char letraDni = dni.charAt(dni.length() -1); //COGEMOS LA LETRA
            String temp = dni.substring(0,dni.length() -1); //con este recupero las letras hasta la antepenultima con el -1
            int numeroDni = Integer.parseInt(temp);
            int resultado = (numeroDni -(numeroDni/23)*23);
            char letra = letrasDni.charAt(resultado);//la letra que corresponde
            //comprobamos que la letra que nos ha dado en el dni es igual a la letra que corresponde a su numero
            if(letraDni == letra){
                System.out.println("Su DNI es correcto");
            }else{
                System.out.println("Su DNI es incorrecto, su letra es " + letra);
            }
        }else{
            System.out.println("Introduzca su DNI: ");
            dato = teclado.nextLine();//capturamos lo que escriba el usuario por teclado
            int numeroDni = Integer.parseInt(dato);
            int resultado = (numeroDni -(numeroDni/23)*23);
            char letra = letrasDni.charAt(resultado);
            System.out.println("Su letra de DNI es" + letra);

        }teclado.close();
     
       
    }
}
