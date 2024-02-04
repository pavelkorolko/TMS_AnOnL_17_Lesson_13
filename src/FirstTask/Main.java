package FirstTask;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(89, 89, 90, 90, 1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 10, 10, 10, 11, 12, 14, 14, 15, 16, 17, 17, 18, 19, 19, 20);

        //deleting duplicates
        List<Integer> uniqueValues = elements.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueValues);

        //output even elements from 7 to 17
        List<Integer> evenValues = elements.stream().filter(e -> e >= 7 && e <= 17).filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(evenValues);

        //every value should be multiplied by 2
        List<Integer> multipliedValues = elements.stream().map(e -> e * 2).collect(Collectors.toList());
        System.out.println(multipliedValues);

        //sort and output first 4 values
        List<Integer> sortedValues = elements.stream().sorted().limit(4).collect(Collectors.toList());
        System.out.println(sortedValues);

        //output number of elements in stream
        long numOfElements = elements.stream().count();
        System.out.println("Num of elements in list: " + numOfElements);

        //output average value
        OptionalDouble average = elements.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println("Average value of list: " + average.getAsDouble());




    }
}