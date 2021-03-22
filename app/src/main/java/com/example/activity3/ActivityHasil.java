package com.example.activity3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHasil extends AppCompatActivity {
    //Mendeklaraasikan variabel dengan tipe data Textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //menghubungkan variabel txEmail dan txPassword dengan componen textview pada layout
        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);


        //Mendeklarasikan variabel bundle yang akan digunakan untuk mengambil pesan yang dikirimkan melalui method intent
        Bundle bundle= getIntent().getExtras();

        //Membuat variabel string yang digunakan untuk menyimpan data yang dikirimkan dari activity sebelumnya dengan kunci "a" dan "b"
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        //Menampilkan value dari variabel email kedalam txEmail dan txPassword
        txEmail.setText(email);
        txPassword.setText(pass);
    }
}
