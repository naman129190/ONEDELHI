package com.onedelhi.secure;

import java.io.File;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.wf */
public final class C7166wf extends eb0 {

    /* renamed from: a */
    public final pa0 f36970a;

    /* renamed from: a */
    public final File f36971a;

    /* renamed from: a */
    public final String f36972a;

    public C7166wf(pa0 pa0, String str, File file) {
        Objects.requireNonNull(pa0, "Null report");
        this.f36970a = pa0;
        Objects.requireNonNull(str, "Null sessionId");
        this.f36972a = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f36971a = file;
    }

    /* renamed from: b */
    public pa0 mo35007b() {
        return this.f36970a;
    }

    /* renamed from: c */
    public File mo35008c() {
        return this.f36971a;
    }

    /* renamed from: d */
    public String mo35009d() {
        return this.f36972a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0 = (eb0) obj;
        return this.f36970a.equals(eb0.mo35007b()) && this.f36972a.equals(eb0.mo35009d()) && this.f36971a.equals(eb0.mo35008c());
    }

    public int hashCode() {
        return ((((this.f36970a.hashCode() ^ 1000003) * 1000003) ^ this.f36972a.hashCode()) * 1000003) ^ this.f36971a.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f36970a + ", sessionId=" + this.f36972a + ", reportFile=" + this.f36971a + "}";
    }
}
