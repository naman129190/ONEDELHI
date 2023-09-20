package com.delhitransport.onedelhi.models.freshdesk;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.File;
import java.util.ArrayList;

public class FreshDeskRequest {
    @nu3("attachments")
    @qy0
    private ArrayList<File> attachment;
    @nu3("description")
    @qy0
    private String description;
    @nu3("email")
    @qy0
    private String email;
    @nu3("name")
    @qy0
    private String name;
    @nu3("phone")
    @qy0
    private String phone;
    @nu3("priority")
    @qy0
    private Integer priority;
    @nu3("source")
    @qy0
    private Integer source;
    @nu3("status")
    @qy0
    private Integer status;
    @nu3("subject")
    @qy0
    private String subject;
    @nu3("tags")
    @qy0
    private ArrayList<String> tags;

    public FreshDeskRequest() {
    }

    public FreshDeskRequest(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, ArrayList<String> arrayList) {
        this.name = str;
        this.email = str2;
        this.phone = str3;
        this.subject = str4;
        this.description = str5;
        this.status = Integer.valueOf(i);
        this.priority = Integer.valueOf(i2);
        this.source = Integer.valueOf(i3);
        this.tags = arrayList;
    }

    public ArrayList<File> getAttachment() {
        return this.attachment;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getPriority() {
        return this.priority.intValue();
    }

    public int getSource() {
        return this.source.intValue();
    }

    public int getStatus() {
        return this.status.intValue();
    }

    public String getSubject() {
        return this.subject;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public void setAttachment(ArrayList<File> arrayList) {
        this.attachment = arrayList;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setPriority(int i) {
        this.priority = Integer.valueOf(i);
    }

    public void setSource(int i) {
        this.source = Integer.valueOf(i);
    }

    public void setStatus(int i) {
        this.status = Integer.valueOf(i);
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setTags(ArrayList<String> arrayList) {
        this.tags = arrayList;
    }

    public String toString() {
        return "FreshDeskRequest{name='" + this.name + '\'' + ", email='" + this.email + '\'' + ", phone='" + this.phone + '\'' + ", subject='" + this.subject + '\'' + ", description='" + this.description + '\'' + ", status=" + this.status + ", priority=" + this.priority + ", source=" + this.source + ", tags=" + this.tags + ", attachment=" + this.attachment + '}';
    }
}
