package ca.hobin.crashy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.common.collect.ImmutableCollection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This will make the application crash
        ImmutableCollection.class.getDeclaredMethods();
    }

}