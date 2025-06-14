public class GalonesGasolina {

 
    public static int contarConsumosAltos(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo > 8) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioConsumoModerado(int[][] matriz) {
        int suma = 0;
        incontador = 0;
        for (int[] fila : matriz) {t 
            for (int consumo : fila) {
                if (consumo >= 4 && consumo <= 7) {
                    suma += consumo;
                    contador++;

                }
            }
        }
        return (contador > 0) ? (double) suma / contador : 0.0;    }


    public static void imprimirConsumoBajo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 3) {
                    System.out.println("Consumo bajo en [" + i + "][" + j + "]: " + matriz[i][j] + " galones");
                }
            }
        }
    }

    public static int[] posicionConsumoMaximo(int[][] matriz) {
        int max = Integer.MIN_VALUE;
        int[] posicion = new int[2]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
    }
}