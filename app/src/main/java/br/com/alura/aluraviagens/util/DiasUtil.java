package br.com.alura.aluraviagens.util;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    public static String formataDiasEmTexto(int quantidadeDeDias) {
        String dia = quantidadeDeDias + SINGULAR;
        if(quantidadeDeDias > 1) {
            dia =  quantidadeDeDias + PLURAL;
        }
        return dia;
    }
}
