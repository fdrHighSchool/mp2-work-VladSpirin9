class Main {
  public static void main(String[] args) {
    //int num = 4;
    
    for(int i = 1; i < 101; i++) {
    
      if ((i % 3 == 0) && (i % 5 == 0)) {
        //result += "fizzbuzz";
        System.out.print("fizzbuzz");
      }
    
      else if ((i % 3) == 0) {
        //result += "fizz";
        System.out.print("fizz");
      }
        
      else if ((i % 5) == 0) {
        //result += "buzz";
        System.out.print("buzz");
      }
      
      else {
        System.out.print(i);
        System.out.print(" ");
      }
      System.out.println( );
    }
  }
}
