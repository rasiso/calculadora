import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculadora {

    public int add(String values) {
        int soma = 0;
        int init = 0;
        int number;

        String delimiter = "[\\\\,\\n\\t]+";
        String secondPart = "";
        //List<String> itens = Arrays.asList(numbers.split("[\\,\n\t]+"));
        List<String> numberList = new ArrayList<String>();
        List<String> numbers = new ArrayList<String>();
        List<String> linhas = Arrays.asList(values.split("\n"));

        if(linhas.size() > 1 && linhas.get(0).contains("//")) {

            delimiter = linhas.get(0).replace("//", "");
            //numberList = Arrays.asList(linhas.get(1).split(delimiter));
            init = 1;

        }

        for (int i = init; i < linhas.size(); i++) {
            numberList.add(linhas.get(i));
        }

        for (int i = 0; i < numberList.size(); i++) {
            numbers = Arrays.asList(numberList.get(i).split(delimiter));
            for (int x = 0; x < numbers.size(); x++) {
                number = 0;
                try {
                    number = Integer.parseInt(numbers.get(x));
                    if(isNegative(number)){
                        System.out.println("Números negativos não são permitidos: "+number);
                    } else if (number < 1000){
                        soma += Integer.parseInt(numbers.get(x));
                    }
                } catch (NumberFormatException e){
                    continue;
                }
            }
        }
        return soma;
    }

    private boolean isNegative(int number){
        return number < 0;
    }
}
