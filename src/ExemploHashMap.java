import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> usandoHashMap = new HashMap<>();

        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorrros", 2);
        usandoHashMap.put("Roedores", 3);

        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros: " + valor);

        usandoHashMap.remove("Gatos");

        for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }
    }
}
