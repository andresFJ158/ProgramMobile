public class Matriz {
    public void MostrarMatriz(int[][] matriz){
        String cadena = "";
        for (int i = 0; i < matriz.length ; i++) {
            cadena = cadena + "\n";
            for (int j = 0; j < matriz[i].length ; j++) {
                cadena = cadena + matriz[i][j] + ", ";
            }
        }
        System.out.println(cadena);
    }
    public int ObtenerMayor(int[][] matriz){
        int mayor = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if (mayor<matriz[i][j])
                    mayor = matriz[i][j];
            }
        }
        return mayor;
    }
}
