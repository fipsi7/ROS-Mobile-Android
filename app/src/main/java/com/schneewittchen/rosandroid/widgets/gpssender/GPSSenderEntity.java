package com.schneewittchen.rosandroid.widgets.gpssender;


import com.schneewittchen.rosandroid.model.entities.widgets.PublisherWidgetEntity;
import com.schneewittchen.rosandroid.model.repositories.rosRepo.message.Topic;

import org.ros.namespace.GraphName;

import sensor_msgs.NavSatFix;

public class GPSSenderEntity extends PublisherWidgetEntity {

    public GPSSenderEntity() {
        this.width = 4;
        this.height = 4;
        this.topic = new Topic("gps", NavSatFix._TYPE);
    }

}