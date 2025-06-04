import java.util.Scanner;

public class Class07DiaNacimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pedimos al usuario dia, numero de mes y año de nacimiento

        System.out.println("Introduzca Dia ");
        String dato = teclado.nextLine();
        int dia = Integer.parseInt(dato);

        System.out.println("Introduzca (numero 1 - 12 ) Mes ");
        dato = teclado.nextLine();
        int mes = Integer.parseInt(dato);

        System.out.println("Introduzca Año ");
        dato = teclado.nextLine();
        int anio = Integer.parseInt(dato);

        //Hay que tener en cuenta el mes para realizar el cálculo, si el mes es Enero, el Mes será 13 y
        // restaremos uno al año. Si el Mes es Febrero, el Mes será 14 y restaremos uno al año.
        if(mes == 1){
            mes = 13;
            anio -= 1;  // anio--  (dicen lo mismo) // anio = -1
        }else if(mes == 2){
            mes =14;
            anio -=1;
        }

        // 1.Multiplicar el Mes más 1 por 3 y dividirlo entre 5
        int paso1 = ((mes +1)*3)/5;
        // 2.Dividir el año entre 4
        int paso2 = anio /4;
        // 3.Dividir el año entre 100
        int paso3 = anio/100;
        // 4.Dividir el año entre 400
        int paso4 = anio/400;
        // 5.Sumar el dia, el doble del mes, el año, el resultado de la operación 1, el resultado de 
        //la operación 2, menos el resultado de la operación 3 más la operación 4 más 2.
        int paso5 = dia +(mes * 2)+ anio + paso1 + paso2 - paso3 + paso4 + 2;
        // 6.Dividir el resultado anterior entre 7
        int paso6 = paso5/7;
        // 7.Restar el número del paso 5 con el número del paso 6 por 7.
        int res = paso5 - (paso6 * 7);
        // 8.Miramos la tabla y vemos que el número 1 corresponde a Domingo
        String diaSemana = "";
        if(res == 0){
            diaSemana = "SÁBADO";
        }else if(res == 1){
            diaSemana = "DOMINGO";
        }else if(res == 2){
            diaSemana = "LUNES";
        }else if(res == 3){
            diaSemana = "MARTES";
        }else if(res == 4){
            diaSemana = "MIERCOLES";
        }else if(res == 5){
            diaSemana = "JUEVES";
        }else if(res == 6){
            diaSemana = "VIERNES";
        }else{
            diaSemana = "hemos pinchado..";
        }
        System.out.println("El dia de la semana es " + diaSemana);
        

        teclado.close();

    }
}
