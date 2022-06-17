import java.util.*;

public class main {
  public static void main(String[] args) {
    String num1 ;
    String num2 ;
    String op ;
    String[] rom = new String[]{" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
            "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV",
            "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV",
            "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV",
            "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII",
            "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII",
            "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
            "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
            "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"};
    String line ;
    System.out.println("Ведите два цыфра: римские или арабские: от 0 до 10 или от I до X");
    Scanner sc = new Scanner(System.in);
    line= sc.nextLine();
    String[] x= line.split(" ");
    num1 = x[0];   //наша первая римская или арабская цыфра
    op = x[1];    //операция (+, -, *, /)
    num2 = x[2];  //наша вторая римская или арабская цыфра
if (x.length>3){
  System.out.println("Введенная операция не сответсвует стандартам калькулятора");
  System.exit(5);}
    //проверим введенные строки (num1, num2) римские?
    List<String> romList = new ArrayList<>(Arrays.asList(rom));


  if (romList.contains(num1) &&
          romList.contains(num2)) {
    //получим индекс
    int numR1 = romList.indexOf(num1);
    int numR2 = romList.indexOf(num2);

    if (numR1 > 0 && numR1 < 11 && numR2 > 0 && numR2 < 11) {
      switch (op) {
        case "+":
          int a = numR1 + numR2;
          System.out.println(rom[a]);
          break;
        case "-":
          int b = numR1 - numR2;

          if (b > 0) {
            System.out.println(rom[b]);
          } else {

            System.out.println("полученная цыфра не может быть меньше I");
          }
          break;
        case "/":
          int c = numR1 / numR2;
//           System.out.println(rom[c]);}
//         catch(Exception e){
//           System.out.println(e+"полученная цыфра не может быть меньше I");}
          if (c > 0) {
            System.out.println(rom[c]);
          } else {

            System.out.println("полученная цыфра не может быть меньше I");
          }
          break;
        case "*":
          int d = numR1 * numR2;
          System.out.println(rom[d]);
          break;


      }

    }
    else {
      System.out.println("введенные цыфры не сответствуют стандартам калькулятора");}
  }

  //проверим введенные строки (num1, num2) арабские?
  else {
    int numA1 = Integer.parseInt(num1.trim());
    int numA2 = Integer.parseInt(num2.trim());
    if(numA1>0 && numA1<11 && numA2>0 && numA2<11) {
      switch (op) {
        case "+":
          int a = numA1 + numA2;
          System.out.println(a);
          break;
        case "-":
          int b = numA1 - numA2;
          System.out.println(b);
          break;
        case "/":
          int c = numA1 / numA2;
          System.out.println(c);
          break;
        case "*":
          int d = numA1 * numA1;
          System.out.println(d);
          break;
      }
    }
    else{;
      System.out.println("введенные цыфры не сответствуют стандартам калькулятора");}
  }
}

  }



