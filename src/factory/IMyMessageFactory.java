/**
 * 抽象的工厂
 */
public interface IMyMessageFactory {

    public IMyMessage createMessage(String type);
}
