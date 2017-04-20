package com.example.asus.time;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Time extends AppCompatActivity {

    private TextView showdate;
    private Button setdate;
    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        showdate=(TextView) this.findViewById(R.id.showtime);
        setdate=(Button) this.findViewById(R.id.setdate);
        //初始化Calendar日历对象
        Calendar c=Calendar.getInstance(Locale.CHINA);
        Date mydate=new Date(); //获取当前日期Date对象
        c.setTime(mydate);////为Calendar对象设置时间为当前日期

        year=c.get(Calendar.YEAR); //获取Calendar对象中的年
        month=c.get(Calendar.MONTH);//获取Calendar对象中的月
        day=c.get(Calendar.DAY_OF_MONTH);//获取这个月的第几天
        showdate.setText("当前日期:"+year+"-"+(month+1)+"-"+day); //显示当前的年月日

        //添加单击事件--设置日期
        setdate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                //创建DatePickerDialog对象
                DatePickerDialog my_datePickerDialog=new DatePickerDialog(Time.this,Datelistener,year,month,day);
                my_datePickerDialog.show();//显示DatePickerDialog组件
            }
        });

    }
    private DatePickerDialog.OnDateSetListener Datelistener=new DatePickerDialog.OnDateSetListener()
    {

        @Override
        public void onDateSet(DatePicker v, int y, int m, int d) {


            //修改year、month、day的变量值，以便以后单击按钮时，DatePickerDialog上显示上一次修改后的值
            year=y;
            month=m;
            day=d;
            //更新日期
            updateDate();

        }
        //当DatePickerDialog关闭时，更新日期显示
        private void updateDate()
        {
            //在TextView上显示日期
            showdate.setText("当前日期："+year+"-"+(month+1)+"-"+day);
        }
    };
}
