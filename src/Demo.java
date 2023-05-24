public class Demo {
    public static void main(String[] args) {

        Message msg1 = new Message();
        msg1.setOring("whatsapp");
        msg1.setFrom("jhon.doe1");
        msg1.setMsg("hello world from whatsapp");
        msg1.setMessageType(MessageType.TEXT);

        Message msg2 = new Message();
        msg2.setOring("whatsapp");
        msg2.setFrom("jhon.doe1");
        msg2.setMsg("hello world from whatsapp");
        msg2.setMessageType(MessageType.VIDEO);

        Message msg3 = new Message();
        msg2.setOring("whatsapp");
        msg2.setFrom("jhon.doe1");
        msg2.setMsg("hello world from whatsapp");
        msg2.setMessageType(MessageType.MEME);

		Message msg4 = new Message();
        msg4.setOring("whatsapp");
        msg4.setFrom("jhon.doe1");
        msg4.setMsg("hello world from whatsapp");
        msg4.setMessageType(MessageType.VIDEO);

        Message msg5 = new Message();
        msg5.setOring("whatsapp");
        msg5.setFrom("jhon.doe1");
        msg5.setMsg("hello world from whatsapp");
        msg5.setMessageType(MessageType.LOCALIZACAO);
        
        MessageTextHandler messageTextHandler = new MessageTextHandler();
        MessageMemeHandler messageMemeHandler = new MessageMemeHandler(messageTextHandler);
        MessageVideoHandler messageVideoHandler = new MessageVideoHandler(messageMemeHandler);
        MessageLocalizacaoHandler messageLocalizacaoHandler = new MessageLocalizacaoHandler(messageVideoHandler);
        BroadcastMessage broadcastMessage = new BroadcastMessage(messageLocalizacaoHandler);

        broadcastMessage.addMessage(msg1);
        broadcastMessage.addMessage(msg2);
        broadcastMessage.addMessage(msg3);
        broadcastMessage.addMessage(msg4);
        broadcastMessage.addMessage(msg5);

        try {
            broadcastMessage.sendAllMessages();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}