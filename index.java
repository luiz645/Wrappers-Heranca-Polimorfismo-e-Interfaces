public class index {
    public static void main(String[] args) {
        
        /*
        Crie uma classe com main que declare uma variavel int nota = 8 e uma variavel Integer notaObj =
        nota. Imprima ambas e imprima o tipo da notaObj usando getClass().getSimpleName().
        */

        int nota = 8;
        Integer notaObj = nota;

        System.out.println("nota" + nota);
        System.out.println("notaObj" + notaObj);
        System.out.println("o tipo é " + notaObj.getClass().getSimpleName());

    }
}
