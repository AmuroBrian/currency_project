public class Currency {
    public String ownedCurr, desiredCurr;
    public double amount, rate;
    public double[][] rates = {
        {0.93, 1.00, 55.32},
        {0.006, 0.007, 0.38},
        {1.17, 1.26, 69.49},
        {0.12, 0.13, 7.08},
        {1.06, 1.14, 63.27},
        {0.68, 0.74, 40.70},
        {0.69, 0.75, 41.23},
        {0.61, 0.65, 36.22},
        {2.46, 2.65, 156.75},
        {0.25, 0.27, 14.75}
    };
    public String[] unitCurr = {"USD", "JPY", "GBP", "HKD", "CHF", "CAD", "SGD", "AUD", "BHD", "SAR"};
    public String[] desiredUnitCurr = {"EURO", "USD", "PHP"};
    
    public Currency(String ownedCurr, double amount, String desiredCurr){
        this.ownedCurr = ownedCurr;
        this.amount = amount;
        this.desiredCurr = desiredCurr;

        for (int i = 0; i < unitCurr.length; i++){
            if (unitCurr[i].equals(ownedCurr)){
                for (int j = 0; j < desiredUnitCurr.length; j++){
                    if (desiredUnitCurr[j].equals(desiredCurr)){
                        rate = rates[i][j];
                        break;
                    }
                }
            }
        }
    }

    public double getAmount(){
        return this.amount + (rate * this.amount);
    }

    public double getRate(){
        return rate;
    }
}