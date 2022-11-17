public class PurseDemo {
    
    public static void main(String[] args) {
        //new purse object
        Purse bag = new Purse();

        //add random coins to new purse
        bag.addFiftyCentCoins(4);
        //print out total
        System.out.println("Expected total 2.00 " + " Actual total " + String.format("%.2f", bag.getTotal()));

        bag.addOneCentCoins(10);
        System.out.println("Expected total .10" + " Actual Total  " +
                                String.format("%.2f", bag.getTotal()));
        bag.addOneEuroCoins(11);
        System.out.println("Expected total 11.00" + " Actual Total " +
                                String.format("%.2f", bag.getTotal()));
        bag.addTenCentCoins(4);
        System.out.println("Expected total .40" + " Actual Total " +
                                String.format("%.2f", bag.getTotal()));
    





    }

}
