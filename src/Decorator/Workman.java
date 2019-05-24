public class Workman extends Man {

    Man man;

    public void setMan(Man man){
        this.man = man;
    }

    public void eat(){
        super.eat();
        man.eat();
    }

}
