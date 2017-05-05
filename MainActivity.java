package test.bwie.com.view_zhongbiao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    private ClockView view_wath;
    private Button shijian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view_wath = (ClockView) findViewById(R.id.view_wath);
        shijian = (Button) findViewById(R.id.shijian);
        shijian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Secondmain.class);
                intent.putExtra("user","星期五");
                startActivity(intent);
            }
        });
    }
}
