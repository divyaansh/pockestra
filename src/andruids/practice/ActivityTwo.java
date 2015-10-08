package andruids.practice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityTwo extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        Button guitar=(Button)findViewById(R.id.button1);
        guitar.setOnClickListener(this);
        Button keyboard=(Button)findViewById(R.id.button2);
   		keyboard.setOnClickListener(this);
   		Button drums=(Button)findViewById(R.id.button3);
   		drums.setOnClickListener(this);
   }
    
    
    public void onClick(View view) {
		Intent i = new Intent(this, ActivityThree.class);
		this.startActivity(i);  
    }	
}