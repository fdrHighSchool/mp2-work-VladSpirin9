class Main {
  public static void main(String[] args) {
    System.out.println("Shapes!");
    square(5);
    System.out.println();
    rectangle(2, 4);
    System.out.println();
    rightTriangle(4);
    System.out.println();
    triangle(4);
  }
  public static void square(int s) {
    for (int row = 0; row < s; row++) {
      for (int col = 0; col < s; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  
  public static void rectangle(int l, int w) {
    for (int row = 0; row < l; row++) {
      for (int col = 0; col < w; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void rightTriangle(int s) {
    for (int row = 1; row <= s; ++row) {
      for(int col = 1; col <= row; ++col) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void triangle(int s) {
    for (int i = 1; i <= s; i++) {
      for (int j = 1; j <= s - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
