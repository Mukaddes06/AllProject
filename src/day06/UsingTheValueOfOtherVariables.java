package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {
        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;
        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);
        yourFavoriteNumber = 100;
        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        // Create a variable called yourOrder , type String and assign a value
        // optionally assign this value Scanner
        // Create another variabla called myOrder and assign the value
        //to same value as yourOrder by copying
        //and just print them out

        String yourOrder = "Gucci bag";
        String myOrder = yourOrder;

        System.out.println("My ordered " + myOrder);
        System.out.println("Your ordered " + yourOrder);

    }
}
