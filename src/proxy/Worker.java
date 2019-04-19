public class Worker implements Business {

    String name;

    private Business business;

    public Worker(String name, Business business){
        this.name = name;

    }

    @Override
    public void meetimg(String name) {
        business.meetimg(name);
    }
}
