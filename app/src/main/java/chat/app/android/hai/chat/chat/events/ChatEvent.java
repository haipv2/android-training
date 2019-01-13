package chat.app.android.hai.chat.chat.events;


import chat.app.android.hai.chat.chat.entities.ChatMessage;

public class ChatEvent {
    ChatMessage msg;

    public ChatEvent(ChatMessage msg) {
        this.msg = msg;
    }

    public ChatMessage getMessage() {
        return msg;
    }
}
