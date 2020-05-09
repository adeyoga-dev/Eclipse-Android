package com.warungmakanbakso;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnCheckedChangeListener {
	
	CheckBox c1,c2,c3;
	EditText qty1,qty2,qty3;
	TextView t1;
	Button pesan;
	int h1,h2,h3,total;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox)findViewById(R.id.checkBox1);
        c2 = (CheckBox)findViewById(R.id.checkBox2);
        c3 = (CheckBox)findViewById(R.id.checkBox3);
        qty1 = (EditText)findViewById(R.id.qty1);
        qty2 = (EditText)findViewById(R.id.qty2);
        qty3 = (EditText)findViewById(R.id.qty3);
        t1 = (TextView)findViewById(R.id.hasil);
        pesan = (Button)findViewById(R.id.pesan);
        
        pesan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				int num1 = Integer.parseInt(qty1.getText().toString());
				int num2 = Integer.parseInt(qty2.getText().toString());
				int num3 = Integer.parseInt(qty3.getText().toString());
				
				if(num1==0){
					num1=1;
				}
				if(num2==0){
					num2=1;
				}
				if(num3==0){
					num3=1;
				}
				
				total=(h1*num1)+(h2*num2)+(h3*num3);
				t1.setText("anda harus membayar"+total);
				
				
			}
		});
        
        c1.setOnCheckedChangeListener(this);
        c2.setOnCheckedChangeListener(this);
        c3.setOnCheckedChangeListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
		if(c1.isChecked()){
			h1 = 15000;
		}else{
			h1 = 0;
		}
		if(c2.isChecked()){
			h2 = 12000;
		}
		else{
			h2 = 0;
		}
		if(c3.isChecked()){
			h3 = 20000;
		}else{
			h3 = 0;
		}
		
		
	}
}
