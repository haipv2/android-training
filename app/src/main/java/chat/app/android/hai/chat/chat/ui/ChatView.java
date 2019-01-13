package chat.app.android.hai.chat.chat.ui;


import chat.app.android.hai.chat.chat.entities.ChatMessage;

public interface ChatView {
    void sendMessage();
    void onMessageReceived(ChatMessage msg);
}
