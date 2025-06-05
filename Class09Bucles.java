import java.util.Scanner;

public class Class09Bucles {
    public static void main(String[] args) {
        // //BUCLE CONTADOR (FOR)
        // //debemos indicar un inicio, un final(until); un incremento
        // //la variable contador se declara dentro del bucle y solamente se puede utilizar demtro de dicho bucle
        // for(int i = 1; i<=5; i++){
        //     System.out.println("For:" + i);
        // }

        // System.out.println("-------------------------");

        // //podemos tener un incremento distinto de 3 en 3
        // for(int i =1; i<= 10; i +=3){
        //     System.out.println("tres en tres" + i);
        // }


        // System.out.println("-------------------------");

        // //podemos hacer un bucle inverso
        // for(int i =7; i >0; i --){
        //     System.out.println("tres en tres" + i);
        // }

        // System.out.println("-------------------------");

        // //BUCLE DE CONDICIÓN
        // //Necesitan una condicion para salir 
        // //es un bucle infinito
        // //necesitamos una variable de salida del bucle
        // int contador = 1;
        // while (contador <= 5){
        //     System.out.println("While: " + contador);
        //     //debemos hacer "algo" para que la variable del buvle ca,bie y llegue a la condicion de salida
        //     //System.out.println("Soy infinito!!");
        //     contador ++;

        // }
        // System.out.println("-------------------------");



        // //Necesito mostrar los 20 primeros números pares, con un for es suficiente
        // for(int i = 1; i <=20; i++){
        //     //preguntamos si un numero es par
        //     //se utiliza el operador del resto: % (el resto de la divicion)
        //     if(i % 2 == 0){
        //         System.out.println("Par:" + i);
        //     }
        // }

        //Vamos a pedir al usuario textos hasta que escriba stop
        Scanner teclado = new Scanner(System.in);
        String dato = "";

        // while (dato != "stop"){
        //     System.out.println("Dime algo bonito(stop para salir)");
        //     dato = teclado.nextLine();
        // }


        //JAVA en sus String no compara con el operador == ni !=
        //Estoy comparando objetos y con String debo comparar el valor del objeto
        //para comparar se utiliza( el operador) el metodo equils() de la class String si sin texto
        // if(dato.equals((""))){
        //     System.out.println("Texto vacio!!");
        // }else{
        //     System.out.println("Contenido!!");
        //     }

        while (dato.equals("stop") == false ){
            System.out.println("Dime algo bonito(stop para salir)");
            dato = teclado.nextLine();
        }
        teclado.close();

    }
}
