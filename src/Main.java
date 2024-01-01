import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the two numbers for addition:");
        Scanner readInput = new Scanner(System.in);
        int a = readInput.nextInt();
        int b = readInput.nextInt();
        readInput.close();

        System.out.println("The sumb of a and b is= " +Integer.sum(a,b));
    }

}