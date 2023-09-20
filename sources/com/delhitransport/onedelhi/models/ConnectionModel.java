package com.delhitransport.onedelhi.models;

public class ConnectionModel {
    private boolean isConnected;
    private int type;

    public ConnectionModel(int i, boolean z) {
        this.type = i;
        this.isConnected = z;
    }

    public boolean getIsConnected() {
        return this.isConnected;
    }

    public int getType() {
        return this.type;
    }
}
