package com.example.asus.contextmeun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;

public class ContextMeun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_meun);
        //没有下面的内容点击是无反应的
        TextView tv = new TextView(this);
        tv.setText("上下文菜单的载体");
        registerForContextMenu(tv);
        setContentView(tv);
    }

    public boolean onContextItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        super.onContextItemSelected(item);
        switch (item.getItemId()) {
            case 1://做新建的事情
                break;
            case 2://做打开的事情
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        menu.add(0, 1, 1, "新建");
        menu.add(0, 2, 2, "打开");
        super.onCreateContextMenu(menu, v, menuInfo);
    }


}
