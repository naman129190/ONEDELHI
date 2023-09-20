package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0016\u001a$\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a$\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a$\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a$\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\n\u0010\r\u001a\u00020\f\"\u00020\u0002\u001a\u0016\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\n\u0010\r\u001a\u00020\f\"\u00020\u0002\u001a\u0016\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\n\u0010\r\u001a\u00020\f\"\u00020\u0002\u001a\u0016\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\n\u0010\r\u001a\u00020\f\"\u00020\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\n\u0010\r\u001a\u00020\f\"\u00020\u0002\u001a\u0016\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\n\u0010\r\u001a\u00020\f\"\u00020\u0002\u001a\n\u0010\u0014\u001a\u00020\u0000*\u00020\u0000\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0006H\b\u001a\n\u0010\u0016\u001a\u00020\u0000*\u00020\u0000\u001a\r\u0010\u0017\u001a\u00020\u0006*\u00020\u0006H\b\u001a\n\u0010\u0018\u001a\u00020\u0000*\u00020\u0000\u001a\r\u0010\u0019\u001a\u00020\u0006*\u00020\u0006H\b\u001a\u001c\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u001a\u001c\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u001a\u001c\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u001a\u001c\u0010 \u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u001a \u0010!\u001a\u00020\u0003*\u0004\u0018\u00010\u0000H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010\"\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010#\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010$\u001a\u00020\u0003*\u00020\u0000H\b\u001a \u0010%\u001a\u00020\u0003*\u0004\u0018\u00010\u0000H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010'\u001a\u00020&*\u00020\u0000H\u0002\u001a\u000f\u0010(\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\b\u001a9\u0010-\u001a\u00028\u0001\"\f\b\u0000\u0010)*\u00020\u0000*\u00028\u0001\"\u0004\b\u0001\u0010**\u00028\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+H\bø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a9\u0010/\u001a\u00028\u0001\"\f\b\u0000\u0010)*\u00020\u0000*\u00028\u0001\"\u0004\b\u0001\u0010**\u00028\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+H\bø\u0001\u0000¢\u0006\u0004\b/\u0010.\u001a\u0012\u00101\u001a\u00020\u0003*\u00020\u00002\u0006\u00100\u001a\u00020\u001a\u001a\u0012\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00103\u001a\u000202\u001a\u0012\u00105\u001a\u00020\u0000*\u00020\u00002\u0006\u00103\u001a\u000202\u001a\u001d\u00108\u001a\u00020\u0000*\u00020\u00062\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001aH\b\u001a\u001f\u0010;\u001a\u00020\u0006*\u00020\u00002\u0006\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u00020\u001aH\b\u001a\u0012\u0010<\u001a\u00020\u0006*\u00020\u00002\u0006\u00103\u001a\u000202\u001a\u001c\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001c\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001c\u0010A\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001c\u0010B\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001c\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001c\u0010D\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001c\u0010E\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001c\u0010F\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\"\u0010H\u001a\u00020\u0000*\u00020\u00002\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u0000\u001a%\u0010I\u001a\u00020\u0006*\u00020\u00062\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u0000H\b\u001a\u001a\u0010J\u001a\u00020\u0000*\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u0010G\u001a\u00020\u0000\u001a\u001d\u0010K\u001a\u00020\u0006*\u00020\u00062\u0006\u00103\u001a\u0002022\u0006\u0010G\u001a\u00020\u0000H\b\u001a\u001a\u0010L\u001a\u00020\u0000*\u00020\u00002\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001a\u001a\u001d\u0010M\u001a\u00020\u0006*\u00020\u00062\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001aH\b\u001a\u0012\u0010N\u001a\u00020\u0000*\u00020\u00002\u0006\u00103\u001a\u000202\u001a\u0015\u0010O\u001a\u00020\u0006*\u00020\u00062\u0006\u00103\u001a\u000202H\b\u001a\u0012\u0010Q\u001a\u00020\u0000*\u00020\u00002\u0006\u0010P\u001a\u00020\u0000\u001a\u0012\u0010R\u001a\u00020\u0006*\u00020\u00062\u0006\u0010P\u001a\u00020\u0000\u001a\u0012\u0010T\u001a\u00020\u0000*\u00020\u00002\u0006\u0010S\u001a\u00020\u0000\u001a\u0012\u0010U\u001a\u00020\u0006*\u00020\u00062\u0006\u0010S\u001a\u00020\u0000\u001a\u001a\u0010V\u001a\u00020\u0000*\u00020\u00002\u0006\u0010P\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0000\u001a\u001a\u0010W\u001a\u00020\u0006*\u00020\u00062\u0006\u0010P\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0000\u001a\u0012\u0010X\u001a\u00020\u0000*\u00020\u00002\u0006\u0010=\u001a\u00020\u0000\u001a\u0012\u0010Y\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u0000\u001a$\u0010Z\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a$\u0010[\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a$\u0010\\\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a$\u0010]\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a$\u0010^\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a$\u0010_\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a$\u0010`\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a$\u0010a\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0006\u001a\u001d\u0010d\u001a\u00020\u0006*\u00020\u00002\u0006\u0010c\u001a\u00020b2\u0006\u0010G\u001a\u00020\u0006H\b\u001a.\u0010g\u001a\u00020\u0006*\u00020\u00002\u0006\u0010c\u001a\u00020b2\u0014\b\b\u0010f\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00000\u0001H\bø\u0001\u0000\u001a\u001d\u0010h\u001a\u00020\u0006*\u00020\u00002\u0006\u0010c\u001a\u00020b2\u0006\u0010G\u001a\u00020\u0006H\b\u001a+\u0010i\u001a\u00020\u0006*\u00020\u00062\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\bi\u0010j\u001a+\u0010k\u001a\u00020\u0006*\u00020\u00062\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001H\bø\u0001\u0000¢\u0006\u0004\bk\u0010j\u001a\u0015\u0010l\u001a\u00020\u0003*\u00020\u00002\u0006\u0010c\u001a\u00020bH\f\u001a4\u0010q\u001a\u00020\u0003*\u00020\u00002\u0006\u0010m\u001a\u00020\u001a2\u0006\u0010n\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010p\u001a\u00020\u0003H\u0000\u001a\u001c\u0010s\u001a\u00020\u0003*\u00020\u00002\u0006\u0010r\u001a\u00020\u00022\b\b\u0002\u0010p\u001a\u00020\u0003\u001a\u001c\u0010t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010r\u001a\u00020\u00022\b\b\u0002\u0010p\u001a\u00020\u0003\u001a\u001c\u0010u\u001a\u00020\u0003*\u00020\u00002\u0006\u0010P\u001a\u00020\u00002\b\b\u0002\u0010p\u001a\u00020\u0003\u001a$\u0010v\u001a\u00020\u0003*\u00020\u00002\u0006\u0010P\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a\u001c\u0010w\u001a\u00020\u0003*\u00020\u00002\u0006\u0010S\u001a\u00020\u00002\b\b\u0002\u0010p\u001a\u00020\u0003\u001a\u001c\u0010x\u001a\u00020\u0006*\u00020\u00002\u0006\u0010n\u001a\u00020\u00002\b\b\u0002\u0010p\u001a\u00020\u0003\u001a\u001c\u0010y\u001a\u00020\u0006*\u00020\u00002\u0006\u0010n\u001a\u00020\u00002\b\b\u0002\u0010p\u001a\u00020\u0003\u001a&\u0010z\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a&\u0010{\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a=\u0010}\u001a\u00020\u001a*\u00020\u00002\u0006\u0010n\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010p\u001a\u00020\u00032\b\b\u0002\u0010|\u001a\u00020\u0003H\u0002¢\u0006\u0004\b}\u0010~\u001aL\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001*\u00020\u00002\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000602\u0006\u00109\u001a\u00020\u001a2\u0006\u0010p\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u0003H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a=\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001*\u00020\u00002\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000602\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a=\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001*\u00020\u00002\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000602\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a.\u0010\u0001\u001a\u00020\u001a*\u00020\u00002\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000602\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a.\u0010\u0001\u001a\u00020\u001a*\u00020\u00002\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000602\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a'\u0010\u0001\u001a\u00020\u001a*\u00020\u00002\u0006\u0010r\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a(\u0010\u0001\u001a\u00020\u001a*\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a'\u0010\u0001\u001a\u00020\u001a*\u00020\u00002\u0006\u0010r\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a(\u0010\u0001\u001a\u00020\u001a*\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u0003\u001a \u0010\u0001\u001a\u00020\u0003*\u00020\u00002\u0006\u0010n\u001a\u00020\u00002\b\b\u0002\u0010p\u001a\u00020\u0003H\u0002\u001a \u0010\u0001\u001a\u00020\u0003*\u00020\u00002\u0006\u0010r\u001a\u00020\u00022\b\b\u0002\u0010p\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0001\u001a\u00020\u0003*\u00020\u00002\u0006\u0010c\u001a\u00020bH\n\u001aE\u0010\u0001\u001a\t\u0012\u0004\u0012\u0002020\u0001*\u00020\u00002\u0007\u0010\u0001\u001a\u00020\f2\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u00032\t\b\u0002\u0010\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001aN\u0010\u0001\u001a\t\u0012\u0004\u0012\u0002020\u0001*\u00020\u00002\u0010\u0010\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00060\u00012\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010p\u001a\u00020\u00032\t\b\u0002\u0010\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u001aH\u0000\u001aF\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00002\u0014\u0010\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\"\u00020\u00062\b\b\u0002\u0010p\u001a\u00020\u00032\t\b\u0002\u0010\u0001\u001a\u00020\u001a¢\u0006\u0006\b\u0001\u0010\u0001\u001aF\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00002\u0014\u0010\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\"\u00020\u00062\b\b\u0002\u0010p\u001a\u00020\u00032\t\b\u0002\u0010\u0001\u001a\u00020\u001a¢\u0006\u0006\b\u0001\u0010\u0001\u001a4\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00002\u000b\u0010\u0001\u001a\u00020\f\"\u00020\u00022\b\b\u0002\u0010p\u001a\u00020\u00032\t\b\u0002\u0010\u0001\u001a\u00020\u001a\u001a4\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00002\u000b\u0010\u0001\u001a\u00020\f\"\u00020\u00022\b\b\u0002\u0010p\u001a\u00020\u00032\t\b\u0002\u0010\u0001\u001a\u00020\u001a\u001a6\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00002\u0006\u0010=\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u00032\u0007\u0010\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001a(\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00002\u0006\u0010c\u001a\u00020b2\t\b\u0002\u0010\u0001\u001a\u00020\u001aH\b\u001a(\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00002\u0006\u0010c\u001a\u00020b2\t\b\u0002\u0010\u0001\u001a\u00020\u001aH\b\u001a\u0012\u0010¥\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0000\u001a\u0012\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0000\u001a\u0019\u0010§\u0001\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010n\u001a\u0004\u0018\u00010\u0000H\u0000\u001a\u0019\u0010¨\u0001\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010n\u001a\u0004\u0018\u00010\u0000H\u0000\u001a\r\u0010©\u0001\u001a\u00020\u0003*\u00020\u0006H\u0007\u001a\u0018\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003*\u00020\u0006H\u0007¢\u0006\u0006\bª\u0001\u0010«\u0001\"\u0018\u0010®\u0001\u001a\u000202*\u00020\u00008F¢\u0006\b\u001a\u0006\b¬\u0001\u0010­\u0001\"\u0018\u0010±\u0001\u001a\u00020\u001a*\u00020\u00008F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006²\u0001"}, d2 = {"", "Lkotlin/Function1;", "", "", "predicate", "F5", "", "I5", "R5", "U5", "L5", "O5", "", "chars", "G5", "J5", "S5", "V5", "M5", "P5", "E5", "H5", "Q5", "T5", "K5", "N5", "", "length", "padChar", "S3", "T3", "O3", "P3", "A3", "w3", "y3", "x3", "z3", "Lcom/onedelhi/secure/uw;", "B3", "N3", "C", "R", "Lkotlin/Function0;", "defaultValue", "l3", "(Ljava/lang/CharSequence;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "k3", "index", "j3", "Lcom/onedelhi/secure/is1;", "range", "k5", "g5", "start", "end", "h5", "startIndex", "endIndex", "i5", "j5", "delimiter", "missingDelimiterValue", "u5", "v5", "m5", "n5", "y5", "z5", "q5", "r5", "replacement", "I4", "K4", "J4", "L4", "d4", "f4", "e4", "g4", "prefix", "b4", "c4", "suffix", "h4", "i4", "k4", "m4", "j4", "l4", "x4", "y4", "p4", "q4", "u4", "t4", "B4", "C4", "Lcom/onedelhi/secure/eh3;", "regex", "o4", "Lcom/onedelhi/secure/ce2;", "transform", "n4", "F4", "G4", "(Ljava/lang/String;Lcom/onedelhi/secure/ec1;)Ljava/lang/String;", "H4", "M3", "thisOffset", "other", "otherOffset", "ignoreCase", "a4", "char", "a5", "Y2", "c5", "b5", "Z2", "N2", "P2", "t3", "H3", "last", "o3", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lcom/onedelhi/secure/ey2;", "d3", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lcom/onedelhi/secure/ey2;", "c3", "f3", "s3", "G3", "m3", "string", "n3", "C3", "D3", "T2", "R2", "S2", "delimiters", "limit", "Lcom/onedelhi/secure/zt3;", "W3", "(Ljava/lang/CharSequence;[CIZI)Lcom/onedelhi/secure/zt3;", "", "X3", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/un4;", "M4", "W4", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lcom/onedelhi/secure/zt3;", "", "P4", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "V4", "O4", "Q4", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "N4", "U4", "K3", "L3", "W2", "X2", "C5", "D5", "(Ljava/lang/String;)Ljava/lang/Boolean;", "h3", "(Ljava/lang/CharSequence;)Lcom/onedelhi/secure/is1;", "indices", "i3", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class u54 extends t54 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"com/onedelhi/secure/u54$a", "Lcom/onedelhi/secure/uw;", "", "b", "", "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.u54$a */
    public static final class C6931a extends C6980uw {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f35977a;

        /* renamed from: n */
        public int f35978n;

        public C6931a(CharSequence charSequence) {
            this.f35977a = charSequence;
        }

        /* renamed from: b */
        public char mo32266b() {
            CharSequence charSequence = this.f35977a;
            int i = this.f35978n;
            this.f35978n = i + 1;
            return charSequence.charAt(i);
        }

        public boolean hasNext() {
            return this.f35978n < this.f35977a.length();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lcom/onedelhi/secure/ey2;", "a", "(Ljava/lang/CharSequence;I)Lcom/onedelhi/secure/ey2;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.u54$b */
    public static final class C6932b extends d12 implements sc1<CharSequence, Integer, ey2<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        public final /* synthetic */ char[] f35979a;

        /* renamed from: b */
        public final /* synthetic */ boolean f35980b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6932b(char[] cArr, boolean z) {
            super(2);
            this.f35979a = cArr;
            this.f35980b = z;
        }

        @ss2
        /* renamed from: a */
        public final ey2<Integer, Integer> mo45424a(@vr2 CharSequence charSequence, int i) {
            jt1.m53777p(charSequence, "$this$$receiver");
            int t3 = u54.m66675t3(charSequence, this.f35979a, i, this.f35980b);
            if (t3 < 0) {
                return null;
            }
            return yi4.m71797a(Integer.valueOf(t3), 1);
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ Object mo21054h0(Object obj, Object obj2) {
            return mo45424a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lcom/onedelhi/secure/ey2;", "a", "(Ljava/lang/CharSequence;I)Lcom/onedelhi/secure/ey2;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.u54$c */
    public static final class C6933c extends d12 implements sc1<CharSequence, Integer, ey2<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        public final /* synthetic */ List<String> f35981a;

        /* renamed from: b */
        public final /* synthetic */ boolean f35982b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6933c(List<String> list, boolean z) {
            super(2);
            this.f35981a = list;
            this.f35982b = z;
        }

        @ss2
        /* renamed from: a */
        public final ey2<Integer, Integer> mo45425a(@vr2 CharSequence charSequence, int i) {
            jt1.m53777p(charSequence, "$this$$receiver");
            ey2 M2 = u54.m66627d3(charSequence, this.f35981a, i, this.f35982b, false);
            if (M2 != null) {
                return yi4.m71797a(M2.mo35668e(), Integer.valueOf(((String) M2.mo35670f()).length()));
            }
            return null;
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ Object mo21054h0(Object obj, Object obj2) {
            return mo45425a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/onedelhi/secure/is1;", "it", "", "a", "(Lcom/onedelhi/secure/is1;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.u54$d */
    public static final class C6934d extends d12 implements ec1<is1, String> {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f35983a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6934d(CharSequence charSequence) {
            super(1);
            this.f35983a = charSequence;
        }

        @vr2
        /* renamed from: a */
        public final String mo17094X(@vr2 is1 is1) {
            jt1.m53777p(is1, "it");
            return u54.m66647j5(this.f35983a, is1);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/onedelhi/secure/is1;", "it", "", "a", "(Lcom/onedelhi/secure/is1;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.u54$e */
    public static final class C6935e extends d12 implements ec1<is1, String> {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f35984a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6935e(CharSequence charSequence) {
            super(1);
            this.f35984a = charSequence;
        }

        @vr2
        /* renamed from: a */
        public final String mo17094X(@vr2 is1 is1) {
            jt1.m53777p(is1, "it");
            return u54.m66647j5(this.f35984a, is1);
        }
    }

    @xq1
    /* renamed from: A3 */
    public static final boolean m66530A3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: A4 */
    public static /* synthetic */ String m66531A4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m66691y4(str, str2, str3, str4);
    }

    /* renamed from: A5 */
    public static /* synthetic */ String m66532A5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m66692y5(str, c, str2);
    }

    @vr2
    /* renamed from: B3 */
    public static final C6980uw m66533B3(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return new C6931a(charSequence);
    }

    @vr2
    /* renamed from: B4 */
    public static final String m66534B4(@vr2 String str, char c, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "replacement");
        jt1.m53777p(str3, "missingDelimiterValue");
        int E3 = m66542E3(str, c, 0, false, 6, (Object) null);
        return E3 == -1 ? str3 : m66555I4(str, 0, E3, str2).toString();
    }

    /* renamed from: B5 */
    public static /* synthetic */ String m66535B5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m66695z5(str, str2, str3);
    }

    /* renamed from: C3 */
    public static final int m66536C3(@vr2 CharSequence charSequence, char c, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m66551H3(charSequence, new char[]{c}, i, z);
    }

    @vr2
    /* renamed from: C4 */
    public static final String m66537C4(@vr2 String str, @vr2 String str2, @vr2 String str3, @vr2 String str4) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "replacement");
        jt1.m53777p(str4, "missingDelimiterValue");
        int F3 = m66545F3(str, str2, 0, false, 6, (Object) null);
        return F3 == -1 ? str4 : m66555I4(str, 0, F3, str3).toString();
    }

    @gz3(version = "1.5")
    /* renamed from: C5 */
    public static final boolean m66538C5(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        if (jt1.m53768g(str, h60.f29487F)) {
            return true;
        }
        if (jt1.m53768g(str, h60.f29488G)) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    /* renamed from: D3 */
    public static final int m66539D3(@vr2 CharSequence charSequence, @vr2 String str, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(str, ak4.C1709b.f9167e);
        return (z || !(charSequence instanceof String)) ? m66660o3(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: D4 */
    public static /* synthetic */ String m66540D4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m66534B4(str, c, str2, str3);
    }

    @gz3(version = "1.5")
    @ss2
    /* renamed from: D5 */
    public static final Boolean m66541D5(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        if (jt1.m53768g(str, h60.f29487F)) {
            return Boolean.TRUE;
        }
        if (jt1.m53768g(str, h60.f29488G)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: E3 */
    public static /* synthetic */ int m66542E3(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m66642i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66536C3(charSequence, c, i, z);
    }

    /* renamed from: E4 */
    public static /* synthetic */ String m66543E4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m66537C4(str, str2, str3, str4);
    }

    @vr2
    /* renamed from: E5 */
    public static final CharSequence m66544E5(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean r = C5327fx.m48556r(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!r) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!r) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: F3 */
    public static /* synthetic */ int m66545F3(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m66642i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66539D3(charSequence, str, i, z);
    }

    @xq1
    /* renamed from: F4 */
    public static final String m66546F4(CharSequence charSequence, eh3 eh3, String str) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        jt1.m53777p(str, "replacement");
        return eh3.mo35383o(charSequence, str);
    }

    @vr2
    /* renamed from: F5 */
    public static final CharSequence m66547F5(@vr2 CharSequence charSequence, @vr2 ec1<? super Character, Boolean> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(ec1, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = ec1.mo17094X(Character.valueOf(charSequence.charAt(!z ? i : length))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: G3 */
    public static final int m66548G3(@vr2 CharSequence charSequence, @vr2 Collection<String> collection, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(collection, "strings");
        ey2<Integer, String> d3 = m66627d3(charSequence, collection, i, z, true);
        if (d3 != null) {
            return d3.mo35668e().intValue();
        }
        return -1;
    }

    @uw1(name = "replaceFirstCharWithChar")
    @fx2
    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: G4 */
    public static final String m66549G4(String str, ec1<? super Character, Character> ec1) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(ec1, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        char charValue = ec1.mo17094X(Character.valueOf(str.charAt(0))).charValue();
        String substring = str.substring(1);
        jt1.m53776o(substring, "this as java.lang.String).substring(startIndex)");
        return charValue + substring;
    }

    @vr2
    /* renamed from: G5 */
    public static final CharSequence m66550G5(@vr2 CharSequence charSequence, @vr2 char... cArr) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(cArr, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean O8 = C4478ab.m36571O8(cArr, charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!O8) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!O8) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: H3 */
    public static final int m66551H3(@vr2 CharSequence charSequence, @vr2 char[] cArr, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int u = df3.m45219u(i, m66642i3(charSequence)); -1 < u; u--) {
                char charAt = charSequence.charAt(u);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C5453gx.m49972J(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return u;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C4478ab.m37666wt(cArr), i);
    }

    @uw1(name = "replaceFirstCharWithCharSequence")
    @fx2
    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: H4 */
    public static final String m66552H4(String str, ec1<? super Character, ? extends CharSequence> ec1) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(ec1, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ec1.mo17094X(Character.valueOf(str.charAt(0))));
        String substring = str.substring(1);
        jt1.m53776o(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    @xq1
    /* renamed from: H5 */
    public static final String m66553H5(String str) {
        jt1.m53777p(str, "<this>");
        return m66544E5(str).toString();
    }

    /* renamed from: I3 */
    public static /* synthetic */ int m66554I3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m66642i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66548G3(charSequence, collection, i, z);
    }

    @vr2
    /* renamed from: I4 */
    public static final CharSequence m66555I4(@vr2 CharSequence charSequence, int i, int i2, @vr2 CharSequence charSequence2) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            jt1.m53776o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            jt1.m53776o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    @vr2
    /* renamed from: I5 */
    public static final String m66556I5(@vr2 String str, @vr2 ec1<? super Character, Boolean> ec1) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(ec1, "predicate");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = ec1.mo17094X(Character.valueOf(str.charAt(!z ? i : length))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    /* renamed from: J3 */
    public static /* synthetic */ int m66557J3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m66642i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66551H3(charSequence, cArr, i, z);
    }

    @vr2
    /* renamed from: J4 */
    public static final CharSequence m66558J4(@vr2 CharSequence charSequence, @vr2 is1 is1, @vr2 CharSequence charSequence2) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(is1, "range");
        jt1.m53777p(charSequence2, "replacement");
        return m66555I4(charSequence, is1.mo27428i().intValue(), is1.mo27427g().intValue() + 1, charSequence2);
    }

    @vr2
    /* renamed from: J5 */
    public static final String m66559J5(@vr2 String str, @vr2 char... cArr) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean O8 = C4478ab.m36571O8(cArr, str.charAt(!z ? i : length));
            if (!z) {
                if (!O8) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!O8) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @vr2
    /* renamed from: K3 */
    public static final zt3<String> m66560K3(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return m66617Z4(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    @xq1
    /* renamed from: K4 */
    public static final String m66561K4(String str, int i, int i2, CharSequence charSequence) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charSequence, "replacement");
        return m66555I4(str, i, i2, charSequence).toString();
    }

    @vr2
    /* renamed from: K5 */
    public static final CharSequence m66562K5(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C5327fx.m48556r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @vr2
    /* renamed from: L3 */
    public static final List<String> m66563L3(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return hu3.m51011c3(m66560K3(charSequence));
    }

    @xq1
    /* renamed from: L4 */
    public static final String m66564L4(String str, is1 is1, CharSequence charSequence) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(is1, "range");
        jt1.m53777p(charSequence, "replacement");
        return m66558J4(str, is1, charSequence).toString();
    }

    @vr2
    /* renamed from: L5 */
    public static final CharSequence m66565L5(@vr2 CharSequence charSequence, @vr2 ec1<? super Character, Boolean> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(ec1, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!ec1.mo17094X(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    @xq1
    /* renamed from: M3 */
    public static final boolean m66567M3(CharSequence charSequence, eh3 eh3) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        return eh3.mo35379k(charSequence);
    }

    /* renamed from: M4 */
    public static final void m66568M4(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    @vr2
    /* renamed from: M5 */
    public static final CharSequence m66569M5(@vr2 CharSequence charSequence, @vr2 char... cArr) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C4478ab.m36571O8(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @vr2
    /* renamed from: N2 */
    public static final String m66570N2(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && C5453gx.m49972J(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (m66645j3(charSequence, i2) || m66645j3(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    @xq1
    /* renamed from: N3 */
    public static final String m66571N3(String str) {
        return str == null ? "" : str;
    }

    @xq1
    /* renamed from: N4 */
    public static final List<String> m66572N4(CharSequence charSequence, eh3 eh3, int i) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        return eh3.mo35384p(charSequence, i);
    }

    @xq1
    /* renamed from: N5 */
    public static final String m66573N5(String str) {
        jt1.m53777p(str, "<this>");
        return m66562K5(str).toString();
    }

    /* renamed from: O2 */
    public static /* synthetic */ String m66574O2(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66570N2(charSequence, charSequence2, z);
    }

    @vr2
    /* renamed from: O3 */
    public static final CharSequence m66575O3(@vr2 CharSequence charSequence, int i, char c) {
        jt1.m53777p(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append(charSequence);
            ds1 o = new is1(1, i - charSequence.length()).iterator();
            while (o.hasNext()) {
                o.mo19249b();
                sb.append(c);
            }
            return sb;
        }
    }

    @vr2
    /* renamed from: O4 */
    public static final List<String> m66576O4(@vr2 CharSequence charSequence, @vr2 char[] cArr, boolean z, int i) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(cArr, "delimiters");
        if (cArr.length == 1) {
            return m66584Q4(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<is1> N = hu3.m50948N(m66613Y3(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(t00.m65073Z(N, 10));
        for (is1 j5 : N) {
            arrayList.add(m66647j5(charSequence, j5));
        }
        return arrayList;
    }

    @vr2
    /* renamed from: O5 */
    public static final String m66577O5(@vr2 String str, @vr2 ec1<? super Character, Boolean> ec1) {
        Object obj;
        jt1.m53777p(str, "<this>");
        jt1.m53777p(ec1, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ec1.mo17094X(Character.valueOf(str.charAt(length))).booleanValue()) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return obj.toString();
        }
        obj = "";
        return obj.toString();
    }

    @vr2
    /* renamed from: P2 */
    public static final String m66578P2(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "other");
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min && C5453gx.m49972J(charSequence.charAt((length - i) - 1), charSequence2.charAt((length2 - i) - 1), z)) {
            i++;
        }
        if (m66645j3(charSequence, (length - i) - 1) || m66645j3(charSequence2, (length2 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    @vr2
    /* renamed from: P3 */
    public static final String m66579P3(@vr2 String str, int i, char c) {
        jt1.m53777p(str, "<this>");
        return m66575O3(str, i, c).toString();
    }

    @vr2
    /* renamed from: P4 */
    public static final List<String> m66580P4(@vr2 CharSequence charSequence, @vr2 String[] strArr, boolean z, int i) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m66584Q4(charSequence, str, z, i);
            }
        }
        Iterable<is1> N = hu3.m50948N(m66616Z3(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(t00.m65073Z(N, 10));
        for (is1 j5 : N) {
            arrayList.add(m66647j5(charSequence, j5));
        }
        return arrayList;
    }

    @vr2
    /* renamed from: P5 */
    public static final String m66581P5(@vr2 String str, @vr2 char... cArr) {
        Object obj;
        jt1.m53777p(str, "<this>");
        jt1.m53777p(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C4478ab.m36571O8(cArr, str.charAt(length))) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return obj.toString();
        }
        obj = "";
        return obj.toString();
    }

    /* renamed from: Q2 */
    public static /* synthetic */ String m66582Q2(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66578P2(charSequence, charSequence2, z);
    }

    /* renamed from: Q3 */
    public static /* synthetic */ CharSequence m66583Q3(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m66575O3(charSequence, i, c);
    }

    /* renamed from: Q4 */
    public static final List<String> m66584Q4(CharSequence charSequence, String str, boolean z, int i) {
        m66568M4(i);
        int i2 = 0;
        int n3 = m66657n3(charSequence, str, 0, z);
        if (n3 == -1 || i == 1) {
            return r00.m63300l(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = df3.m45219u(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, n3).toString());
            i2 = str.length() + n3;
            if ((z2 && arrayList.size() == i - 1) || (n3 = m66657n3(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, n3).toString());
            i2 = str.length() + n3;
            break;
        } while ((n3 = m66657n3(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    @vr2
    /* renamed from: Q5 */
    public static final CharSequence m66585Q5(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C5327fx.m48556r(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: R2 */
    public static final boolean m66586R2(@vr2 CharSequence charSequence, char c, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        return m66666q3(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: R3 */
    public static /* synthetic */ String m66587R3(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m66579P3(str, i, c);
    }

    /* renamed from: R4 */
    public static /* synthetic */ List m66588R4(CharSequence charSequence, eh3 eh3, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        return eh3.mo35384p(charSequence, i);
    }

    @vr2
    /* renamed from: R5 */
    public static final CharSequence m66589R5(@vr2 CharSequence charSequence, @vr2 ec1<? super Character, Boolean> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(ec1, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ec1.mo17094X(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @xq1
    /* renamed from: S2 */
    public static final boolean m66590S2(CharSequence charSequence, eh3 eh3) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        return eh3.mo35372b(charSequence);
    }

    @vr2
    /* renamed from: S3 */
    public static final CharSequence m66591S3(@vr2 CharSequence charSequence, int i, char c) {
        jt1.m53777p(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            ds1 o = new is1(1, i - charSequence.length()).iterator();
            while (o.hasNext()) {
                o.mo19249b();
                sb.append(c);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    /* renamed from: S4 */
    public static /* synthetic */ List m66592S4(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m66576O4(charSequence, cArr, z, i);
    }

    @vr2
    /* renamed from: S5 */
    public static final CharSequence m66593S5(@vr2 CharSequence charSequence, @vr2 char... cArr) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C4478ab.m36571O8(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: T2 */
    public static final boolean m66594T2(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m66669r3(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m66663p3(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    @vr2
    /* renamed from: T3 */
    public static final String m66595T3(@vr2 String str, int i, char c) {
        jt1.m53777p(str, "<this>");
        return m66591S3(str, i, c).toString();
    }

    /* renamed from: T4 */
    public static /* synthetic */ List m66596T4(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m66580P4(charSequence, strArr, z, i);
    }

    @xq1
    /* renamed from: T5 */
    public static final String m66597T5(String str) {
        jt1.m53777p(str, "<this>");
        return m66585Q5(str).toString();
    }

    /* renamed from: U2 */
    public static /* synthetic */ boolean m66598U2(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66586R2(charSequence, c, z);
    }

    /* renamed from: U3 */
    public static /* synthetic */ CharSequence m66599U3(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m66591S3(charSequence, i, c);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: U4 */
    public static final zt3<String> m66600U4(CharSequence charSequence, eh3 eh3, int i) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        return eh3.mo35385r(charSequence, i);
    }

    @vr2
    /* renamed from: U5 */
    public static final String m66601U5(@vr2 String str, @vr2 ec1<? super Character, Boolean> ec1) {
        Object obj;
        jt1.m53777p(str, "<this>");
        jt1.m53777p(ec1, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!ec1.mo17094X(Character.valueOf(str.charAt(i))).booleanValue()) {
                obj = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    /* renamed from: V2 */
    public static /* synthetic */ boolean m66602V2(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66594T2(charSequence, charSequence2, z);
    }

    /* renamed from: V3 */
    public static /* synthetic */ String m66603V3(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m66595T3(str, i, c);
    }

    @vr2
    /* renamed from: V4 */
    public static final zt3<String> m66604V4(@vr2 CharSequence charSequence, @vr2 char[] cArr, boolean z, int i) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(cArr, "delimiters");
        return hu3.m51041k1(m66613Y3(charSequence, cArr, 0, z, i, 2, (Object) null), new C6935e(charSequence));
    }

    @vr2
    /* renamed from: V5 */
    public static final String m66605V5(@vr2 String str, @vr2 char... cArr) {
        Object obj;
        jt1.m53777p(str, "<this>");
        jt1.m53777p(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!C4478ab.m36571O8(cArr, str.charAt(i))) {
                obj = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    /* renamed from: W2 */
    public static final boolean m66606W2(@ss2 CharSequence charSequence, @ss2 CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return t54.m65410K1((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C5453gx.m49972J(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W3 */
    public static final zt3<is1> m66607W3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m66568M4(i2);
        return new ej0(charSequence, i, i2, new C6932b(cArr, z));
    }

    @vr2
    /* renamed from: W4 */
    public static final zt3<String> m66608W4(@vr2 CharSequence charSequence, @vr2 String[] strArr, boolean z, int i) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(strArr, "delimiters");
        return hu3.m51041k1(m66616Z3(charSequence, strArr, 0, z, i, 2, (Object) null), new C6934d(charSequence));
    }

    /* renamed from: X2 */
    public static final boolean m66609X2(@ss2 CharSequence charSequence, @ss2 CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return jt1.m53768g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X3 */
    public static final zt3<is1> m66610X3(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m66568M4(i2);
        return new ej0(charSequence, i, i2, new C6933c(C7458za.m72983t(strArr), z));
    }

    /* renamed from: X4 */
    public static /* synthetic */ zt3 m66611X4(CharSequence charSequence, eh3 eh3, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        return eh3.mo35385r(charSequence, i);
    }

    /* renamed from: Y2 */
    public static final boolean m66612Y2(@vr2 CharSequence charSequence, char c, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        return charSequence.length() > 0 && C5453gx.m49972J(charSequence.charAt(m66642i3(charSequence)), c, z);
    }

    /* renamed from: Y3 */
    public static /* synthetic */ zt3 m66613Y3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m66607W3(charSequence, cArr, i, z, i2);
    }

    /* renamed from: Y4 */
    public static /* synthetic */ zt3 m66614Y4(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m66604V4(charSequence, cArr, z, i);
    }

    /* renamed from: Z2 */
    public static final boolean m66615Z2(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return t54.m65408J1((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m66619a4(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: Z3 */
    public static /* synthetic */ zt3 m66616Z3(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m66610X3(charSequence, strArr, i, z, i2);
    }

    /* renamed from: Z4 */
    public static /* synthetic */ zt3 m66617Z4(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m66608W4(charSequence, strArr, z, i);
    }

    /* renamed from: a3 */
    public static /* synthetic */ boolean m66618a3(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66612Y2(charSequence, c, z);
    }

    /* renamed from: a4 */
    public static final boolean m66619a4(@vr2 CharSequence charSequence, int i, @vr2 CharSequence charSequence2, int i2, int i3, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C5453gx.m49972J(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a5 */
    public static final boolean m66620a5(@vr2 CharSequence charSequence, char c, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        return charSequence.length() > 0 && C5453gx.m49972J(charSequence.charAt(0), c, z);
    }

    /* renamed from: b3 */
    public static /* synthetic */ boolean m66621b3(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66615Z2(charSequence, charSequence2, z);
    }

    @vr2
    /* renamed from: b4 */
    public static final CharSequence m66622b4(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "prefix");
        return m66635f5(charSequence, charSequence2, false, 2, (Object) null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    /* renamed from: b5 */
    public static final boolean m66623b5(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return t54.m65464t2((String) charSequence, (String) charSequence2, i, false, 4, (Object) null);
        }
        return m66619a4(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    @ss2
    /* renamed from: c3 */
    public static final ey2<Integer, String> m66624c3(@vr2 CharSequence charSequence, @vr2 Collection<String> collection, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(collection, "strings");
        return m66627d3(charSequence, collection, i, z, false);
    }

    @vr2
    /* renamed from: c4 */
    public static final String m66625c4(@vr2 String str, @vr2 CharSequence charSequence) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charSequence, "prefix");
        if (!m66635f5(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        jt1.m53776o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c5 */
    public static final boolean m66626c5(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return t54.m65466u2((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m66619a4(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: d3 */
    public static final ey2<Integer, String> m66627d3(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            gs1 is1 = !z2 ? new is1(df3.m45198n(i, 0), charSequence.length()) : df3.m45156W(df3.m45219u(i, m66642i3(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = is1.mo36871j();
                int l = is1.mo36872l();
                int n = is1.mo36873n();
                if ((n > 0 && i2 <= l) || (n < 0 && l <= i2)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (t54.m65432d2(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str == null) {
                            if (i2 == l) {
                                break;
                            }
                            i2 += n;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int j = is1.mo36871j();
            int l2 = is1.mo36872l();
            int n2 = is1.mo36873n();
            if ((n2 > 0 && j <= l2) || (n2 < 0 && l2 <= j)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (m66619a4(str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str == null) {
                        if (i2 == l2) {
                            break;
                        }
                        j = i2 + n2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return yi4.m71797a(Integer.valueOf(i2), str);
        }
        String str4 = (String) a10.m35818a5(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i3 = i;
        int r3 = !z2 ? m66669r3(charSequence2, str5, i3, false, 4, (Object) null) : m66545F3(charSequence2, str5, i3, false, 4, (Object) null);
        if (r3 < 0) {
            return null;
        }
        return yi4.m71797a(Integer.valueOf(r3), str4);
    }

    @vr2
    /* renamed from: d4 */
    public static final CharSequence m66628d4(@vr2 CharSequence charSequence, int i, int i2) {
        jt1.m53777p(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            jt1.m53776o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence, i2, charSequence.length());
            jt1.m53776o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
    }

    /* renamed from: d5 */
    public static /* synthetic */ boolean m66629d5(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66620a5(charSequence, c, z);
    }

    /* renamed from: e3 */
    public static /* synthetic */ ey2 m66630e3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66624c3(charSequence, collection, i, z);
    }

    @vr2
    /* renamed from: e4 */
    public static final CharSequence m66631e4(@vr2 CharSequence charSequence, @vr2 is1 is1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(is1, "range");
        return m66628d4(charSequence, is1.mo27428i().intValue(), is1.mo27427g().intValue() + 1);
    }

    /* renamed from: e5 */
    public static /* synthetic */ boolean m66632e5(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66623b5(charSequence, charSequence2, i, z);
    }

    @ss2
    /* renamed from: f3 */
    public static final ey2<Integer, String> m66633f3(@vr2 CharSequence charSequence, @vr2 Collection<String> collection, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(collection, "strings");
        return m66627d3(charSequence, collection, i, z, true);
    }

    @xq1
    /* renamed from: f4 */
    public static final String m66634f4(String str, int i, int i2) {
        jt1.m53777p(str, "<this>");
        return m66628d4(str, i, i2).toString();
    }

    /* renamed from: f5 */
    public static /* synthetic */ boolean m66635f5(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m66626c5(charSequence, charSequence2, z);
    }

    /* renamed from: g3 */
    public static /* synthetic */ ey2 m66636g3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m66642i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66633f3(charSequence, collection, i, z);
    }

    @xq1
    /* renamed from: g4 */
    public static final String m66637g4(String str, is1 is1) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(is1, "range");
        return m66631e4(str, is1).toString();
    }

    @vr2
    /* renamed from: g5 */
    public static final CharSequence m66638g5(@vr2 CharSequence charSequence, @vr2 is1 is1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(is1, "range");
        return charSequence.subSequence(is1.mo27428i().intValue(), is1.mo27427g().intValue() + 1);
    }

    @vr2
    /* renamed from: h3 */
    public static final is1 m66639h3(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return new is1(0, charSequence.length() - 1);
    }

    @vr2
    /* renamed from: h4 */
    public static final CharSequence m66640h4(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "suffix");
        return m66621b3(charSequence, charSequence2, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @xq1
    @xj0(message = "Use parameters named startIndex and endIndex.", replaceWith = @oi3(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    /* renamed from: h5 */
    public static final CharSequence m66641h5(String str, int i, int i2) {
        jt1.m53777p(str, "<this>");
        return str.subSequence(i, i2);
    }

    /* renamed from: i3 */
    public static final int m66642i3(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @vr2
    /* renamed from: i4 */
    public static final String m66643i4(@vr2 String str, @vr2 CharSequence charSequence) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charSequence, "suffix");
        if (!m66621b3(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @xq1
    /* renamed from: i5 */
    public static final String m66644i5(CharSequence charSequence, int i, int i2) {
        jt1.m53777p(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    /* renamed from: j3 */
    public static final boolean m66645j3(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "<this>");
        return new is1(0, charSequence.length() + -2).mo38213s(i) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    @vr2
    /* renamed from: j4 */
    public static final CharSequence m66646j4(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "delimiter");
        return m66649k4(charSequence, charSequence2, charSequence2);
    }

    @vr2
    /* renamed from: j5 */
    public static final String m66647j5(@vr2 CharSequence charSequence, @vr2 is1 is1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(is1, "range");
        return charSequence.subSequence(is1.mo27428i().intValue(), is1.mo27427g().intValue() + 1).toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.3")
    @com.onedelhi.secure.xq1
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.lang.CharSequence & R, R> R m66648k3(C r1, com.onedelhi.secure.cc1<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            boolean r0 = com.onedelhi.secure.t54.m65422U1(r1)
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.invoke()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.u54.m66648k3(java.lang.CharSequence, com.onedelhi.secure.cc1):java.lang.Object");
    }

    @vr2
    /* renamed from: k4 */
    public static final CharSequence m66649k4(@vr2 CharSequence charSequence, @vr2 CharSequence charSequence2, @vr2 CharSequence charSequence3) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(charSequence2, "prefix");
        jt1.m53777p(charSequence3, "suffix");
        return (charSequence.length() < charSequence2.length() + charSequence3.length() || !m66635f5(charSequence, charSequence2, false, 2, (Object) null) || !m66621b3(charSequence, charSequence3, false, 2, (Object) null)) ? charSequence.subSequence(0, charSequence.length()) : charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
    }

    @vr2
    /* renamed from: k5 */
    public static final String m66650k5(@vr2 String str, @vr2 is1 is1) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(is1, "range");
        String substring = str.substring(is1.mo27428i().intValue(), is1.mo27427g().intValue() + 1);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.3")
    @com.onedelhi.secure.xq1
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.lang.CharSequence & R, R> R m66651l3(C r1, com.onedelhi.secure.cc1<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.invoke()
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.u54.m66651l3(java.lang.CharSequence, com.onedelhi.secure.cc1):java.lang.Object");
    }

    @vr2
    /* renamed from: l4 */
    public static final String m66652l4(@vr2 String str, @vr2 CharSequence charSequence) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charSequence, "delimiter");
        return m66655m4(str, charSequence, charSequence);
    }

    /* renamed from: l5 */
    public static /* synthetic */ String m66653l5(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        jt1.m53777p(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    /* renamed from: m3 */
    public static final int m66654m3(@vr2 CharSequence charSequence, char c, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m66675t3(charSequence, new char[]{c}, i, z);
    }

    @vr2
    /* renamed from: m4 */
    public static final String m66655m4(@vr2 String str, @vr2 CharSequence charSequence, @vr2 CharSequence charSequence2) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(charSequence, "prefix");
        jt1.m53777p(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m66635f5(str, charSequence, false, 2, (Object) null) || !m66621b3(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @vr2
    /* renamed from: m5 */
    public static final String m66656m5(@vr2 String str, char c, @vr2 String str2) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "missingDelimiterValue");
        int q3 = m66666q3(str, c, 0, false, 6, (Object) null);
        if (q3 == -1) {
            return str2;
        }
        String substring = str.substring(q3 + 1, str.length());
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: n3 */
    public static final int m66657n3(@vr2 CharSequence charSequence, @vr2 String str, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(str, ak4.C1709b.f9167e);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m66663p3(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    @xq1
    /* renamed from: n4 */
    public static final String m66658n4(CharSequence charSequence, eh3 eh3, ec1<? super ce2, ? extends CharSequence> ec1) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        jt1.m53777p(ec1, "transform");
        return eh3.mo35381m(charSequence, ec1);
    }

    @vr2
    /* renamed from: n5 */
    public static final String m66659n5(@vr2 String str, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "missingDelimiterValue");
        int r3 = m66669r3(str, str2, 0, false, 6, (Object) null);
        if (r3 == -1) {
            return str3;
        }
        String substring = str.substring(r3 + str2.length(), str.length());
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: o3 */
    public static final int m66660o3(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        gs1 is1 = !z2 ? new is1(df3.m45198n(i, 0), df3.m45219u(i2, charSequence.length())) : df3.m45156W(df3.m45219u(i, m66642i3(charSequence)), df3.m45198n(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int j = is1.mo36871j();
            int l = is1.mo36872l();
            int n = is1.mo36873n();
            if ((n <= 0 || j > l) && (n >= 0 || l > j)) {
                return -1;
            }
            while (true) {
                if (m66619a4(charSequence2, 0, charSequence, j, charSequence2.length(), z)) {
                    return j;
                }
                if (j == l) {
                    return -1;
                }
                j += n;
            }
        } else {
            int j2 = is1.mo36871j();
            int l2 = is1.mo36872l();
            int n2 = is1.mo36873n();
            if ((n2 <= 0 || j2 > l2) && (n2 >= 0 || l2 > j2)) {
                return -1;
            }
            while (true) {
                if (t54.m65432d2((String) charSequence2, 0, (String) charSequence, j2, charSequence2.length(), z)) {
                    return j2;
                }
                if (j2 == l2) {
                    return -1;
                }
                j2 += n2;
            }
        }
    }

    @xq1
    /* renamed from: o4 */
    public static final String m66661o4(CharSequence charSequence, eh3 eh3, String str) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(eh3, "regex");
        jt1.m53777p(str, "replacement");
        return eh3.mo35382n(charSequence, str);
    }

    /* renamed from: o5 */
    public static /* synthetic */ String m66662o5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m66656m5(str, c, str2);
    }

    /* renamed from: p3 */
    public static /* synthetic */ int m66663p3(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m66660o3(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    @vr2
    /* renamed from: p4 */
    public static final String m66664p4(@vr2 String str, char c, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "replacement");
        jt1.m53777p(str3, "missingDelimiterValue");
        int q3 = m66666q3(str, c, 0, false, 6, (Object) null);
        return q3 == -1 ? str3 : m66555I4(str, q3 + 1, str.length(), str2).toString();
    }

    /* renamed from: p5 */
    public static /* synthetic */ String m66665p5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m66659n5(str, str2, str3);
    }

    /* renamed from: q3 */
    public static /* synthetic */ int m66666q3(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66654m3(charSequence, c, i, z);
    }

    @vr2
    /* renamed from: q4 */
    public static final String m66667q4(@vr2 String str, @vr2 String str2, @vr2 String str3, @vr2 String str4) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "replacement");
        jt1.m53777p(str4, "missingDelimiterValue");
        int r3 = m66669r3(str, str2, 0, false, 6, (Object) null);
        return r3 == -1 ? str4 : m66555I4(str, r3 + str2.length(), str.length(), str3).toString();
    }

    @vr2
    /* renamed from: q5 */
    public static final String m66668q5(@vr2 String str, char c, @vr2 String str2) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "missingDelimiterValue");
        int E3 = m66542E3(str, c, 0, false, 6, (Object) null);
        if (E3 == -1) {
            return str2;
        }
        String substring = str.substring(E3 + 1, str.length());
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: r3 */
    public static /* synthetic */ int m66669r3(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66657n3(charSequence, str, i, z);
    }

    /* renamed from: r4 */
    public static /* synthetic */ String m66670r4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m66664p4(str, c, str2, str3);
    }

    @vr2
    /* renamed from: r5 */
    public static final String m66671r5(@vr2 String str, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "missingDelimiterValue");
        int F3 = m66545F3(str, str2, 0, false, 6, (Object) null);
        if (F3 == -1) {
            return str3;
        }
        String substring = str.substring(F3 + str2.length(), str.length());
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: s3 */
    public static final int m66672s3(@vr2 CharSequence charSequence, @vr2 Collection<String> collection, int i, boolean z) {
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(collection, "strings");
        ey2<Integer, String> d3 = m66627d3(charSequence, collection, i, z, false);
        if (d3 != null) {
            return d3.mo35668e().intValue();
        }
        return -1;
    }

    /* renamed from: s4 */
    public static /* synthetic */ String m66673s4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m66667q4(str, str2, str3, str4);
    }

    /* renamed from: s5 */
    public static /* synthetic */ String m66674s5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m66668q5(str, c, str2);
    }

    /* renamed from: t3 */
    public static final int m66675t3(@vr2 CharSequence charSequence, @vr2 char[] cArr, int i, boolean z) {
        boolean z2;
        jt1.m53777p(charSequence, "<this>");
        jt1.m53777p(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            ds1 o = new is1(df3.m45198n(i, 0), m66642i3(charSequence)).iterator();
            while (o.hasNext()) {
                int b = o.mo19249b();
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C5453gx.m49972J(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C4478ab.m37666wt(cArr), i);
    }

    @vr2
    /* renamed from: t4 */
    public static final String m66676t4(@vr2 String str, char c, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "replacement");
        jt1.m53777p(str3, "missingDelimiterValue");
        int E3 = m66542E3(str, c, 0, false, 6, (Object) null);
        return E3 == -1 ? str3 : m66555I4(str, E3 + 1, str.length(), str2).toString();
    }

    /* renamed from: t5 */
    public static /* synthetic */ String m66677t5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m66671r5(str, str2, str3);
    }

    /* renamed from: u3 */
    public static /* synthetic */ int m66678u3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66672s3(charSequence, collection, i, z);
    }

    @vr2
    /* renamed from: u4 */
    public static final String m66679u4(@vr2 String str, @vr2 String str2, @vr2 String str3, @vr2 String str4) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "replacement");
        jt1.m53777p(str4, "missingDelimiterValue");
        int F3 = m66545F3(str, str2, 0, false, 6, (Object) null);
        return F3 == -1 ? str4 : m66555I4(str, F3 + str2.length(), str.length(), str3).toString();
    }

    @vr2
    /* renamed from: u5 */
    public static final String m66680u5(@vr2 String str, char c, @vr2 String str2) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "missingDelimiterValue");
        int q3 = m66666q3(str, c, 0, false, 6, (Object) null);
        if (q3 == -1) {
            return str2;
        }
        String substring = str.substring(0, q3);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: v3 */
    public static /* synthetic */ int m66681v3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m66675t3(charSequence, cArr, i, z);
    }

    /* renamed from: v4 */
    public static /* synthetic */ String m66682v4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m66676t4(str, c, str2, str3);
    }

    @vr2
    /* renamed from: v5 */
    public static final String m66683v5(@vr2 String str, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "missingDelimiterValue");
        int r3 = m66669r3(str, str2, 0, false, 6, (Object) null);
        if (r3 == -1) {
            return str3;
        }
        String substring = str.substring(0, r3);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @xq1
    /* renamed from: w3 */
    public static final boolean m66684w3(CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    /* renamed from: w4 */
    public static /* synthetic */ String m66685w4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m66679u4(str, str2, str3, str4);
    }

    /* renamed from: w5 */
    public static /* synthetic */ String m66686w5(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m66680u5(str, c, str2);
    }

    @xq1
    /* renamed from: x3 */
    public static final boolean m66687x3(CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return !t54.m65422U1(charSequence);
    }

    @vr2
    /* renamed from: x4 */
    public static final String m66688x4(@vr2 String str, char c, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "replacement");
        jt1.m53777p(str3, "missingDelimiterValue");
        int q3 = m66666q3(str, c, 0, false, 6, (Object) null);
        return q3 == -1 ? str3 : m66555I4(str, 0, q3, str2).toString();
    }

    /* renamed from: x5 */
    public static /* synthetic */ String m66689x5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m66683v5(str, str2, str3);
    }

    @xq1
    /* renamed from: y3 */
    public static final boolean m66690y3(CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @vr2
    /* renamed from: y4 */
    public static final String m66691y4(@vr2 String str, @vr2 String str2, @vr2 String str3, @vr2 String str4) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "replacement");
        jt1.m53777p(str4, "missingDelimiterValue");
        int r3 = m66669r3(str, str2, 0, false, 6, (Object) null);
        return r3 == -1 ? str4 : m66555I4(str, 0, r3, str3).toString();
    }

    @vr2
    /* renamed from: y5 */
    public static final String m66692y5(@vr2 String str, char c, @vr2 String str2) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "missingDelimiterValue");
        int E3 = m66542E3(str, c, 0, false, 6, (Object) null);
        if (E3 == -1) {
            return str2;
        }
        String substring = str.substring(0, E3);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @xq1
    /* renamed from: z3 */
    public static final boolean m66693z3(CharSequence charSequence) {
        return charSequence == null || t54.m65422U1(charSequence);
    }

    /* renamed from: z4 */
    public static /* synthetic */ String m66694z4(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m66688x4(str, c, str2, str3);
    }

    @vr2
    /* renamed from: z5 */
    public static final String m66695z5(@vr2 String str, @vr2 String str2, @vr2 String str3) {
        jt1.m53777p(str, "<this>");
        jt1.m53777p(str2, "delimiter");
        jt1.m53777p(str3, "missingDelimiterValue");
        int F3 = m66545F3(str, str2, 0, false, 6, (Object) null);
        if (F3 == -1) {
            return str3;
        }
        String substring = str.substring(0, F3);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
