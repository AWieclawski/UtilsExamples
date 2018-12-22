public class ExampleArray {

    public static void someArray() {

        String[] testArray = {"a", "b", "c", "d"};
        System.out.println("\n testArray ");
        printArray(testArray);
        String[] shuffledArray = ArraysShuffle.nonDuplicateStringArrayShuffle(testArray);
        System.out.println("\n shuffledArray ");
        printArray(shuffledArray);
    }

    private static void printArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (i < inputArray.length - 1) {
                System.out.print(inputArray[i] + ", ");
            } else {
                System.out.println(inputArray[i] + ". ");
            }
        }
    }
}
