package com.onedelhi.secure;

import java.util.Objects;

public final class ux0 {

    /* renamed from: a */
    public final kd0 f36333a;

    /* renamed from: a */
    public final m31 f36334a;

    /* renamed from: b */
    public final kd0 f36335b;

    public ux0(kd0 kd0, kd0 kd02, m31 m31) {
        this.f36333a = kd0;
        this.f36335b = kd02;
        this.f36334a = m31;
    }

    /* renamed from: a */
    public m31 mo45858a() {
        return this.f36334a;
    }

    /* renamed from: b */
    public kd0 mo45859b() {
        return this.f36333a;
    }

    /* renamed from: c */
    public kd0 mo45860c() {
        return this.f36335b;
    }

    /* renamed from: d */
    public boolean mo45861d() {
        return this.f36335b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ux0)) {
            return false;
        }
        ux0 ux0 = (ux0) obj;
        return Objects.equals(this.f36333a, ux0.f36333a) && Objects.equals(this.f36335b, ux0.f36335b) && Objects.equals(this.f36334a, ux0.f36334a);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f36333a) ^ Objects.hashCode(this.f36335b)) ^ Objects.hashCode(this.f36334a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f36333a);
        sb.append(" , ");
        sb.append(this.f36335b);
        sb.append(" : ");
        m31 m31 = this.f36334a;
        sb.append(m31 == null ? "null" : Integer.valueOf(m31.mo40461c()));
        sb.append(" ]");
        return sb.toString();
    }
}
