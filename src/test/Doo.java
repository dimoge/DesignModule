public class Doo {

    Notify notify;

    public void send(String msg){
        notify.notifyMsg(msg);
    }

    public interface Notify{
        public void notifyMsg(String msg);
    }

    public void setListener(Notify notify){
        this.notify = notify;
    }

}
