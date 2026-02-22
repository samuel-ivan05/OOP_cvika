package web.hello_world;

public class TestHelloWorld {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();

        System.out.println(hw.sayHello("Alice"));
        System.out.println("---");
        System.out.println(hw.sayHelloMultiple(new String[]{"Alice", "Bob"}));
        System.out.println("---");
        System.out.println(hw.countGreetings(new String[]{"A", "B", "C"}));
    }
}
