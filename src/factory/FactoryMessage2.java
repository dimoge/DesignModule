/**
 *  静态多工厂模式
 *  具体的工厂：多个穿件方法，进一步防止type传递错误导致不能正确创建对象
 */
public class FactoryMessage2 {


    public static EmailMessage createEmail(){
        return new EmailMessage();
    }

    public static ToDoMessage createToDo(){
        return new ToDoMessage();
    }

    public static OAMessage createOA(){
        return new OAMessage();
    }
}
