package com.onedelhi.secure;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class ph0 implements or3 {

    /* renamed from: a */
    public static final Logger f18526a = Logger.getLogger(ni4.class.getName());

    /* renamed from: a */
    public final aw0 f18527a;

    /* renamed from: a */
    public final C2448ii f18528a;

    /* renamed from: a */
    public final ky4 f18529a;

    /* renamed from: a */
    public final q84 f18530a;

    /* renamed from: a */
    public final Executor f18531a;

    @qq1
    public ph0(Executor executor, C2448ii iiVar, ky4 ky4, aw0 aw0, q84 q84) {
        this.f18531a = executor;
        this.f18528a = iiVar;
        this.f18529a = ky4;
        this.f18527a = aw0;
        this.f18530a = q84;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m24701d(xh4 xh4, uv0 uv0) {
        this.f18527a.mo13300y1(xh4, uv0);
        this.f18529a.mo18889a(xh4, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m24702e(xh4 xh4, qi4 qi4, uv0 uv0) {
        try {
            wh4 a = this.f18528a.mo17813a(xh4.mo23177b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{xh4.mo23177b()});
                f18526a.warning(format);
                qi4.mo23188a(new IllegalArgumentException(format));
                return;
            }
            this.f18530a.mo16818b(new mh0(this, xh4, a.mo20677b(uv0)));
            qi4.mo23188a((Exception) null);
        } catch (Exception e) {
            Logger logger = f18526a;
            logger.warning("Error scheduling event " + e.getMessage());
            qi4.mo23188a(e);
        }
    }

    /* renamed from: a */
    public void mo22059a(xh4 xh4, uv0 uv0, qi4 qi4) {
        this.f18531a.execute(new nh0(this, xh4, qi4, uv0));
    }
}
