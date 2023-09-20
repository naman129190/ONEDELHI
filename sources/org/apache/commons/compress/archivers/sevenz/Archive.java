package org.apache.commons.compress.archivers.sevenz;

import java.util.BitSet;

class Archive {
    public SevenZArchiveEntry[] files;
    public Folder[] folders;
    public long[] packCrcs;
    public BitSet packCrcsDefined;
    public long packPos;
    public long[] packSizes;
    public StreamMap streamMap;
    public SubStreamsInfo subStreamsInfo;

    private static String lengthOf(long[] jArr) {
        return jArr == null ? "(null)" : String.valueOf(jArr.length);
    }

    private static String lengthOf(Object[] objArr) {
        return objArr == null ? "(null)" : String.valueOf(objArr.length);
    }

    public String toString() {
        return "Archive with packed streams starting at offset " + this.packPos + ", " + lengthOf(this.packSizes) + " pack sizes, " + lengthOf(this.packCrcs) + " CRCs, " + lengthOf((Object[]) this.folders) + " folders, " + lengthOf((Object[]) this.files) + " files and " + this.streamMap;
    }
}
