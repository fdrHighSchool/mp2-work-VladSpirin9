class Main {
  public static void main(String[] args) {
    //int g;
    System.out.println(letterGrade(48)); //F
    System.out.println(letterGrade(61)); //D-
    System.out.println(letterGrade(85)); //B
    System.out.println(letterGrade(99)); //A+
    
  }
  public static String letterGrade(int g) {
    String grade = "";
    System.out.println("What is your grade?");
    if (g >= 90) {
      grade = "A";
      if (g % 10 >= 7) {
        grade  += "+";
      }
      else if (g % 10 <= 2) {
        grade += "-";
      }
      
      
    }
    else if (g >= 80 && g < 90) {
      grade = "B";
      if (g % 10 >= 7) {
        grade += "+";
      }
      else if (g % 10 <= 2) {
        grade += "-";
      }
      
      
    }
    else if (g >= 70 && g < 80) {
      grade = "C";
      if (g % 10 >= 7) {
        grade += "+";
      }
      else if (g % 10 <= 2) {
        grade += "-";
      }
      
    }
    else if (g >= 60 && g < 70) {
      grade = "D";
      if (g % 10 >= 7) {
        grade += "+";
      }
      else if (g % 10 <= 2) {
        grade  += "-";
      }
      
    }
    else {
      grade = "F";
    }
    return grade;
  }
}
