package input.output;

import java.io.*;
import java.util.*;

public class InputFile {

    public static String[] getFromFile(String inputToFind) {

        Boolean isUser = false;
        String csvFile = "src/resources/pass.csv";
        String line = null;
        String csvSplitBy = "\\p{Punct}";// Lines splitted by "|" - POSIX character class

        List<String[]> dataList = new ArrayList<>();
        String[] correctFileline = null;
        String[] correctFileline$ = null;

        try (BufferedReader br
                     = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] lineOfFileData = line.split(csvSplitBy);
                dataList.addAll(Collections.singleton(lineOfFileData));
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        for (String[] fileLine : dataList) {

            if (Arrays.asList(fileLine).contains(inputToFind)) {
                correctFileline = fileLine;
                isUser = true;
                break;
            }
        }
        return correctFileline;
    }
}
