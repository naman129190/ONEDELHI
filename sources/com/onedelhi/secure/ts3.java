package com.onedelhi.secure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ts3 extends us3 {

    /* renamed from: a */
    public RandomAccessFile f35773a;

    public ts3(File file) throws FileNotFoundException {
        this.f35773a = new RandomAccessFile(file, "r");
    }

    public ts3(RandomAccessFile randomAccessFile) {
        this.f35773a = randomAccessFile;
    }

    public ts3(String str) throws FileNotFoundException {
        this.f35773a = new RandomAccessFile(str, "r");
    }

    /* renamed from: a */
    public long mo45288a() throws IOException {
        return this.f35773a.length();
    }

    /* renamed from: b */
    public long mo45289b() throws IOException {
        return this.f35773a.getFilePointer();
    }

    /* renamed from: c */
    public void mo45290c(long j) throws IOException {
        this.f35773a.seek(j);
    }

    public void close() throws IOException {
        this.f35773a.close();
    }

    public int read() throws IOException {
        return this.f35773a.read();
    }

    public int read(byte[] bArr) throws IOException {
        return this.f35773a.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f35773a.read(bArr, i, i2);
    }
}
