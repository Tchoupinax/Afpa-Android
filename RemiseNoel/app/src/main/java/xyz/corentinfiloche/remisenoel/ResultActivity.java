package xyz.corentinfiloche.remisenoel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by corentin on 12/7/17.
 */

public class ResultActivity extends AppCompatActivity {
    /**
     * Variables
     */
    private Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        myIntent = getIntent();
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView TVdisplayPrice = (TextView) findViewById(R.id.textView);
        Integer i = this.myIntent.getIntExtra("value", 0);
        TVdisplayPrice.setText(i.toString());
    }
}
