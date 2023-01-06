package fraction;

import session2.HotGirl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction t1=new Fraction();
        Fraction t2=new Fraction();
        Fraction t= t1.add(t2);
        Fraction h=t1.sub(t2);
        Fraction n=t1.mul(t2);
        Fraction c=t1.div(t2);

        t.rutGon();
        h.rutGon();
        n.rutGon();
        c.rutGon();

        t.print();
        h.print();
        n.print();
        c.print();
    }
}
