package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class RouteSearchData implements Serializable {
    @nu3("id")
    @qy0

    /* renamed from: id */
    private String f7044id;
    @nu3("route_name")
    @qy0
    private String route_name;
    @nu3("source")
    @qy0
    private String source;
    @nu3("terminal")
    @qy0
    private String terminal;
    @nu3("type")
    @qy0
    private String type;

    public RouteSearchData() {
    }

    public RouteSearchData(String str, String str2, String str3, String str4, String str5) {
        this.f7044id = str;
        this.route_name = str2;
        this.terminal = str3;
        this.source = str4;
        this.type = str5;
    }

    public String getId() {
        return this.f7044id;
    }

    public String getRoute_name() {
        return this.route_name;
    }

    public String getSource() {
        return this.source;
    }

    public String getTerminal() {
        return this.terminal;
    }

    public String getType() {
        return this.type;
    }

    public void setId(String str) {
        this.f7044id = str;
    }

    public void setRoute_name(String str) {
        this.route_name = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTerminal(String str) {
        this.terminal = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "RouteSearchData{id='" + this.f7044id + '\'' + ", route_name='" + this.route_name + '\'' + ", terminal='" + this.terminal + '\'' + ", source='" + this.source + '\'' + ", type='" + this.type + '\'' + '}';
    }
}
