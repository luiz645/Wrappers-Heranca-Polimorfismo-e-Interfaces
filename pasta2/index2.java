package pasta2;

public class index2 {
    public static void main(String[] args) {
        /*
        Declare Integer x = null. Tente atribuir x a uma variavel int. O que acontece ao rodar? Explique.
        */

        Integer x = null;
        int v = x;

        System.out.println("escreva o valor de " + v);
        
        /*
        Integer aceita null
        int NÃO aceita null
        Ao converter Integer para int, o Java faz auto-unboxing
        Se o Integer estiver null, ocorre NullPointerException
        */
        
    }
}
