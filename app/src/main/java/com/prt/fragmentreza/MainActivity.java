package com.prt.fragmentreza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prt.fragmentreza.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.container, MainFragment.class, null)
                    .commitNow();
        }
    }
}