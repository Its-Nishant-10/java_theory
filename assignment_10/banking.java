abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class banking {
    static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new PNB();
        System.out.println("Nishant Nahar -- 241551078");
        System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + "%");
        System.out.println("PNB Rate of Interest: " + b2.getRateOfInterest() + "%");
    }
}