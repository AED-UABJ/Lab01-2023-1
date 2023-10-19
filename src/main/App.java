package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        return encontre(arrayOrdenado, num,0, arrayOrdenado.length-1);
    }
    public static int encontre(int[] arrayOrdenado, int num, int inicio, int fim){
        if (inicio > fim) return 0;
        int m = (inicio + fim) / 2;
        if (arrayOrdenado[m] == num){
            return 1;
        } else if (arrayOrdenado[m] < num){
            return encontre(arrayOrdenado, num, m+1, fim);
        } else {
            return encontre(arrayOrdenado, num, inicio, m-1);
        }
    }

    public static int maior(int[] arrayDesordenado){
        int maior = arrayDesordenado[0];
        for (int i = 1; i < arrayDesordenado.length; i++){
            if (arrayDesordenado[i] > maior){
                maior = arrayDesordenado[i];
            }
        }
        return maior;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
