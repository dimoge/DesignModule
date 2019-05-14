/**
 * 抽象 - 被观察者
 *
 */
public interface Observable {

    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifyObserver();
}
