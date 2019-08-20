package basics;

public class LargestNumberOfVariable {

    // Declare three variables numerical and assign them value. Then write down the largest of them.

    public int getLargestNumber(int number1, int number2, int number3) {
        System.out.println("Witch number is the largest");

        System.out.println("Number 1 is " +number1);
        System.out.println("Number 2 is " +number2);
        System.out.println("Number 3 is " +number3);
               return Math.max(number1, Math.max(number2,number3));
    }

}
