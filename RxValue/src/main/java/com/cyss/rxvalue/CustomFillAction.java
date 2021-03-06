package com.cyss.rxvalue;

import android.content.Context;

/**
 * Created by chenyang on 2017/2/7.
 */

/**
 * 自定义填充或获取行为
 * @param <T>
 */
public interface CustomFillAction<T> {
    /**
     * 填充行为
     * @param context
     * @param view 填充的view
     * @param obj  填充object
     */
    public void action1(Context context, T view, Object obj);

    /**
     * 获取view数据行为
     * @param context
     * @param view  获取view
     * @return      返回从view获取的值
     */
    public Object action2(Context context, T view);
}
