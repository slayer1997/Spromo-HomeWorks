public class Zadacha2 {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner( System.in );

        System.out.print( "Enter string: " );
        String building = scanner.nextLine();
        int wordLength = building.length();
        char letter1 = building.charAt( 0 );
        char letter2 = building.charAt( 1 );
        char letter3 = building.charAt( 2 );
        char letter4 = building.charAt( 3 );
        char letter5 = building.charAt( 4 );
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);

    }
}
