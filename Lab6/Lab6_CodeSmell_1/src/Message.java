class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void display() {
        System.out.println("From: " + sender);
        System.out.println("To: " + recipient);
        System.out.println("Message: " + content);
    }

    @Override
    public String toString() {
        return "From: " + sender + " -> To: " + recipient + "\nMessage: " + content;
    }
}