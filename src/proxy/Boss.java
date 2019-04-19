public class Boss implements Business {

    String name;

    public Boss(String name){
        this.name = name;
    }

    @Override
    public void meetimg(String name) {
        System.out.println("参加会议：" + name);
    }
}
