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
        
        MessageTextHandler messageTextHandler = new MessageTextHandler();
        BroadcastMessage broadcastMessage = new BroadcastMessage(messageTextHandler);

        broadcastMessage.addMessage(msg1);
        broadcastMessage.addMessage(msg2);

        try {
            broadcastMessage.sendAllMessages();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}