package shuliang.han.time_date_test;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_host);
		
		TabHost tabHost = getTabHost();
		
		TabSpec tabSpec1 = tabHost.newTabSpec("tag1");
		tabSpec1.setIndicator("时钟");
		Intent intent1 = new Intent(this, ClockActivity.class);
		tabSpec1.setContent(intent1);
		tabHost.addTab(tabSpec1);
		
		TabSpec tabSpec2 = tabHost.newTabSpec("tag2");
		tabSpec2.setIndicator("计时器");
		Intent intent2 = new Intent(this, ChronometerActivity.class);
		tabSpec2.setContent(intent2);
		tabHost.addTab(tabSpec2);
		
		TabSpec tabSpec3 = tabHost.newTabSpec("tag3");
		tabSpec3.setIndicator("日历");
		Intent intent3 = new Intent(this, CalendarActivity.class);
		tabSpec3.setContent(intent3);
		tabHost.addTab(tabSpec3);
		
		TabSpec tabSpec4 = tabHost.newTabSpec("tag4");
		tabSpec4.setIndicator("时间选择");
		Intent intent4 = new Intent(this, TimePickerActivity.class);
		tabSpec4.setContent(intent4);
		tabHost.addTab(tabSpec4);
		
		TabSpec tabSpec5 = tabHost.newTabSpec("tag5");
		tabSpec5.setIndicator("日期选择");
		Intent intent5 = new Intent(this, DatePickerActivity.class);
		tabSpec5.setContent(intent5);
		tabHost.addTab(tabSpec5);
	}

}
