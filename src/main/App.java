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
        int menorDistancia = Integer.MAX_VALUE;
        Integer[] parMaisProximo = null;
        for (int i = 0; i < pares.length; i++){
            for (int j = i+1; j < pares.length; j++){
                int distancia = distancia(pares[i], pares[j]);
                if (distancia < menorDistancia){
                    menorDistancia = distancia;
                    parMaisProximo = new Integer[]{i, j};
                }
            }
        }
        return menorDistancia;
    }

    public static Integer distancia(Integer[] par1, Integer[] par2){
        return (int) (Math.pow((Math.pow((par1[0] - par2[0]),2) + Math.pow((par1[1] - par2[1]), 2)), 0.5)); 
    }
}
