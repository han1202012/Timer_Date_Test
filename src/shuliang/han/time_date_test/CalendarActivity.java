package shuliang.han.time_date_test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class CalendarActivity extends Activity {

	private CalendarView calendarView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calendar);
		
		calendarView = (CalendarView) findViewById(R.id.calendarView);
		//设置日期改变监听器, 日期改变的时候激活该监听器
		calendarView.setOnDateChangeListener(new OnDateChangeListener() {
			@Override
			public void onSelectedDayChange(CalendarView view, int year, int month,
					int dayOfMonth) {
				Toast.makeText(getApplicationContext(), "选择的日期是 : " + year +" 年"
						+ month + " 月 " + dayOfMonth + "日", Toast.LENGTH_LONG).show();
			}
		});
	}
}
