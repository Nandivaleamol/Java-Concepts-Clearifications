package practice.interfaces.atm.services;

public interface ATMService {

    void withdraw(int atmPin, long amount);

    void checkBalance(int atmPin);

    void transferMoney(int atmPin, long receiverAccountNumber, String IFSCCode);

    void changePin(int otp, int newPin);

    void rechargeYourMobile(int atmPin, long mobileNumber, double amount);

    void depositCash(int atmPin, long amount);

    String changeMobileNumber(int atmPin, int otp, long oldMobileNumber,long newMobileNumber);
}
