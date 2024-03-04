package assignment;

public class SmartCalculator
{
	/**
	 * A class representing a smart calculator with various mathematical functionalities.
	 */
	 
	    private double principal; // principal amount for interest calculations
	    private double rate; // interest rate for interest calculations
	    private double time; // time period for interest calculations
	    private double[] numbers; // array of numbers for mean calculation
	    private double totalMarks; // total marks for percentage calculation
	    private double obtainedMarks; // obtained marks for percentage calculation

	    /**
	     * Constructs a new SmartCalculator with default values.
	     */
	    public SmartCalculator()
	    {
	        this.principal = 0;
	        this.rate = 0;
	        this.time = 0;
	        this.numbers = null;
	        this.totalMarks = 0;
	        this.obtainedMarks = 0;
	    }

	    /**
	     * Constructs a new SmartCalculator with specified values.
	     *
	     * @param principal     the principal amount
	     * @param rate          the interest rate
	     * @param time          the time period
	     * @param numbers       an array of numbers
	     * @param totalMarks    the total marks
	     * @param obtainedMarks the obtained marks
	     */
	    public SmartCalculator(double principal, double rate, double time, double[] numbers, double totalMarks, double obtainedMarks) {
	        this.principal = principal;
	        this.rate = rate;
	        this.time = time;
	        this.numbers = numbers;
	        this.totalMarks = totalMarks;
	        this.obtainedMarks = obtainedMarks;
	    }

	    // Getters and setters...

	    /**
	     * Calculates the simple interest.
	     *
	     * @return the simple interest
	     */
	    public double calculateSimpleInterest() {
	        return (principal * rate * time) / 100;
	    }

	    /**
	     * Calculates the compound interest.
	     *
	     * @return the compound interest
	     */
	    public double calculateCompoundInterest() {
	        return principal * Math.pow((1 + rate / 100), time) - principal;
	    }

	    /**
	     * Calculates the mean of the given numbers.
	     *
	     * @return the mean of the numbers
	     */
	    public double calculateMean() {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return sum / numbers.length;
	    }

	    /**
	     * Calculates the factorial of a given number.
	     *
	     * @param n the number
	     * @return the factorial of the number
	     */
	    public double calculateFactorial(int n) {
	        if (n == 0)
	            return 1;
	        else
	            return n * calculateFactorial(n - 1);
	    }

	    /**
	     * Calculates the percentage.
	     *
	     * @return the percentage
	     */
	    public double calculatePercentage() {
	        return (obtainedMarks / totalMarks) * 100;
	    }
	}
	


