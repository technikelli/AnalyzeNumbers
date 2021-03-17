import java.util.Scanner;
public class AnalyzeNumbers {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        //PROMPT USER FOR INPUT
        System.out.print("Enter the number of items: ");
        int userInput = scan.nextInt();

        //CREATE AN ARRAY FOR THE NUMBERS
        double[] numbers = new double[userInput];
        double sum = 0;

        //CREATE A LOOP FOR THE AMOUNT OF NUMBERS 'USERINPUT' DECLARED
        for (int i = 0; i< userInput; i++){
            System.out.print("Enter the " +i+ "(st/nd/th) number: ");
            numbers[i] = scan.nextDouble();
            sum += numbers[i];
         }

        //CALCULATE THE AVERAGE
        double average = sum/userInput;

        //DETERMINE HOW MANY ELEMENTS IN THE ARRAY ARE ABOVE THE AVERAGE
        int count = 0;
        for (int i = 0; i < userInput; i++){
            if (numbers[i] > average){
                count++;
            }
        }

        //OUTPUT THE INFORMATION TO THE USER
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
        scan.close();
    }
}
