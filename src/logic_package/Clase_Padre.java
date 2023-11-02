package logic_package;

import java.util.Scanner;

public abstract class Clase_Padre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos() {

        System.out.print(" Dame el primer valor para las operaciones: ");
        valor1 = entrada.nextInt();

        System.out.print(" Dame el segundo valor para las operaciones: ");
        valor2 = entrada.nextInt();

    }

    public abstract void Operaciones();

    public void Mostrar_Resultado() {

        System.out.println(" El resultado es: " + resultado);
        System.out.println("");
    }
}
