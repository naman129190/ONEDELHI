package com.onedelhi.secure;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/ig3;", "Lokhttp3/ResponseBody;", "", "contentLength", "Lokhttp3/MediaType;", "contentType", "Lcom/onedelhi/secure/to;", "source", "", "contentTypeString", "<init>", "(Ljava/lang/String;JLcom/onedelhi/secure/to;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ig3 extends ResponseBody {

    /* renamed from: a */
    public final C6893to f30327a;

    /* renamed from: b */
    public final long f30328b;

    /* renamed from: b */
    public final String f30329b;

    public ig3(@ss2 String str, long j, @vr2 C6893to toVar) {
        jt1.m53777p(toVar, "source");
        this.f30329b = str;
        this.f30328b = j;
        this.f30327a = toVar;
    }

    public long contentLength() {
        return this.f30328b;
    }

    @ss2
    public MediaType contentType() {
        String str = this.f30329b;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @vr2
    public C6893to source() {
        return this.f30327a;
    }
}
