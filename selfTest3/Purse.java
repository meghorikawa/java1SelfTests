/**
 * A class to simulate a coin purse that can hold
 * one-euro, fifty-cent, ten-cent, and one-cent coins.
 */
public class Purse 
{
    // Coin value constants
    public static final double ONE_EURO_VALUE = 1.0;
    public static final double FIFTY_CENT_VALUE = .50;
    public static final double TEN_CENT_VALUE = .10;
    public static final double ONE_CENT_VALUE = .01;
    
    // Instance variables for number of each coin denomination
    private int numOneEuro;
    private int numFiftyCent;
    private int numTenCent;
    private int numOneCent;
    
    /**
     * Construct an empty Purse
     */
    public Purse()
    {
        numOneEuro = numFiftyCent = numTenCent = numOneCent = 0;
    }
    
    /**
     * Add count one-cent coins to this purse
     * @param count the number of one-cent coins to add
     */
    public void addOneCentCoins(int count)
    {
         // this is a stub - replace it with your code
        numOneCent += count;
    }
    
    /**
     * Add count ten-cent coins to this purse
     * @param count the number of ten-cent coins to add
     */
    public void addTenCentCoins(int count)
    {
        // this is a stub - replace it with your code
        numTenCent += count;

    }
    
    /**
     * Add count fifty-cent coins to this purse
     * @param count the number of fifty-cent coins to add
     */
    public void addFiftyCentCoins(int count)
    {
        // this is a stub - replace it with your code
        numFiftyCent += count;
    }
    
    /**
     * Add count one-euro coins to this purse
     * @param count the number of one-euro coins to add
     */
    public void addOneEuroCoins(int count)
    {
        // this is a stub - replace it with your code
        numOneEuro += count; 
    }
    
    /**
     * Determine the total value of all the coins
     * in this purse
     * @return the total value of the coins in this Purse
     */
    public double getTotal()
    {
        // this is a stub - replace it with your code
        double totalValue = 0;
        totalValue = ((numOneEuro*1)+ (numFiftyCent*.5)+(numTenCent*.10)+(numOneCent*.01));
        return totalValue;
    }
    
    /**
     * Get a String representation of this Purse
     * @return a String representation of this Purse
     */
    public String toString()
    {
        // this is a stub - replace it with your code
        String stringrep="";
        stringrep = numOneEuro +" One Euro Coins, " +
                    numFiftyCent +  "Fifty-Cent Coins" + 
                    numTenCent + " Ten-Cent Coins, " + 
                    numOneCent + " One-Cent Coins."+
                    "[total value: " + String.format("%.2f", getTotal());
        return stringrep;
    }
}