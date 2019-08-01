package com.example.a14fragments_i;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RojoFragment rojoFragment;
    VerdeFragment verdeFragment;
    AzulFragment azulFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rojoFragment = new RojoFragment();
        verdeFragment = new VerdeFragment();
        azulFragment = new AzulFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContenedor, rojoFragment).commit();

    }

    public void onClick(View vista) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (vista.getId()) {
            case R.id.btnRojo:
                fragmentTransaction.replace(R.id.fragmentContenedor, rojoFragment);
                break;

            case R.id.btnVerde:
                fragmentTransaction.replace(R.id.fragmentContenedor, verdeFragment);
                break;

            case R.id.btnAzul:
                fragmentTransaction.replace(R.id.fragmentContenedor, azulFragment);
                break;
        }

        fragmentTransaction.commit();

    }
}
