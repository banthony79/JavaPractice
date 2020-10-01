package PersonalStuff.BrycesPizza;

public class Wing extends MenuItem {

    private Flavour wingFlavour;


    public Wing(String itemName, int itemNumber, Flavour wingFlavour) {
        super(itemName, 9.99, itemNumber);
        this.wingFlavour = wingFlavour;
    }

    enum Flavour {
        BBQ,
        SALT_AND_PEPPER,
        LEMON_PEPPER,
        RANCH,
        HOT,
        TERIYAKI,

    }

    public Flavour getWingFlavour() {
        return wingFlavour;
    }

    public void setWingFlavour(Flavour wingFlavour) {
        this.wingFlavour = wingFlavour;
    }
}
