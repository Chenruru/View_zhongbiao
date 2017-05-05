package test.bwie.com.view_zhongbiao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class Secondmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondmain);

        TextView text = (TextView) findViewById(R.id.text);
        Intent intent = getIntent();
        Serializable user = intent.getSerializableExtra("user");
        text.setText(user.toString());

    }
}
