package org.perfomatix.training;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
    public class ATMBank  {
    public static void main(String args[]) {
        try {
            boolean Islogged = false;
            int ch;
            char c;
            Scanner s = new Scanner(System.in);
           // ATMBank atm = new ATMBank();
            AtmService atmService = new AtmService();
            Map<Integer, Integer> userDetails = new HashMap<>();
            userDetails.put(333445, 1234);
            userDetails.put(112212, 3456);

            if (atmService.validatePin(userDetails)) {
                System.out.println("Sucessfully Loggedin");
                Islogged = true;
            } else {
                System.out.println("Invalid Credentials");
                System.out.println("Do you want to continue [Y/n]:");
                c = s.next().charAt(0);
                if (c == 'Y') {
                    atmService.validatePin(userDetails);
                }
            }

            do {
                System.out.println("Deposite 1:");
                System.out.println("Widraw 2:");
                System.out.println("CheckBalance 3:");
                System.out.println("Change Pin 4:");
                System.out.println("Enter the Choice ");
                ch = s.nextInt();
                switch (ch) {
                    case 1:
                        if (atmService.validatePin(userDetails)) {
                            atmService.deposit();
                        } else {
                            System.out.println("Invalid credentials");
                        }
                        break;
                    case 2:
                        if (Islogged == true)
                            atmService.widraw();
                        break;
                    case 3:
                        if (Islogged == true) {
                            atmService.balance();
                        }
                        break;
                    case 4:
                            if(atmService.changePin(userDetails)){
                                System.out.println("Sucessfully pin Updated");
                                //return;
                            }
                        else{
                            System.out.println("Pin alredy exist!!");
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice ");
                }
                System.out.println("Do you want to continue [Y/n]:");
                c = s.next().charAt(0);
            }
            while (c == 'Y');
        }catch(InputMismatchException e){System.out.println(e);}
        System.out.println("Account Number and PinNumber should be in Numeric");

    }
}







