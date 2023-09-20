package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

abstract class CoderBase {
    private static final byte[] NONE = new byte[0];
    private final Class<?>[] acceptableOptions;

    public CoderBase(Class<?>... clsArr) {
        this.acceptableOptions = clsArr;
    }

    public static int numberOptionOrDefault(Object obj, int i) {
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    public boolean canAcceptOptions(Object obj) {
        for (Class<?> isInstance : this.acceptableOptions) {
            if (isInstance.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException;

    public OutputStream encode(OutputStream outputStream, Object obj) throws IOException {
        throw new UnsupportedOperationException("method doesn't support writing");
    }

    public byte[] getOptionsAsProperties(Object obj) {
        return NONE;
    }

    public Object getOptionsFromCoder(Coder coder, InputStream inputStream) {
        return null;
    }
}
