public class Numero
{
    public static String Fibonacci(int N) {
        //0, 1, 1, 2, 3, ...

        int a = 0, b = 1;
        String resultado = "";

        for (int i = 0; i < N; i++)
        {
            resultado = resultado + a;
            if (i<N - 1){
                resultado = resultado + ", "; // Agregar coma excepto en el último número
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return resultado;
    }

    public static String Primos(int N) {
        String resultado = "";

        for (int i = 2; i <= N; i++) {
            int contador = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++; // Contar cuántos divisores tiene i
                }
            }

            if (contador == 2) { // Será primo si tiene exactamente 2 divisores (1 y él mismo)
                if (!resultado.equals("")) {
                    resultado = resultado + ", ";
                }
                resultado = resultado + i;
            }
        }
        return resultado;
    }

    public static String Invertir(int N) {
        String resultado = "";

        while (N > 0) {
            int digito = N % 10; // Obtener el último dígito
            resultado = resultado + digito; // Concatenarlo al resultado
            N = N / 10; // Eliminar el último dígito
        }
        return resultado;
    }

    public static int MCD(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B; // Residuo de la división
            A = temp;
        }
        return A;
    }

    public static String DecimalABinario(int N) {
        String resultado = "";

        while (N > 0) {
            int residuo = N % 2; // Obtener el bit menos significativo
            resultado = residuo + resultado; // Agregarlo al inicio del resultado
            N = N / 2; // Dividir por 2
        }

        if (resultado.equals("")) {
            resultado = "0"; // Manejo especial para N = 0
        }

        return resultado;
    }

    public static int SumaCuadrados(int N) {
        int resultado = 0;

        for (int i = 1; i <= N; i++) {
            resultado = resultado + (i * i); // Sumar el cuadrado de i
        }

        return resultado;
    }

    public static String NumerosPerfectos(int N) {
        String resultado = "";

        for (int i = 1; i <= N; i++) {
            int suma = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j; // Sumar los divisores propios de i
                }
            }

            if (suma == i) { // Si la suma de divisores es igual al número, es perfecto
                if (!resultado.equals("")) {
                    resultado = resultado + ", ";
                }
                resultado = resultado + i;
            }
        }

        return resultado;
    }
}
