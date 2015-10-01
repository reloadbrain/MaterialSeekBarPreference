package com.pavelsikun.seekbarpreference;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by mrbimc on 30.09.15.
 */
public class MaterialSeekBarView extends FrameLayout {

    private MaterialSeekBarController mController;

    public MaterialSeekBarView(Context context) {
        super(context);
        init(null);
    }

    public MaterialSeekBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public MaterialSeekBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MaterialSeekBarView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    void init(AttributeSet attrs) {
        View view = inflate(getContext(), R.layout.seekbar_preference, this);
        mController = new MaterialSeekBarController(getContext(), attrs, view);
    }

    public String getMeasurementUnit() {
        return mController.getMeasurementUnit();
    }

    public void setMeasurementUnit(String measurementUnit) {
        mController.setMeasurementUnit(measurementUnit);
    }

    public int getInterval() {
        return mController.getInterval();
    }

    public void setInterval(int interval) {
        mController.setInterval(interval);
    }

    public int getMinValue() {
        return mController.getMinValue();
    }

    public void setMinValue(int minValue) {
        mController.setMinValue(minValue);
    }

    public int getMaxValue() {
        return mController.getMaxValue();
    }

    public void setMaxValue(int maxValue) {
        mController.setMaxValue(maxValue);
    }

    public int getCurrentValue() {
        return mController.getCurrentValue();
    }

    public void setCurrentValue(int value) {
        mController.setCurrentValue(value);
    }
}