import java.util.Scanner;

public class Class08CalularSalarioPaco {
    public static void main(String[] args) {
        //como vamos a pedir daros con scanner
        Scanner teclado = new Scanner(System.in);

        //que necesitamos y lo inicializamos, declaramos variables
        int horas= 0;
        int kilometos = 0;
        int horasExtras = 0;
        int importeHora = 0;
        int salario = 0;
        int salarioExtra = 0;
        String  destino = "";
        String retencion = "";
        double iva =0;
        //float iva =0;

        //pedimos los datos
        System.out.println("Introduzca horas semanansle");
        String dato = teclado.nextLine();
        horas = Integer.parseInt(dato);
        System.out.println("Introduzca PRECIO/HORA");
        dato = teclado.nextLine();
        importeHora = Integer.parseInt(dato);
        System.out.println("Kilometros recorridos");
        dato = teclado.nextLine();
        kilometos = Integer.parseInt(dato);

        //
        if(horas > 36){ //solo entra en el if si tiene las de 36h si no no;
            //tenemos horas extra
            horasExtras = horas -36;
            salario = 36 * importeHora;
            salarioExtra = horasExtras *(importeHora +2);//aqui si tiene horas extra cobraria esto
            salario = salario + salarioExtra;//salario neto con horas extra
        }else{//si no tiene horas extras 
            salario = horas * importeHora; //salario sin horas extras
        }

        //comprobamos el destino segun los km
        if (kilometos >100 && kilometos <900){
            destino = "NACIONAL";
        }else if (kilometos >900 ){
            destino = "INTERNACIONAL";
        }else{
            destino= "PROVICIONAL";
        }
        //COMPROBAMOS EL SALARIO PARA LA RETENCION
        if(salario <= 250){
            retencion = "0%";
        }else if (salario > 500){
            retencion = "50%";
        }else{
            retencion = "20%";
        }
        //sacamos el iva
        iva = salario * 0.16;
        //iva = (float) (salario * 0.16);//si lo definimos arriba como float

        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Importe hora: " + importeHora);
        System.out.println("Kilometros: " + kilometos);
        System.out.println("Destino: " + destino);
        System.out.println("Retención: " + retencion);
        System.out.println("Salario base: " + salario);
        System.out.println("Salario extra: " + salarioExtra);
        System.out.println("Iva (16%): " + iva);
        System.out.println("-------------------------");
        System.out.println("Salario final: " + (salario - iva));
        
    }
}
