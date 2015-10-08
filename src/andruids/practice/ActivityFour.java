package andruids.practice;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class ActivityFour extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operate);
        Button play=(Button)findViewById(R.id.button1);
        play.setOnClickListener(this);
        Button save=(Button)findViewById(R.id.button2);
        save.setOnClickListener(this);
        Button add=(Button)findViewById(R.id.button3);
        add.setOnClickListener(this);
        
     }

	public void onClick(View view) {
		switch(view.getId()){
		case R.id.button3:Intent i = new Intent(this, ActivityTwo.class);
							this.startActivity(i);
							break;
		case R.id.button2:Intent i2 = new Intent(this, ActivityFive.class);
							this.startActivity(i2);
							break;
		case R.id.button1:Toast.makeText(this,"Plays the present layer", Toast.LENGTH_SHORT).show();
							break;
		}
	}
    
    
    }