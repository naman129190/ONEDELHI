package com.onedelhi.secure;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c70 extends FilterInputStream {

    /* renamed from: b */
    public static final String f10175b = "ContentLengthStream";

    /* renamed from: o */
    public static final int f10176o = -1;

    /* renamed from: b */
    public final long f10177b;

    /* renamed from: n */
    public int f10178n;

    public c70(@mr2 InputStream inputStream, long j) {
        super(inputStream);
        this.f10177b = j;
    }

    @mr2
    /* renamed from: b */
    public static InputStream m12370b(@mr2 InputStream inputStream, long j) {
        return new c70(inputStream, j);
    }

    @mr2
    /* renamed from: c */
    public static InputStream m12371c(@mr2 InputStream inputStream, @ts2 String str) {
        return m12370b(inputStream, (long) m12372d(str));
    }

    /* renamed from: d */
    public static int m12372d(@ts2 String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                if (Log.isLoggable(f10175b, 3)) {
                    Log.d(f10175b, "failed to parse content length header: " + str, e);
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo14045a(int i) throws IOException {
        if (i >= 0) {
            this.f10178n += i;
        } else if (this.f10177b - ((long) this.f10178n) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f10177b + ", but read: " + this.f10178n);
        }
        return i;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f10177b - ((long) this.f10178n), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        mo14045a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return mo14045a(super.read(bArr, i, i2));
    }
}
