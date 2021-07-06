package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

public class LoginActivity(var TxEmail: Any) : AppCompatActivity() {

    EditText TxEmail, TxPassword;
    Button BtnLogin;
    DBHelper dbHelper;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);

        TxEmail = (EditText)findViewById(R.id.txEmail);
        TxPassword = (EditText)findViewById(R.id.txpassword);
        BtnLogin =

    }
}