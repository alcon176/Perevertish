/*
 *Программа просит ввести строку и выводит её наоборот 
 * 
 * 
 */
package perevertish;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Perevertish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
    //    System.out.println(" str = "+str);
        char[] charStr = str.toCharArray();
    //  System.out.println("charStr"+Arrays.toString(charStr));
        char[] newCharStr = new char[charStr.length];
      //  System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        for (int i = 0; i < charStr.length; i++){
            newCharStr[(charStr.length-1)-i]=charStr[i];
        }
      //  System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        String str2 = new String(newCharStr);
        System.out.println(" Строка наоборт: = "+str2);
        System.out.println("++++++++++++++++++++++++++++++");
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Строка наоборот: " + sb.reverse().toString());
    }
    
}
