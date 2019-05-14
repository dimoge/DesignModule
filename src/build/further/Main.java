package further;

public class Main {

    public static void main(String[] args){
        Student student = new Student.Builder("Mr.Li", 12, 180, 1).idCard("abc").build();
    }
}
