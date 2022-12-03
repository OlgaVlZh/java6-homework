package ru.netology.sqr;

public class SQRService {
    public int calcNumberSQR(int lowerRangeValue, int upperRangeValue) {
        int number = 0;
        for (int i = 10; i < 99; i++) {
            if (lowerRangeValue <= i * i & i * i <= upperRangeValue) {
                number++;

            }

        }
        return number;

    }
}
