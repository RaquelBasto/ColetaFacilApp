package br.com.coletafacilapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.coletafacilapp.R;

public class CalendarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        // aqui vai codigo

        int num = 1, num2 = 2;


        System.out.println(cadastrarUsuario(num, num2));


        return view;
    }

    public int cadastrarUsuario(int valor1 , int valor2){


        return valor1 + valor2;

    }
}