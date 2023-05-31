public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{1, 10, 100, 1000};
        SalesManager salesmanager = new SalesManager(sales);
        long max = salesmanager.max();
        System.out.println(max);
        long min = salesmanager.min();
        long average = salesmanager.average();
        System.out.println(min);
        System.out.println(average);
    }


}