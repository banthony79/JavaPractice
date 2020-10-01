package PersonalStuff.ShoppingList;

public class CharacterCount {

    public static int characterCount(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char result = word.charAt(i);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int num = characterCount("Coffee Cup");
        System.out.println("The count is " + num);

    }


}
