package Semana_6;

/**
 * Programa para verificar atravez de metodos sin un numero es primo y si es impar o no
 */
public class Verificacion {

    public boolean verifcar_primo(int num_a_verificar){
        int cont_divisores = 0;
        for (int cont = 1; cont <= num_a_verificar; cont++) {
            if (num_a_verificar % cont ==0)//detectamos un  nuevo divisor
            cont_divisores++;
        }
        if (cont_divisores == 2)//verificamos si es primo
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Verificacion mivariable = new Verificacion();
        if (mivariable.verifcar_primo(6))
            System.out.println("si es primo");
        else
            System.out.println("no es primo");
    }


}
