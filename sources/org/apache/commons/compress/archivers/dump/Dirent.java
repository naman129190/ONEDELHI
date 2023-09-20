package org.apache.commons.compress.archivers.dump;

class Dirent {
    private final int ino;
    private final String name;
    private final int parentIno;
    private final int type;

    public Dirent(int i, int i2, int i3, String str) {
        this.ino = i;
        this.parentIno = i2;
        this.type = i3;
        this.name = str;
    }

    public int getIno() {
        return this.ino;
    }

    public String getName() {
        return this.name;
    }

    public int getParentIno() {
        return this.parentIno;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return String.format("[%d]: %s", new Object[]{Integer.valueOf(this.ino), this.name});
    }
}
