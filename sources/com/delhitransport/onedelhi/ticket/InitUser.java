package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class InitUser {
    @nu3("current_app_version")
    @qy0
    private final String current_app_version;
    @nu3("current_db_version")
    @qy0
    private final String current_db_version;
    @nu3("db_version_no")
    @qy0
    private final Integer db_version_no;
    @nu3("description")
    @qy0
    private final String description;
    @nu3("features")
    @qy0
    private Features features;
    @nu3("is_beta_user")
    @qy0
    private boolean is_beta_user;
    @nu3("is_new_user")
    @qy0
    private final boolean is_new_user;
    @nu3("message")
    @qy0
    private final String message;

    public static class DailyPass {
        @nu3("message")
        @qy0
        private final String message;
        @nu3("status")
        @qy0
        private final Boolean status;

        public DailyPass(Boolean bool, String str) {
            this.status = bool;
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public Boolean getStatus() {
            return this.status;
        }
    }

    public static class Features {
        @nu3("dailypass")
        @qy0
        private final DailyPass dailypass;
        @nu3("ticketing")
        @qy0
        private final Ticketing ticketing;

        public Features(Ticketing ticketing2, DailyPass dailyPass) {
            this.ticketing = ticketing2;
            this.dailypass = dailyPass;
        }

        public DailyPass getDailypass() {
            return this.dailypass;
        }

        public Ticketing getTicketing() {
            return this.ticketing;
        }
    }

    public static class Ticketing {
        @nu3("message")
        @qy0
        private final String message;
        @nu3("status")
        @qy0
        private final Boolean status;

        public Ticketing(Boolean bool, String str) {
            this.status = bool;
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public Boolean getStatus() {
            return this.status;
        }
    }

    public InitUser(String str, String str2, boolean z, String str3, String str4) {
        this.message = str;
        this.description = str2;
        this.is_new_user = z;
        this.current_app_version = str3;
        this.current_db_version = str4;
        this.db_version_no = null;
    }

    public InitUser(String str, String str2, boolean z, String str3, String str4, Features features2, Integer num) {
        this.message = str;
        this.description = str2;
        this.is_new_user = z;
        this.features = features2;
        this.current_app_version = str3;
        this.current_db_version = str4;
        this.db_version_no = num;
    }

    public String getCurrent_app_version() {
        return this.current_app_version;
    }

    public String getCurrent_db_version() {
        return this.current_db_version;
    }

    public Integer getDb_version_no() {
        return this.db_version_no;
    }

    public String getDescription() {
        return this.description;
    }

    public Features getFeatures() {
        return this.features;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isIs_beta_user() {
        return this.is_beta_user;
    }

    public boolean isIs_new_user() {
        return this.is_new_user;
    }
}
