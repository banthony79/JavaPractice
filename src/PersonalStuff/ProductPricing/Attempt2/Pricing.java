package PersonalStuff.ProductPricing.Attempt2;

public class Pricing {

    private static double[] EastPitPrices = {6.00, 5.65, 5.65, 4.60, 6.35, 6.90, 8.60,
            6.35, 8.55, 8.50, 9.85, 7.70};
    private static double[] k2PitPrices = {7.50, 8.16, 8.16, 9.18, 8.50, 9.50, 4.50, 0,
            0, 10.50, 12.10, 9.80, 12.50};
    private static double[] dundurnPrices = {7.75, 7.40, 6.85, 6.85, 6.35, 7.95, 8.45, 00,
            12.35, 4.25, 9.75, 11.60, 11.70};
    private static double[] radissonPrices = {8.55, 9.00, 9.00, 9.84, 9.84, 9.61, 10.55, 4.75,
            00, 00, 11.60, 13.15, 11.35, 13.50};
    private static double[] martensvillePrices = {0, 3.22, 3.80, 4.50, 3.00, 3.85, 5.50, 10.30
            , 8.00, 5.50, 7.10, 4.15};
    private static double[] revyPrices = {5.50, 5.15, 5.15, 4.20, 4.20, 5.80, 6.35, 0, 0, 0, 0, 0,
            0, 0};
    private static double[] twayPrices = {14.55, 14.55, 14.55, 13.65, 13.65, 15.90, 16.25, 0, 0, 0, 0,
            0, 0};
    private static double[] wakawPrices = {11.50, 11.20, 11.20, 10.70, 10.70, 11.50, 12.50, 0, 0, 0, 0,
            0, 0};

    public double priceCalulator(double price, double haulrate) {
        double deliveredPrice = price - haulrate;
        if (deliveredPrice <= 0) {
            System.out.println("Price is less than zero - invalid price");
            return -1;
        } else {
            return price - haulrate;
        }
    }


    public double pricingNoDeduction(double price, double haulrate) {
        double deliveredPrice = price - haulrate;
        if (deliveredPrice <= 0) {
            System.out.println("Price is less than zero - invalid price");
            return -1;
        } else {
            return price + haulrate;
        }
    }


    public double freighRateCalculator(int kilometers, double rate) {
        return kilometers * rate / 100;
    }

    public double pitNumbers(int pitNumber, int zone) {
        double haulrate = 0;
        switch (pitNumber) {
            case 9408:
                haulrate = EastPitPrices[zone - 1];
                break;
            case 9414:
                haulrate = k2PitPrices[zone - 1];
                break;
            case 9407:
                haulrate = dundurnPrices[zone - 1];
                break;
            case 9428:
                haulrate = martensvillePrices[zone - 1];
                break;
            case 9440:
                haulrate = revyPrices[zone - 1];
                break;
            case 9481:
                haulrate = wakawPrices[zone - 1];
                break;
            case 9454:
                haulrate = twayPrices[zone - 1];
                break;
            case 9402:
                haulrate = radissonPrices[zone - 1];
                break;
            default:
                System.out.println("Invalid Pit Number.");
                break;
        }

        return haulrate;
    }

    public double pitNumberDiscount(int pitNumber) {
        double pitdiscount = 0;
        switch (pitNumber) {
            case 9408:
                pitdiscount = 5;
                break;
            case 9414:
                pitdiscount = 7.5;
                break;
            case 9407:
                pitdiscount = 6;
                break;
            case 9402:
                pitdiscount = 9;
                break;


        }

        return pitdiscount;
    }
}


