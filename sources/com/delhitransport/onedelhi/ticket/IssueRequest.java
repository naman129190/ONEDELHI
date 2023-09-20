package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class IssueRequest {
    @nu3("body")
    @qy0
    private String body;
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("contact")
    @qy0
    private String contact;
    @nu3("login_id")
    @qy0
    private String login_id;
    @nu3("type")
    @qy0
    private String type;

    public IssueRequest(String str, String str2, String str3, String str4, String str5) {
        this.login_id = str;
        this.booking_id = str2;
        this.body = str3;
        this.contact = str4;
        this.type = str5;
    }

    public String getBody() {
        return this.body;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getContact() {
        return this.contact;
    }

    public String getLogin_id() {
        return this.login_id;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "IssueRequest{login_id='" + this.login_id + '\'' + ", booking_id='" + this.booking_id + '\'' + ", body='" + this.body + '\'' + ", contact='" + this.contact + '\'' + ", type='" + this.type + '\'' + '}';
    }
}
