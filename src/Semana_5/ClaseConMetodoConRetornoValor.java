package Semana_5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("progrma para sumar 2 numeros");
        System.out.println("Ingrese el primer numeros: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        int resultado = sumar(num1,num2);//llamamos al metodo y recibimos el valor
        System.out.println("la suma es: "+resultado);
        //sumar_dos_numeros(num1 , num2);
        //obtener el promedio de los numeros ingresados
        double promedio =obtener_promedio(resultado,2);
        System.out.println("el promedio de los numeros es: "+promedio);

    }

    /**
     * este metodo realiza la suma de 2 numeros enteros
     * @param n1
     * @param n2
     * @return resultado
     */
    public static int sumar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;

    }

    public static void sumar_dos_numeros(int n1 , int n2){
        int resultado = n1 + n2;
        System.out.println("la suma de los numeros es: "+resultado);
    }

    /**
     * metodo para obetener el promedio de una suma de valores
     * @param suma_total
     * @param catidad_numeros
     * @return promedio
     */
    public static double obtener_promedio(int suma_total,int catidad_numeros){
        double promedio = (double) suma_total/(double) catidad_numeros;
        return promedio;
    }
}
