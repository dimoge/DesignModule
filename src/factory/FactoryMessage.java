/**
 *  具体的工厂
 */
public class FactoryMessage implements IMyMessageFactory {

    public static final String EMAIL = "EMAIL";
    public static final String OA = "OA";
    public static final String TODO = "TODO";

    IMyMessage iMyMessage;

    @Override
    public IMyMessage createMessage(String type) {
        if(type.equals(EMAIL)){
            iMyMessage = new EmailMessage();
        }else if(type.equals(OA)){
            iMyMessage = new OAMessage();
        }else if(type.equals("TODO")){
            iMyMessage = new ToDoMessage();
        }else{
            iMyMessage = new EmailMessage();
        }
        return iMyMessage;
    }
}
