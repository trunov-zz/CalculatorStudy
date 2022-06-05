import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        String path = "c:" + separator +"Users" + separator + "truno" + separator + "IdeaProjects" + separator + "CalculatorStudy" + separator + "inputFile.txt";
        File inputFromFile = new File(path);

        Scanner sc = new Scanner(inputFromFile);

        String[] nums = sc.nextLine().split(" ");
        String operator = nums[1];

        try {

            Double.parseDouble(nums[0]);
            Double.parseDouble(nums[2]);

            if (nums[2].equals("0") && operator.equals("/")) {
                System.out.println("Error! Division by zero");
            }
            else {

                switch (operator) {
                    case "+":
                        System.out.println(Double.parseDouble(nums[0]) + Double.parseDouble(nums[2]));
                        break;
                    case "-":
                        System.out.println(Double.parseDouble(nums[0]) - Double.parseDouble(nums[2]));
                        break;
                    case "*":
                        System.out.println(Double.parseDouble(nums[0]) * Double.parseDouble(nums[2]));
                        break;
                    case "/":
                        System.out.println(Double.parseDouble(nums[0]) / Double.parseDouble(nums[2]));
                        break;
                    default:
                        System.out.println("Operation Error!");
                        break;

                }
            }
        }
        catch (Exception format) {
            System.out.println("Error! Not number");
        }
    }
}

