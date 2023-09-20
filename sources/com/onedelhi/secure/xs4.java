package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.vs4;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import org.apache.commons.compress.utils.CharsetNames;

@hl3({hl3.C2354a.LIBRARY})
public class xs4 extends vs4 {

    /* renamed from: A */
    public static final int f22737A = 8;

    /* renamed from: B */
    public static final int f22738B = 9;

    /* renamed from: C */
    public static final int f22739C = 10;

    /* renamed from: D */
    public static final int f22740D = 11;

    /* renamed from: E */
    public static final int f22741E = 12;

    /* renamed from: F */
    public static final int f22742F = 13;

    /* renamed from: G */
    public static final int f22743G = 14;

    /* renamed from: a */
    public static final Charset f22744a = Charset.forName(CharsetNames.UTF_16);

    /* renamed from: s */
    public static final int f22745s = 0;

    /* renamed from: t */
    public static final int f22746t = 1;

    /* renamed from: u */
    public static final int f22747u = 2;

    /* renamed from: v */
    public static final int f22748v = 3;

    /* renamed from: w */
    public static final int f22749w = 4;

    /* renamed from: x */
    public static final int f22750x = 5;

    /* renamed from: y */
    public static final int f22751y = 6;

    /* renamed from: z */
    public static final int f22752z = 7;

    /* renamed from: a */
    public C3950b f22753a;

    /* renamed from: a */
    public final DataInputStream f22754a;

    /* renamed from: a */
    public final DataOutputStream f22755a;

    /* renamed from: a */
    public boolean f22756a;

    /* renamed from: b */
    public DataInputStream f22757b;

    /* renamed from: b */
    public DataOutputStream f22758b;

    /* renamed from: p */
    public int f22759p;

    /* renamed from: q */
    public int f22760q;

    /* renamed from: r */
    public int f22761r;

    /* renamed from: com.onedelhi.secure.xs4$a */
    public class C3949a extends FilterInputStream {
        public C3949a(InputStream inputStream) {
            super(inputStream);
        }

        public int read() throws IOException {
            xs4 xs4 = xs4.this;
            int i = xs4.f22761r;
            if (i == -1 || xs4.f22759p < i) {
                int read = super.read();
                xs4.this.f22759p++;
                return read;
            }
            throw new IOException();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            xs4 xs4 = xs4.this;
            int i3 = xs4.f22761r;
            if (i3 == -1 || xs4.f22759p < i3) {
                int read = super.read(bArr, i, i2);
                if (read > 0) {
                    xs4.this.f22759p += read;
                }
                return read;
            }
            throw new IOException();
        }

        public long skip(long j) throws IOException {
            xs4 xs4 = xs4.this;
            int i = xs4.f22761r;
            if (i == -1 || xs4.f22759p < i) {
                long skip = super.skip(j);
                if (skip > 0) {
                    xs4.this.f22759p += (int) skip;
                }
                return skip;
            }
            throw new IOException();
        }
    }

    /* renamed from: com.onedelhi.secure.xs4$b */
    public static class C3950b {

        /* renamed from: a */
        public final int f22763a;

        /* renamed from: a */
        public final ByteArrayOutputStream f22764a;

        /* renamed from: a */
        public final DataOutputStream f22765a;

        /* renamed from: b */
        public final DataOutputStream f22766b;

        public C3950b(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f22764a = byteArrayOutputStream;
            this.f22765a = new DataOutputStream(byteArrayOutputStream);
            this.f22763a = i;
            this.f22766b = dataOutputStream;
        }

        /* renamed from: a */
        public void mo27086a() throws IOException {
            this.f22765a.flush();
            int size = this.f22764a.size();
            this.f22766b.writeInt((this.f22763a << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f22766b.writeInt(size);
            }
            this.f22764a.writeTo(this.f22766b);
        }
    }

    public xs4(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new C3042oa(), new C3042oa(), new C3042oa());
    }

