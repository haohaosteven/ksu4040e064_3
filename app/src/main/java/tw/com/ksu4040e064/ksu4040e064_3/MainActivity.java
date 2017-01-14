package tw.com.ksu4040e064.ksu4040e064_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSubmit(View view){
        Intent intent = new Intent(this,ReasultActivity.class);
        startActivity(intent);
    }

    public void onClickHelp(View view){
        Intent intent = new Intent(this,HelpActivity.class);
        startActivity(intent);
    }
}
