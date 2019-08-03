import java.util.Arrays;
import java.util.List;

public class Calculadora {

    public int add(String numbers) {
        int soma = 0;
        List<String> itens = Arrays.asList(numbers.split("[\\,\n\t]+"));

            for (int i = 0; i < itens.size(); i++) {
                try {
                    soma += Integer.parseInt(itens.get(i));
                } catch (NumberFormatException e){
                   continue;
                }
            }
        return soma;
    }
}
