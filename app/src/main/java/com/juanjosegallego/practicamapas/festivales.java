package com.juanjosegallego.practicamapas;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class festivales extends Fragment {

    Button boton;


    public festivales() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_festivales, container, false);
        boton= (Button) root.findViewById(R.id.boton4);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mapa4 = new Intent(getActivity(),festivalesmaps.class);
                startActivity(mapa4);

            }
        });

        return root;
    }



}

