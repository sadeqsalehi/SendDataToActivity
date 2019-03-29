package ir.sadeqsalehi.senddatatoactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUserName;
    public static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUserName = findViewById(R.id.edUserName);
    }

    public void sendDataOnClick(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("username", txtUserName.getText().toString());
        //startActivity(intent);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            //Toast.makeText(this, "Confirmed", Toast.LENGTH_SHORT).show();
            if (data != null)
                Toast.makeText(this, data.getStringExtra("message"), Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "Not Confirmed!", Toast.LENGTH_SHORT).show();
    }
}
