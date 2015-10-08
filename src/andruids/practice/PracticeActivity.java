package andruids.practice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PracticeActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button compose=(Button)findViewById(R.id.button1);
        compose.setOnClickListener(this);
        Button saved=(Button)findViewById(R.id.button2);
        saved.setOnClickListener(this);
        Button about=(Button)findViewById(R.id.button3);
        about.setOnClickListener(this);
     }

	public void onClick(View view) {
		switch(view.getId()){
		case R.id.button1:Intent i = new Intent(this, ActivityTwo.class);
							this.startActivity(i);
							break;
		case R.id.button2:Toast.makeText(this,"Opens the saved compositions", Toast.LENGTH_SHORT).show();
							break;
		case R.id.button3:Toast.makeText(this,"Your own orchestra in your pocket", Toast.LENGTH_SHORT).show();
							break;
		}
	}

    
    
}


