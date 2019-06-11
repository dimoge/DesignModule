/**
 * 初级会员 不打折
 */
public class Member1 implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        return price;
    }
}
