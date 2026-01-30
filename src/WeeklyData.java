/**
 * The WeeklyData class stores and analyzes a week’s worth of numeric data.
 * This could represent steps taken, hours of sleep, money spent, screen time,
 * or any other measurable daily value.
 */
public class WeeklyData  {

    
    private double[] weekData;
    


    
    /**
     * Constructs a WeeklyData object by taking in an array of values
     * and making a deep copy (element-by-element) into the internal array.
     *
     * @param input an array representing 7 days of data
     */
    public WeeklyData(double[] input) {
        if (input == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        weekData = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            weekData[i] = input[i];
        }
        
        }
        


    
    /**
     * Calculates and returns the total of all values in the week.
     *
     * @return the sum of all values in the data array
     */
    public double getTotal() {
        // TODO: Create a variable to store the running total
        // TODO: Use a loop to add each value in the array to the total
        // TODO: Return the total
        double total = 0.0;
        for (int i = 0; i < 7; i++) {
            total += weekData[i];
        }
        return total; // replace with your calculated total
    }


    
    /**
     * Calculates and returns the average value for the week.
     *
     * @return the average of the values in the array,
     *         or 0.0 if the array is empty
     */
    public double getAverage() {
        // TODO: If the array length is 0, return 0.0
        // TODO: Otherwise, divide the total by the number of elements
        // Hint: You may call getTotal()
        if (weekData.length == 0) {
            return 0.0;
        } else {
            return getTotal() / weekData.length;
        }
        
    }


    
    /**
     * Finds and returns the highest value in the data array.
     *
     * @return the maximum value
     */
    public double getMax() {
        // TODO: Assume the first value is the current maximum
        // TODO: Loop through the rest of the array and update max as needed
        // TODO: Return the maximum value found
        double max = weekData[0];
        for (int i = 1; i < weekData.length; i++) {
            if (weekData[i] > max) {
                max = weekData[i];
            }
        }
        return max; // replace with the maximum value
    }


    
    /**
     * Finds and returns the lowest value in the data array.
     *
     * @return the minimum value
     */
    public double getMin() {
        // TODO: Assume the first value is the current minimum
        // TODO: Loop through the rest of the array and update min as needed
        // TODO: Return the minimum value found
        double min = weekData[0];
        for (int i = 1; i < weekData.length; i++) {
            if (weekData[i] < min) {
                min = weekData[i];
            }
        }
        return min; // replace with the minimum value
    }


    
    /**
     * Returns a formatted, multi-line String showing each day’s data.
     *
     * Example:
     * Day 1: 4500
     * Day 2: 6200
     * Day 3: 5100
     *
     * @return a formatted String representing the week’s data
     */
    //@Override
    public String toString() {
        // TODO: Create a StringBuilder
        // TODO: Loop through the data array
        // TODO: Append each value with a day label (Day 1, Day 2, etc.)
        // TODO: Return the completed String
        System.out.println("Money spent this week:");
        String dayEntry = "";
        for (int i = 0; i < weekData.length; i++) {
            dayEntry += "Day " + String.valueOf(i + 1) + ": " + String.valueOf(weekData[i]) + "\n";
        }
        return dayEntry;
        
    }
}
