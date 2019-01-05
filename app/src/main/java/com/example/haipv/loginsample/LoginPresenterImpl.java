package com.example.haipv.loginsample;

import android.text.TextUtils;

/**
 * middle layer looks like connector between business layer and implementation layer.
 */
public class LoginPresenterImpl implements LoginPresenter, LoginModel.OnLoginFinishedListener {

    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModelImpl();
    }

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

    @Override
    public void validateCredentials(String username, String password) {
// Check for a valid password, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            loginView.setPasswordError(R.string.error_field_required);
            return;
        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(username)) {
            loginView.setUsernameError(R.string.error_field_required);
            return;
        } else if (!isEmailValid(username)) {
            loginView.setUsernameError(R.string.error_invalid_email);
            return;
        }

        loginView.showProgress(true);
        loginModel.login(username,password,this);
    }

    @Override
    public void onCanceled() {
        loginView.showProgress(false);

    }

    @Override
    public void onPasswordError() {
        loginView.showProgress(false);
        loginView.setPasswordError(R.string.error_incorrect_password);

    }

    @Override
    public void onSuccess() {
        loginView.showProgress(false);
        loginView.successAction();
    }
}
