package org.solarex.ndp0;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtn0,mBtn1,mBtn2,mBtn3,mBtn4,mBtn5;
    private Resources mRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_btn_0:
                showToast(mBtn0.getText().toString());
                break;
            case R.id.main_btn_1:
                showToast(mBtn1.getText().toString());
                break;
            case R.id.main_btn_2:
                showToast(mBtn2.getText().toString());
                break;
            case R.id.main_btn_3:
                showToast(mBtn3.getText().toString());
                break;
            case R.id.main_btn_4:
                showToast(mBtn4.getText().toString());
                break;
            case R.id.main_btn_5:
                showToast(mBtn5.getText().toString());
                break;
            default:
                break;
        }
    }

    private void initView(){
        mBtn0 = (Button)findViewById(R.id.main_btn_0);
        mBtn1 = (Button)findViewById(R.id.main_btn_1);
        mBtn2 = (Button)findViewById(R.id.main_btn_2);
        mBtn3 = (Button)findViewById(R.id.main_btn_3);
        mBtn4 = (Button)findViewById(R.id.main_btn_4);
        mBtn5 = (Button)findViewById(R.id.main_btn_5);
        mBtn0.setOnClickListener(this);
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
    }

    private void showToast(String str){
        if (mRes == null){
            mRes = getResources();
        }
        if (!TextUtils.isEmpty(str)){
            Toast.makeText(this, String.format(mRes.getString(R.string.main_btn_click), str), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
