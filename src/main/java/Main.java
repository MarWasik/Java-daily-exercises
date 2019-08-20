import basics.CompareToZero;
import basics.IsEven;
import basics.LargestNumberOfVariable;

public class Main {

    public static void main(String[] args) {

        LargestNumberOfVariable largestNumber = new LargestNumberOfVariable();
        System.out.println("Largest number is " + largestNumber.getLargestNumber(2, 3, -4));

        System.out.println();

        IsEven evenOrNotEven = new IsEven();
        System.out.println(evenOrNotEven.isThisNumberEven(9));

        System.out.println();

        CompareToZero compareToZero = new CompareToZero();
        compareToZero.compare(0);

    }
}
