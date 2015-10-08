package andruids.practice;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class ActivityThree extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record);
        Button record=(Button)findViewById(R.id.button1);
        record.setOnClickListener(this);
        Button stop=(Button)findViewById(R.id.button2);
        stop.setOnClickListener(this);
     }

	public void onClick(View view) {
		switch(view.getId()){
		case R.id.button2:Intent i = new Intent(this, ActivityFour.class);
							this.startActivity(i);
							break;
		case R.id.button1:Toast.makeText(this,"Record/Pause", Toast.LENGTH_SHORT).show();
							break;
		}
    
	}
 }