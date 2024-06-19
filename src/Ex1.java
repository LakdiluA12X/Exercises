import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex1 {
    public static void main(String[] args) {
        List <Integer> IntList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        OptionalDouble avarage = IntList.stream()
                                        .mapToInt(Integer::intValue)
                                        .average();

        if (avarage.isPresent()) {
            System.out.println("Avarage of the List: " + avarage.getAsDouble());
        } else {
            System.out.println("Array is Empty.");
        }
        
    }
}
