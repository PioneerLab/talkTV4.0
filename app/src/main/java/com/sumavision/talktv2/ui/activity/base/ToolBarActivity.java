package com.sumavision.talktv2.ui.activity.base;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.animation.DecelerateInterpolator;

import com.sumavision.talktv2.R;
import com.sumavision.talktv2.presenter.base.BasePresenter;

import butterknife.BindView;

/**
 * 带Toolbar的基础Activity
 * Created by dell on 2016/4/15.
 */
public abstract class ToolBarActivity<T extends BasePresenter> extends BaseActivity<T> {
    protected ActionBar actionBar;
    protected boolean isToolBarHiding = false;

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;
    @BindView(R.id.app_bar)
    protected AppBarLayout appBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initToolBar();
    }

   /* *//**
     * 设置 home icon 是否可见
     * @return
     *//*
    protected boolean canBack(){
        return true;
    }*/

    protected void initToolBar(){
        actionBar = getSupportActionBar();
//        if (actionBar != null) getSupportActionBar().setDisplayHomeAsUpEnabled(canBack());

    }

    protected void hideOrShowToolBar() {
        appBar.animate()
                .translationY(isToolBarHiding ? 0 : -appBar.getHeight())
                .setInterpolator(new DecelerateInterpolator(2))
                .start();
        isToolBarHiding = !isToolBarHiding;
    }
}
