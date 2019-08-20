package basics;

public class IsEven{

//    Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie (wypisz na ekranie odpowiedni komunikat).

    public boolean isThisNumberEven(int number) {

        if (number == 0) {
            throw new ArithmeticException("0 is an exception");
        }
        return number % 2 == 0;
    }
}
