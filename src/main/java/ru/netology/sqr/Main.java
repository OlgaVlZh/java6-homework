package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        //SQRService service = new SQRService();
        //int expected = 3;
        //int actual = service.calcNumberSQR(200, 300);
        //System.out.println(expected + " == ? == " + actual);

        SQRService service = new SQRService();
        System.out.println(service.calcNumberSQR(200, 300));
        //System.out.println(service.calcNumberSQR(0, 100));
        //System.out.println(service.calcNumberSQR(0, 99));
    }
}