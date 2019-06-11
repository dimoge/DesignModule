public class TestMain {

    public static void main(String[] args){
        Doo doo1 = new Doo();
        doo1.setListener(new Doo.Notify() {
            @Override
            public void notifyMsg(String msg) {
                System.out.println("doo1"+msg);
            }
        });

        doo1.setListener(new Doo.Notify() {
            @Override
            public void notifyMsg(String msg) {
                System.out.println("doo2"+msg);
            }
        });

        doo1.send("hello");
    }

    public void test(){

    }
}
