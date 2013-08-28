package tcd.com.t;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class LoginMainActivity extends Activity implements OnItemSelectedListener{
	// private RadioGroup rGrp= (RadioGroup) findViewById(R.id.radioGroup1);
 	//public RadioButton rBtnSelectSuperAdmin=(RadioButton) findViewById(R.id.radioLSuperAdmin);
 	//public RadioButton rBtnAdmin=(RadioButton) findViewById(R.id.radioLAdmin);
 	//public RadioButton rBtnTeacher=(RadioButton) findViewById(R.id.radioLTeacher);
   	//public RadioButton rBtnParent=(RadioButton) findViewById(R.id.radioLParent);
    Intent intent1;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_main);
       
			Button buttonLogin= (Button) findViewById(R.id.buttonAESubmit);
			buttonLogin.setOnClickListener(new OnClickListener() {
			
				@Override
				public void onClick(View v) {
					//intent1=new Intent(LoginMainActivity.this,AfterAdminMainActivity.class );
					startActivity(intent1);
			}
			});
			
			// Spinner element
	        Spinner spinner = (Spinner) findViewById(R.id.spinner);
	 
	        // Spinner click listener
	        spinner.setOnItemSelectedListener(this);
	 
	        // Spinner Drop down elements
	        List <String>categories = new ArrayList<String>();
	        categories.add("Super Admn");
	        categories.add("Admn");
	        categories.add("Teacher");
	        categories.add("Parent");
	        //categories.add("Student");
	 
	        // Creating adapter for spinner
	        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
	 
	        // Drop down layout style - list view with radio button
	        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	 
	        // attaching data adapter to spinner
	        spinner.setAdapter(dataAdapter);
        
    }

	@Override
	public void onItemSelected(AdapterView<?>parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		// On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
 
        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        
        if(item.equals("Super Admn"))
        {
        	intent1=new Intent(LoginMainActivity.this,AfterAdminMainActivity.class );
        }
        else if(item.equals("Admn")){
        	intent1=new Intent(LoginMainActivity.this,AfterAdminMainActivity.class );
        }
        else if(item.equals("Teacher")){
        	intent1=new Intent(LoginMainActivity.this,AfterTeacherLoginActivity.class );
        }
        else if(item.equals("Parent")){
        	intent1=new Intent(LoginMainActivity.this,AfterPArentLoginMainActivity.class );
        }
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}


    
}
