import java.util.ArrayList;

public class Class27MetodosNarcisista {
    public static void main(String[] args) {
        ArrayList<Integer> coleccionNarcisista = new ArrayList<Integer>();
        for(int i = 0; i<= 20000;i++){
         // metNarcisista(i); //llamoasmoa al metodo
            if(metNarcisista(i)== true){ //aqui pregunta si el numero es narcisita y de una vez llamamos al metodo
                coleccionNarcisista.add(i); //aqui guardamos los numeros para posterormente dibijarlos
            }
       } 
       for (Integer numArraylis : coleccionNarcisista) { //el tipo de dato, el nombre de esa variable donde se guarda informacion de cada posicion de la coleccion, es el arraylis el que recogemos
        System.out.print(numArraylis + ","); // aqui los pintamos
       }
       System.out.println("Fin del programa");
    }
    public static boolean metNarcisista (int numero){
        String textoNumero = String.valueOf(numero);//con este converti la variable a de nuemro a string
        int suma=0;
        //convertir el int a String
       for(int i = 0; i < textoNumero.length();i++){ //con esto sabemos la longitud del texto, el numero de caracteres
        char num = textoNumero.charAt(i);//nos devuelve el numero de la posicion i
        String aux= String.valueOf(num); // pasamos el numero a string
        int numeroString = Integer.parseInt(aux);//pasamos el numero a entero
        suma += Math.pow(numeroString,textoNumero.length());//la operacion 
        } 
        int resuteclado = Integer.parseInt(textoNumero); //atrapamos el texto que introducimos por teclado
        if(resuteclado == suma){ //comparamos la suma del for con lo que metemos por teclado
            return true;
        }else{
            return false;
        }
        
    }
}
