
package com.example;

public class TestClass {

    public static void main(String[] args) {
        //Create an instance of ComputeMethods,
        ComputeMethods compute = new ComputeMethods();

        //invoke the 3 methods and display their results
        System.out.println(compute.fToC(101));
        System.out.println(compute.hypotenuse(10,3));
        System.out.println(compute.roll());

    }
}
/* Expected Output:
Temp in celsius is 38.00000000000001
Hypotenuse is 10.816653826391969
The sum of the dice values is 9
 */