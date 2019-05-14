/**
 * 具体观察者 -- 关注公众号的用户
 */
public class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "获得推送消息：【" + msg + "】");
    }
}
