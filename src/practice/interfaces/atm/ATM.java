package practice.interfaces.atm;

import practice.interfaces.atm.services.ATMService;
import practice.interfaces.atm.services.impl.ATMServiceImpl;

public class ATM {
    public static void main(String[] args) {

        ATMService atmService = new ATMServiceImpl();

        atmService.withdraw(1528,2000);

        System.out.println("---------------------------------------");

        atmService.checkBalance(1527);
        System.out.println("---------------------------------------");

        atmService.changePin(1919,7373);
        System.out.println("-----------------------------------------");

        atmService.rechargeYourMobile(1528,66493203,300);
        System.out.println("--------------------------------------------");

        atmService.depositCash(1529,10000);

    }
}
