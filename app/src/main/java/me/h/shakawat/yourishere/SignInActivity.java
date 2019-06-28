package me.h.shakawat.yourishere;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {


    DataBaseHelper dataBaseHelper;
    private Button signInButton, signUpHereButton;
    private EditText usernameEditText;
    private EditText passwordEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);




        signInButton = (Button) findViewById(R.id.signInButtonId);
        signUpHereButton = (Button) findViewById(R.id.signUpHereButtonId);

        usernameEditText = (EditText) findViewById(R.id.userNameEditTextId);
        passwordEditText = (EditText) findViewById(R.id.passWordEditTextId);


        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase =  dataBaseHelper.getWritableDatabase();

        signInButton.setOnClickListener(this);
        signUpHereButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String usserName = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (view.getId()==R.id.signInButtonId){

            Boolean result = dataBaseHelper.findPassword(usserName,password);
            if (result==true){
                Intent intent = new Intent(SignInActivity.this,FirstActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "username and password did not match..", Toast.LENGTH_SHORT).show();
            }

            usernameEditText.setText("");
            passwordEditText.setText("");


        }else if (view.getId()==R.id.signUpHereButtonId){

            Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
            startActivity(intent);

        }


    }
}
