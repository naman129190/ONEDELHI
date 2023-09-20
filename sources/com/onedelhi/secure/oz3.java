package com.onedelhi.secure;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/oz3;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "Lcom/onedelhi/secure/me4;", "timeout", "close", "okio"}, k = 1, mv = {1, 4, 0})
public interface oz3 extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    @vr2
    me4 timeout();

    void write(@vr2 C6205no noVar, long j) throws IOException;
}
