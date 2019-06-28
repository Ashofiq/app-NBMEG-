package me.h.shakawat.yourishere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private Button signUpButton;
    private EditText nameEditText, emailEdittext, userNameEditText, passwordEditText;
    DataBaseHelper dataBaseHelper;


    UserDetails userDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        signUpButton = (Button) findViewById(R.id.signUpPageSignUpButtonId);

        nameEditText = (EditText) findViewById(R.id.signUpPageNameEditTextId);
        emailEdittext = (EditText) findViewById(R.id.signUpPageEmailEditTextId);
        userNameEditText = (EditText) findViewById(R.id.signUpPageUserNameEditTextId);
        passwordEditText = (EditText) findViewById(R.id.signUpPagePasswordEditTextId);

        dataBaseHelper = new DataBaseHelper(this);


        userDetails = new UserDetails();

        signUpButton.setOnClickListener(this);

    }


    // login page intent

    public void login(View v){
        Intent i = new Intent(SignUpActivity.this, SignInActivity.class);
        startActivity(i);
    }


    @Override
    public void onClick(View view) {


        String name = nameEditText.getText().toString();
        String email = emailEdittext.getText().toString();
        String userName = userNameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        userDetails.setName(name);
        userDetails.setEmail(email);
        userDetails.setUsername(userName);
        userDetails.setPassword(password);

        nameEditText.setText("");
        emailEdittext.setText("");
        userNameEditText.setText("");
        passwordEditText.setText("");


        long rowId = dataBaseHelper.insertData(userDetails);


        if (rowId>0){
            Toast.makeText(this, "SignUp successfully, Now you can Sign In ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Row inserted failed.....", Toast.LENGTH_SHORT).show();
        }
    }




}

