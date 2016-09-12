package com.brilliantbear.fileexplorer.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.brilliantbear.fileexplorer.R;

/**
 * Created by Bear on 2016-9-12.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected Context mContext;
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        initView(savedInstanceState);
        initData(savedInstanceState);
    }

    protected void initView(Bundle savedInstanceState) {
        initToolbar();
    }

    protected void initData(Bundle savedInstanceState) {

    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }

    protected abstract int getLayoutId();
}
