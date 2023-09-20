package com.delhitransport.onedelhi.models.payment;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class CustomPaymentItem {
    @nu3("data")
    @qy0
    private ArrayList<CustomPaymentDataItem> data;
    @nu3("description")
    @qy0
    private String description;
    @nu3("message")
    @qy0
    private String message;
    @nu3("user_login_id")
    @qy0
    private String user_login_id;

    public CustomPaymentItem() {
    }

    public CustomPaymentItem(String str, String str2, String str3, ArrayList<CustomPaymentDataItem> arrayList) {
        this.message = str;
        this.description = str2;
        this.user_login_id = str3;
        this.data = arrayList;
    }

    public ArrayList<CustomPaymentDataItem> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUser_login_id() {
        return this.user_login_id;
    }

    public void setData(ArrayList<CustomPaymentDataItem> arrayList) {
        this.data = arrayList;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setUser_login_id(String str) {
        this.user_login_id = str;
    }

    public String toString() {
        return "CustomPaymentItem{message='" + this.message + '\'' + ", description='" + this.description + '\'' + ", user_login_id='" + this.user_login_id + '\'' + ", data=" + this.data + '}';
    }
}
