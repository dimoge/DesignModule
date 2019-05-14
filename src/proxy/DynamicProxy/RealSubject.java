package DynamicProxy;

public class RealSubject implements Subject {
    @Override
    public void rest() {
        System.out.println("RealSubject ......rest!");
    }

    @Override
    public void hello(String str) {
        System.out.println("RealSubject=>hello: " + str);
    }

    public void Ddd(){

    }
}
