package ir.sadeqsalehi.senddatatoactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtUserName=findViewById(R.id.tvUserName);
        Bundle extras = getIntent().getExtras();
        if (extras!=null){
            String userName;
            if (extras.containsKey("username")){
                userName= String.format("Welcome : %s", getIntent().getExtras().get("username"));
                txtUserName.setText(userName);
            }

        }
    }
}
