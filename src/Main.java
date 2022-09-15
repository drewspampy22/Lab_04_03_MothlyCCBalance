public class Main {
    public static void main(String[] args)
    {
        double CardBal = 5000;
        double Month1 = CardBal * 1.17;
        double Month2 = Month1 * 1.17;
        System.out.println("The interest after month 1 is " + Month1);
        System.out.println("The interest after month 2 is " + Month2);
    }
}