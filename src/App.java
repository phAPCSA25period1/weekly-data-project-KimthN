import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {
    //maybe ask user about saving goals, total budget for week and see if they went over or under or have smth to save and tips about that

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("This program helps you track your weekly expenses.");
        System.out.println("Please enter your daily expenses for the week.");
        
        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        double[] weekData = new double[7];
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        for (int i = 0; i < weekData.length; i++) {
            System.out.print("Enter expenses for day " + (i + 1) + ": ");
            double input = scanner.nextDouble();
            while (input < 0) {
                System.out.print("Invalid input. Please enter a non-negative value for day " + (i + 1) + ": ");
                input = scanner.nextDouble();
            }
            weekData[i] = input;
        }
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData newobject = new WeeklyData(weekData);

        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        System.out.println("Total expenses for the week:" + newobject.getTotal());
        System.out.println("Average daily expenses: " + newobject.getAverage());
        System.out.println("Minimum daily expenses: " + newobject.getMin());
        System.out.println("Maximum daily expenses: " + newobject.getMax());
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.println("Weekly Data: " + newobject.toString());

        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
            if (newobject.getAverage() < 50) {
            System.out.println("You can spend more on your daily needs next week!");
            if (newobject.getAverage() > 200) {
            System.out.println("You should consider budgeting better next week! Let's keep the average down to 100 next week!");
            }
            //identify day with least and most expenses

    }
    scanner.close();
}
}
