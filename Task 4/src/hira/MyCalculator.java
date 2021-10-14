package hira;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {

        int sum = 0;
        for (int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public BigInteger findFactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        
        for (int i=1;i<=n;i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}

/**
 * Name: Md. Mahdi Hossain Hira
 * ID: 2012020106
 * Section: C
 * Email: cse_2012020106@lus.ac.bd
 * Date: 15/10/2021
 */