package br.com.javateste.bigdecimal.reader;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FormatadorBigDecimalParaValorBrasileiro {
    private BigDecimal valor;

    public void formatar(String valor){
        DecimalFormat df = new DecimalFormat("###,###.##");
        valor = valor.replace(".","");
        valor = valor.replace(",",".");

        BigDecimal novoValor = new BigDecimal(valor);

        System.out.println(df.format(novoValor));
    }


    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
