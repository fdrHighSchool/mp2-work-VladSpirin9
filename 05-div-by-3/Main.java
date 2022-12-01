class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(1000));
    
  }
  public static boolean divBy3(int num) {
    int result = 0;
    int len = len(num);
    for(int i = 0; i < len; i++) {
      result += num % 10;
      num /= 10;
    }
    if (result % 3 == 0) {
      return true;
    }
    return false;
  }
  public static int len(int num) {
    int len = 0;
    int t = 1;
    while(t <= num) {
      len++;
      t *= 10;
    }
    return len;
  }
}
