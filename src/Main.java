public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1, 10, 100, 1000};
        SalesManager salesmanager = new SalesManager(sales);
        int max = salesmanager.max();
        System.out.println(max);
        int min = salesmanager.min();
        int average = salesmanager.average();
        System.out.println(min);
        System.out.println(average);
    }
}