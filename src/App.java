import java.util.Scanner;


public class App {


    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("This program helps you track your weekly expenses.");
        System.out.println("Enter in your budget for the week (as a decimal number): ");
        double budget = scanner.nextDouble();
        System.out.println("Please enter your daily expenses for the week.");
        
        
        double[] weekData = new double[7];
        
        for (int i = 0; i < weekData.length; i++) {
            System.out.print("Enter expenses for day " + (i + 1) + ": ");
            double input = scanner.nextDouble();
            while (input < 0) {
                System.out.print("Invalid input. Please enter a non-negative value for day " + (i + 1) + ": ");
                input = scanner.nextDouble();
            }
            weekData[i] = input;
        }
        
        WeeklyData newobject = new WeeklyData(weekData);

        
        System.out.println("Total expenses for the week:" + newobject.getTotal());
        System.out.println("Average daily expenses: " + newobject.getAverage());
        System.out.println("Minimum daily expenses: " + newobject.getMin());
        System.out.println("Maximum daily expenses: " + newobject.getMax());
        
        System.out.println("Weekly Data: " + newobject.toString());

        
            if (newobject.getAverage() < budget / 7.0) {
            System.out.println("You can spend more on your daily needs next week!");
            } else if (newobject.getAverage() > budget / 7.0) {
                System.out.println("You should consider budgeting better next week! Let's keep the average down to $" + (int)(budget / 7.0) + " next week!");
            }
            if (newobject.getTotal() > budget) {
                System.out.println("You have exceeded your budget for the week by $" + (newobject.getTotal() - budget) + "! Try to save more next week!");
            }
            if (newobject.getTotal() < budget) {
                System.out.println("You are under budget for the week! You saved $" + (budget - newobject.getTotal()) + " this week. Keep it up!");
            }

        scanner.close();
    }
    
}
