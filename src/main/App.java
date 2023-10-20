package main;

import static org.junit.Assert.assertEquals;

public class App {
    
    // public static void main(String[] args){
    //     int[] arrayOrdenado = {1, 2, 3, 4, 5};
    //     int x = 3;
    //     int resultado = encontre(arrayOrdenado, x);

    //     if( resultado != -1){
    //         System.out.println("O valor " + x + " foi encontrado");
    //     }
    //     else{
    //         System.out.println("O valor " + x + " não foi encontrado");
    //     }
    // }

    // public static int encontre(int[] arrayOrdenado, int x){
    //     int inicio = 0;
    //     int fim = arrayOrdenado.length - 1;

    //     while (inicio <= fim){
    //         int meio = inicio + (fim - inicio) / 2;
    //         if (arrayOrdenado[meio] == x){
    //             return meio;
    //         }
    //         if (arrayOrdenado[meio] > x){
    //             fim = meio - 1;
    //         }
    //         else{
    //             inicio = meio + 1;
    //         }
    //     }
    //     return -1;
    // }

    public static int maior(int[] arrayDesordenado){
        int maximo = arrayDesordenado[0];
        for (int i= 1; i < arrayDesordenado.length; i++){
            if (maximo < arrayDesordenado[i]){
                maximo = arrayDesordenado[i];
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        int[] arrayDesordenado = {5, 2, 3, 4, 5};
        int resultado = maior(arrayDesordenado);
        System.out.println("O maior número no array é: " + resultado);

    }

    // public static Integer parMaisProximo(Integer[][] pares){
    //     return 1;
    // }
    }
