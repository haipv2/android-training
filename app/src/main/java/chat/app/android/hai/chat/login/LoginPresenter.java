package chat.app.android.hai.chat.login;


import chat.app.android.hai.chat.login.events.LoginEvent;

public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void onEventMainThread(LoginEvent event);
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
