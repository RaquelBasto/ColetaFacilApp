package br.com.coletafacilapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.coletafacilapp.R;
import br.com.coletafacilapp.mainresources.ColetoresActivity;


public class EstudoFragment extends Fragment {

    CardView card;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_estudo, container, false);

        // Iniciando componente

        card = view.findViewById(R.id.cardColetor);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ColetoresActivity.class));
            }
        });


        return view;


    }
    public void iniciarComponentes(){

    }
}