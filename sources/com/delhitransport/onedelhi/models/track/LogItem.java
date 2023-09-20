package com.delhitransport.onedelhi.models.track;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class LogItem {
    @nu3("key")
    @qy0
    private String key;
    @nu3("value")
    @qy0
    private String value;

    public LogItem(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @mr2
    public String toString() {
        return "LogItem{key='" + this.key + '\'' + ", value='" + this.value + '\'' + '}';
    }
}
