package Semana_6;

import java.util.Scanner;

/**
 * programa para crear metodos para realizar opera ciones matematicas
 */
public class OperacionAritmetica {
    //creacion de variables globales
    int n1;
    int n2;

    /**
     * metodo para realizar la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return n1+n2
     */
    public int sumar(int n1,int n2){
        return (n1+n2);
    }

    /**
     * metodo para realizar la resta entre 2 numeros enteros
     * @param n1
     * @param n2
     * @return n1-n2
     */
    public int restar(int n1,int n2){
        return (n1-n2);
    }

    /**
     * metodo para multiplicar 2 numeros enteros.No retorna valor
     * @param n1
     * @param n2
     */
    public void multiplicacion(int n1,int n2){
        System.out.println("la multiplicacion es: "+(n1*n2));
    }
    public void dividir(){
        if (n2>0){
            System.out.println("La divicion es: "+((double)n1/(double) n2));
        }else{
            System.out.println("Divicion por cero no existe");
        }
    }
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while (interruptor){
            System.out.println("Digite 0 para salir: ");
            System.out.println("Digite 1 para sumar 2 numeros: ");
            System.out.println("Digite 2 para restar 2 numeros: ");
            System.out.println("Digite 3 para multiplicar 2 numeros: ");
            System.out.println("Digite 4 para dividir 2 numeros: ");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Salir");
                    interruptor= false;
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("la suma es: "+sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: "+restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicacion(n1,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }

        }
    }
    public void ingresar_numeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese numero 2: ");
        n2= teclado.nextInt();
    }

    public static void main(String[] args) {
        OperacionAritmetica mivariable=new OperacionAritmetica();
        mivariable.ejecutar();
    }
}
