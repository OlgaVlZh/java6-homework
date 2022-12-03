package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/datain.csv")
    public void test(int expected, int lowerRangeValue, int upperRangeValue) {
        SQRService service = new SQRService();

        int actual = service.calcNumberSQR(lowerRangeValue, upperRangeValue);
        Assertions.assertEquals(expected, actual);
    }

}
