package tw.tcnr07.m0503;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class M0503 extends AppCompatActivity {

    private CheckBox chb001,chb002,chb003,chb004;
    private TextView t01;
    private Button b001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0503);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        chb001=(CheckBox)findViewById(R.id.m0503_chb01);
        chb002=(CheckBox)findViewById(R.id.m0503_chb02);
        chb003=(CheckBox)findViewById(R.id.m0503_chb03);
        chb004=(CheckBox)findViewById(R.id.m0503_chb04);
        b001=(Button)findViewById(R.id.m0503_b01);
        t01=(TextView)findViewById(R.id.m0503_t001);
        //設定按鈕
        b001.setOnClickListener(b001on);
    }

    private View.OnClickListener b001on= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String ans01=getString(R.string.t001);
            if(chb001.isChecked()) ans01+=chb001.getText().toString()+" ";
            if(chb002.isChecked()) ans01+=chb002.getText().toString()+" ";
            if(chb003.isChecked()) ans01+=chb003.getText().toString()+" ";
            if(chb004.isChecked()) ans01+=chb004.getText().toString()+" ";
            t01.setText(ans01);
        }
    };
}