class Main {
  public static void main(String[] args) {
    System.out.println(repeatEnd("Hello", 3));
    System.out.println(repeatEnd("Hello", 2));
    System.out.println(repeatEnd("Hello", 1));
  }
  public static String repeatEnd(String str, int num) {
    String a = str.substring(str.length()-num);
    String n = "";
    for (int i = 0; i < num; i++) {
      n += a;
      
    }
    return n;
  }
}
