package shuliang.han.time_date_test;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;
import android.widget.Toast;

public class TimePickerActivity extends Activity {

	private TimePicker timePicker;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.time_picker);
		
		timePicker = (TimePicker) findViewById(R.id.time_picker);
		
		//打印当前时间
		getCurrentDateTime();
		
		timePicker.setOnTimeChangedListener(new OnTimeChangedListener() {
			@Override
			public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
				Toast.makeText(getApplicationContext(), "改变时间 : " + hourOfDay + "时" + minute + "分", Toast.LENGTH_LONG).show();
			}
		});
	}
	
	/*
	 * 获取当前的日期和时间, 并将日期时间Toast出来
	 */
	private void getCurrentDateTime() {
		//1. 获取当前日历
		Calendar calendar = Calendar.getInstance();
		//2. 获取时间日期方法 : calendar.get(Calendar.YEAR)
		Toast.makeText(getApplicationContext(), "当前时间 : " + 
			calendar.get(Calendar.YEAR) + "年" + 
			calendar.get(Calendar.MONTH) + "月" + 
			calendar.get(Calendar.DATE) + "日" + 
			calendar.get(Calendar.HOUR) + "时" + 
			calendar.get(Calendar.MINUTE) + "分" + 
			calendar.get(Calendar.SECOND) + "秒"
				, Toast.LENGTH_LONG).show();
	}
}
