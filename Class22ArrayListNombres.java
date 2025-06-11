import java.util.ArrayList;
import java.util.Scanner;

public class Class22ArrayListNombres {
    public static void main(String[] args) {
        ArrayList<String> coleccionNombres = new ArrayList<String>(); //declaramos y creamos el arraylist que la llamamos coleccion 
        Scanner teclado = new Scanner(System.in); //creamos el objeto
        String nombre = "";//delcaramos la variable donde vamos a guardar lo que entra por teclado
        
        while(!nombre.equalsIgnoreCase("Stop")){ // le decimos que cuando metan el stop termine el bucle(y como la calss String no lee el == se debe de poner equalsIgnoreCase) y como queremos que cuando escriba stop pare debemos pponer el !
        System.out.println("Ingrese Nombres ");//mensaje que aparece en consola
        nombre = teclado.nextLine(); //lo que ingresamos lo guarda en la variable nombre 
            if(!nombre.equalsIgnoreCase("Stop")){ //con este controlamos que en la lista no salga el stop
            coleccionNombres.add(nombre);//con el .add  agregamos o añadimos 
            }
        };

        for (String elemento: coleccionNombres){ //este recorre las cajitas de los colecciones 
            System.out.println(elemento);
        }
        
        System.out.println("cantidad de nombres" + coleccionNombres.size());
        teclado.close();

    }
}
