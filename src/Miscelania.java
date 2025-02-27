public class Miscelania {

    public int busquedaBinaria(int[] vector, int numero){
        int resultado=0;
        int aux=0;
        for (int i = 0; i < vector.length ; i++) {
            for (int j = 0; j < vector.length-1 ; j++) {

                if (vector[j] > vector[j+1]) {
                    aux=vector[j+1];
                    vector[j+1]=vector[j];
                    vector[j]=aux;
                }
            }
        }

        int inicio = 0;
        int fin = vector.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (vector[medio] == numero) {
                return medio; // Retorna la posición donde se encontró el número
            } else if (vector[medio] < numero) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }


    public int busquedaSecuencial(int[] vector, int num){

        int  numero=0;
        for (int i = 0; i < vector.length ; i++) {

            if (vector[i] == num) {
                numero=i;
                break;
            }

        }
        return numero;
    }

    public int elSegundoPequeno(int[] vector){
        int aux=0;
        int num=0;
        for (int i = 0; i < vector.length ; i++) {
            for (int j = 0; j < vector.length-1 ; j++) {

                if (vector[j] > vector[j+1]) {
                    aux=vector[j+1];
                    vector[j+1]=vector[j];
                    vector[j]=aux;
                }
            }
        }

        num=vector[vector.length-2];

        return num;
    }

}