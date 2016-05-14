/**
 * Получить от пользователя число1
 Получить от пользователя число2
 Вывести на экран сумму, разницу, произведение, частное.

 */
public class Zadacha1 {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner( System.in );

        System.out.print( "Enter integer1: " );
        int integer1 = scanner.nextInt();
        System.out.println( "You printed: " + integer1 );

        System.out.print( "Enter integer2: " );
        int integer2 = scanner.nextInt();
        System.out.println( "You printed: " + integer2 );

        System.out.println(integer1 + integer2);
        System.out.println(integer1 - integer2);
        System.out.println(integer1 / integer2);
        System.out.println(integer1 * integer2);
    }
}
