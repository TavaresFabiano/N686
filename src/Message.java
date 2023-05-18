public class Message {
    private String msg;
    private String from;
    private String origin;
    private MessageType messageType;
	
    public Message(){}
    
    public Message(String msg, String from, String origin, MessageType messageType) {
		super();
		this.msg = msg;
		this.from = from;
		this.origin = origin;
		this.messageType = messageType;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getOring() {
		return origin;
	}

	public void setOring(String origin) {
		this.origin = origin;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

	@Override
	public String toString() {
		return "Message [msg=" + msg + ", from=" + from + ", origin=" + origin + ", messageType=" + messageType + "]";
	}
    
}
