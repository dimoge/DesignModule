import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者 - 微信公众号
 */
public class WechatServer implements Observable {

    private List<Observer> observerList;
    private String msg;

    public WechatServer(){
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update(msg);
        }
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
