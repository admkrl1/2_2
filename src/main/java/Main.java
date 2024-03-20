// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[] numbers=new int[5];

    System.out.println("Podaj 5 liczb:");
    
    for(int i=0;i<5;i++){
      System.out.println("Liczba"+(i+1)+":");
      numbers[i]=scanner.nextInt();
    }
    int min=numbers[0];
    for (int i=1;i<5;i++){
      if (numbers[i]<min){
        min=numbers[i];
      }
    }
    System.out.println("Najmniejsza liczba to:"+min);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}