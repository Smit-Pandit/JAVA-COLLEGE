
public class family {

    public static void main(String[] args) {
        Children x = new Children("Arma", "Karma", "Verma", "Sharma");
        x.displayName();
    }
}

class Grandparent {

    String firstG, lastG;

    Grandparent(String f, String l) {
        this.firstG = f;
        this.lastG = l;
    }

    public void displayName() {
        System.out.println("Grandparent name: " + firstG + " " + lastG);
    }
}

class Parent extends Grandparent {

    String firstP, middleP, lastP;

    Parent(String sN, String tN, String lN) {
        super(tN, lN);
        this.firstP = sN;
        this.middleP = tN;
        this.lastP = lN;
    }

    @Override
    public void displayName() {
        super.displayName();
        System.out.println("Parent name: " + firstP + " " + middleP + " " + lastP);
    }
}

class Children extends Parent {

    String firstC, middleC, lastC;

    Children(String fN, String sN, String tN, String lN) {
        super(sN, tN, lN);
        this.firstC = fN;
        this.middleC = sN;
        this.lastC = lN;
    }

    @Override
    public void displayName() {
        super.displayName();
        System.out.println("Children name: " + firstC + " " + middleC + " " + lastC);
    }
}
