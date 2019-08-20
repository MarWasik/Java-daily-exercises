package basics;

public class CompareToZero {

    public void compare(int number){

        System.out.println("Number: " + number);

        if (number == 0 ){
            System.out.println("Number is equal to 0");
        } else if (number > 0) {
            System.out.println("Number is greater than 0");
        }else {
            System.out.println("Number is lower than 0");
        }
    }
}
