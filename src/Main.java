public class Main {
    public static void main(String[] args) {

        Outer o1 = new Outer(100);
        o1.fun();

        /*Outer o1 = new Outer(100);
        Outer.Inner in1 = o1.new Inner(10);*/

    }
}
