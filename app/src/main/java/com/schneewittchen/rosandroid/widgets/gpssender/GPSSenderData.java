package com.schneewittchen.rosandroid.widgets.gpssender;

import com.schneewittchen.rosandroid.model.entities.widgets.BaseEntity;
import com.schneewittchen.rosandroid.model.repositories.rosRepo.node.BaseData;
import com.schneewittchen.rosandroid.widgets.joystick.JoystickEntity;

import org.ros.internal.message.Message;
import org.ros.node.topic.Publisher;

import geometry_msgs.Twist;
import geometry_msgs.Vector3;
import sensor_msgs.NavSatFix;


public class GPSSenderData extends BaseData {

    public static final String TAG = GPSSenderData.class.getSimpleName();
    public double latitude;
    public double longitude;
    public double altitude;

    public GPSSenderData(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    @Override
    public Message toRosMessage(Publisher<Message> publisher, BaseEntity widget) {
        GPSSenderEntity senderWidget = (GPSSenderEntity) widget;

        NavSatFix message = (NavSatFix) publisher.newMessage();
        message.setLatitude(this.latitude);
        message.setAltitude(this.altitude);
        message.setLongitude(this.longitude);

        return message;
    }
}
