package org.apache.commons.compress.archivers.sevenz;

import java.util.LinkedList;

class Folder {
    public BindPair[] bindPairs;
    public Coder[] coders;
    public long crc;
    public boolean hasCrc;
    public int numUnpackSubStreams;
    public long[] packedStreams;
    public long totalInputStreams;
    public long totalOutputStreams;
    public long[] unpackSizes;

    public int findBindPairForInStream(int i) {
        int i2 = 0;
        while (true) {
            BindPair[] bindPairArr = this.bindPairs;
            if (i2 >= bindPairArr.length) {
                return -1;
            }
            if (bindPairArr[i2].inIndex == ((long) i)) {
                return i2;
            }
            i2++;
        }
    }

    public int findBindPairForOutStream(int i) {
        int i2 = 0;
        while (true) {
            BindPair[] bindPairArr = this.bindPairs;
            if (i2 >= bindPairArr.length) {
                return -1;
            }
            if (bindPairArr[i2].outIndex == ((long) i)) {
                return i2;
            }
            i2++;
        }
    }

    public Iterable<Coder> getOrderedCoders() {
        LinkedList linkedList = new LinkedList();
        int i = (int) this.packedStreams[0];
        while (i != -1) {
            linkedList.addLast(this.coders[i]);
            int findBindPairForOutStream = findBindPairForOutStream(i);
            i = findBindPairForOutStream != -1 ? (int) this.bindPairs[findBindPairForOutStream].inIndex : -1;
        }
        return linkedList;
    }

    public long getUnpackSize() {
        long j = this.totalOutputStreams;
        if (j == 0) {
            return 0;
        }
        for (int i = ((int) j) - 1; i >= 0; i--) {
            if (findBindPairForOutStream(i) < 0) {
                return this.unpackSizes[i];
            }
        }
        return 0;
    }

    public long getUnpackSizeForCoder(Coder coder) {
        if (this.coders == null) {
            return 0;
        }
        int i = 0;
        while (true) {
            Coder[] coderArr = this.coders;
            if (i >= coderArr.length) {
                return 0;
            }
            if (coderArr[i] == coder) {
                return this.unpackSizes[i];
            }
            i++;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Folder with ");
        sb.append(this.coders.length);
        sb.append(" coders, ");
        sb.append(this.totalInputStreams);
        sb.append(" input streams, ");
        sb.append(this.totalOutputStreams);
        sb.append(" output streams, ");
        sb.append(this.bindPairs.length);
        sb.append(" bind pairs, ");
        sb.append(this.packedStreams.length);
        sb.append(" packed streams, ");
        sb.append(this.unpackSizes.length);
        sb.append(" unpack sizes, ");
        if (this.hasCrc) {
            str = "with CRC " + this.crc;
        } else {
            str = "without CRC";
        }
        sb.append(str);
        sb.append(" and ");
        sb.append(this.numUnpackSubStreams);
        sb.append(" unpack streams");
        return sb.toString();
    }
}
