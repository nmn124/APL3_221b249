
interface Testable {
   
    void display();
}


class Test implements Testable {
   
    public void display() {
        System.out.println("Display method from Test class");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display(); 
    }
}


abstract class AbsTest implements Testable {
 
}


class ConcreteTest extends AbsTest {
    
    public void display() {
        System.out.println("Display method from ConcreteTest class");
    }

    public static void main(String[] args) {
        ConcreteTest ct = new ConcreteTest();
        ct.display(); 
    }
}
