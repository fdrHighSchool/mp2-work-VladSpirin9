class Main {
  public static void main(String[] args) {
    System.out.println(conCat("dog","cat"));
    System.out.println(conCat("abc","cat"));
    System.out.println(conCat("banana", "ace"));
  }
  public static String conCat(String s1, String s2) {
    char last = s1.charAt(s1.length()-1);
    char first = s2.charAt(0);
    if (last == first) { 
      return s1 + s2.substring(1);
    }
    return s1 + s2;
    
  }
}
