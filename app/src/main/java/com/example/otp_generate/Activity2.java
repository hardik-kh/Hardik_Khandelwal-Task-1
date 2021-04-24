package com.example.otp_generate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    String strotp;

    public void register(View view){
        EditText v1 = findViewById(R.id.editTextNumber3);
        String val1 = (v1.getText().toString());
        EditText v2 = findViewById(R.id.editTextNumber4);
        String val2 = (v2.getText().toString());
        EditText v3 = findViewById(R.id.editTextNumber5);
        String val3 = (v3.getText().toString());
        EditText v4 = findViewById(R.id.editTextNumber6);
        String val4 = (v4.getText().toString());

        String fin = val1+val2+val3+val4;
        int c1 = Integer.parseInt(fin);
        int c2 = Integer.parseInt(strotp);

        if(c1 == c2){
            //Toast.makeText(this, "OTP is Valid", Toast.LENGTH_SHORT).show();
            /*LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.test,null);
            PopupWindow popupWindow = new PopupWindow(container, 1000, 1500, true);
            TextView poptext = popupWindow.getContentView().findViewById(R.id.textView5);
            String scoretext;
            poptext.setText("OTP Verified");
            View constraintLayout = null;
            popupWindow.showAtLocation(null, Gravity.NO_GRAVITY,0,0);*/
            TextView title = findViewById(R.id.textView7);
            title.setVisibility(View.INVISIBLE);
            TextView des = findViewById(R.id.textView9);
            des.setVisibility(View.INVISIBLE);
            EditText o1= findViewById(R.id.editTextNumber3);
            o1.setVisibility(View.INVISIBLE);
            EditText o2= findViewById(R.id.editTextNumber4);
            o2.setVisibility(View.INVISIBLE);
            EditText o3= findViewById(R.id.editTextNumber5);
            o3.setVisibility(View.INVISIBLE);
            EditText o4= findViewById(R.id.editTextNumber6);
            o4.setVisibility(View.INVISIBLE);
            Button reg = findViewById(R.id.button3);
            reg.setVisibility(View.INVISIBLE);
            TextView msg = findViewById(R.id.textView8);
            msg.setText("OTP Verified");




        }
        else {
            Toast.makeText(this, "OTP is not Valid ", Toast.LENGTH_SHORT).show();
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        strotp = getIntent().getStringExtra("strotp");



    }
}