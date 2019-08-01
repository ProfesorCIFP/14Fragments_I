package com.example.a14fragments_i;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RojoFragment extends Fragment {

    Button btnRojo;
    View vista;

    public RojoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vista = inflater.inflate(R.layout.fragment_rojo, container, false);

        btnRojo = vista.findViewById(R.id.btnRojo);

        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has presionado el ROJO", Toast.LENGTH_SHORT).show();
            }
        });

        return vista;
    }

}
