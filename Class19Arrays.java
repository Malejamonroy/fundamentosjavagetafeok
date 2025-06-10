public class Class19Arrays {
    public static void main(String[] args) {
        //vamos a declarar un array para guardar nombre
        String[]nombre =new String[3];
        //PODEMOS ACCEDER A SUS POSICIONES MEDIANTE EL INDICE
        //PODEMOS VISUALIZAR LA LONGITUD
        System.out.println("Longitud del Array: " + nombre.length);
        nombre[0] = "Lucia";
        nombre[1] = "Adrian";
        nombre[2] = "Diana";
        //nombre[4] = "lo que sea";//da error
        for(int i = 0; i< nombre.length; i++){
            System.out.println("Nombre: " + i + " =" + nombre[i]);
        }
        //TAMBIEN PODEMOS TENER UN ARRAY INICIALIZADO CON CONTENIDO
        int[] numeros = new int []{11,14,15,66,55,44,22,88};
        System.out.println("Elementos en Array de int" + numeros.length);
    }
    
}
