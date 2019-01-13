package chat.app.android.hai.chat.addcontact;


import chat.app.android.hai.chat.addcontact.events.AddContactEvent;

public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}

