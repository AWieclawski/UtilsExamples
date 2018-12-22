package input.output;

import java.io.*;

public class LogIn {

    public static void run() throws FileNotFoundException {

        Boolean isLoginOK = false;
        String inpUser = null;
        int logCounter = 1;
        int logProov = 3;
        Boolean checkUser = false;


        while (!isLoginOK && logCounter <= logProov) {

            System.out.println("\nEnter the user name to find: ");
            inpUser = InputKeys.inputStrings();
            System.out.println("Entered: " + inpUser);

            if (InputFile.getFromFile(inpUser) != null) {
                checkUser = true;
                System.out.printf("Welcome %s. User name is correct!", inpUser);

            } else {
                checkUser = false;
                System.out.printf("Invalid user name! \nLogin proof no %s failed. Left only %s attempts!", logCounter, (logProov - logCounter));
                logCounter++;
            }

            if (checkUser) {

                String[] userData = InputFile.getFromFile(inpUser);
                System.out.println("\nEnter the user password to log in: ");
                String inputPass = InputKeys.inputStrings();

                if (inputPass.equals(userData[1])) {
                    System.out.printf("OK %s. You've logged in successfully", inpUser);
                    isLoginOK = true;
                } else {
                    System.out.printf("Invalid password! \nLogin proof no %s failed. Left only %s attempts", logCounter, (logProov - logCounter));
                    logCounter++;
                }
            }
        }
    }

}
