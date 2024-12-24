import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaCollections {
    public static void main(String[] args) {
        String[] questions = new String[3];
        questions[0] = "What is the capital of France?";
        questions[1] = "What is the capital of Italy?";
        questions[2] = "What is the capital of Spain?";

        List<String> questionList = new ArrayList<>();
        questionList.add("What is the capital of France?");
        questionList.add("What is the capital of Italy?");
        questionList.add("What is the capital of Spain?");


        // they add them dynamically

        questionList.remove(1);
        questionList.remove("What is the capital of Spain?");

        System.out.println(questionList.size());

        System.out.println(questionList.get(0));

        // Wrapper Classes - we can use these instead of the primitive data types
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(10);


        // MAPS
        // it contains a key and a value. KEY maps to a certain value
        // called key value pair
        Map<String, String> countryToCaptital = new HashMap<>();
        countryToCaptital.put("France", "Paris");
        countryToCaptital.put("Italy", "Rome");
        countryToCaptital.put("Spain", "Madrid");
        countryToCaptital.put("Germany", "Berlin");

        System.out.println(countryToCaptital.get("France"));
    }
}
