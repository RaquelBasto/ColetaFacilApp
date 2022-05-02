package br.com.coletafacilapp;

import static android.widget.AdapterView.*;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import android.os.Bundle;

public class FormCadastro extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_form_cadastro);
        String[] type = new String[]{"teste1","teste2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.drop_down_item,
                type
        );


        //Spinner spinner = (Spinner) findViewById(R.id.spinner_languages);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.spinner);
        autoCompleteTextView.setAdapter(adapter);


        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(FormCadastro.this, autoCompleteTextView.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });
        // Create an ArrayAdapter using the string array and a default spinner layout


        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
          //      R.array.planets_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        //spinner.setAdapter(adapter);


    }


    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {

        Spinner spinner = (Spinner) findViewById(R.id.spinner_languages);
        //spinner.setOnClickListener();
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}