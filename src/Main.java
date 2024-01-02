import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the two numbers for addition:");
        Scanner readInput = new Scanner(System.in);
        int x = readInput.nextInt();
        int y= readInput.nextInt();
        readInput.close();

        System.out.println("The sum of a and b is= " +Integer.sum(x,y));
        System.out.println(x + " minus " + y + (" equals ") + (x-y));
    }

}