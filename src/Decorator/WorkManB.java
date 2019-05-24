public class WorkManB extends Workman {

    Workman workman;

    public void setWorkman(Workman workman){
        this.workman = workman;
    }

    public void eatB(){
        System.out.println("WorkmanB 独有的发给发 eatB ！");
    }

    public void eat(){
        super.eat();
        eatB();
    }
}
