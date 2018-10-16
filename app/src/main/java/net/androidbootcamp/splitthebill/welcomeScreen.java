package net.androidbootcamp.splitthebill;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        //Initiate instance of an object
        Button moveToSplit = findViewById(R.id.btnBill);


        //Make actions when the user click the button
        moveToSplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Move to the Split Bill activity from the Welcome Screen
                startActivity(new Intent(welcomeScreen.this,splitBill.class));
            }
        });
    }
}
