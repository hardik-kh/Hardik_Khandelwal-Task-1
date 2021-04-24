package com.example.otp_generate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.telephony.SmsManager;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String strotp;
    public void tap(View view){

        EditText phone = findViewById(R.id.editTextNumber);
        String val = (phone.getText().toString());
        if (isValidMobile(val)){

            int otp = (int) (Math.random() * 10000);
            if(otp < 1000){
                otp = otp +1000;
            }
            strotp = String.valueOf(otp);
            //Getting intent and PendingIntent instance

            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);

//Get the SmsManager instance and call the sendTextMessage method to send message
            SmsManager sms=SmsManager.getDefault();
            sms.sendTextMessage(val, null, "Your OTP is "+strotp, pi,null);
            Toast.makeText(this, "SMS SEND TO YOUR PHONE", Toast.LENGTH_SHORT).show();

            openActivity2();




        }
        else{
            Toast.makeText(this, "Incorrect" , Toast.LENGTH_SHORT).show();
        }

    }








    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("strotp",strotp);
        //intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP );
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK );
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);

    }




    public boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}