package example.com.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.board).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("url","url write");
                startActivity(intent);
            }
        });

        findViewById(R.id.signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("url","url write");
                startActivity(intent);
            }
        });

        findViewById(R.id.some).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText dd = (EditText) findViewById(R.id.stringUrl);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("url",dd.getText().toString());
                startActivity(intent);

            }
        });


    }
}
