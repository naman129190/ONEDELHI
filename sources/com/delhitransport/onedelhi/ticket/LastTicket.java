package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class LastTicket {
    @nu3("ticket")
    @qy0
    private Ticket lastTicket;
    @nu3("message")
    @qy0
    private String message;

    public LastTicket(String str, Ticket ticket) {
        this.message = str;
        this.lastTicket = ticket;
    }

    public Ticket getLastTicket() {
        return this.lastTicket;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return "LastTicket{message='" + this.message + '\'' + ", lastTicket=" + this.lastTicket + '}';
    }
}
