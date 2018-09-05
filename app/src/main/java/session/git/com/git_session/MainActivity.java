package session.git.com.git_session;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "onCreate");
        Log.v(TAG, "Dev");
        Log.v(TAG, "Prod");
        Log.v(TAG, "Stash");
        Log.v(TAG, "Branch jira");
        Log.v(TAG, "Delete");

    }
}
