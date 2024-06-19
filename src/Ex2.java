import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("MMEXE", "MNCS", "NSWSW", "SWEXE", "EXESSF");
        List <String> exNames = filterNames(names);
        System.out.println("Extracted Names:" + exNames);
        
    }

    public static List<String> filterNames (List<String> names){
        ArrayList <String> filteredNames = new ArrayList<>();
        names.stream().filter(str -> str.contains("EXE")).forEach(name -> {System.out.println(name); filteredNames.add(name);});
        System.out.println(filteredNames);
        return filteredNames;
    }
}

