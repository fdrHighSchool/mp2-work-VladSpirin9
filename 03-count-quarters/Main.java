class Main {
  public static void main(String[] args) {
    System.out.println(countQuarters(64));
    System.out.println(countQuarters(1278));
    System.out.println(countQuarters(9));
  }
  public static int countQuarters(int cents) {
    String a = "";
    a += cents;
    if (a.length() == 1) {
      return 0;
    }
    String value = a.substring(a.length() - 2);
    return Integer.parseInt(value)/25;
  }
}
