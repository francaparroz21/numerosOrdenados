import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = cargar();
        mostrar(numeros);
        if (estaOrdenado(numeros)){
            System.out.println("Los numeros estan ordenados.");
        }
        else {
            System.out.println("Los numeros no estan ordenados.");
        }
        ordenar(numeros);
        mostrar(numeros);
    }


    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static int[] cargar() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        int cant = scr.nextInt();
        int[] numeros = new int[cant];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = scr.nextInt();
        }
        return numeros;
    }

    public static void ordenar(int[] n) {
        int aux = 0;
        for (int i = 0; i<n.length;i++){
            for (int j = 0;j<n.length;j++){
                if (i!=0&&n[i]<n[j]){
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }
    }

    public static boolean estaOrdenado(int[]numeros) {
        boolean flag = true;
        for (int i = 0; i < numeros.length; i++) {
            if (i != numeros.length-1&&numeros[i] > numeros[i+1]) {
                return false;
            }
        }
        return flag;
    }
}

