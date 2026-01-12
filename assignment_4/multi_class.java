class A {
    void show() {
        System.out.println("This is class A");
    }
}

class B {
    void show() {
        System.out.println("This is class B");
    }
}

class C {
    void show() {
        System.out.println("This is class C");
    }
}

class multi_class {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.show();
        b.show();
        c.show();
    }
}
