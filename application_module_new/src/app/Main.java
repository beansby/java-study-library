package app;

import packA.A;
import packB.B;
import packC.C;
import packD.*;
public class Main { public static void main(String[] args) {
        A a = new A();
        a.method();

        B b = new B();
        b.method();

        C c = new C();
        c.method();

        D d = new D();
        d.method();
    }
}
