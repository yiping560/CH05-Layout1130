package tw.tcnr07.m0500g;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import tw.tcnr07.m0500g.R;


public class M0500 extends AppCompatActivity {

    private EditText e001;
    private Button b001;
    private TextView t003, t005, t007;
    private DecimalFormat pondsFormat;
    private String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent(); //自定義方法
    }

    private void setupViewcomponent() { //定義配置碼
        e001 = (EditText) findViewById(R.id.m0500_e001); //輸入公斤
        b001 = (Button) findViewById(R.id.m0500_b001);  //按鈕執行轉換
        t003 = (TextView) findViewById(R.id.m0500_t003);  //輸出答案
        t005 = (TextView) findViewById(R.id.m0500_t005);  //輸出答案
        t007 = (TextView) findViewById(R.id.m0500_t007);  //輸出答案
        b001.setOnClickListener(b001on);
    }

    private View.OnClickListener b001on;


    {
        b001on = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DecimalFormat   pondsFormat = new DecimalFormat("0.00000");  0.00000是數字和小數點的格式
                pondsFormat = new DecimalFormat("0.00000");
                if (e001.getText().toString().length() > 0) {
                    ans = pondsFormat.format(Float.parseFloat(e001.getText().toString()) * 0.00034);
                    t003.setText(ans);
                    ans = pondsFormat.format(Float.parseFloat(e001.getText().toString()) * 3.30579);
                    t005.setText(ans);
                    ans = pondsFormat.format(Float.parseFloat(e001.getText().toString()) * 0.03306);
                    t007.setText(ans);
                } else {
                    ans = "";
                }
            }
        };
    }
}