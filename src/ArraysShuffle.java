import java.util.ArrayList;
import java.util.Random;

public class ArraysShuffle {

    protected static String[] nonDuplicateStringArrayShuffle(String[] arrayToShuffle) {

        String[] shuffledArray = new String[arrayToShuffle.length];

        ArrayList<String> shuffledList = new ArrayList<>(arrayToShuffle.length);

        Random randomGenerator = new Random();

        while (shuffledList.size() < arrayToShuffle.length) {

            int random = randomGenerator.nextInt(arrayToShuffle.length);
            String randomed$ = arrayToShuffle[random];
            // Check element under random generated number is already located in the List
            if (!shuffledList.contains(randomed$)) {
                // Add new element, if not found in the List
                shuffledList.add(randomed$);
//                System.out.format("\nRandom generated number of element: %s, Element found in list under generated number: %s ", random, randomed$);
            }
        }
        shuffledList.toArray(shuffledArray);

        return shuffledArray;
    }
}

