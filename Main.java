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
      System.out.println("element " + (y + 1) + " is " + biggie[y]);
    }
    // for exercise 2
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter how long you want the arraylist to be: ");
    int quantity=userInput.nextInt();
    ArrayList<Integer> tortilla = new ArrayList<Integer>();
    int z = 1;
    while (z < quantity )
      ;
    {

      int a=z*z;
      tortilla.add(a);
     
      z++;
    }
     System.out.println(tortilla);
  }
}