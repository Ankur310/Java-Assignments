package Coupling;


import java.io.IOException;

interface Show {
    public void display();
}

class a {
    Show s;
    public a(Show s) {
        //s is loosely coupled to A
        this.s = s;
    }

    public void display() {
        System.out.println("a");
        s.display();
    }
}

class b implements Show {
    public b(){}
    public void display() {
        System.out.println("b");
    }
}

class C implements Show {
    public C(){}
    public void display() {
        System.out.println("C");
    }
}




public class Loose_Coupling {
    public static void main(String args[]) throws IOException {
        Show b = new b();
        Show c = new C();

        a ab = new a(b);
        //a.display() will print A and B
        ab.display();

        a a1 = new a(c);
        //a.display() will print A and C
        a1.display();
    }
}
