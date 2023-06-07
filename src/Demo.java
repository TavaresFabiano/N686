public class Demo {

    public static final String ORIGIN = "whatsapp";
    public static final String FROM = "jhon.doe1";
    public static final String MESSAGE = "hello world from whatsapp";

    public static void main(String[] args) {

        Message msg1 = new Message();
        msg1.setOring(ORIGIN);
        msg1.setFrom(FROM);
        msg1.setMsg(MESSAGE);
        msg1.setMessageType(MessageType.TEXT);

        Message msg2 = new Message();
        msg2.setOring(ORIGIN);
        msg2.setFrom(FROM);
        msg2.setMsg(MESSAGE);
        msg2.setMessageType(MessageType.VIDEO);

        Message msg3 = new Message();
        msg3.setOring(ORIGIN);
        msg3.setFrom(FROM);
        msg3.setMsg(MESSAGE);
        msg3.setMessageType(MessageType.MEME);

        Message msg4 = new Message();
        msg4.setOring(ORIGIN);
        msg4.setFrom(FROM);
        msg4.setMsg(MESSAGE);
        msg4.setMessageType(MessageType.VIDEO);

        Message msg5 = new Message();
        msg5.setOring(ORIGIN);
        msg5.setFrom(FROM);
        msg5.setMsg(MESSAGE);
        msg5.setMessageType(MessageType.GIF);

        Message msg6 = new Message();
        msg6.setOring(ORIGIN);
        msg6.setFrom(FROM);
        msg6.setMsg(MESSAGE);
        msg6.setMessageType(MessageType.LOCALIZACAO);

        MessageTextHandler messageTextHandler = new MessageTextHandler();
        MessageMemeHandler messageMemeHandler = new MessageMemeHandler(messageTextHandler);
        MessageVideoHandler messageVideoHandler = new MessageVideoHandler(messageMemeHandler);
        MessageGIFHandler messageGIFHandler = new MessageGIFHandler(messageVideoHandler);
        MessageLocalizacaoHandler messageLocalizacaoHandler = new MessageLocalizacaoHandler(messageGIFHandler);
        BroadcastMessage broadcastMessage = new BroadcastMessage(messageLocalizacaoHandler);

        broadcastMessage.addMessage(msg1);
        broadcastMessage.addMessage(msg2);
        broadcastMessage.addMessage(msg3);
        broadcastMessage.addMessage(msg4);
        broadcastMessage.addMessage(msg5);
        broadcastMessage.addMessage(msg6);

        try {
            broadcastMessage.sendAllMessages();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}