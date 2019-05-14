import java.nio.file.Watchable;

public class Main_o {

    public static void main(String[] args){
        //创建一个被观察者，微信公众号
        WechatServer wechatServer = new WechatServer();

        //创建几个观察者，用户
        User zhangsan = new User("张三");
        User lisi = new User("李四");
        User wang2 = new User("王二麻");

        //将观察这注册到被观察者那里
        wechatServer.register(zhangsan);
        wechatServer.register(lisi);
        wechatServer.register(wang2);

        //发送订阅事件
        wechatServer.setMsg("日本海警逮捕我渔船船长张静波");
        wechatServer.notifyObserver();

        //某个用户取消关注
        wechatServer.unRegister(zhangsan);
        System.out.println("zhagnsan：破新闻，我要取关！");

        //发送订阅事件2
        wechatServer.setMsg("日方释放扣押人员，欢迎回家！");
        wechatServer.notifyObserver();


    }

}
