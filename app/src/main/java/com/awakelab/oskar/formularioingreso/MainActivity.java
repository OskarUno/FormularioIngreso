package com.awakelab.oskar.formularioingreso;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.awakelab.oskar.formularioingreso.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners() {
        binding.buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.editTextName.getText().toString().trim();
                String lastName = binding.editTextLastName.getText().toString().trim();
                String email = binding.editTextEmail.getText().toString().trim();
                String pass = binding.editTextPassword.getText().toString().trim();

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