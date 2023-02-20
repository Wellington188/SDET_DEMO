import java.util.Scanner;

public class Ex {
   
  public static void main(String[] args) {
    String s = "1 2 3 4" +
    "\n6 8 9";
    Scanner sc = new Scanner(s);
    String input = "";
    int maior = Integer.MIN_VALUE;

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      input += line + " ";
    }

    String[] arrayStr = input.split(" ");
    int[] array = new int[arrayStr.length];

    for (int i = 0; i < arrayStr.length; i++) {
      array[i] = Integer.parseInt(arrayStr[i]);
      if (array[i] > maior) {
        maior = array[i];
      }
    }

    System.out.println("Maior valor: " + maior);
  }
}

    
