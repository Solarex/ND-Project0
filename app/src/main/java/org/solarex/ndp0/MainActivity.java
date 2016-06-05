package org.solarex.ndp0;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtn0, mBtn1, mBtn2, mBtn3, mBtn4, mBtn5;
    private Resources mRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtn0 = (Button) findViewById(R.id.main_btn_0);
        mBtn1 = (Button) findViewById(R.id.main_btn_1);
        mBtn2 = (Button) findViewById(R.id.main_btn_2);
        mBtn3 = (Button) findViewById(R.id.main_btn_3);
        mBtn4 = (Button) findViewById(R.id.main_btn_4);
        mBtn5 = (Button) findViewById(R.id.main_btn_5);
    }

    private void showToast(String str) {
        if (mRes == null) {
            mRes = getResources();
        }
        if (!TextUtils.isEmpty(str)) {
            Toast.makeText(this, String.format(mRes.getString(R.string.main_btn_click), str),
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void buttonClick(View view) {
        String str = ((Button) view).getText().toString();
        showToast(str);
    }
}
