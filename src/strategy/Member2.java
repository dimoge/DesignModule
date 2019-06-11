/**
 * 中级会员 20%折扣
 */
public class Member2 implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        return price * 0.2;
    }
}
