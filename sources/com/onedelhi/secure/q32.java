package com.onedelhi.secure;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/q32;", "Lcom/onedelhi/secure/zt3;", "", "", "iterator", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class q32 implements zt3<String> {
    @vr2

    /* renamed from: a */
    public final BufferedReader f33959a;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"com/onedelhi/secure/q32$a", "", "", "", "hasNext", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.q32$a */
    public static final class C6502a implements Iterator<String>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ q32 f33960a;
        @ss2

        /* renamed from: b */
        public String f33961b;

        /* renamed from: b */
        public boolean f33962b;

        public C6502a(q32 q32) {
            this.f33960a = q32;
        }

        @vr2
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f33961b;
                this.f33961b = null;
                jt1.m53774m(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f33961b == null && !this.f33962b) {
                String readLine = this.f33960a.f33959a.readLine();
                this.f33961b = readLine;
                if (readLine == null) {
                    this.f33962b = true;
                }
            }
            return this.f33961b != null;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q32(@vr2 BufferedReader bufferedReader) {
        jt1.m53777p(bufferedReader, "reader");
        this.f33959a = bufferedReader;
    }

    @vr2
    public Iterator<String> iterator() {
        return new C6502a(this);
    }
}
