public class Class12String {
    public static void main(String[] args) {
        String texto = "Desarrollo con Java";
        System.out.println("Longitud texto: " + texto.length());
        System.out.println("toLower() " + texto.toLowerCase());
        System.out.println("toUpper ()" + texto.toUpperCase());

        //Buscamos la letra a de diverdas formals
        System.out.println("indexOf('a')" + texto.indexOf('a')); //3
        //La sobrecarga busca a partir de un indice 
        System.out.println("indexOf('a',4)" + texto.indexOf('a',4));
        //ahora busca de derecha a izquierda (final al inicio)
        System.out.println("lastIndexOf('a'):" + texto.lastIndexOf('a'));
        //LA SOBRE CARGA busca a partir de un indice inferior
        System.out.println("lastIndexOf('a',17):" + texto.lastIndexOf('a',17));

        // Nos quedamos con una parte de la cadena
        System.out.println("substring(5): " + texto.substring(5));

        //tenemos una sobre carga indicando un final ??
        System.out.println("substing(2,4): " + texto.substring(2,4));

        //primera letra
        System.out.println("startWith ('D'): " + texto.startsWith("D"));

        //ultima letra
        System.out.println("endswith ('a')" + texto.endsWith("a"));

        //recupera un caracter
        System.out.println("charAt(5)" + texto.charAt(5));

        //Aplicar un metodo a un objato, no implica que el objeto sea modificado.
        //los metodos (algunos)devuelven un valor del objeto.


        //convertimos el texto a mayusculas
        texto.toUpperCase();
        //si deseamos modificar el objeto texto,debemos igualarlo
        texto = texto.toUpperCase();// asi se iguala
        System.out.println(texto);
        //como recorrer letra a latra un string (caracter a caracter)
        for(int i=0; i< texto.length();i++){
            char letra=texto.charAt(i);
            System.out.println("letra("+i+"): "+ letra);
        }

    }
}
