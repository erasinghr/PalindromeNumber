package app.dsa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromeNumber{

    public void findPalindrome(){
        File file = new File("resources/Numbers.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int number = sc.nextInt();
                int temp = number;
                int rev =  0;
                while (temp!=0){
//                    System.out.println(temp + " " + rev);
                    int lastDigit = temp%10;
                    rev = rev * 10 + lastDigit;
                    temp = temp/10;
                }
                if(number==rev)
                    System.out.println("Number is palindrome"+" "+number+" "+rev);
                else
                    System.out.println("Number is not palindrome"+" "+number+" "+rev);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
