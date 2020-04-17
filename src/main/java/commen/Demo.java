package commen;

//import java.util.ArrayList;

public class Demo extends Momo{
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        show(list);
        Test test = new Test();
        System.out.println(test.a);
    }

    private static void show(java.util.ArrayList<String> list) {
        System.out.println("I am fully Qualified Name");
    }
}

class Test extends Momo{
    int age;
  //  int a = 50;
    public void setAge() {
        System.out.println("I am Test :");
    }
}
class Momo {
    int a = 20;
    int b;
    public void alex() {
        System.out.println("I am momo");
    }
}
