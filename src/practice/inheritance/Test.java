package practice.inheritance;

class Bank{
    public int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    @Override
    public int getRateOfInterest(){
        return 8;
    }
}
class BOI extends Bank{
    @Override
    public int getRateOfInterest(){
        return 10;
    }
}
class MHB extends Bank{
   public int getRateOfInterest(){
       super.getRateOfInterest();
        return 12;
    }
}
public class Test {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank mhb = new MHB();

        System.out.println(sbi.getRateOfInterest());
        System.out.println(boi.getRateOfInterest());
        System.out.println(mhb.getRateOfInterest());

    }
}
