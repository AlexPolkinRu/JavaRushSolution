package Javarush.task0918;

import java.io.IOException;
import java.sql.SQLException;

/*
Все свои, даже исключения
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends ArithmeticException{
    }

    static class MyException2 extends ArrayIndexOutOfBoundsException{
    }

    static class MyException3 extends IOException{
    }

    static class MyException4 extends SQLException{
    }
}





























