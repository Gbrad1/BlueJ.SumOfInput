/**
 * The purpose of this proram is to return the
 *sum of all numbers between 1 and n(or the input).
 *
 * @author Giles Bradford
 * @version 0.0 5-Feb-2020
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }

    public Integer oneToNumber(Integer numberToSum) {
      sum = 0;
      for (int i = 1; i <= numberToSum; i++) {
        sum = i + sum;
      } return sum;
    }
  }
