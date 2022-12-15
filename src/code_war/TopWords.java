package code_war;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/51e056fe544cf36c410000fb/train/java
 */
public class TopWords {
    public static List<String> top3(String s) {
        // Your code here
        s = s.replaceAll("(#|\\/|\\\\|\\.|\\,|\n|.)", " ").trim();
        var words = s.split("( )+");
        if (words.length < 3){
            return List.of(words);
        }

        Map<String, Long> wordMap = Stream.of(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Comparator<Map.Entry<String, Long>> compareOccurrence =
                Comparator.comparing(Map.Entry::getValue);

        var compareFinal = compareOccurrence.
                thenComparing(Map.Entry::getKey).reversed();

        var result = wordMap.entrySet().stream()
                .sorted(compareFinal)
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
//        TopWords.top3(Stream
//                .of("In a village of La Mancha, the name of which I have no desire to call to",
//                        "mind, there lived not long since one of those gentlemen that keep a lance",
//                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
//                        "coursing. An olla of rather more beef than mutton, a salad on most",
//                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
//                        "on Sundays, made away with three-quarters of his income.")
//                .collect(Collectors.joining("\n")) );
        TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e");
    }
}
