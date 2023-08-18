package com.openBootcamp.suma;

public class SumaIterativa {

    public static void main(String[] args) {
        System.out.println(sumaIterativa(5));
    }

    public static int sumaIterativa(int max) {
        int resultado = 0;

        for (int i = 0; i <= max; i++) {
            resultado += i;
        }

        return resultado;
    }
}
