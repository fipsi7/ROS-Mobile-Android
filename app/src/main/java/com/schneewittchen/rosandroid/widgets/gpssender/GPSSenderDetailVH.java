package com.schneewittchen.rosandroid.widgets.gpssender;


import android.view.View;

import com.schneewittchen.rosandroid.model.entities.widgets.BaseEntity;
import com.schneewittchen.rosandroid.ui.views.details.PublisherWidgetViewHolder;

import java.util.Collections;
import java.util.List;

import sensor_msgs.NavSatFix;

public class GPSSenderDetailVH extends PublisherWidgetViewHolder {

    @Override
    public void initView(View view) {
    }

    @Override
    public void bindEntity(BaseEntity entity) {
    }


    @Override
    public void updateEntity(BaseEntity entity) {
    }

    @Override
    public List<String> getTopicTypes() {
        return Collections.singletonList(NavSatFix._TYPE);
    }
}