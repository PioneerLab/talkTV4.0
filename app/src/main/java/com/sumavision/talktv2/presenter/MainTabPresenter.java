package com.sumavision.talktv2.presenter;

import android.content.Context;

import com.sumavision.talktv2.presenter.base.BasePresenter;
import com.sumavision.talktv2.ui.iview.IMainTabView;

/**
 * Created by sharpay on 16-5-24.
 */
public class MainTabPresenter extends BasePresenter<IMainTabView> {

    public MainTabPresenter(Context context, IMainTabView iView) {
        super(context, iView);
    }

    @Override
    public void release() {

    }
}
