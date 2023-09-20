package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.List;

public class AllTickets {
    @nu3("message")
    @qy0
    private String message;
    @nu3("tickets")
    @qy0
    private List<Ticket> tickets;

    public AllTickets() {
    }

    public AllTickets(String str, List<Ticket> list) {
        this.message = str;
        this.tickets = list;
    }

    public String getMessage() {
        return this.message;
    }

    public List<Ticket> getTickets() {
        return this.tickets;
    }

    public String toString() {
        return "AllTickets{message='" + this.message + '\'' + ", tickets=" + this.tickets + '}';
    }
}
