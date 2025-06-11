import java.util.ArrayList;
import java.util.Scanner;

public class Class22PacoArrayListNombre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> coleccionNombres = new ArrayList<String>();
        String nombre = "";
        while (nombre.equalsIgnoreCase("stop") == false){
            System.out.println("Introduzca un nombre");
            nombre = teclado.nextLine();
            coleccionNombres.add(nombre);
            System.out.println("Nombres almacenados: " 
                + coleccionNombres.size());
        }
        coleccionNombres.remove(coleccionNombres.size() - 1);
        System.out.println("---------------------");
        //RECORREMOS LA COLECCION Y DIBUJAMOS TODOS LOS NOMBRES
        for (String name: coleccionNombres){
            System.out.println(name);
        }
        System.out.println("Fin de programa");
        teclado.close();
    }
}
