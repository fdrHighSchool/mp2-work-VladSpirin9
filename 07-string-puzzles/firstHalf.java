class Main {
  public static void main(String[] args) {
    System.out.println(firstHalf("WooHoo"));
    System.out.println(firstHalf("HelloThere"));
    System.out.println(firstHalf("abcdef"));
  }
  public static String firstHalf(String s) {
    String result = s.substring(0,(s.length() / 2));
    return result;
  }
}
