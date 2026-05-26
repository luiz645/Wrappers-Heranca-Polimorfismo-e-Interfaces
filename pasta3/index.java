package pasta3;

import java.math.BigDecimal;

public class index {
    public static void main(String[] args) {
        /*
        Uma loja vende um produto por R$ 49.90 e o cliente comprou 3 unidades com 5% de desconto.
        Calcule o total usando BigDecimal (nao use double). Lembre: sempre passe String no construtor.
        */
        
                    BigDecimal produto = new BigDecimal("49.90");
            int quantidade = 3;

            BigDecimal valor = produto.multiply(BigDecimal.valueOf(quantidade));

            BigDecimal taxa = new BigDecimal("0.05");

            
            BigDecimal valorTaxa = valor.multiply(taxa);

            BigDecimal total = valor.subtract(valorTaxa);

            System.out.println("Valor da compra: " + valor);
            System.out.println("Desconto: " + valorTaxa);
            System.out.println("Total com desconto: " + total);



    }
}
