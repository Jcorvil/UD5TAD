package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EjemploLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> letras = new HashMap<>();
        letras.put(1, "A");
        letras.put(2, "B");
        letras.put(3, "C");
        letras.put(4, "D");
        letras.put(5, "E");

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.putAll(letras);
        System.out.println(lhm.values());
    }
}