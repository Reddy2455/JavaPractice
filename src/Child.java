public class Child extends Parent {
    int age=20;

    public Child(String name, int age){
        super("arjun");
        this.name=name;
        this.age=age;
    }
    public Child(int age){
        super("nag");

        this.age=age;

    }
    public static void main(String[] args) {
        Child ch = new Child(30);
        System.out.println(ch.age + ch.name);
    }

}

