package practice.interfaces.atm.dao;

import practice.interfaces.atm.entities.ATMCard;
import java.util.ArrayList;
import java.util.List;

public class ATMCardDao {

   public static List<ATMCard> atmCardList = new ArrayList<>();
   // long atmNumber, int atmPin, long mobileNumber, short csv

   static {
       atmCardList.add(new ATMCard(102030405,1525,66493200,232,100000.00));
       atmCardList.add(new ATMCard(102030406,1526,66493201,233,50000.00));
       atmCardList.add(new ATMCard(102030407,1527,66493202,234,15000.00));
       atmCardList.add(new ATMCard(102030408,1528,66493203,235,35000.00));
       atmCardList.add(new ATMCard(102030409,1529,66493204,2326,43000.00));
       atmCardList.add(new ATMCard(102030450,1530,66493205,237,70000.00));
       atmCardList.add(new ATMCard(102030451,1531,66493206,238,350000.00));
       atmCardList.add(new ATMCard(102030452,1532,66493207,239,40000.00));
       atmCardList.add(new ATMCard(102030453,1533,66493208,240,20000.00));
       atmCardList.add(new ATMCard(102030454,1534,66493209,241,90000.00));

   }
}
