package br.com.javateste.bigdecimal.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/ferna/Documents/sage.txt"));
        String valor = reader.readLine();

        FormatadorBigDecimalParaValorBrasileiro fbdpvb = new FormatadorBigDecimalParaValorBrasileiro();
        fbdpvb.formatar(valor);
        /*
         * Passando o valor do txt para String ocorre tudo bem.
         * Mas quando é passado direto para o BigDecimal ocorre um problema devido a formatação do valor do txt.
         *
         *
         * Meu objetivo é passar o valor para uma string e utilizar o replace para tirar os "." do valor recebido
         */
    }
}
