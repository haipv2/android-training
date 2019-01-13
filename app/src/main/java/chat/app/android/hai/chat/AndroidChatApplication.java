package chat.app.android.hai.chat;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

import chat.app.android.hai.chat.lib.GlideImageLoader;
import chat.app.android.hai.chat.lib.ImageLoader;


public class AndroidChatApplication extends Application {
    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
        setupImageLoader();
    }

    private void setupImageLoader() {
        imageLoader = new GlideImageLoader(this);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

    private void setupFirebase(){
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
