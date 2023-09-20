package com.delhitransport.onedelhi.others;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Locale;

public class Notifications {
    @nu3("body")
    @qy0
    private String notification;
    /* access modifiers changed from: private */
    @nu3("time")
    @qy0
    public String time;
    @nu3("url")
    @qy0
    private String url;

    public static class NotificationComparator implements Comparator<Notifications> {
        private final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm", Locale.ENGLISH);

        public int compare(Notifications notifications, Notifications notifications2) {
            try {
                return this.formatter.parse(notifications2.time).compareTo(this.formatter.parse(notifications.time));
            } catch (ParseException e) {
                e.printStackTrace();
                return notifications.time.compareTo(notifications2.time);
            }
        }
    }

    public Notifications() {
    }

    public Notifications(String str, String str2, String str3) {
        this.notification = str;
        this.url = str2;
        this.time = str3;
    }

    public String getNotification() {
        return this.notification;
    }

    public String getTime() {
        return this.time;
    }

    public String getUrl() {
        return this.url;
    }

    public void setNotification(String str) {
        this.notification = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "Notifications{notification='" + this.notification + '\'' + ", time='" + this.time + '\'' + ", url='" + this.url + '\'' + '}';
    }
}
