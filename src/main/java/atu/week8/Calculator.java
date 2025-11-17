package atu.week8;

public class Calculator {
    public int add(int firstNum, int secondNum)
    {
        if(firstNum == Integer.MAX_VALUE || secondNum == Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Value Out Of Range");
        }
        return firstNum + secondNum;
    }

    public  int sub(int firstNum, int secondNum)
    {
        if(firstNum == Integer.MIN_VALUE || secondNum == Integer.MIN_VALUE)
        {
            throw new ArithmeticException("Value Out Of Range");
        }
        return firstNum - secondNum;
    }


}
