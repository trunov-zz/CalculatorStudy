import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFromFile = new File("inputFile");
        File outputToFile = new File("OutputFile");
        PrintWriter resultToFile = new PrintWriter(outputToFile);

        Scanner sc = new Scanner(inputFromFile);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            resultToFile.write(str+" = ");
            String[] nums = str.split(" ");
            String operator = nums[1];
            double resultNumber;

            try {

                Double.parseDouble(nums[0]);
                Double.parseDouble(nums[2]);

                if (nums[2].equals("0") && operator.equals("/")) {
                    resultToFile.println("Error! Division by zero");
                    resultToFile.flush();
                    continue;
                } else {

                    switch (operator) {
                        case "+":
                            resultNumber = Double.parseDouble(nums[0]) + Double.parseDouble(nums[2]);
                            resultToFile.println(resultNumber);
                            resultToFile.flush();
                            continue;
                        case "-":
                            resultNumber = Double.parseDouble(nums[0]) - Double.parseDouble(nums[2]);
                            resultToFile.println(resultNumber);
                            resultToFile.flush();
                            continue;
                        case "*":
                            resultNumber = Double.parseDouble(nums[0]) * Double.parseDouble(nums[2]);
                            resultToFile.println(resultNumber);
                            resultToFile.flush();
                            continue;
                        case "/":
                            resultNumber = Double.parseDouble(nums[0]) / Double.parseDouble(nums[2]);
                            resultToFile.println(resultNumber);
                            resultToFile.flush();
                            continue;
                        default:
                            resultToFile.println("Operation Error!");
                            resultToFile.flush();
                            continue;
                    }
                }
            } catch (Exception format) {
                resultToFile.println("Error! Not number");
                resultToFile.flush();
                continue;
            }
        }
    }
}

