package andruids.practice;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ActivityFive extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	EditText message;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saveas);
        Button save=(Button)findViewById(R.id.button1);
        save.setOnClickListener(this);
        message=(EditText)findViewById(R.id.editText1);
     }

	public void onClick(View view) {
		switch(view.getId()){
		case R.id.button1:
		  if(message.getText().toString().length()!=0)
		  {
			  Toast.makeText(this,"Saved as "+message.getText().toString(), Toast.LENGTH_SHORT).show();
			  Intent i = new Intent(this, PracticeActivity.class);
				this.startActivity(i);
		  }
		  else
		  {
			  Toast.makeText(this,"Message is empty", Toast.LENGTH_SHORT).show(); 
		  }
		  break;
		}
	}
    
    
    }