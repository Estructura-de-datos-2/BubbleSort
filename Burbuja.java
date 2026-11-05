import java.util.Arrays;

public class Burbuja {

    public void bubleS(int[] arreglo) {

        int aux;
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int z = 0; z < arreglo.length - 1; z++) {
                comparaciones=comparaciones+1;
                if (arreglo[z] > arreglo[z + 1]) {
                    aux = arreglo[z];
                    arreglo[z] = arreglo[z + 1];
                    arreglo[z + 1] = aux;
                    intercambios = intercambios+1;;
                }
            }
            System.out.println("Pasada " + (i + 1)+ Arrays.toString(arreglo));
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
        System.out.println("Pasadas: " + (arreglo.length - 1));
    }
    public static void main(String[] args) {
         Burbuja objeto = new Burbuja();

        int[] lista = {34, 12, 25, 8, 19};

        objeto.bubleS(lista);
    }
}
					
