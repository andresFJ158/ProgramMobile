import java.util.ArrayList;
import java.util.List;

public class Vector {
    public int ObtenerMayor(ArrayList<Integer> mayor)
    {
        int aux = 0;
        for (int i = 0; i < mayor.size() ; i++) {
            if (mayor.get(i)>aux)
                aux = mayor.get(i);
        }
        return aux;
    }
    public int Suma(int[] vector)
    {
        int aux = 0;
        for (int i = 0; i < vector.length ; i++) {
                aux = aux + vector[i];
        }
        return aux;
    }
    public int[] Ordenamiento(int[] vector)
    {
        int[] nuevoVector;
        int aux = 0;
        for (int i = 0; i < vector.length ; i++) {
            if (i< vector.length-1 && vector[i]>vector[i+1])
            {
                aux = vector[i];
                vector[i] = vector[i+1];
                vector[i+1] = aux;
            }
        }
        nuevoVector = vector.clone();
        return nuevoVector;
    }
    public String MostrarVector(int[] vector)
    {
        String cadena = "";
        for (int i = 0; i < vector.length; i++) {
            cadena = cadena + " " +vector[i];
        }
        return cadena;
    }
    public int Ocurrencia(int [] vector, int n)
    {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n)
                cont++;
        }
        return cont;
    }
    public boolean VerOrden(int [] vector){
        boolean bandera = true;
        for (int i = 0; i < vector.length ; i++) {
            if(i < vector.length-1 && vector[i]>vector[i+1])
            {
                bandera = false;
                break;
            }
        }
        return bandera;
    }
    public ArrayList<Integer> EliminarDuplicado (int[] vector)
    {
        ArrayList<Integer> lista;
        lista = new ArrayList();
        for (int i = 0; i < vector.length ; i++) {
            if (!lista.contains(vector[i]))
                lista.add(vector[i]);
        }
        return lista;
    }
    public void MostrarLista(ArrayList<Integer> lista){
        String cadena = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena = cadena + " " +lista.get(i);
        }
        System.out.println(cadena);
    }
    public ArrayList<Integer> UnirVectores (int[] vector1, int[]vector2)
    {
        ArrayList<Integer> lista;
        lista = new ArrayList();
        for (int i = 0; i < vector1.length ; i++) {
                lista.add(vector1[i]);
        }
        for (int j = 0; j < vector2.length ; j++) {
            lista.add(vector2[j]);
        }
        return lista;
    }
    public ArrayList<Integer> DifVectores (int[] vector1, int[]vector2)
    {
        ArrayList<Integer> lista;
        lista = new ArrayList();
        for (int i = 0; i < vector1.length ; i++) {
            lista.add(vector1[i]);
        }
        for (int j = 0; j < vector2.length ; j++) {
            lista.add(vector2[j]);
        }
        return lista;
    }
    public int MayorDifVector(int[]vector)
    {
        ArrayList<Integer> lista;
        lista = new ArrayList();
        int dif = 0;
        int aux = 0;
        for (int i = 1; i < vector.length ; i++) {
                aux = vector[i]-vector[i-1];
                lista.add(aux);
        }
        dif = ObtenerMayor(lista);
        return dif;
    }
    public int MultiplicarVector(int [] vector)
    {
        int aux = 1;
        for (int i = 0; i < vector.length ; i++) {
            aux = aux * vector[i];
        }
        return aux;
    }
    public boolean VerfPalindrome (int[]vector)
    {
        ArrayList<Integer> vector1 = new ArrayList<>();
        ArrayList<Integer> vector2 = new ArrayList<>();
        vector1 = ConvertirLista(vector);
        vector2 = InvertirVector(vector);
        for (int i = 0; i < vector.length ; i++) {
            if (vector1.get(i) != vector2.get(i))
            {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> ConvertirLista (int [] vector)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < vector.length ; i++) {
            lista.add(vector[i]);
        }
        return lista;
    }
    public ArrayList<Integer> InvertirVector (int[] vector)
    {
        ArrayList<Integer> listaInvertida = new ArrayList<>();
        for (int i = vector.length-1; i >= 0 ; i--) {
            listaInvertida.add(vector[i]);
        }
        return listaInvertida;
    }
    public boolean contSubConjunto(int[] vector, int valor){
        boolean respuestas=false;
        for (int i = 0; i <vector.length ; i++) {
            for (int j = 0; j <vector.length-1 ; j++) {
                if (vector[i]+vector[j]==valor && vector[i]!=vector[j]) {
                    respuestas=!respuestas;
                }
            }
        }
        return respuestas;
    }
}
