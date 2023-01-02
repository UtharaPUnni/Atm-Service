package org.perfomatix.training;

import java.util.Map;
import java.util.Scanner;

class AtmService implements Account {
    User user = new User();
    Scanner sc = new Scanner(System.in);
    @Override
    public void deposit() {
        System.out.println("Enter the Amount");
        user.amount= sc.nextInt();
        user.balance = user.getBalance()+ user.getAmount();
        System.out.println("Deposited Amount " + user.getAmount());
        System.out.println("Successfully Deposited : Your total balance " + user.getBalance());
    }
    @Override
    public void widraw() {
        System.out.println("Enter the Amount");
        user.amount = sc.nextInt();
        if(user.balance>=user.amount) {
            user.balance = user.getBalance() - user.getAmount();
            System.out.println("Windrowal Amount " + user.getAmount());
            System.out.println("Your Account Balance " + user.getBalance());
        }else{
            System.out.println("Insuffient Balance");
        }
    }
    @Override
    public void balance() {
        System.out.println("Available Balance " +user.getBalance());
    }
    @Override
    public boolean changePin(Map<Integer, Integer> userDetails){
        System.out.println("Enter the account Number");
        user.acctno = sc.nextInt();
        System.out.println("Enter the New PinNumber");
        user.updatedpin = sc.nextInt();
        for(Map.Entry<Integer,Integer> entry:userDetails.entrySet()) {
            if(entry.getKey()==user.acctno&&entry.getValue()!=user.updatedpin){
                user.pinno = user.updatedpin;
                userDetails.put(user.acctno,user.pinno);
                // System.out.println("Sucessfully pin Updated");
                //break;
                return true;
            }

        }
        return false;
    }
    @Override
    public boolean validatePin(Map<Integer, Integer> userDetails) {
        System.out.println("Enter the AccountNumber");
        user.acctno = sc.nextInt();
        System.out.println("Enter the pinNumber");
        user.pinno = sc.nextInt();
        for(Map.Entry<Integer,Integer> entry:userDetails.entrySet()) {
            if (entry.getKey() == user.acctno && entry.getValue() == user.pinno
                    || entry.getKey() == user.acctno && entry.getValue() == user.pinno) {

                return true;
            }
        }
        return false;
    }
}
