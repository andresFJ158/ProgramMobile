import java.util.Locale;
import java.util.HashMap;
import java.util.Locale;

public class Cadena{
    public String invertirString(String cadena){
        String result="";
        for (int i = 0; i <cadena.length(); i++) {
            result=cadena.charAt(i)+result;
        }

        return result;
    }
    public String convertirMay(String cadena){

        cadena=cadena.toUpperCase();
        return  cadena;
    }
    public String sumarString(String cadena1, String cadena2){
        String resultado="";
        resultado=cadena1+cadena2;

        return resultado;
    }
    public String reemplazarCadenas(String cadena, char a, char b){
        String restultado="";

        restultado=cadena.replace(a,b);

        return restultado;
    }
    public static char caracterMasFrecuente(String cadena) {
        HashMap<Character, Integer> frecuencia = new HashMap<>();
        char maxChar = ' ';
        int maxFrecuencia = 0;

        for (char c : cadena.toCharArray()) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
            if (frecuencia.get(c) > maxFrecuencia) {
                maxFrecuencia = frecuencia.get(c);
                maxChar = c;
            }
        }
        return maxChar;
    }
    public String mayMin(String cadena){
        boolean bandera=true;
        String aux="";
        String resultado="";
        for (int i = 0; i <cadena.length() ; i++) {

            if (bandera) {
                aux=String.valueOf(cadena.charAt(i));
                aux=aux.toUpperCase();
                resultado=resultado+aux;
            }
            else {
                aux=String.valueOf(cadena.charAt(i));
                aux=aux.toLowerCase();
                resultado=resultado+aux;
            }
            bandera=!bandera;
            aux="";
        }
        return resultado;
    }

    public String rotarCaracter(String cadena){
        int tamano=cadena.length();
        String aux="";
        char a=cadena.charAt(tamano-2);
        char b= cadena.charAt(tamano-1);
        aux=String.valueOf(a)+String.valueOf(b);
        cadena=cadena.substring(0, cadena.length() - 1);
        cadena=cadena.substring(0, cadena.length() - 1);
        cadena=aux+cadena;
        return cadena;
    }
}
