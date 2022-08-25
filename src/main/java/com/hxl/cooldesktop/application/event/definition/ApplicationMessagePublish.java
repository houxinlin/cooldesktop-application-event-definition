package com.hxl.cooldesktop.application.event.definition;

import java.util.Map;

public interface ApplicationMessagePublish {
    void push(Map<String, String> data);

    void push(String data);
}
