public class Numero
{
    public static String Fibonacci(int n) {

        int a = 0, b = 1;
        String resultado = "";

        for (int i = 0; i < n; i++)
        {
            resultado = resultado + a;
            if (i<n - 1){
                resultado = resultado + ", ";
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return resultado;
    }

    public static String Primos(int n) {
        String resultado = "";

        for (int i = 2; i <= n; i++) {
            int contador = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }

            if (contador == 2) {
                if (!resultado.equals("")) {
                    resultado = resultado + ", ";
                }
                resultado = resultado + i;
            }
        }
        return resultado;
    }

    public static String Invertir(int n) {
        String resultado = "";

        while (n > 0) {
            int digito = n % 10;
            resultado = resultado + digito;
            n = n / 10;
        }
        return resultado;
    }

    public static int MCD(int a, int B) {
        while (B != 0) {
            int temp = B;
            B = a % B;
            a = temp;
        }
        return a;
    }

    public static String DecimalaBinario(int n) {
        String resultado = "";

        while (n > 0) {
            int residuo = n % 2; 
            resultado = residuo + resultado;
            n = n / 2; 
        }

        if (resultado.equals("")) {
            resultado = "0"; 
        }

        return resultado;
    }

    public static int SumaCuadrados(int n) {
        int resultado = 0;

        for (int i = 1; i <= n; i++) {
            resultado = resultado + (i * i); 
        }

        return resultado;
    }

    public static String numerosPerfectos(int n) {
        String resultado = "";

        for (int i = 1; i <= n; i++) {
            int suma = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j; 
                }
            }

            if (suma == i) { 
                if (!resultado.equals("")) {
                    resultado = resultado + ", ";
                }
                resultado = resultado + i;
            }
        }

        return resultado;
    }
}
