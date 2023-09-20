package com.onedelhi.secure;

import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.yw2;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\f\"\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0012\u00102\u001a\u000200*\u00020/2\u0006\u00101\u001a\u000200\u001a \u00106\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000104\u001a\n\u00107\u001a\u00020\u0018*\u00020$\u001a\u0010\u0010;\u001a\u00020:*\b\u0012\u0004\u0012\u00020908\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020908*\u00020:\u001a\u0012\u0010=\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010@\u001a\u00020?*\u00020>\u001a\u0015\u0010C\u001a\u00020\u0018*\u00020A2\u0006\u0010B\u001a\u00020\u0018H\u0004\u001a\u0015\u0010E\u001a\u00020\u0018*\u00020D2\u0006\u0010B\u001a\u00020\u0018H\u0004\u001a\u0015\u0010F\u001a\u00020\u0000*\u00020\u00182\u0006\u0010B\u001a\u00020\u0000H\u0004\u001a\u0012\u0010I\u001a\u00020\u0004*\u00020G2\u0006\u0010H\u001a\u00020\u0018\u001a\n\u0010J\u001a\u00020\u0018*\u00020/\u001a\u001a\u0010M\u001a\u00020\b*\u00020K2\u0006\u00103\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u001a\u0010O\u001a\u00020\b*\u00020K2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\n\u0010Q\u001a\u00020\u0006*\u00020P\u001a\u0012\u0010S\u001a\u00020\b*\u00020P2\u0006\u0010R\u001a\u00020/\u001a\u001a\u0010V\u001a\u00020\u00042\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040TH\bø\u0001\u0000\u001a\"\u0010W\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040TH\bø\u0001\u0000\u001a\u0012\u0010Y\u001a\u00020\u0018*\u00020X2\u0006\u0010C\u001a\u00020A\u001a\u0014\u0010Z\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010\\\u001a\u00020\u0000*\u00020[\u001a\u0012\u0010^\u001a\u00020\u0000*\u00020\u00062\u0006\u0010]\u001a\u00020\u0000\u001a\u0014\u0010_\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010]\u001a\u00020\u0018\u001a\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y*\b\u0012\u0004\u0012\u00028\u000008\u001a/\u0010b\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y2\u0012\u0010a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\bb\u0010c\u001a.\u0010e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010d\"\u0004\b\u0000\u0010S\"\u0004\b\u0001\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010d\u001a\n\u0010g\u001a\u00020\u0004*\u00020f\u001a\n\u0010h\u001a\u00020\u0004*\u00020P\u001a\n\u0010j\u001a\u00020\u0004*\u00020i\u001a\u0012\u0010n\u001a\u00020\b*\u00020k2\u0006\u0010m\u001a\u00020l\u001a\n\u0010o\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010p\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010q\u001a\u00020\u0004*\u00020+H\b\u001a\r\u0010r\u001a\u00020\u0004*\u00020+H\b\u001a\r\u0010s\u001a\u00020\u0004*\u00020+H\b\u001a3\u0010x\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010Y2\u0006\u0010t\u001a\u00020+2\f\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u2\u0006\u0010w\u001a\u00020\u0006¢\u0006\u0004\bx\u0010y\u001a'\u0010|\u001a\u00020\u0004\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000z2\u0006\u0010{\u001a\u00028\u0000H\u0000¢\u0006\u0004\b|\u0010}\u001a\r\u0010~\u001a\u00020\u0004*\u00020+H\b\u001a\r\u0010\u001a\u00020\u0004*\u00020+H\b\u001a'\u0010\u0001\u001a\u00030\u0001*\b0\u0001j\u0003`\u00012\u0013\u0010\u0001\u001a\u000e\u0012\n\u0012\b0\u0001j\u0003`\u000108\u001a@\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y*\t\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0003\b\u0001H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0001"}, d2 = {"", "arrayLength", "offset", "count", "Lcom/onedelhi/secure/un4;", "k", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "V", "", "other", "Ljava/util/Comparator;", "comparator", "I", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "w", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "b0", "value", "", "A", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "C", "E", "h0", "delimiters", "q", "", "delimiter", "p", "B", "h", "L", "format", "", "args", "v", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lcom/onedelhi/secure/to;", "Ljava/nio/charset/Charset;", "default", "Q", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "j", "O", "", "Lcom/onedelhi/secure/sk1;", "Lokhttp3/Headers;", "Y", "X", "i", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "e", "", "mask", "b", "", "c", "d", "Lcom/onedelhi/secure/so;", "medium", "l0", "S", "Lcom/onedelhi/secure/x04;", "timeUnit", "U", "timeout", "t", "Ljava/net/Socket;", "P", "source", "K", "Lkotlin/Function0;", "block", "y", "W", "Lcom/onedelhi/secure/no;", "T", "G", "Lokhttp3/Response;", "x", "defaultValue", "f0", "g0", "d0", "elements", "z", "([Ljava/lang/Object;)Ljava/util/List;", "", "e0", "Ljava/io/Closeable;", "l", "n", "Ljava/net/ServerSocket;", "m", "Lcom/onedelhi/secure/u21;", "Ljava/io/File;", "file", "J", "a0", "Z", "j0", "M", "N", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "R", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "g", "f", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "k0", "", "Lkotlin/Function1;", "Lcom/onedelhi/secure/wy0;", "predicate", "u", "okhttp"}, k = 2, mv = {1, 4, 0})
@uw1(name = "Util")
public final class nq4 {

    /* renamed from: a */
    public static final eh3 f32727a = new eh3("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: a */
    public static final yw2 f32728a;
    @rw1
    @vr2

    /* renamed from: a */
    public static final String f32729a;
    @rw1
    @vr2

    /* renamed from: a */
    public static final TimeZone f32730a;
    @rw1
    @vr2

    /* renamed from: a */
    public static final Headers f32731a = Headers.Companion.mo49239of(new String[0]);
    @rw1
    @vr2

    /* renamed from: a */
    public static final RequestBody f32732a;
    @rw1
    @vr2

    /* renamed from: a */
    public static final ResponseBody f32733a;
    @rw1

    /* renamed from: a */
    public static final boolean f32734a = false;
    @rw1
    @vr2

    /* renamed from: a */
    public static final byte[] f32735a;
    @vr2

    /* renamed from: b */
    public static final String f32736b = "okhttp/4.9.3";

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo38105d2 = {"<anonymous>", "Lokhttp3/EventListener;", "it", "Lokhttp3/Call;", "create"}, mo38106k = 3, mo38107mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nq4$a */
    public static final class C6222a implements EventListener.Factory {

        /* renamed from: a */
        public final /* synthetic */ EventListener f32737a;

        public C6222a(EventListener eventListener) {
            this.f32737a = eventListener;
        }

        @vr2
        public final EventListener create(@vr2 Call call) {
            jt1.m53777p(call, "it");
            return this.f32737a;
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo38105d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, mo38106k = 3, mo38107mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.nq4$b */
    public static final class C6223b implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f32738a;

        /* renamed from: a */
        public final /* synthetic */ boolean f32739a;

        public C6223b(String str, boolean z) {
            this.f32738a = str;
            this.f32739a = z;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f32738a);
            thread.setDaemon(this.f32739a);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f32735a = bArr;
        f32733a = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        f32732a = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        yw2.C7395a aVar = yw2.f38083a;
        C5301fr.C5302a aVar2 = C5301fr.f28633a;
        f32728a = aVar.mo48028d(aVar2.mo36294i("efbbbf"), aVar2.mo36294i("feff"), aVar2.mo36294i("fffe"), aVar2.mo36294i("0000ffff"), aVar2.mo36294i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        jt1.m53774m(timeZone);
        f32730a = timeZone;
        Class<OkHttpClient> cls = OkHttpClient.class;
        String name = OkHttpClient.class.getName();
        jt1.m53776o(name, "OkHttpClient::class.java.name");
        f32729a = u54.m66643i4(u54.m66625c4(name, "okhttp3."), "Client");
    }

    /* renamed from: A */
    public static final int m58663A(@vr2 String[] strArr, @vr2 String str, @vr2 Comparator<String> comparator) {
        jt1.m53777p(strArr, "$this$indexOf");
        jt1.m53777p(str, "value");
        jt1.m53777p(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public static final int m58664B(@vr2 String str) {
        jt1.m53777p(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (jt1.m53781t(charAt, 31) <= 0 || jt1.m53781t(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: C */
    public static final int m58665C(@vr2 String str, int i, int i2) {
        jt1.m53777p(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: D */
    public static /* synthetic */ int m58666D(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m58665C(str, i, i2);
    }

    /* renamed from: E */
    public static final int m58667E(@vr2 String str, int i, int i2) {
        jt1.m53777p(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: F */
    public static /* synthetic */ int m58668F(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m58667E(str, i, i2);
    }

    /* renamed from: G */
    public static final int m58669G(@vr2 String str, int i) {
        jt1.m53777p(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* renamed from: H */
    public static /* synthetic */ int m58670H(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m58669G(str, i);
    }

    @vr2
    /* renamed from: I */
    public static final String[] m58671I(@vr2 String[] strArr, @vr2 String[] strArr2, @vr2 Comparator<? super String> comparator) {
        jt1.m53777p(strArr, "$this$intersect");
        jt1.m53777p(strArr2, "other");
        jt1.m53777p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = com.onedelhi.secure.un4.f36206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, (java.lang.Throwable) null);
        r3.mo45368b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m58672J(@com.onedelhi.secure.vr2 com.onedelhi.secure.u21 r3, @com.onedelhi.secure.vr2 java.io.File r4) {
        /*
            java.lang.String r0 = "$this$isCivilized"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "file"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            com.onedelhi.secure.oz3 r0 = r3.mo45371e(r4)
            r1 = 0
            r3.mo45368b(r4)     // Catch:{ IOException -> 0x0019 }
            r3 = 1
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0017 }
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            r3.mo45368b(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nq4.m58672J(com.onedelhi.secure.u21, java.io.File):boolean");
    }

    /* renamed from: K */
    public static final boolean m58673K(@vr2 Socket socket, @vr2 C6893to toVar) {
        int soTimeout;
        jt1.m53777p(socket, "$this$isHealthy");
        jt1.m53777p(toVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !toVar.mo31685f2();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: L */
    public static final boolean m58674L(@vr2 String str) {
        jt1.m53777p(str, "name");
        return t54.m65410K1(str, "Authorization", true) || t54.m65410K1(str, "Cookie", true) || t54.m65410K1(str, "Proxy-Authorization", true) || t54.m65410K1(str, "Set-Cookie", true);
    }

    /* renamed from: M */
    public static final void m58675M(@vr2 Object obj) {
        jt1.m53777p(obj, "$this$notify");
        obj.notify();
    }

    /* renamed from: N */
    public static final void m58676N(@vr2 Object obj) {
        jt1.m53777p(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    /* renamed from: O */
    public static final int m58677O(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    @vr2
    /* renamed from: P */
    public static final String m58678P(@vr2 Socket socket) {
        jt1.m53777p(socket, "$this$peerName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        jt1.m53776o(hostName, "address.hostName");
        return hostName;
    }

    @vr2
    /* renamed from: Q */
    public static final Charset m58679Q(@vr2 C6893to toVar, @vr2 Charset charset) throws IOException {
        Charset charset2;
        String str;
        jt1.m53777p(toVar, "$this$readBomAsCharset");
        jt1.m53777p(charset, "default");
        int m0 = toVar.mo31692m0(f32728a);
        if (m0 == -1) {
            return charset;
        }
        if (m0 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (m0 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (m0 == 2) {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        } else if (m0 == 3) {
            return C5604hx.f29887a.mo37600b();
        } else {
            if (m0 == 4) {
                return C5604hx.f29887a.mo37601c();
            }
            throw new AssertionError();
        }
        jt1.m53776o(charset2, str);
        return charset2;
    }

    @ss2
    /* renamed from: R */
    public static final <T> T m58680R(@vr2 Object obj, @vr2 Class<T> cls, @vr2 String str) {
        Object R;
        Class<Object> cls2 = Object.class;
        jt1.m53777p(obj, "instance");
        jt1.m53777p(cls, "fieldType");
        jt1.m53777p(str, "fieldName");
        Class cls3 = obj.getClass();
        while (!jt1.m53768g(cls3, cls2)) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                jt1.m53776o(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
                jt1.m53776o(cls3, "c.superclass");
            }
        }
        if (!(!jt1.m53768g(str, "delegate")) || (R = m58680R(obj, cls2, "delegate")) == null) {
            return null;
        }
        return m58680R(R, cls, str);
    }

    /* renamed from: S */
    public static final int m58681S(@vr2 C6893to toVar) throws IOException {
        jt1.m53777p(toVar, "$this$readMedium");
        return m58691b(toVar.readByte(), 255) | (m58691b(toVar.readByte(), 255) << 16) | (m58691b(toVar.readByte(), 255) << 8);
    }

    /* renamed from: T */
    public static final int m58682T(@vr2 C6205no noVar, byte b) {
        jt1.m53777p(noVar, "$this$skipAll");
        int i = 0;
        while (!noVar.mo31685f2() && noVar.mo41249Z(0) == b) {
            i++;
            noVar.readByte();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.timeout().mo40554a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.timeout().mo40558e(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r12;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m58683U(@com.onedelhi.secure.vr2 com.onedelhi.secure.x04 r11, int r12, @com.onedelhi.secure.vr2 java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            com.onedelhi.secure.jt1.m53777p(r11, r0)
            java.lang.String r0 = "timeUnit"
            com.onedelhi.secure.jt1.m53777p(r13, r0)
            long r0 = java.lang.System.nanoTime()
            com.onedelhi.secure.me4 r2 = r11.timeout()
            boolean r2 = r2.mo40559f()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            com.onedelhi.secure.me4 r2 = r11.timeout()
            long r5 = r2.mo40557d()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            com.onedelhi.secure.me4 r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo40558e(r12)
            com.onedelhi.secure.no r12 = new com.onedelhi.secure.no     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.mo41255c()     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            com.onedelhi.secure.me4 r11 = r11.timeout()
            r11.mo40554a()
            goto L_0x007d
        L_0x005b:
            com.onedelhi.secure.me4 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.mo40558e(r0)
            goto L_0x007d
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            com.onedelhi.secure.me4 r11 = r11.timeout()
            if (r13 != 0) goto L_0x0071
            r11.mo40554a()
            goto L_0x0075
        L_0x0071:
            long r0 = r0 + r5
            r11.mo40558e(r0)
        L_0x0075:
            throw r12
        L_0x0076:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x007d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nq4.m58683U(com.onedelhi.secure.x04, int, java.util.concurrent.TimeUnit):boolean");
    }

    @vr2
    /* renamed from: V */
    public static final ThreadFactory m58684V(@vr2 String str, boolean z) {
        jt1.m53777p(str, "name");
        return new C6223b(str, z);
    }

    /* renamed from: W */
    public static final void m58685W(@vr2 String str, @vr2 cc1<un4> cc1) {
        jt1.m53777p(str, "name");
        jt1.m53777p(cc1, "block");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            cc1.invoke();
        } finally {
            uq1.m67403d(1);
            currentThread.setName(name);
            uq1.m67402c(1);
        }
    }

    @vr2
    /* renamed from: X */
    public static final List<sk1> m58686X(@vr2 Headers headers) {
        jt1.m53777p(headers, "$this$toHeaderList");
        is1 z1 = df3.m45236z1(0, headers.size());
        ArrayList arrayList = new ArrayList(t00.m65073Z(z1, 10));
        Iterator it = z1.iterator();
        while (it.hasNext()) {
            int b = ((ds1) it).mo19249b();
            arrayList.add(new sk1(headers.name(b), headers.value(b)));
        }
        return arrayList;
    }

    @vr2
    /* renamed from: Y */
    public static final Headers m58687Y(@vr2 List<sk1> list) {
        jt1.m53777p(list, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (sk1 next : list) {
            builder.addLenient$okhttp(next.mo44396a().mo36280u0(), next.mo44397b().mo36280u0());
        }
        return builder.build();
    }

    @vr2
    /* renamed from: Z */
    public static final String m58688Z(int i) {
        String hexString = Integer.toHexString(i);
        jt1.m53776o(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    /* renamed from: a */
    public static final <E> void m58689a(@vr2 List<E> list, E e) {
        jt1.m53777p(list, "$this$addIfAbsent");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    @vr2
    /* renamed from: a0 */
    public static final String m58690a0(long j) {
        String hexString = Long.toHexString(j);
        jt1.m53776o(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    /* renamed from: b */
    public static final int m58691b(byte b, int i) {
        return b & i;
    }

    @vr2
    /* renamed from: b0 */
    public static final String m58692b0(@vr2 HttpUrl httpUrl, boolean z) {
        String str;
        jt1.m53777p(httpUrl, "$this$toHostHeader");
        if (u54.m66602V2(httpUrl.host(), ar4.f25981a, false, 2, (Object) null)) {
            str = '[' + httpUrl.host() + ']';
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + ':' + httpUrl.port();
    }

    /* renamed from: c */
    public static final int m58693c(short s, int i) {
        return s & i;
    }

    /* renamed from: c0 */
    public static /* synthetic */ String m58694c0(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m58692b0(httpUrl, z);
    }

    /* renamed from: d */
    public static final long m58695d(int i, long j) {
        return ((long) i) & j;
    }

    @vr2
    /* renamed from: d0 */
    public static final <T> List<T> m58696d0(@vr2 List<? extends T> list) {
        jt1.m53777p(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(a10.m35784T5(list));
        jt1.m53776o(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @vr2
    /* renamed from: e */
    public static final EventListener.Factory m58697e(@vr2 EventListener eventListener) {
        jt1.m53777p(eventListener, "$this$asFactory");
        return new C6222a(eventListener);
    }

    @vr2
    /* renamed from: e0 */
    public static final <K, V> Map<K, V> m58698e0(@vr2 Map<K, ? extends V> map) {
        jt1.m53777p(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return id2.m52156z();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        jt1.m53776o(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    /* renamed from: f */
    public static final void m58699f(@vr2 Object obj) {
        jt1.m53777p(obj, "$this$assertThreadDoesntHoldLock");
        if (f32734a && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: f0 */
    public static final long m58700f0(@vr2 String str, long j) {
        jt1.m53777p(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: g */
    public static final void m58701g(@vr2 Object obj) {
        jt1.m53777p(obj, "$this$assertThreadHoldsLock");
        if (f32734a && !Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: g0 */
    public static final int m58702g0(@ss2 String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: h */
    public static final boolean m58703h(@vr2 String str) {
        jt1.m53777p(str, "$this$canParseAsIpAddress");
        return f32727a.mo35379k(str);
    }

    @vr2
    /* renamed from: h0 */
    public static final String m58704h0(@vr2 String str, int i, int i2) {
        jt1.m53777p(str, "$this$trimSubstring");
        int C = m58665C(str, i, i2);
        String substring = str.substring(C, m58667E(str, C, i2));
        jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: i */
    public static final boolean m58705i(@vr2 HttpUrl httpUrl, @vr2 HttpUrl httpUrl2) {
        jt1.m53777p(httpUrl, "$this$canReuseConnectionFor");
        jt1.m53777p(httpUrl2, "other");
        return jt1.m53768g(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && jt1.m53768g(httpUrl.scheme(), httpUrl2.scheme());
    }

    /* renamed from: i0 */
    public static /* synthetic */ String m58706i0(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m58704h0(str, i, i2);
    }

    /* renamed from: j */
    public static final int m58707j(@vr2 String str, long j, @ss2 TimeUnit timeUnit) {
        jt1.m53777p(str, "name");
        boolean z = true;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    /* renamed from: j0 */
    public static final void m58708j0(@vr2 Object obj) {
        jt1.m53777p(obj, "$this$wait");
        obj.wait();
    }

    /* renamed from: k */
    public static final void m58709k(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @vr2
    /* renamed from: k0 */
    public static final Throwable m58710k0(@vr2 Exception exc, @vr2 List<? extends Exception> list) {
        jt1.m53777p(exc, "$this$withSuppressed");
        jt1.m53777p(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception a : list) {
            pw0.m61687a(exc, a);
        }
        return exc;
    }

    /* renamed from: l */
    public static final void m58711l(@vr2 Closeable closeable) {
        jt1.m53777p(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: l0 */
    public static final void m58712l0(@vr2 C6785so soVar, int i) throws IOException {
        jt1.m53777p(soVar, "$this$writeMedium");
        soVar.mo41230L0((i >>> 16) & 255);
        soVar.mo41230L0((i >>> 8) & 255);
        soVar.mo41230L0(i & 255);
    }

    /* renamed from: m */
    public static final void m58713m(@vr2 ServerSocket serverSocket) {
        jt1.m53777p(serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static final void m58714n(@vr2 Socket socket) {
        jt1.m53777p(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!jt1.m53768g(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    @vr2
    /* renamed from: o */
    public static final String[] m58715o(@vr2 String[] strArr, @vr2 String str) {
        jt1.m53777p(strArr, "$this$concat");
        jt1.m53777p(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C4478ab.m36866Xe(strArr2)] = str;
        return strArr2;
    }

    /* renamed from: p */
    public static final int m58716p(@vr2 String str, char c, int i, int i2) {
        jt1.m53777p(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: q */
    public static final int m58717q(@vr2 String str, @vr2 String str2, int i, int i2) {
        jt1.m53777p(str, "$this$delimiterOffset");
        jt1.m53777p(str2, "delimiters");
        while (i < i2) {
            if (u54.m66598U2(str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: r */
    public static /* synthetic */ int m58718r(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m58716p(str, c, i, i2);
    }

    /* renamed from: s */
    public static /* synthetic */ int m58719s(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m58717q(str, str2, i, i2);
    }

    /* renamed from: t */
    public static final boolean m58720t(@vr2 x04 x04, int i, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(x04, "$this$discard");
        jt1.m53777p(timeUnit, "timeUnit");
        try {
            return m58683U(x04, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @vr2
    /* renamed from: u */
    public static final <T> List<T> m58721u(@vr2 Iterable<? extends T> iterable, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(iterable, "$this$filterList");
        jt1.m53777p(ec1, "predicate");
        List<T> F = s00.m64037F();
        for (Object next : iterable) {
            if (ec1.mo17094X(next).booleanValue()) {
                if (F.isEmpty()) {
                    F = new ArrayList<>();
                }
                lj4.m55693g(F).add(next);
            }
        }
        return F;
    }

    @vr2
    /* renamed from: v */
    public static final String m58722v(@vr2 String str, @vr2 Object... objArr) {
        jt1.m53777p(str, "format");
        jt1.m53777p(objArr, "args");
        x44 x44 = x44.f37329a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        jt1.m53776o(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: w */
    public static final boolean m58723w(@vr2 String[] strArr, @ss2 String[] strArr2, @vr2 Comparator<? super String> comparator) {
        jt1.m53777p(strArr, "$this$hasIntersection");
        jt1.m53777p(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: x */
    public static final long m58724x(@vr2 Response response) {
        jt1.m53777p(response, "$this$headersContentLength");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return m58700f0(str, -1);
        }
        return -1;
    }

    /* renamed from: y */
    public static final void m58725y(@vr2 cc1<un4> cc1) {
        jt1.m53777p(cc1, "block");
        try {
            cc1.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @vr2
    /* renamed from: z */
    public static final <T> List<T> m58726z(@vr2 T... tArr) {
        jt1.m53777p(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(s00.m64044M(Arrays.copyOf(objArr, objArr.length)));
        jt1.m53776o(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }
}
