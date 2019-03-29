package ir.sadeqsalehi.senddatatoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUserName=findViewById(R.id.edUserName);
    }

    public void sendDataOnClick(View view) {
        Intent intent= new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra("username",txtUserName.getText().toString());
        startActivity(intent);
    }
}
