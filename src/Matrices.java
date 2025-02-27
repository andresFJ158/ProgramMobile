public class Matrices {
    public void DiagonalesMatriz(int[][] elementos){
        String resultado = "";
        for (int i = 0; i < elementos.length; i++) {
            resultado = resultado + elementos[i][i] + " ";
        }
        System.out.println(resultado);
    }
    public void TransponerMatriz(int[] [] elementos){

        String resultado = "";
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                if (i < j) {
                    int auxiliar = elementos[i][j];
                    elementos[i][j] = elementos[j][i];
                    elementos[j][i] = auxiliar;
                }
            }
        }
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                resultado = resultado + elementos[i][j] + " ";
            }
            resultado = resultado + "\n";
        }
        System.out.println(resultado);
    }
    public void MatrizIdentidad(int[] [] elementos){
        int [][] matrizidentidad = new int[3][3];
        String resultado="";
        for (int i = 0; i <matrizidentidad.length ; i++) {
            for (int j = 0; j < matrizidentidad.length; j++) {
                if (i == j ){
                    matrizidentidad[i][j] = 1;

                }
                else {
                    matrizidentidad [i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrizidentidad.length; i++) {
            for (int j = 0; j < matrizidentidad.length; j++) {

                resultado = resultado + matrizidentidad[i][j] + " " ;
            }
            resultado = resultado + "\n";
        }
        System.out.println(resultado);
    }
    public void VerificarSimetria(int[] []elementos){
        boolean bandera = true;
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                if (elementos[i][j] != elementos [j][i]){
                    bandera = false;
                    break;
                }
            }
            if (!bandera){
                break;
            }
        }
        if (bandera){
            System.out.println("La matriz es simetrica" );
        }
        else {
            System.out.println("la matriz no es simetrica");
        }
    }
    public void MatrizEspiral(int n) {
        String resultado ="";
        int[][] espiral = new int[n][n];
        int numero = 1;
        int arriba = 0;
        int abajo = n - 1;
        int izquierda = 0;
        int derecha = n - 1;
        while (numero <= n * n) {
            for (int i = izquierda; i <= derecha; i++) {
                espiral[arriba][i] = numero++;
            }
            arriba++;
            for (int i = arriba; i <= abajo; i++) {
                espiral[i][derecha] = numero++;
            }
            derecha--;
            if (arriba <= abajo) {
                for (int i = derecha; i >= izquierda; i--) {
                    espiral[abajo][i] = numero++;
                }
                abajo--;
            }

            if (izquierda <= derecha) {
                for (int i = abajo; i >= arriba; i--) {
                    espiral[i][izquierda] = numero++;
                }
                izquierda++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(espiral[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void MostrarMayor(int [][] elementos){
        int mayor;
        String resultado ="";
        for (int i = 0; i < elementos.length; i++) {
            mayor = elementos [i][0];

            for (int j = 1; j < elementos[i].length; j++) {
                if (elementos[i][j]>mayor) {
                    mayor = elementos[i][j];
                }
            }
            resultado += mayor + " ";
        }
        System.out.println("El mayor de cada fila es=" + resultado);
    }
    // 12. Encontrar el valor máximo en cada fila
    public void MaximoPorFila(int[][] elementos) {
        for (int i = 0; i < elementos.length; i++) {
            int maximo = elementos[i][0];
            for (int j = 1; j < elementos[i].length; j++) {
                if (elementos[i][j] > maximo) {
                    maximo = elementos[i][j];
                }
            }
            System.out.println("Máximo en fila " + i + ": " + maximo);
        }
    }

    // 13. Encontrar el valor mínimo en cada columna
    public void MinimoPorColumna(int[][] elementos) {
        for (int j = 0; j < elementos[0].length; j++) {
            int minimo = elementos[0][j];
            for (int i = 1; i < elementos.length; i++) {
                if (elementos[i][j] < minimo) {
                    minimo = elementos[i][j];
                }
            }
            System.out.println("Mínimo en columna " + j + ": " + minimo);
        }
    }

    // 14. Intercambiar filas y columnas
    public void IntercambiarFilaColumna(int[][] elementos) {
        int n = elementos.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[j][i] = elementos[i][j];
            }
        }
        ImprimirMatriz(resultado);
    }

    // 15. Rellenar matriz con patrón de ajedrez
    public void MatrizAjedrez(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (i + j) % 2;
            }
        }
        ImprimirMatriz(matriz);
    }

    // 16. Compresión de una matriz (eliminar filas y columnas de ceros)
    public void ComprimirMatriz(int[][] elementos) {
        // Implementación pendiente
    }

    // 17. Suma de elementos en la frontera
    public void SumaFrontera(int[][] elementos) {
        int suma = 0;
        int n = elementos.length, m = elementos[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    suma += elementos[i][j];
                }
            }
        }
        System.out.println("Suma de la frontera: " + suma);
    }

    // 18. Rellenar matriz con patrones diagonales
    public void MatrizDiagonal(int n) {
        int[][] matriz = new int[n][n];
        int num = 1;
        for (int d = 0; d < 2 * n - 1; d++) {
            for (int i = 0; i < n; i++) {
                int j = d - i;
                if (j >= 0 && j < n) {
                    matriz[i][j] = num++;
                }
            }
        }
        ImprimirMatriz(matriz);
    }

    // 19. Determinar si una matriz es anti-simétrica
    public void VerificarAntisimetria(int[][] elementos) {
        boolean esAntisimetrica = true;
        int n = elementos.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (elementos[i][j] != -elementos[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }
        System.out.println(esAntisimetrica ? "La matriz es anti-simétrica" : "La matriz no es anti-simétrica");
    }

    // 20. Suma de diagonales excluyendo principal y secundaria
    public void SumaDiagonalesExcluidas(int[][] elementos) {
        int suma = 0;
        int n = elementos.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && i + j != n - 1) {
                    suma += elementos[i][j];
                }
            }
        }
        System.out.println("Suma de elementos fuera de las diagonales: " + suma);
    }

    // 21. Generar matriz con números Fibonacci
    public void MatrizFibonacci(int n, int m) {
        int[][] matriz = new int[n][m];
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = a;
                int temp = a + b;
                a = b;
                b = temp;
            }
        }
        ImprimirMatriz(matriz);
    }
    private void ImprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}