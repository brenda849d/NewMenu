package com.example.newmenu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class iniciar_sesion extends Fragment {
    View vista;
    Button btnEnviar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista= inflater.inflate(R.layout.fragment_iniciar_sesion, container, false);
       btnEnviar= (Button) vista.findViewById(R.id.btnEnviar);
       btnEnviar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

       }
       });
        return vista;

    }

}
