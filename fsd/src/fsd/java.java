package fsd;

import java.io.BufferedReader;//ce zelimo importat vse io. lahko damo io.*
import java.io.IOException;
import java.io.InputStreamReader;

public class java{
  public static void main(String[]args) throws IOException{

    BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Vnesi prvo Stevilo ");
    int prvoStevilo = Integer.parseInt(vhod.readLine());

    System.out.print("Vnesi drugo stevilo ");
    double drugoStevilo = Double.parseDouble(vhod.readLine());

    double rezultat = prvoStevilo + drugoStevilo;

    System.out.println(prvoStevilo + " + " + drugoStevilo + " = " + rezultat);
  }
}
