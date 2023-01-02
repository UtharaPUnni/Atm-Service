package org.perfomatix.training;

import java.util.Map;

public interface Account {
     void deposit();
     void widraw();
     void balance();
    //abstract void changePin();
     boolean changePin(Map<Integer,Integer> userDetails);
     boolean validatePin(Map<Integer,Integer> userDetails);
}
