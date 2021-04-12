package sk.kosickaakademia.stovcikova.exchange;

import sk.kosickaakademia.stovcikova.exchange.calc.Calculator;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        System.out.println( "Welcome to the Exchange Rates app!!!" );

        Calculator calculator = new Calculator();
        calculator.calculate(100);
    }


}
