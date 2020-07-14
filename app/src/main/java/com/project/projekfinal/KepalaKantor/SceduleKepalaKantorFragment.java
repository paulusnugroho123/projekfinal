package com.project.projekfinal.KepalaKantor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.projekfinal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SceduleKepalaKantorFragment extends Fragment {

    public SceduleKepalaKantorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scedule_kepala_kantor, container, false);
    }
}
