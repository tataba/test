package com.onbonbx;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("This is a demo, 2.");

        BxData data = new BxData(1, 24, "Silly");
        data.printInfo();
    }
}
