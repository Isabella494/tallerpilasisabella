package Punto7taller;

import java.util.Scanner;
import java.util.Stack;


public class Punto7taller {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int opt = 0;
            boolean bandera = true;

            metodos m = new metodos();
            
            Stack<Integer> pila = new Stack<>();

            while (bandera) {

                System.out.println("Ingrese la opcion que desea:");
                System.out.println("1.Llenar la pila");
                System.out.println("2. Mostrar pila");
                System.out.println("3. calcular cubo :");
                System.out.println("4. Mostrar la cantidad de números comprendidos entre 20 y 80");
                System.out.println("5. Mostrar la cantidad de numeros que fueron positivos:");
                System.out.println("6. La suma de los números comprendidos entre 80 y 200");
                System.out.println("7.Salir");
                while (!sc.hasNextInt()) {

                    System.out.println("Ingrese una opcion valida");
                    sc.next();

                }

                opt = sc.nextInt();
                switch (opt) {
                    case 1:

                        pila = m.LlenarPila();
                        System.out.println("");
                        break;

                    case 2:

                        m.MostrarPila(pila);

                        break;

                    case 3:

                        m.CalcularCubo(pila);

                        break;

                    case 4:

                        int cantidad = m.numeros20_80(pila);
                        System.out.println("Cantidad de números entre 20 y 80:" + cantidad);

                        break;
                    case 5:

                        m.NumerosPositivos(pila);

                        break;
                    case 6:

                       int suma =  m.SumarNumeros80_200(pila);
                        System.out.println("Suma de los números entre 80 y 200: " + suma);

                        break;
                    case 7:
                        
                        bandera = false;
                        
                        break;

                    default:

                        System.out.println("Pagina cerrada");

                        break;

                }

            }
        }

    }

}
