package practice.interfaces.atm.services;

// Abstraction means Hiding internal implementation and just highlight the set of services what we are offering
 public interface ATMService {

    void withdraw(int atmPin, long amount);  // public abstract void withdraw(int atmPin, long amount);

    void checkBalance(int atmPin);

    void transferMoney(int atmPin, long receiverAccountNumber, String IFSCCode);

    void changePin(int otp, int newPin);

    void rechargeYourMobile(int atmPin, long mobileNumber, double amount);

    void depositCash(int atmPin, long amount);

    String changeMobileNumber(int atmPin, int otp, long oldMobileNumber,long newMobileNumber);

}
