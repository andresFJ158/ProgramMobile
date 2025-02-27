public class Sumatoria {
    public static int ejercicio2(int n){
        //0, 1, 1, 2, 3, ... n

        int a = 1, b = 4;
        int resultado = 0;

        for (int i = 0; i < n; i++)
        {
            resultado = a;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return resultado;
    }

    public static int ejercicio4(int n){
        //1 x 2 + 3 x 4 + 5 x 6 + ...n
        int a = 1;
        int b = 2;
        int sum = 0;
        for (int i = 0; b <= n; i++){
            sum = sum + (a * b);
            a = a + 2;
            b = b + 2;
        }
        if (n % 2 != 0) { // Si n es impar, se suma el último número
            sum += a;
        }
        return sum;
    }

    public static int ejercicio6(int n) {
        //1x1 + 2x3 + 3x5 + 4x7 + ... n
        int a = 1;
        int b = 1;
        int sum = 0;

        while (b < n) {
            sum = sum + (a * b);
            a++;
            b += 2;
        }
        if (n % 2 != 0) { // Si n es impar, se suma el último número
            sum += a;
        }
        return sum;
    }

    public static int ejercicio8(int n){
        //1^2 + 3^2 + 5^2 + 7^2 + ... n
        int a = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + (a * a);
            a = a + 2;
        }

        return sum;
    }

    public static int ejercicio10() {
        // F = 1 + 1 + 2 + 2 + 4 + 4 + ... + 100.
        int a = 1;
        int sum = 0;

        while (a <= 100) {
            sum += a;
            sum += a;
            a *= 2;
        }
        return sum;
    }

    public static int ejercicio12(int n){
        //11 + 22 + 33 + 44 + ... + nn
        int a = 11;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += a;
            a += 11;
        }
        return sum;
    }

    public static int ejercicio14(int n){
        //6 + 12 + 24 + 48 + 96 +...+ n
        int a = 6;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += a;
            a *= 2;
        }
        return sum;
    }

    public static float ejercicio16(){
        // 9/1+ 8/2 + 7/3 + 6/4 +...+ 1/9
        float a = 9, b = 1, sum = 0;
        for (int i = 0; i < 9; i++){
            sum += a/b;
            a--;
            b++;
        }
        return sum;
    }
}
