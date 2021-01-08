import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    // for exercise 1
    int biggie[] = new int[10];
    for (int x = 0; x < 10; x++) {
      biggie[x] = x;
    }
    for (int y : biggie) {
      System.out.println("element " + (y + 1) + " is " + y);
    }
    // for exercise 2
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter how long you want the arraylist to be: ");
    int quantity = userInput.nextInt();
    ArrayList<Integer> tortilla = new ArrayList<Integer>();
    int z = 0;
    int a;
    while (z < quantity) {

      a = z * z;
      tortilla.add(a);

      z++;
    }
    System.out.println(tortilla);
    int sum=0;
    for (int element : tortilla) {
      sum = element + sum;
    }
    System.out.println("the sum of the values is: " + sum);
    int average = sum / quantity;
    System.out.println("The average of the values is: " + average);
  }
}