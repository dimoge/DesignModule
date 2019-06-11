public class Client {

    public static void main(String[] args){

        MemberStrategy memberStrategy = new Member3();

        Price price = new Price(memberStrategy);
        double myPrice = 100;
        System.out.println("原价: " + myPrice + ", 高级会员价：" + price.qute(myPrice));

    }
}
