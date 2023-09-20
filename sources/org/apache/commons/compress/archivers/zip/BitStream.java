package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.utils.BitInputStream;

class BitStream extends BitInputStream {
    public BitStream(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
    }

    public int nextBit() throws IOException {
        return (int) readBits(1);
    }

    public long nextBits(int i) throws IOException {
        return readBits(i);
    }

    public int nextByte() throws IOException {
        return (int) readBits(8);
    }
}
