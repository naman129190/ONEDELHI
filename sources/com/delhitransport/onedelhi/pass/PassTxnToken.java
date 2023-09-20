package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class PassTxnToken {
    @nu3("callback_url")
    @qy0
    private String callback_url;
    @nu3("gateway_name")
    @qy0
    private int gateway_name;
    @nu3("gateway_order_id")
    @qy0
    private String gateway_order_id;
    @nu3("host")
    @qy0
    private String host;
    @nu3("message")
    @qy0
    private String message;
    @nu3("mid")
    @qy0
    private String mid;
    @nu3("transaction_token")
    @qy0
    private String transaction_token;

    public PassTxnToken(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.message = str;
        this.transaction_token = str2;
        this.mid = str3;
        this.callback_url = str4;
        this.host = str5;
        this.gateway_order_id = str6;
        this.gateway_name = i;
    }

    public String getCallback_url() {
        return this.callback_url;
    }

    public int getGateway_name() {
        return this.gateway_name;
    }

    public String getGateway_order_id() {
        return this.gateway_order_id;
    }

    public String getHost() {
        return this.host;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMid() {
        return this.mid;
    }

    public String getTransaction_token() {
        return this.transaction_token;
    }

    public String toString() {
        return "PassTxnToken{message='" + this.message + '\'' + ", transaction_token='" + this.transaction_token + '\'' + ", mid='" + this.mid + '\'' + ", callback_url='" + this.callback_url + '\'' + ", host='" + this.host + '\'' + ", gateway_order_id='" + this.gateway_order_id + '\'' + ", gateway_name=" + this.gateway_name + '}';
    }
}
