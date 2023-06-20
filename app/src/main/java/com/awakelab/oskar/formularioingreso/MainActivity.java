package com.awakelab.oskar.formularioingreso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonCreate = findViewById(R.id.buttonCreate);

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String lastName = editTextLastName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String pass = editTextPassword.getText().toString().trim();

                if(name.isEmpty() || lastName.isEmpty() || email.isEmpty() || pass.isEmpty() || !email.contains("@")){
                    Toast.makeText(getBaseContext(), "Faltan campos por agregar", Toast.LENGTH_SHORT).show();
                    return;
                }

                String formulario = "Usuario: " + name + ", LastName: " + lastName + ", Email: " + email + ", Contraseña: " + pass;

                Toast.makeText(getBaseContext(),formulario, Toast.LENGTH_LONG).show();


            }
        });

    }
}