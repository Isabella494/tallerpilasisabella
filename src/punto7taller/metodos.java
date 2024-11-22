package Punto7taller;

import java.util.Stack;
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public Stack<Integer> LlenarPila() {

        Stack<Integer> pila = new Stack<>();

        boolean seguir = true;

        metodos m = new metodos();
        int opt = 0;

        while (seguir) {

            pila.push((int) (Math.random() * 2001 - 1000));
            System.out.println("Desea ingresar mas registros 1: si, 2:no");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un numero");
                sc.next();

            }
            opt = sc.nextInt();
            
            while (opt < 1 || opt > 2) {
                System.out.println("Debe ingresar un numero entre 1 y 2");
                while(!sc.hasNextInt()){
                    
                    System.out.println("Ingrese un numero valido");
                    sc.next();
                    
                }
                
                opt=sc.nextInt();

            }

            if (opt == 2) {
                seguir = false;
            }

        }

        return pila;

    }

    public void MostrarPila(Stack<Integer> pila) {
        System.out.println(pila);
    }

    public void CalcularCubo(Stack<Integer> pila) {

        Stack<Integer> pilaAux = new Stack<>();

        while (!pila.isEmpty()) {
            int numero = pila.pop();
            if (numero < 0) {
                pilaAux.push(numero * numero * numero);

            } else {
                pilaAux.push(numero);
            }
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());

        }

        System.out.println("Pila con los numeros negativos al cubo " + pila);

    }

    public int numeros20_80(Stack<Integer> pila) {

        Stack<Integer> pilaAux = new Stack<>();
        int contador = 0;

        while (!pila.isEmpty()) {
            int numero = pila.pop();
            if (numero >= 20 && numero <= 80) {
                contador++;
            }
            pilaAux.push(numero);
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }

        return contador;
    }

    public void NumerosPositivos(Stack<Integer> pila) {

        Stack<Integer> pilaAux = new Stack<>();
        System.out.print("Números negativos: ");

        while (!pila.isEmpty()) {
            int numero = pila.pop();
            if (numero > 0) {
                System.out.print(numero + " ");
            }
            pilaAux.push(numero);
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }

        System.out.println();
    }

    public int SumarNumeros80_200(Stack<Integer> pila) {
        
        
        Stack<Integer> pilaAux = new Stack<>();
        
        int suma = 0;

        while (!pila.isEmpty()) {
            int numero = pila.pop();
            if (numero >= 80 && numero <= 200) {
                suma += numero;
            }
            pilaAux.push(numero);
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }

        return suma;
    }

}

