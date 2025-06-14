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
        int contador = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo >= 4 && consumo <= 7) {
                    suma += consumo;
                    contador++;
                }
            }
        }
        return (contador > 0) ? (double) suma / contador : 0.0;
    }


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
        return posicion;
    }


    public static void main(String[] args) {
        int[][] consumo = {
            {2, 5, 9},
            {3, 7, 10},
            {1, 4, 6}
        };

        System.out.println(" Consumos mayores a 8 galones: " + contarConsumosAltos(consumo));
        System.out.println(" Promedio de consumos moderados (4-7 galones): " + promedioConsumoModerado(consumo));
        System.out.println(" Posiciones con consumo bajo (<3 galones):");
        imprimirConsumoBajo(consumo);
        int[] posMax = posicionConsumoMaximo(consumo);
        System.out.println(" Consumo máximo en posición: [" + posMax[0] + "][" + posMax[1] + "]");
    }
}

