package sg.edu.rp.c346.id22022505.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double calcPay(double price, double discount){
        double pay = price * (1-discount/100);
        return pay;
    }

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        cbEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = cbEnabled.isChecked();

            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_SHORT).show();
                if (cbEnabled.isChecked() == true) {
                    String stringResponse = "The discount is given";
                    tvShow.setText(stringResponse);
                } else {
                    String stringResponse = "The discount is not given";
                    tvShow.setText(stringResponse);
                }
            }
        });

    }
}