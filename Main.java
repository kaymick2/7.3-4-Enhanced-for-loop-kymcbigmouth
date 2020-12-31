class Main {
  public static void main(String[] args) {
    //for exercise 1
    int biggie[] = new int[10];
    for (int x = 0; x < 10; x++) {
      biggie[x] = x;
    }
    for (int y : biggie) {
      System.out.println("element " + (y+1) + " is " + biggie[y]);
    }
    //for exercise 2
    
  }
}