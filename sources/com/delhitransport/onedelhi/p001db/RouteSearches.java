package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.pj0;
import com.onedelhi.secure.r10;
import com.onedelhi.secure.up1;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(indices = {@up1(unique = true, value = {"route_name"})})
/* renamed from: com.delhitransport.onedelhi.db.RouteSearches */
public class RouteSearches implements Serializable {
    @w43(autoGenerate = true)

    /* renamed from: id */
    private int f7036id;
    @r10(name = "route_name")
    private String route_name;
    @r10(name = "source")
    private String source;
    @r10(name = "terminal")
    private String terminal;
    @r10(name = "type")
    private String type;

    public RouteSearches() {
    }

    public RouteSearches(int i, String str, String str2, String str3, String str4) {
        this.f7036id = i;
        this.route_name = str;
        this.source = str2;
        this.terminal = str3;
        this.type = str4;
    }

    public int getId() {
        return this.f7036id;
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

    public void setId(int i) {
        this.f7036id = i;
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
        return pj0.m61166a(-92529787770695L) + this.f7036id + pj0.m61166a(-92607097182023L) + this.route_name + '\'' + pj0.m61166a(-92671521691463L) + this.source + '\'' + pj0.m61166a(-92718766331719L) + this.terminal + '\'' + pj0.m61166a(-92774600906567L) + this.type + '\'' + '}';
    }
}
