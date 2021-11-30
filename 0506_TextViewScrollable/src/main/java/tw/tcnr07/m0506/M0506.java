package tw.tcnr07.m0506;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class M0506 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0506);
        setupViewComponent();
    }

    private void setupViewComponent() {
        TextView msg = (TextView) findViewById(R.id.m0506_msg);
        msg.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}