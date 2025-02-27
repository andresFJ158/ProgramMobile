public class Serie {
    public class Ejercicio2 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numeroPar = 60;
            int numeroImpar = 1;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    if (!secuencia.isEmpty()) {
                        secuencia += ", ";
                    }
                    secuencia += numeroPar;
                    numeroPar -= 2;
                } else {
                    secuencia += ", " + numeroImpar;
                    numeroImpar += 2;
                }
            }
            return secuencia;
        }

        public void mostrarSecuencia(String secuencia) {
            System.out.println(secuencia);
        }
    }
    public class Ejercicio4 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numeroPar = 760;
            int numeroImpar = 9;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    if (!secuencia.isEmpty()) {
                        secuencia += ", ";
                    }
                    secuencia += numeroPar;
                    numeroPar -= 2;
                } else {
                    secuencia += ", " + numeroImpar;
                    numeroImpar += 9;
                }
            }
            return secuencia;
        }
    }
    public class Ejercicio6 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += i * i;
            }
            return secuencia;
        }
    }
    public class Ejercicio8 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            for (int i = 0; i < n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                if (i % 2 == 0) {
                    secuencia += 1;
                } else {
                    secuencia += 0;
                }
            }
            return secuencia;
        }
    }
    public class Ejercicio10 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (!secuencia.isEmpty()) {
                        secuencia += ", ";
                    }
                    secuencia += j;
                }
            }
            return secuencia;
        }
    }
    public class Ejercicio12 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 1;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero += 3;
            }
            return secuencia;
        }
    }
    public class Ejercicio14 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 3;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero *= 3;
            }
            return secuencia;
        }
    }
    public class Ejercicio16 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            double numero = 4; // Empezamos con 4
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero /= 2;
            }
            return secuencia;
        }
    }
    public class Ejercicio18 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int inicio = n;
            int fin = 1;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    if (!secuencia.isEmpty()) {
                        secuencia += ", ";
                    }
                    secuencia += inicio;
                    inicio--;
                } else {
                    secuencia += ", " + fin;
                    fin++;
                }
            }
            return secuencia;
        }
    }
    public class Ejercicio20 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 1;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero *= 2;
            }
            return secuencia;
        }
    }
    public class Ejercicio22 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int a = -1, b = 1;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += a;
                int siguiente = a + b;
                a = b;
                b = siguiente;
                if (i % 2 == 0) {
                    a = -a;
                }
            }
            return secuencia;
        }
    }
    public class Ejercicio24 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 1; // Comenzamos con 1
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                if (i % 2 != 0) {
                    numero *= 3;
                } else {
                    numero *= 2;
                }
            }
            return secuencia;
        }
    }
    public class Ejercicio26 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 1;
            int diferencia = -4;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                if (i % 2 != 0) {
                    secuencia += numero;
                } else {
                    secuencia += -numero;
                }
                numero += diferencia;
                diferencia = -diferencia + 8;
            }

            return secuencia;
        }
    }
    public class Ejercicio28 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 4;
            int incremento = 3;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero += incremento;
            }
            return secuencia;
        }
    }
    public class Ejercicio30 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 4;
            int multiplicador = 1;

            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero *= multiplicador;
                multiplicador++;
            }
            return secuencia;
        }
    }
    public class Ejercicio32 {
        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 1;

            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero *= 2;
            }
            return secuencia;
        }
    }
    public class Ejercicio34 {

        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 6;
            int diferencia = 2;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                numero += diferencia;
                if (i % 2 == 0) {
                    diferencia += 6;
                } else {
                    diferencia += 4;
                }
            }
            return secuencia;
        }
    }
    public class Ejercicio36 {

        public String generarSecuencia(int n) {
            String secuencia = "";
            int numero = 100;
            for (int i = 1; i <= n; i++) {
                if (!secuencia.isEmpty()) {
                    secuencia += ", ";
                }
                secuencia += numero;
                if (i < 6) {
                    numero -= 3;
                } else if (i == 6) {
                    numero = 50;
                } else {
                    numero *= 2;
                }
            }
            return secuencia;
        }
    }
}



