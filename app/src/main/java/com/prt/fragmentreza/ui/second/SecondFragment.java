package com.prt.fragmentreza.ui.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.prt.fragmentreza.R;
import com.prt.fragmentreza.ui.main.MainFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    public SecondFragment() {
        super(R.layout.second_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.second_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().setReorderingAllowed(true)
                        .replace(R.id.container, MainFragment.class, null).commit();
            }
        });
    }
}
