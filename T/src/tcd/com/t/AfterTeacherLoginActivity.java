package tcd.com.t;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AfterTeacherLoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_after_teacher_login);
		Button btnAddSubject = (Button) findViewById(R.id.buttonASAddSubject);
		Button btnTimetable = (Button) findViewById(R.id.buttonTTimetable);
		Button btnAttendence = (Button) findViewById(R.id.buttonTAddendence);
		Button btnAssignment = (Button) findViewById(R.id.buttonTAssignment);
		Button btnAlarm = (Button) findViewById(R.id.buttonTAlarm);
		btnAddSubject.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			Intent intent1=new Intent(AfterTeacherLoginActivity.this, AllocateSubjectActivity.class);
			startActivity(intent1);
			}
		});
		btnAttendence.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
			//	Intent intent2= new Intent(AfterTeacherLoginActivity.this, );
			//	startActivity(intent2);
			}
		});
		btnAssignment.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
		btnAlarm.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.after_teacher_login, menu);
		return true;
	}

}
