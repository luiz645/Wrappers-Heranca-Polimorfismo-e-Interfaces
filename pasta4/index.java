package pasta4;

public class index {
    public static void main(String[] args) {
        /*
        Declare dois Integer com valor 127 e compare com ==. Depois declare dois Integer com valor 200 e
        compare com == e com .equals(). Explique a diferenca.
        */

        Integer n1 = new Integer(127);
        Integer n2 = new Integer(127);

        System.out.println(n1 == n2);


        
        Integer n3 = new Integer(200);
        Integer n4 = new Integer(200);

        System.out.println(n3 == n4);

        System.out.println(n3.equals(n4));
    }
}
