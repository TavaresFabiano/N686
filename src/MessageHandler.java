public abstract class MessageHandler {

	protected MessageHandler nextMessage;

	MessageHandler(){}
	MessageHandler(MessageHandler nextMessage) {
        this.nextMessage = nextMessage;
    }
    
    abstract String message(Message message);
    
    abstract MessageType getTypeMessage();

    public boolean validateTypeMessage(Message message) {
        return message.getMessageType() == this.getTypeMessage();
    }
    
    public String sendMessage(Message message) {
        return message.toString();
    }
}
