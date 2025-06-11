import java.util.ArrayList;

public class Class21ArrayList {
    public static void main(String[] args) {
        ArrayList<String> coleccion = new ArrayList<String>();
        //AGREGAMOS CUATRO ELEMENTOS Y UNO EPETIDO
        coleccion.add("Elemento 1");
        coleccion.add("Elemento 2");
        coleccion.add("Elemento 3");
        coleccion.add("Elemento 1");
        

        // //probamos a modiuficar un elemento 
        // coleccion.set(1, "Nuevo elemento 2");
        // //PODEMOS INSERTAR ELEMENTOS
        // coleccion.add(1,"Insertando elementos");
        // //PODEMOS ELIMINAR ELEMENTOS, SI ENVIAMOS EL OBJETO ELIMINA EL PRIMER ELEMENTO QUE ENCUENTRA EN LA COLECCION
        // coleccion.remove("Elemento 1");
        // //ELIMINAR POR INDEX PERMITE MAYOR PRECICON
        // coleccion.remove(4); //solo pones la posicion que desea eliminar 
        //BUSCAMOS DENTRO DE LA COLECCION
        System.out.println("primera Posicion Elemento 1: " + coleccion.indexOf("Elemento 1"));
        System.out.println("Ultima Posicion Elemento 1: " + coleccion.lastIndexOf("Elemento 1"));

        System.out.println("Numero de elementos: " + coleccion.size());

        //VAMOS A REALIZAR UN BUCLE PARA VISUALIZAR LOS ELEMENTOS Y COMO SE COMPORTAN A MEDIDA QUE VAMOS TRABAJANDO
        // for(int i = 0;i < coleccion.size();i++){
        //     //Recuperamos cada elemento de la coleccion
        //     String elemmento = coleccion.get(i);
        //     //pintamos cada elemento
        //     System.out.println(elemmento);
        // }

        //OTRA SINTAXIS DE BUCLES POR FERENCIA 
        //for(tipo variable: CONJUNTO){}
        for (String elemento : coleccion){
            System.out.println(elemento);
        }
        //ELIMINAR TODA LA COLECCION
        coleccion.clear();
        System.out.println("Numero de elementos: " + coleccion.size());
    }
}
