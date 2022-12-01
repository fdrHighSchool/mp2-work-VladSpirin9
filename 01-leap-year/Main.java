class Main {
  public static void main(String[] args) {
    int year = 2000;
    isLeapYear(year);


  }
  public static boolean isLeapYear(int year) {
    System.out.println("Is the year divisible by 4?");
    if(year%4==0) {
      System.out.println("Is the year divisible by 100?");
      if(year%100==0) {
        System.out.println("Is the year divisible by 400?");
        if(year%400==0) {
          System.out.println("It is a leap year");
          return true;
        }
        else {
          System.out.println("It is not a leap year");
          
        }
      }
      else {
        System.out.println("It is not a leap year");
      }
    }
    else {
      System.out.println("It is not a leap year");
    }
    return false;
  }
}
