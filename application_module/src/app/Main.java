package app;

import packA.*;
import packB.*;
import packC.*;
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method();

        B b = new B();
        b.method();

        C c = new C();
        c.method();

        //컴파일 에러 : import 안 함
//        D d = new D();
//        d.method();
    }
}
