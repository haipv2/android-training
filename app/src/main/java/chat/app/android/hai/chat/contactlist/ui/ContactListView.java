package chat.app.android.hai.chat.contactlist.ui;


import chat.app.android.hai.chat.contactlist.entities.User;

public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
