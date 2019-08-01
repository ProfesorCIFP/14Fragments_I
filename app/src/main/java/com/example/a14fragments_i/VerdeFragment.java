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
public class VerdeFragment extends Fragment {

    Button btnVerde;
    View vista;

    public VerdeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_verde, container, false);

        btnVerde = vista.findViewById(R.id.btnVerde);

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has presionado el VERDE", Toast.LENGTH_SHORT).show();
            }
        });

        return vista;
    }

}
