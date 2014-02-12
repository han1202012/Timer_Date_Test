package shuliang.han.time_date_test;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;
import android.widget.Chronometer.OnChronometerTickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ChronometerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chronometer);
		
		final Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
		ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
		
		toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(isChecked){//从  显示 停止计时 点击, checked false -> true 停止计时, 显示 开始计时
					chronometer.stop();
				}else{// 显示开始计时 点击, checked true -> false 开始计时, 显示 停止计时
					chronometer.start();
					chronometer.setBase(SystemClock.elapsedRealtime());
				}
			}
		});
		
		//设置一个监听器, 当超过5秒计时的时候Toast信息
		chronometer.setOnChronometerTickListener(new OnChronometerTickListener() {
			@Override
			public void onChronometerTick(Chronometer chronometer) {
				if(SystemClock.elapsedRealtime() - chronometer.getBase() > 5 * 1000)
					Toast.makeText(getApplicationContext(), "5秒了", Toast.LENGTH_LONG).show();
			}
		});
	}
	
}
