package com.onedelhi.secure;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/oa1;", "Lcom/onedelhi/secure/me4;", "delegate", "m", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "j", "", "f", "d", "deadlineNanoTime", "e", "b", "a", "Lcom/onedelhi/secure/un4;", "h", "Lcom/onedelhi/secure/me4;", "l", "()Lcom/onedelhi/secure/me4;", "n", "(Lcom/onedelhi/secure/me4;)V", "<init>", "okio"}, k = 1, mv = {1, 4, 0})
public class oa1 extends me4 {
    @vr2

    /* renamed from: b */
    public me4 f32957b;

    public oa1(@vr2 me4 me4) {
        jt1.m53777p(me4, "delegate");
        this.f32957b = me4;
    }

    @vr2
    /* renamed from: a */
    public me4 mo40554a() {
        return this.f32957b.mo40554a();
    }

    @vr2
    /* renamed from: b */
    public me4 mo40555b() {
        return this.f32957b.mo40555b();
    }

    /* renamed from: d */
    public long mo40557d() {
        return this.f32957b.mo40557d();
    }

    @vr2
    /* renamed from: e */
    public me4 mo40558e(long j) {
        return this.f32957b.mo40558e(j);
    }

    /* renamed from: f */
    public boolean mo40559f() {
        return this.f32957b.mo40559f();
    }

    /* renamed from: h */
    public void mo40561h() throws IOException {
        this.f32957b.mo40561h();
    }

    @vr2
    /* renamed from: i */
    public me4 mo40562i(long j, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(timeUnit, "unit");
        return this.f32957b.mo40562i(j, timeUnit);
    }

    /* renamed from: j */
    public long mo40563j() {
        return this.f32957b.mo40563j();
    }

    @uw1(name = "delegate")
    @vr2
    /* renamed from: l */
    public final me4 mo41627l() {
        return this.f32957b;
    }

    @vr2
    /* renamed from: m */
    public final oa1 mo41628m(@vr2 me4 me4) {
        jt1.m53777p(me4, "delegate");
        this.f32957b = me4;
        return this;
    }

    /* renamed from: n */
    public final /* synthetic */ void mo41629n(@vr2 me4 me4) {
        jt1.m53777p(me4, "<set-?>");
        this.f32957b = me4;
    }
}
