package practice.interfaces.atm.services.impl;

import practice.interfaces.atm.dao.ATMCardDao;
import practice.interfaces.atm.services.ATMService;

public class ATMServiceImpl implements ATMService {

    @Override
    public void withdraw(int atmPin, long amount) {
       ATMCardDao
                .atmCardList
                .stream()
                .map(atmCard ->
                        atmCard.getAtmPin() == atmPin
                                &&atmCard.getBalance() >= amount
                                ? "Withdraw successfully!! Debited amount: " + amount + " :: available amount: " + (atmCard.getBalance() - amount)
                                : atmCard.getBalance()<amount? "Your account balance is to less":""
                )
               .distinct()
               .forEach(System.out::println);

    }

    @Override
    public void checkBalance(int atmPin) {
        ATMCardDao
                .atmCardList
                .stream()
                .map(atmCard ->
                        atmCard.getAtmPin() == atmPin
                                ? "Your available balance are: " + atmCard.getBalance()
                                : "")
                .distinct()
                .forEach(System.out::println);
    }

    @Override
    public void transferMoney(int atmPin, long receiverAccountNumber, String IFSCCode) {
        System.out.println("Wait just while transferring money...");
    }

    @Override
    public void changePin(int otp, int newPin) {
        System.out.println("Your new PIN: "+newPin);
    }

    @Override
    public void rechargeYourMobile(int atmPin, long mobileNumber, double amount) {
        ATMCardDao
                .atmCardList
                .stream()
                .map(atmCard ->
                        atmCard
                                .getAtmPin()==atmPin
                                &&atmCard.getMobileNumber()==mobileNumber
                                &&atmCard.getBalance()>=amount
                                    ?"Recharged successfully!!"
                                    +"\n Debited amount: "+(amount)
                                    + "\nYour available balance: " +(atmCard.getBalance()-amount)
                                :"Incorrect credentials entered!!").distinct()
                .forEach(System.out::println);
    }

    @Override
    public void depositCash(int atmPin, long amount) {
        ATMCardDao
                .atmCardList
                .stream()
                .map(atmCard ->
                        atmCard.getAtmPin()==atmPin
                                ?"Credited amount: "+amount+" :: Total available balance: "+(atmCard.getBalance()+(amount))
                                :"Incorrect PIN entered!!").distinct()
                .forEach(System.out::println);
    }

    @Override
    public String changeMobileNumber(int atmPin, int otp,long oldMobileNumber, long newMobileNumber) {
       /* ATMCardDao
                .atmCardList
                .stream()
                .map(atmCard ->
                        atmCard.getAtmPin()==atmPin
                                &&atmCard.getOtp()==otp
                                ?ATMCardDao
                                .atmCardList
                                .get(ATMCardDao
                                        .atmCardList
                                        .set(ATMCardDao
                                                .atmCardList
                                                .set(ATMCardDao
                                                        .atmCardList
                                                        .indexOf(atmCard
                                                                .getMobileNumber()),

                                                        ))):"g");*/

        // long atmNumber, int atmPin, long mobileNumber, int csv, Double balance
        return null;
    }
}
