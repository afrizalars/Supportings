package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class signup_manual extends AppCompatActivity {
    //Variable
    EditText edittext_name;
    Button btn_submit;
    RadioGroup rgMaleFemale;
    RadioButton rbMale,rbFemale;
    Spinner sGender;
    String t1="";
    public int pos;
    Animation left2right,right2left;
    LinearLayout linear1,linear2;

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        signup_manual.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_manual);

        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);

        //Motion ID
        left2right = AnimationUtils.loadAnimation(this,R.anim.left2right);
        right2left = AnimationUtils.loadAnimation(this,R.anim.right2left);

        //Motion Action
        linear1.setAnimation(left2right);
        linear2.setAnimation(right2left);
        //Immersive Full Screen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        edittext_name = findViewById(R.id.edittext_name);
        sGender = findViewById(R.id.spinner1);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        pos =sGender.getSelectedItemPosition();

        sGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        //Action when button is clicked
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edittext_name.getText().toString().trim().length() <= 0) {
                edittext_name.setError("Kolom nama tidak boleh kosong.");
                }

                else if(edittext_name.length() > 30){
                edittext_name.setError("Nama terlalu panjang.");
                }

                else {
                    edittext_name.setError(null);
                    Intent i = new Intent(signup_manual.this, Home.class);
                    Intent iUserName = new Intent(signup_manual.this, Home.class);
                    Intent intent = new Intent(signup_manual.this,HalamanEmpat2.class);
                    //intent.putExtra("kelamin", Hasil.toString());
                    iUserName.putExtra("username", edittext_name.getText().toString());
                    intent.putExtra("gender",t1);
                    i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(iUserName);
                    iUserName.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

                }

            }
        });


    }
}
