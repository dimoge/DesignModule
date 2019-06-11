/**
 * 高级会员 50%折扣
 */
public class Member3 implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        return price * 0.5;
    }
}
