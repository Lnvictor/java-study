package collec;

import java.util.List;
import java.util.Vector;

public class Study {
    public static void main(String[] args) {
        //auto-Boxing -> java converte um tipo primitivo em wrapper sem precisarmos fazer nada
        int a = 10;
        Integer b = a;

        // autoUnboxing -> java converte uma classe wrapper para tipo primitivo sem precisarmos fazer nada
        Integer a2 = 10;
        int b2 = a2;

        System.out.println(b);
        System.out.println(b2);

        Vector<Integer> vector = new Vector<>();
        vector.addElement(b);
    }
}