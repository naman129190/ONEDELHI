package com.delhitransport.onedelhi.models.directions;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.List;

public class DirectionResponse implements Serializable {
    @nu3("description")
    @qy0
    private String description;
    @nu3("possible_directions")
    @qy0
    private List<Direction> directions;
    @nu3("message")
    @qy0
    private String msg;
    @nu3("response_type")
    @qy0
    private String response_type;
    @nu3("status")
    @qy0
    private String status;

    public DirectionResponse() {
    }

    public DirectionResponse(String str, List<Direction> list, String str2, String str3) {
        this.msg = str;
        this.directions = list;
        this.status = str2;
        this.response_type = str3;
    }

    public String getDescription() {
        return this.description;
    }

    public List<Direction> getDirections() {
        return this.directions;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getResponse_type() {
        return this.response_type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String toString() {
        return "DirectionResponse{msg='" + this.msg + '\'' + ", directions=" + this.directions + ", status='" + this.status + '\'' + ", response_type='" + this.response_type + '\'' + '}';
    }
}
