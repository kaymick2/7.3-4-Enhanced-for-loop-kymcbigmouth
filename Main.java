class Main {
  public static void main(String[] args) {
    int biggie[]=new int[10];
    for(int x=0;x<10;x++){
      biggie[x]=x+1;
    }
    for(int y=0;y<biggie.length;y++) {
      System.out.println("element "+(y+1)+" is "+biggie[y]);
    }
  }
}