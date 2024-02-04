package SecondTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ilja", "Pavel", "pavel", "pAveL", "Oleg", "Olga", "Nikita", "Alex", "Andre");

        //select number of persons with name Pavel
        long amount = names.stream().filter(e -> e.toLowerCase().equals("pavel")).count();
        System.out.println("Amount: " + amount);

        //select names beginning from a
        List<String> namesWithALetter = names.stream().filter(e -> e.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.println(namesWithALetter);

        //sort and get first element of list or return empty
        String name = names.stream().sorted().findFirst().orElse("Empty@");
        System.out.println(name);
    }
}
