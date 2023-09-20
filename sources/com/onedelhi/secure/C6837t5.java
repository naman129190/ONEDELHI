package com.onedelhi.secure;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/t5;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lcom/onedelhi/secure/un4;", "publish", "flush", "close", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.t5 */
public final class C6837t5 extends Handler {

    /* renamed from: a */
    public static final C6837t5 f35425a = new C6837t5();

    public void close() {
    }

    public void flush() {
    }

    public void publish(@vr2 LogRecord logRecord) {
        jt1.m53777p(logRecord, "record");
        C6749s5 s5Var = C6749s5.f34916a;
        String loggerName = logRecord.getLoggerName();
        jt1.m53776o(loggerName, "record.loggerName");
        int a = C6928u5.m66474b(logRecord);
        String message = logRecord.getMessage();
        jt1.m53776o(message, "record.message");
        s5Var.mo44201a(loggerName, a, message, logRecord.getThrown());
    }
}
