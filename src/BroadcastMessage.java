import java.util.ArrayList;
import java.util.List;

public class BroadcastMessage {
    private final List<Message> messages;
    private final MessageHandler messageHandler;
    public BroadcastMessage(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
        this.messages = new ArrayList<>();
    }
    public void addMessage(Message message) {
        this.messages.add(message);
    }
    public void sendAllMessages() {
        for (Message message: this.messages) {
            var msg = this.messageHandler.message(message);
            System.out.println("\n#################");
            System.out.println("Sended Message");
            System.out.println(msg);
            System.out.println("#################\n");
        }
    }
}
