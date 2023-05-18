import java.util.Objects;

public class MessageTextHandler extends MessageHandler {
	public MessageTextHandler() {
        super();
    }
    public MessageTextHandler(MessageHandler nextMessage) {
        super(nextMessage);
	}
    
	@Override
	String message(Message message) {
		if (this.validateTypeMessage(message)) {
			return this.sendMessage(message);
		}
		if (Objects.isNull(this.nextMessage)) throw new MessageHandlerException("end of chain");
		return this.nextMessage.message(message);
	}
	@Override
	MessageType getTypeMessage() {
		return MessageType.TEXT;
	}
}
