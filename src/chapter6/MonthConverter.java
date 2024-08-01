package chapter6;
// When methods are static within a class there is no need to instantiate them

public class MonthConverter {
    public static void main(String[] args) {
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("January"));
    }
}
