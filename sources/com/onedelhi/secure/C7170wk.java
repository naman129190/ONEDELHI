package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.wk */
public final class C7170wk extends if4 {

    /* renamed from: a */
    public final short f37006a;

    /* renamed from: b */
    public final short f37007b;

    public C7170wk(if4 if4, int i, int i2) {
        super(if4);
        this.f37006a = (short) i;
        this.f37007b = (short) i2;
    }

    /* renamed from: c */
    public void mo35678c(C6014ll llVar, byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            short s = this.f37007b;
            if (i2 < s) {
                if (i2 == 0 || (i2 == 31 && s <= 62)) {
                    int i3 = 5;
                    llVar.mo39923c(31, 5);
                    short s2 = this.f37007b;
                    if (s2 > 62) {
                        i = s2 - 31;
                        i3 = 16;
                    } else if (i2 == 0) {
                        llVar.mo39923c(Math.min(s2, 31), 5);
                    } else {
                        i = s2 - 31;
                    }
                    llVar.mo39923c(i, i3);
                }
                llVar.mo39923c(bArr[this.f37006a + i2], 8);
                i2++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f37006a);
        sb.append("::");
        sb.append((this.f37006a + this.f37007b) - 1);
        sb.append(tk4.f35698e);
        return sb.toString();
    }
}
