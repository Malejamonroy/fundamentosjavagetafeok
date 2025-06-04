

public class Class01Primitivos {

    public static void main(String[] args) {
        //CONVERSION AUTOMATICA
        byte menor = 15;
        int mayor = menor;

        //CONVERSION ENTRE PRIMITIVOS 
        // int mayor = 15;
        // byte menor = (byte) mayor;

        // //CONVERTIR CUALQUIER OBJETO A STRING
        // String texto = "12";
        // texto = Integer.toString(mayor);
        // texto = Byte.toString(menor);

        //CONVERTIR STRING  A PRIMITIVO 
        String texto = "12";
        int variable = Integer.parseInt(texto);

        //GUARDAR PRIMITIVO A STRING
        int numero = 15;
        String texto2 = String.valueOf(numero);// "15"
        System.out.println("fin del programa");

        
    }
}