    public xs4(InputStream inputStream, OutputStream outputStream, C3042oa<String, Method> oaVar, C3042oa<String, Method> oaVar2, C3042oa<String, Class> oaVar3) {
        super(oaVar, oaVar2, oaVar3);
        this.f22759p = 0;
        this.f22760q = -1;
        this.f22761r = -1;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C3949a(inputStream)) : null;
        this.f22754a = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.f22755a = dataOutputStream;
        this.f22757b = dataInputStream;
        this.f22758b = dataOutputStream;
    }

    /* renamed from: C0 */
    public void mo26207C0(double d) {
        try {
            this.f22758b.writeDouble(d);
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: F */
    public boolean mo26212F(int i) {
        while (true) {
            try {
                int i2 = this.f22760q;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.f22759p;
                int i4 = this.f22761r;
                if (i3 < i4) {
                    this.f22754a.skip((long) (i4 - i3));
                }
                this.f22761r = -1;
                int readInt = this.f22754a.readInt();
                this.f22759p = 0;
                int i5 = readInt & 65535;
                if (i5 == 65535) {
                    i5 = this.f22754a.readInt();
                }
                this.f22760q = (readInt >> 16) & 65535;
                this.f22761r = i5;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: G */
    public float mo26214G() {
        try {
            return this.f22757b.readFloat();
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: H0 */
    public void mo26217H0(float f) {
        try {
            this.f22758b.writeFloat(f);
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: L */
    public int mo26224L() {
        try {
            return this.f22757b.readInt();
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: L0 */
    public void mo26225L0(int i) {
        try {
            this.f22758b.writeInt(i);
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: Q */
    public long mo26234Q() {
        try {
            return this.f22757b.readLong();
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: Q0 */
    public void mo26235Q0(long j) {
        try {
            this.f22758b.writeLong(j);
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: V */
    public <T extends Parcelable> T mo26244V() {
        return null;
    }

    /* renamed from: W0 */
    public void mo26247W0(Parcelable parcelable) {
        if (!this.f22756a) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    /* renamed from: a */
    public void mo26254a() {
        C3950b bVar = this.f22753a;
        if (bVar != null) {
            try {
                if (bVar.f22764a.size() != 0) {
                    this.f22753a.mo27086a();
                }
                this.f22753a = null;
            } catch (IOException e) {
                throw new vs4.C3808b(e);
            }
        }
    }

    /* renamed from: c */
    public vs4 mo26260c() {
        return new xs4(this.f22757b, this.f22758b, this.f21938a, this.f21939b, this.f21940c);
    }

    /* renamed from: c0 */
    public String mo26261c0() {
        try {
            int readInt = this.f22757b.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f22757b.readFully(bArr);
            return new String(bArr, f22744a);
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: e0 */
    public IBinder mo26267e0() {
        return null;
    }

    /* renamed from: e1 */
    public void mo26268e1(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(f22744a);
                this.f22758b.writeInt(bytes.length);
                this.f22758b.write(bytes);
            } catch (IOException e) {
                throw new vs4.C3808b(e);
            }
        } else {
            this.f22758b.writeInt(-1);
        }
    }

    /* renamed from: g1 */
    public void mo26273g1(IBinder iBinder) {
        if (!this.f22756a) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* renamed from: i */
    public boolean mo26277i() {
        return true;
    }

    /* renamed from: i0 */
    public void mo26278i0(int i) {
        mo26254a();
        C3950b bVar = new C3950b(i, this.f22755a);
        this.f22753a = bVar;
        this.f22758b = bVar.f22765a;
    }

    /* renamed from: i1 */
    public void mo26279i1(IInterface iInterface) {
        if (!this.f22756a) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* renamed from: j0 */
    public void mo26281j0(boolean z, boolean z2) {
        if (z) {
            this.f22756a = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    /* renamed from: l */
    public boolean mo26286l() {
        try {
            return this.f22757b.readBoolean();
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: m0 */
    public void mo26290m0(boolean z) {
        try {
            this.f22758b.writeBoolean(z);
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: o1 */
    public final void mo27081o1(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, (Parcelable) null);
                return;
            case 1:
            case 2:
                bundle.putBundle(str, mo26297p());
                return;
            case 3:
                bundle.putString(str, mo26261c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) mo26280j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, mo26286l());
                return;
            case 6:
                bundle.putBooleanArray(str, mo26292n());
                return;
            case 7:
                bundle.putDouble(str, mo26315y());
                return;
            case 8:
                bundle.putDoubleArray(str, mo26202A());
                return;
            case 9:
                bundle.putInt(str, mo26224L());
                return;
            case 10:
                bundle.putIntArray(str, mo26228N());
                return;
            case 11:
                bundle.putLong(str, mo26234Q());
                return;
            case 12:
                bundle.putLongArray(str, mo26238S());
                return;
            case 13:
                bundle.putFloat(str, mo26214G());
                return;
            case 14:
                bundle.putFloatArray(str, mo26218I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i);
        }
    }

    /* renamed from: p */
    public Bundle mo26297p() {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < L; i++) {
            mo27081o1(mo26224L(), mo26261c0(), bundle);
        }
        return bundle;
    }

    /* renamed from: p1 */
    public final void mo27082p1(Object obj) {
        int intValue;
        if (obj == null) {
            intValue = 0;
        } else if (obj instanceof Bundle) {
            mo26225L0(1);
            mo26300q0((Bundle) obj);
            return;
        } else if (obj instanceof String) {
            mo26225L0(3);
            mo26268e1((String) obj);
            return;
        } else if (obj instanceof String[]) {
            mo26225L0(4);
            mo26284k0((String[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            mo26225L0(5);
            mo26290m0(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof boolean[]) {
            mo26225L0(6);
            mo26296o0((boolean[]) obj);
            return;
        } else if (obj instanceof Double) {
            mo26225L0(7);
            mo26207C0(((Double) obj).doubleValue());
            return;
        } else if (obj instanceof double[]) {
            mo26225L0(8);
            mo26211E0((double[]) obj);
            return;
        } else if (obj instanceof Integer) {
            mo26225L0(9);
            intValue = ((Integer) obj).intValue();
        } else if (obj instanceof int[]) {
            mo26225L0(10);
            mo26229N0((int[]) obj);
            return;
        } else if (obj instanceof Long) {
            mo26225L0(11);
            mo26235Q0(((Long) obj).longValue());
            return;
        } else if (obj instanceof long[]) {
            mo26225L0(12);
            mo26239S0((long[]) obj);
            return;
        } else if (obj instanceof Float) {
            mo26225L0(13);
            mo26217H0(((Float) obj).floatValue());
            return;
        } else if (obj instanceof float[]) {
            mo26225L0(14);
            mo26221J0((float[]) obj);
            return;
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
        mo26225L0(intValue);
    }

    /* renamed from: q0 */
    public void mo26300q0(Bundle bundle) {
        if (bundle != null) {
            try {
                Set<String> keySet = bundle.keySet();
                this.f22758b.writeInt(keySet.size());
                for (String str : keySet) {
                    mo26268e1(str);
                    mo27082p1(bundle.get(str));
                }
            } catch (IOException e) {
                throw new vs4.C3808b(e);
            }
        } else {
            this.f22758b.writeInt(-1);
        }
    }

    /* renamed from: s */
    public byte[] mo26303s() {
        try {
            int readInt = this.f22757b.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f22757b.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: t0 */
    public void mo26306t0(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f22758b.writeInt(bArr.length);
                this.f22758b.write(bArr);
            } catch (IOException e) {
                throw new vs4.C3808b(e);
            }
        } else {
            this.f22758b.writeInt(-1);
        }
    }

    /* renamed from: v */
    public CharSequence mo26309v() {
        return null;
    }

    /* renamed from: v0 */
    public void mo26310v0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                this.f22758b.writeInt(i2);
                this.f22758b.write(bArr, i, i2);
            } catch (IOException e) {
                throw new vs4.C3808b(e);
            }
        } else {
            this.f22758b.writeInt(-1);
        }
    }

    /* renamed from: y */
    public double mo26315y() {
        try {
            return this.f22757b.readDouble();
        } catch (IOException e) {
            throw new vs4.C3808b(e);
        }
    }

    /* renamed from: y0 */
    public void mo26316y0(CharSequence charSequence) {
        if (!this.f22756a) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }
}
