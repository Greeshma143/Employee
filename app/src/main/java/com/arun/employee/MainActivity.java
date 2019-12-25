package com.arun.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button bt1;
    String getName,getDes,getSalary,getPlace,getCmyName,getEmail,getMob;
    EmpModel empModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.edt1);
        e2=(EditText)findViewById(R.id.edt2);
        e3=(EditText)findViewById(R.id.edt3);
        e4=(EditText)findViewById(R.id.edt4);
        e5=(EditText)findViewById(R.id.edt5);
        e6=(EditText)findViewById(R.id.edt6);
        e7=(EditText)findViewById(R.id.edt7);
        bt1=(Button)findViewById(R.id.bt);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getName=e1.getText().toString();
                getDes=e2.getText().toString();
                getSalary=e3.getText().toString();
                getPlace=e4.getText().toString();
                getCmyName=e5.getText().toString();
                getEmail=e6.getText().toString();
                getMob=e7.getText().toString();

                empModel.setEmpName(getName);
                empModel.setDesig(getDes);
                empModel.setSalary(getSalary);
                empModel.setPlace(getPlace);
                empModel.setCompName(getCmyName);
                empModel.setEmail(getEmail);
                empModel.setMob(getMob);

                String nameValue=empModel.getEmpName();
                String desValue=empModel.getDesig();
                String salValue=empModel.getSalary();
                String placeValue=empModel.getPlace();
                String compNameValue=empModel.getCompName();
                String emailValue=empModel.getEmail();
                String mobValue=empModel.getMob();

                Toast.makeText(getApplicationContext(),nameValue+" "+desValue+" "+salValue+" "+placeValue+" "+compNameValue+" "+emailValue+" "+mobValue,Toast.LENGTH_LONG).show();



            }
        });

    }
}
