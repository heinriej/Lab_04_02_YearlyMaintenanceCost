public class Main
{
    public static void main(String[] args)
    {
        double summerCost = 435.21;
        double winterCost = 657.66;
        double springCost = 345.87;
        double fallCost = 552.45;
        double totalCost = 0;

        totalCost = summerCost + winterCost + springCost + fallCost;

        System.out.println("The total yearly cost of maintenance of " + summerCost + " and " + winterCost + " and " + fallCost + " and " + springCost + " is " + totalCost);
    }
}