package com.shiv.bunktracker;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;

public class MainActivity extends Activity implements OnClickListener {

	public static final String filename = "MySharedString";
	String sub1, sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9;
	public int counter1, counter2, counter3, counter4, counter5,
			counter6, counter7, counter8, counter9;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
			b16, b17, b18, b19;
	EditText et1, et2, et3, et4, et5, et6, et7, et8, et9;
	TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;
	SharedPreferences someData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupVariables();
		someData = getSharedPreferences(filename, 0);

	}

	private void setupVariables() {
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);
		b10 = (Button) findViewById(R.id.button10);
		b11 = (Button) findViewById(R.id.button11);
		b12 = (Button) findViewById(R.id.button12);
		b13 = (Button) findViewById(R.id.button13);
		b14 = (Button) findViewById(R.id.button14);
		b15 = (Button) findViewById(R.id.button15);
		b16 = (Button) findViewById(R.id.button16);
		b17 = (Button) findViewById(R.id.button17);
		b18 = (Button) findViewById(R.id.button18);
		b19 = (Button) findViewById(R.id.button19);

		tv1 = (TextView) findViewById(R.id.textView2);
		tv2 = (TextView) findViewById(R.id.textView3);
		tv3 = (TextView) findViewById(R.id.textView4);
		tv4 = (TextView) findViewById(R.id.textView5);
		tv5 = (TextView) findViewById(R.id.textView6);
		tv6 = (TextView) findViewById(R.id.textView7);
		tv7 = (TextView) findViewById(R.id.textView8);
		tv8 = (TextView) findViewById(R.id.textView9);
		tv9 = (TextView) findViewById(R.id.textView10);
		tv10 = (TextView) findViewById(R.id.textView1);

		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		et3 = (EditText) findViewById(R.id.editText3);
		et4 = (EditText) findViewById(R.id.editText4);
		et5 = (EditText) findViewById(R.id.editText5);
		et6 = (EditText) findViewById(R.id.editText6);
		et7 = (EditText) findViewById(R.id.editText7);
		et8 = (EditText) findViewById(R.id.editText8);
		et9 = (EditText) findViewById(R.id.editText9);

		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b10.setOnClickListener(this);
		b11.setOnClickListener(this);
		b12.setOnClickListener(this);
		b13.setOnClickListener(this);
		b14.setOnClickListener(this);
		b15.setOnClickListener(this);
		b16.setOnClickListener(this);
		b17.setOnClickListener(this);
		b18.setOnClickListener(this);
		b19.setOnClickListener(this);

	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			counter1++;
			tv1.setText("" + counter1);
			
			break;

		case R.id.button2:
			counter2++;
			tv2.setText("" + counter2);

			break;

		case R.id.button3:
			counter3++;
			tv3.setText("" + counter3);

			break;

		case R.id.button4:
			counter4++;
			tv4.setText("" + counter4);

			break;

		case R.id.button5:
			counter5++;
			tv5.setText("" + counter5);

			break;

		case R.id.button6:
			counter6++;
			tv6.setText("" + counter6);

			break;

		case R.id.button7:
			counter7++;
			tv7.setText("" + counter7);

			break;

		case R.id.button8:
			counter8++;
			tv8.setText("" + counter8);

			break;

		case R.id.button9:
			counter9++;
			tv9.setText("" + counter9);

			break;
		case R.id.button10:
			if(counter1!=0){
			counter1--;
			tv1.setText("" + counter1);
			}
			break;

		case R.id.button11:
			if(counter2!=0){
			counter2--;
			tv2.setText("" + counter2);
			}
			break;

		case R.id.button12:
			if(counter3!=0){
			counter3--;
			tv3.setText("" + counter3);
			}
			break;

		case R.id.button13:
			if(counter4!=0){
			counter4--;
			tv4.setText("" + counter4);
			}
			break;

		case R.id.button14:
			if(counter5!=0){
			counter5--;
			tv5.setText("" + counter5);
			}
			break;

		case R.id.button15:
			if(counter6!=0){
			counter6--;
			tv6.setText("" + counter6);
			}
			break;

		case R.id.button16:
			if(counter7!=0){
			counter7--;
			tv7.setText("" + counter7);
			}
			break;

		case R.id.button17:
			if(counter8!=0){
			counter8--;
			tv8.setText("" + counter8);
			}
			break;

		case R.id.button18:
			if(counter9!=0){
			counter9--;
			tv9.setText("" + counter9);
			}
			break;

		case R.id.button19:
			counter1=counter2=counter3=counter4=counter5=counter6=counter7=counter8=counter9=0;
			tv1.setText(""+counter1);
			tv2.setText(""+counter2);
			tv3.setText(""+counter3);
			tv4.setText(""+counter4);
			tv5.setText(""+counter5);
			tv6.setText(""+counter6);
			tv7.setText(""+counter7);
			tv8.setText(""+counter8);
			tv9.setText(""+counter9);
			sub1=sub2=sub3=sub4=sub5=sub6=sub7=sub8=sub9=null;
			et1.setText(sub1);
			et2.setText(sub2);
			et3.setText(sub3);
			et4.setText(sub4);
			et5.setText(sub5);
			et6.setText(sub6);
			et7.setText(sub7);
			et8.setText(sub8);
			et9.setText(sub9);
			break;

		}

	}

	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		sub1 = et1.getText().toString();
		SharedPreferences.Editor editor = someData.edit();
		editor.putString("str1", sub1);
		editor.putInt("count1", counter1);
		sub2 = et2.getText().toString();
		editor.putString("str2", sub2);
		editor.putInt("count2", counter2);
		sub3 = et3.getText().toString();
		editor.putString("str3", sub3);
		editor.putInt("count3", counter3);
		sub4 = et4.getText().toString();
		editor.putString("str4", sub4);
		editor.putInt("count4", counter4);
		sub5 = et5.getText().toString();
		editor.putString("str5", sub5);
		editor.putInt("count5", counter5);
		sub6 = et6.getText().toString();
		editor.putString("str6", sub6);
		editor.putInt("count6", counter6);
		sub7 = et7.getText().toString();
		editor.putString("str7", sub7);
		editor.putInt("count7", counter7);
		sub8 = et8.getText().toString();
		editor.putString("str8", sub8);
		editor.putInt("count8", counter8);
		sub9 = et9.getText().toString();
		editor.putString("str9", sub9);
		editor.putInt("count9", counter9);
		editor.commit();

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		sub1 = et1.getText().toString();
		SharedPreferences.Editor editor = someData.edit();
		editor.putString("str1", sub1);
		editor.putInt("count1", counter1);
		sub2 = et2.getText().toString();
		editor.putString("str2", sub2);
		editor.putInt("count2", counter2);
		sub3 = et3.getText().toString();
		editor.putString("str3", sub3);
		editor.putInt("count3", counter3);
		sub4 = et4.getText().toString();
		editor.putString("str4", sub4);
		editor.putInt("count4", counter4);
		sub5 = et5.getText().toString();
		editor.putString("str5", sub5);
		editor.putInt("count5", counter5);
		sub6 = et6.getText().toString();
		editor.putString("str6", sub6);
		editor.putInt("count6", counter6);
		sub7 = et7.getText().toString();
		editor.putString("str7", sub7);
		editor.putInt("count7", counter7);
		sub8 = et8.getText().toString();
		editor.putString("str8", sub8);
		editor.putInt("count8", counter8);
		sub9 = et9.getText().toString();
		editor.putString("str9", sub9);
		editor.putInt("count9", counter9);
		editor.commit();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		sub1 = et1.getText().toString();
		SharedPreferences.Editor editor = someData.edit();
		editor.putString("str1", sub1);
		editor.putInt("count1", counter1);
		sub2 = et2.getText().toString();
		editor.putString("str2", sub2);
		editor.putInt("count2", counter2);
		sub3 = et3.getText().toString();
		editor.putString("str3", sub3);
		editor.putInt("count3", counter3);
		sub4 = et4.getText().toString();
		editor.putString("str4", sub4);
		editor.putInt("count4", counter4);
		sub5 = et5.getText().toString();
		editor.putString("str5", sub5);
		editor.putInt("count5", counter5);
		sub6 = et6.getText().toString();
		editor.putString("str6", sub6);
		editor.putInt("count6", counter6);
		sub7 = et7.getText().toString();
		editor.putString("str7", sub7);
		editor.putInt("count7", counter7);
		sub8 = et8.getText().toString();
		editor.putString("str8", sub8);
		editor.putInt("count8", counter8);
		sub9 = et9.getText().toString();
		editor.putString("str9", sub9);
		editor.putInt("count9", counter9);
		editor.commit();

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		sub1 = et1.getText().toString();
		SharedPreferences.Editor editor = someData.edit();
		editor.putString("str1", sub1);
		editor.putInt("count1", counter1);
		sub2 = et2.getText().toString();
		editor.putString("str2", sub2);
		editor.putInt("count2", counter2);
		sub3 = et3.getText().toString();
		editor.putString("str3", sub3);
		editor.putInt("count3", counter3);
		sub4 = et4.getText().toString();
		editor.putString("str4", sub4);
		editor.putInt("count4", counter4);
		sub5 = et5.getText().toString();
		editor.putString("str5", sub5);
		editor.putInt("count5", counter5);
		sub6 = et6.getText().toString();
		editor.putString("str6", sub6);
		editor.putInt("count6", counter6);
		sub7 = et7.getText().toString();
		editor.putString("str7", sub7);
		editor.putInt("count7", counter7);
		sub8 = et8.getText().toString();
		editor.putString("str8", sub8);
		editor.putInt("count8", counter8);
		sub9 = et9.getText().toString();
		editor.putString("str9", sub9);
		editor.putInt("count9", counter9);
		editor.commit();

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		someData=getSharedPreferences(filename, 0);
		int a1=someData.getInt("count1", 0);
		counter1=a1;
		tv1.setText(""+counter1);
		int a2=someData.getInt("count2", 0);
		counter2=a2;
		tv2.setText(""+counter2);
		int a3=someData.getInt("count3", 0);
		counter3=a3;
		tv3.setText(""+counter3);
		int a4=someData.getInt("count4", 0);
		counter4=a4;
		tv4.setText(""+counter4);
		int a5=someData.getInt("count5", 0);
		counter5=a5;
		tv5.setText(""+counter5);
		int a6=someData.getInt("count6", 0);
		counter6=a6;
		tv6.setText(""+counter6);
		int a7=someData.getInt("count7", 0);
		counter7=a7;
		tv7.setText(""+counter7);
		int a8=someData.getInt("count8", 0);
		counter8=a8;
		tv8.setText(""+counter8);
		int a9=someData.getInt("count9", 0);
		counter9=a9;
		tv9.setText(""+counter9);
		
		String s1 = someData.getString("str1", "");
		et1.setText(s1);
		String s2 = someData.getString("str2", "");
		et2.setText(s2);
		String s3 = someData.getString("str3", "");
		et3.setText(s3);
		String s4 = someData.getString("str4", "");
		et4.setText(s4);
		String s5 = someData.getString("str5", "");
		et5.setText(s5);
		String s6 = someData.getString("str6", "");
		et6.setText(s6);
		String s7 = someData.getString("str7", "");
		et7.setText(s7);
		String s8 = someData.getString("str8", "");
		et8.setText(s8);
		String s9 = someData.getString("str9", "");
		et9.setText(s9);

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		someData=getSharedPreferences(filename, 0);
		int a1=someData.getInt("count1", 0);
		counter1=a1;
		tv1.setText(""+counter1);
		int a2=someData.getInt("count2", 0);
		counter2=a2;
		tv2.setText(""+counter2);
		int a3=someData.getInt("count3", 0);
		counter3=a3;
		tv3.setText(""+counter3);
		int a4=someData.getInt("count4", 0);
		counter4=a4;
		tv4.setText(""+counter4);
		int a5=someData.getInt("count5", 0);
		counter5=a5;
		tv5.setText(""+counter5);
		int a6=someData.getInt("count6", 0);
		counter6=a6;
		tv6.setText(""+counter6);
		int a7=someData.getInt("count7", 0);
		counter7=a7;
		tv7.setText(""+counter7);
		int a8=someData.getInt("count8", 0);
		counter8=a8;
		tv8.setText(""+counter8);
		int a9=someData.getInt("count9", 0);
		counter9=a9;
		tv9.setText(""+counter9);

		//someData = getSharedPreferences(filename, 0);
		String s1 = someData.getString("str1", "");
		et1.setText(s1);
		String s2 = someData.getString("str2", "");
		et2.setText(s2);
		String s3 = someData.getString("str3", "");
		et3.setText(s3);
		String s4 = someData.getString("str4", "");
		et4.setText(s4);
		String s5 = someData.getString("str5", "");
		et5.setText(s5);
		String s6 = someData.getString("str6", "");
		et6.setText(s6);
		String s7 = someData.getString("str7", "");
		et7.setText(s7);
		String s8 = someData.getString("str8", "");
		et8.setText(s8);
		String s9 = someData.getString("str9", "");
		et9.setText(s9);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		someData=getSharedPreferences(filename, 0);
		int a1=someData.getInt("count1", 0);
		counter1=a1;
		tv1.setText(""+counter1);
		int a2=someData.getInt("count2", 0);
		counter2=a2;
		tv2.setText(""+counter2);
		int a3=someData.getInt("count3", 0);
		counter3=a3;
		tv3.setText(""+counter3);
		int a4=someData.getInt("count4", 0);
		counter4=a4;
		tv4.setText(""+counter4);
		int a5=someData.getInt("count5", 0);
		counter5=a5;
		tv5.setText(""+counter5);
		int a6=someData.getInt("count6", 0);
		counter6=a6;
		tv6.setText(""+counter6);
		int a7=someData.getInt("count7", 0);
		counter7=a7;
		tv7.setText(""+counter7);
		int a8=someData.getInt("count8", 0);
		counter8=a8;
		tv8.setText(""+counter8);
		int a9=someData.getInt("count9", 0);
		counter9=a9;
		tv9.setText(""+counter9);

		//someData = getSharedPreferences(filename, 0);
		String s1 = someData.getString("str1", "");
		et1.setText(s1);
		String s2 = someData.getString("str2", "");
		et2.setText(s2);
		String s3 = someData.getString("str3", "");
		et3.setText(s3);
		String s4 = someData.getString("str4", "");
		et4.setText(s4);
		String s5 = someData.getString("str5", "");
		et5.setText(s5);
		String s6 = someData.getString("str6", "");
		et6.setText(s6);
		String s7 = someData.getString("str7", "");
		et7.setText(s7);
		String s8 = someData.getString("str8", "");
		et8.setText(s8);
		String s9 = someData.getString("str9", "");
		et9.setText(s9);
	}

}
