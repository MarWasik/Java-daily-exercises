package arrays;
import org.apache.commons.lang.ArrayUtils;

public class ArraysTasks {


//    Napisz metodę print, która wypisze w konsoli elementy tablicy intów, przekazanej jako parametr.

    public void print(int[] tab) {
        for (int i = 0; i <= tab.length - 1; i++) {
            System.out.println(tab[i]);
        }
    }

    //    Napisz metodę getLarger, która przyjmie za parametry dwie tablice intów, a która zwróci tę tablicę, której suma elementów jest większa
    public void getLarger(int[] array1, int[] array2) {

        int sumArray1 = 0;
        int sumArray2 = 0;

        for (int i = 0; i <= array1.length - 1; i++) {
            sumArray1 += array1[i];
        }

        for (int i = 0; i <= array2.length - 1; i++) {
            sumArray2 += array2[i];
        }

        if (sumArray1 > sumArray2) {
            System.out.println("The sum of the first array is greater");
        } else {
            System.out.println("The sum of the second array is greater");
        }
    }

//    Napisz metodę getMaxMinAndSum, która przyjmie za parametr tablicę intów, a która zwróci tablicę trzyelementową,
//    której pierwszy element to wartość największa, drugi to najmniejsza, a trzeci suma wszystkich elementów.

    public int[] genMaxMinAndSum(int[] arrayToExtract) {

        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i <= arrayToExtract.length - 1; i++) {
            if (max < arrayToExtract[i]) {
                max = arrayToExtract[i];
            }
        }

        for (int i = 0; i <= arrayToExtract.length - 1; i++) {
            if (min > arrayToExtract[i]) {
                min = arrayToExtract[i];
            }
        }

        for (int i = 0; i <= arrayToExtract.length - 1; i++) {
            sum += arrayToExtract[i];
        }
        return new int[]{max, min, sum};
    }

//    Napisz metodę merge, która za parametry dwie tablice intów, a która zwróci tablicę,
//    która zawierać będzie wszystkie elementy z jednej i drugiej tablicy.

    public int[] merge(int[] array1, int[] array2) {

        int mergedArrayLength = array1.length + array2.length;

//        TODO
        int[] mergedArray =

        return new int[mergedArrayLength];
    }
}
