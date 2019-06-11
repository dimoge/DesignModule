public class Price {

    MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy){
        this.memberStrategy = memberStrategy;
    }

    public double qute(double price){
        return memberStrategy.calcPrice(price);
    }
}
