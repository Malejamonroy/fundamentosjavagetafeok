

public class Class24Metodos {
    public static void main(String[] args) {
        System.out.println("Ejemplo de métodos");
        //LLAMAR A MÉTODO
        metodoAccion();
        //EN LOS MÉTODOS RETOUR, DEBEMOS ALMACENAR LA RESPUESTA EN ALGUNA VARIABLE 
        String saludo = metodoSaludo();
        System.out.println(saludo);
        int suma = sumaNumeros(3,4);
        System.out.println("la suma es " + suma);
        System.out.println("fin de programa");
        
    }
    //LOS MÉTODOS SIEMPRE VANA A NUVEL DE CLASE
    public static void metodoAccion(){
        //UN METODO DE ACCION EJECUTA CODIGO
        System.out.println("Soy un método de accion");
    }

    //Los MÉTODOS RETURN
    public static String metodoSaludo(){
        //ACCIONES DEL METODO
        return "Mi primer método return, que ilusion";
    }
    //los metodos pueden recibir parametros
    //    METPODOS PARA SUMAR DOS NUMEROS Y QUE DEVUELVA LA SUMA
    public static int sumaNumeros(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
        
    }

}
