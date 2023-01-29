package Semana_5;

import java.util.Scanner;

public class Menu_Opciones {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA OBTENER EL ÁREA DE FIGURAS GEOMÉTRICAS");
        System.out.println("DIGITE 1 PARA OBTENER EL ÁREA DE UNA CIRCUNFERENCIA");
        System.out.println("DIGITE 2 PARA OBTENER EL ÁREA DE UN CUADRADO");
        System.out.println("DIGITE 3 PARA OBTENER EL ÁREA DE UN CILINDRO");
        Scanner teclado=new Scanner(System.in);
        int opcion = teclado.nextInt();
        seleccionar_figura(opcion);
    }
    public static void seleccionar_figura (int opcion){
        Scanner teclado=new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor del radio: ");
                double radio= teclado.nextDouble();
                double area=obtener_area_circunferencia(radio);
                System.out.println("El área es: "+area);
                break;
            case 2:
                System.out.println("Ingrese el valor del lado: ");
                double lado = teclado.nextDouble();
                double area_c=Obtener_area_cuadrado(lado);
                System.out.println("El área de un cuadrado es: "+area_c);
                break;
            case 3:
                System.out.println("Ingrese el valor del radio: ");
                double radio_cili =teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                double altura_cili=teclado.nextDouble();
                double area_cilindro=Obtener_area_cilindro(radio_cili,altura_cili);
                System.out.println("El área del cilindro es: "+area_cilindro);
            default:
                System.out.println("Opción no válida");
        }
    }

    /**
     * Método para obtener el área de una circunferencia
     * @param radio
     * @return
     */
    public static double obtener_area_circunferencia (double radio){
        double area= Math.PI * Math.pow(radio,2);
        return area;

    }

    /**
     * Método para obtener el área de un cuadrado
     * @param lado
     * @return
     */
    public static double Obtener_area_cuadrado(double lado){
        double area =lado*lado;
        return area;
    }

    /**
     * Método para obtener el área de un cilindro
     * @return
     */
    public static double Obtener_area_cilindro(double radio, double altura){
        double area=2*Math.PI*radio*(radio+altura);
        return area;
    }
}

