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

        String[] nums = sc.nextLine().split(" ");
        String operator = nums[1];
        double resultNumber;

        try {

            Double.parseDouble(nums[0]);
            Double.parseDouble(nums[2]);

            if (nums[2].equals("0") && operator.equals("/")) {
                resultToFile.println("Error! Division by zero");
                resultToFile.close();
            }
            else {

                switch (operator) {
                    case "+":
                        resultNumber = Double.parseDouble(nums[0]) + Double.parseDouble(nums[2]);
                        resultToFile.println(resultNumber);
                        resultToFile.close();
                        break;
                    case "-":
                        resultNumber = Double.parseDouble(nums[0]) - Double.parseDouble(nums[2]);
                        resultToFile.println(resultNumber);
                        resultToFile.close();
                        break;
                    case "*":
                        resultNumber = Double.parseDouble(nums[0]) * Double.parseDouble(nums[2]);
                        resultToFile.println(resultNumber);
                        resultToFile.close();
                        break;
                    case "/":
                        resultNumber = Double.parseDouble(nums[0]) / Double.parseDouble(nums[2]);
                        resultToFile.println(resultNumber);
                        resultToFile.close();
                        break;
                    default:
                        resultToFile.println("Operation Error!");
                        resultToFile.close();
                        break;

                }
            }
        }
        catch (Exception format) {
            resultToFile.println("Error! Not number");
            resultToFile.close();
        }
    }
}

