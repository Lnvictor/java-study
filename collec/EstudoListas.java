package collec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class EstudoListas {
    public static void main(String[] args) {
        String[] coresArray = {"Vermelho", "Amarelo", "Roxo", "Verde", "Cinza", "Laranja"};
        List<String> cores = new ArrayList<>();

        for (String cor : coresArray) {
            cores.add(cor);
        }

        String[] coresPrimariasArray = {"Vermelho", "Amarelo"};
        List<String> coresPrimarias = new ArrayList<>();

        for (String cor: coresPrimariasArray) {
            coresPrimarias.add(cor);
        }

        removeCores(cores, coresPrimarias);

        for (String cor : cores) {
            System.out.println(cor);
        }
    }

    private static void removeCores(Collection<String> c1, Collection<String> c2) {
        Iterator<String> it = c1.iterator();

        while (it.hasNext()) {
            if (c2.contains(it.next())) {
                it.remove();
            }
        }
    }
}
