package org.apache.commons.compress.archivers.sevenz;

class BindPair {
    public long inIndex;
    public long outIndex;

    public String toString() {
        return "BindPair binding input " + this.inIndex + " to output " + this.outIndex;
    }
}
