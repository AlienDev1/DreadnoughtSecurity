package com.example.cybercomp;

// This class is the backend to the login_activity.xml file

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity{

    // Google sign in api will be attached here
    // FireBase real-time DB will be the first be initialized at this point
    // Button and EditText variable initialization
    private EditText user_email;
    private EditText user_password;
    private Button login_button;
    private Button registration_button;
    private Button google_login;

    //Class Function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login_button = findViewById(R.id.btnLogin);
        registration_button = findViewById(R.id.btnRegister);
        google_login = findViewById(R.id.google_login);

        // note to indicate that the connection was successful
        Toast.makeText(Login.this, "FireBase Connection Success", Toast.LENGTH_LONG).show();

        // Function of the button login_button
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What actually happens when this button is clicked
                homeScreenButton();
            }
        });

        // Function of the google_login button
        google_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                googleAPIButton();
            }
        });

        //Registration Button
        registration_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrationButton();
            }
        });
    }

//    public void userInput() {
//        user_email = findViewById(R.id.email);
//        user_password = findViewById(R.id.password);
//
//        String userName = user_email.getText().toString().trim();
//        String p = user_password.getText().toString().trim();
//
//
//        if(!TextUtils.isEmpty(userName)){  // Temporary more research is required!
//
//            Intent intent = new Intent(this, Registration.class);
//            startActivity(intent);
//
//
//        } else {
//
//            Toast.makeText(Login.this, "Incorrect User Name and Password!", Toast.LENGTH_LONG ).show();
//
//        }
//    }

    // Save Button
    private void registrationButton() {
        //Calls the Registration Screen
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }


    private void homeScreenButton() {
        // will lead to the application home_screen_activty.xml
        // uncomment code below when HomeScreen.java has been created in the project
//        Intent intent = new Intent(this, HomeScreen.class);
//        startActivity(intent);
    }

    // Google Login API Connection
    private void googleAPIButton() {
        // google login API connection sourcecode
    }

}
