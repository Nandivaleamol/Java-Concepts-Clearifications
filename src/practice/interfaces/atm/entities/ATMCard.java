package practice.interfaces.atm.entities;

public class ATMCard {

    private long atmNumber;
    private int atmPin;
    private long mobileNumber;
    private int csv;

    private Double balance;

    private int otp;

    public ATMCard(long atmNumber, int atmPin, long mobileNumber, int csv, Double balance) {
        this.atmNumber = atmNumber;
        this.atmPin = atmPin;
        this.mobileNumber = mobileNumber;
        this.csv = csv;
        this.balance = balance;
    }

    public ATMCard() {
    }

    public long getAtmNumber() {
        return atmNumber;
    }

    public void setAtmNumber(long atmNumber) {
        this.atmNumber = atmNumber;
    }

    public int getAtmPin() {
        return atmPin;
    }

    public void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getCsv() {
        return csv;
    }

    public void setCsv(int csv) {
        this.csv = csv;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }


}
