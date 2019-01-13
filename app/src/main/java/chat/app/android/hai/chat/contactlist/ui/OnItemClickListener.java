package chat.app.android.hai.chat.contactlist.ui;


import chat.app.android.hai.chat.contactlist.entities.User;

public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
