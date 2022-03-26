package com.prt.fragmentreza.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.View;

import com.prt.fragmentreza.R;
import com.prt.fragmentreza.ui.second.SecondFragment;

public class MainFragment extends Fragment {

    public MainFragment() {
        super(R.layout.main_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.main_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().setReorderingAllowed(true)
                        .replace(R.id.container, SecondFragment.class, null).commit();
            }
        });
    }
}