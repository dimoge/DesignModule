import java.util.Map;

public interface IMyMessage {

    public Map<String, Object> getMessageParams();

    public void setMessageParams(Map<String, Object> map);

    public void sendMessage() throws Exception;
}
