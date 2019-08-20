package loops;

import com.sun.xml.internal.bind.v2.TODO;

public class ForLoops {

    // 5-150

    public void loop5to150() {

        for (int i = 5; i <= 150; i++) {
            System.out.println(i);
        }
    }

    // 100-1
    public void loop100to1() {

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // odd 0-100

    public void even0to100() {

        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    public void equilateralTriangleAsc(int numberOfStar) {

        for (int i = 1; i <= numberOfStar; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void equilateralTriangleDesc(int numberOfStar) {
//        TODO
        for (int i = numberOfStar; i >= 1; i--) {
            for (int j = numberOfStar; j <= i; j++) {
                System.out.println("*");
            }

        }
    }
}

