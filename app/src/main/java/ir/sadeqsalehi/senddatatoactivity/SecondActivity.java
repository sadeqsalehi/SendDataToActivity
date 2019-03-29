package ir.sadeqsalehi.senddatatoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtUserName = findViewById(R.id.tvUserName);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String userName;
            if (extras.containsKey("username")) {
                userName = String.format("Welcome : %s", getIntent().getExtras().get("username"));
                txtUserName.setText(userName);
            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem confirm = menu.add("Confirm");
        confirm.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        confirm.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent();
                intent.putExtra("message","Confirm Successfully");
                setResult(RESULT_OK, intent);
                finish();
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
