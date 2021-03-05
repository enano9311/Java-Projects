package Algorithms.Medium;

public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor)
    {
        //10, 3 => 3.3333 => 3
        // 7, -3 =? -2.3333 => -2
        // 1,1 => 1
        // division is just repeated subtraction
        int quotient = 0;
        int sign = dividend/Math.abs(dividend) * divisor/Math.abs(divisor);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while(dividend >= divisor)
        {
            quotient ++;
            dividend -= divisor;
        }
        return sign * quotient;
    }
}
