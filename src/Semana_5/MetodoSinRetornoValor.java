package Semana_5;

public class MetodoSinRetornoValor {
    public static void main(String[] args) {
        //crear una variable apartir de nuestra clase
        //MetodoSinRetornoValor llamada =new MetodoSinRetornoValor();
        //llamada.saludar();
        //saludar_con_nombre("micael");

    }
    public static void saludar(){
        System.out.println("Bienbenido ala creacion de metodos");
        System.out.println("metodo creado en java");
    }

    public static void saludar(String nombre){
        System.out.println("Bienbenido ala creacion de metodos");
        System.out.println("metodo creado en java");
    }

    public static void saludar(String nombre,String apellido){
        System.out.println("Bienbenido ala creacion de metodos");
        System.out.println("metodo creado en java");
    }

    public static void saludar(String nombre,int edad){
        System.out.println("Bienbenido ala creacion de metodos");
        System.out.println("metodo creado en java");
        System.out.println("tu edad es: "+edad);
    }
    public static void saludar_con_nombre(String nombre){
        System.out.println("Bienbenid@ "+nombre.toUpperCase()+" ala creacion de metodos");
        System.out.println("metodo creado en java");

    }
}
