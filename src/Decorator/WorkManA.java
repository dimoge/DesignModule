public class WorkManA extends Workman {

    Workman workman;

    public void setWorkman(Workman workman){
        this.workman = workman;
    }

    public void eatA(){
        System.out.println("WorkmanA 独有的发给发 eatA ！");
    }

    public void eat(){
        super.eat();
        eatA();
    }
}
