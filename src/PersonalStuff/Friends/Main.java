package PersonalStuff.Friends;

public class Main {

    public static void main(String[] args) {

        Beer canadian = new Beer("Devin", "Holdner",
                41, "Canadian", 5.50);
        Beer o16 = new Beer("Bryce", "Looyenga",
                40, "O16", 6.75);

        canadian.beerCost(7);
        o16.beerCost(8);
    }
}
