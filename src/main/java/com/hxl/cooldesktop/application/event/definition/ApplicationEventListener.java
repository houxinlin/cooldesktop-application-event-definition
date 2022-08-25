package com.hxl.cooldesktop.application.event.definition;

public interface ApplicationEventListener {
    void  onOpen(String domId);

    void  onClose(String domId);
}
