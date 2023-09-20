package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.onedelhi.secure.C3568t7;
import com.onedelhi.secure.cg4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ni2;
import com.onedelhi.secure.oi2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.xs0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@C3568t7
@sj3(19)
/* renamed from: androidx.emoji2.text.f */
public final class C0575f {

    /* renamed from: a */
    public static final int f3624a = 1024;

    /* renamed from: a */
    public static final String f3625a = "EmojiCompat.MetadataRepo.create";
    @mr2

    /* renamed from: a */
    public final Typeface f3626a;
    @mr2

    /* renamed from: a */
    public final C0576a f3627a = new C0576a(1024);
    @mr2

    /* renamed from: a */
    public final ni2 f3628a;
    @mr2

    /* renamed from: a */
    public final char[] f3629a;

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.emoji2.text.f$a */
    public static class C0576a {

        /* renamed from: a */
        public final SparseArray<C0576a> f3630a;

        /* renamed from: a */
        public xs0 f3631a;

        public C0576a() {
            this(1);
        }

        public C0576a(int i) {
            this.f3630a = new SparseArray<>(i);
        }

        /* renamed from: a */
        public C0576a mo4238a(int i) {
            SparseArray<C0576a> sparseArray = this.f3630a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* renamed from: b */
        public final xs0 mo4239b() {
            return this.f3631a;
        }

        /* renamed from: c */
        public void mo4240c(@mr2 xs0 xs0, int i, int i2) {
            C0576a a = mo4238a(xs0.mo27067b(i));
            if (a == null) {
                a = new C0576a();
                this.f3630a.put(xs0.mo27067b(i), a);
            }
            if (i2 > i) {
                a.mo4240c(xs0, i + 1, i2);
            } else {
                a.f3631a = xs0;
            }
        }
    }

    public C0575f(@mr2 Typeface typeface, @mr2 ni2 ni2) {
        this.f3626a = typeface;
        this.f3628a = ni2;
        this.f3629a = new char[(ni2.mo21284K() * 2)];
        mo4231a(ni2);
    }

    @mr2
    /* renamed from: b */
    public static C0575f m4203b(@mr2 AssetManager assetManager, @mr2 String str) throws IOException {
        try {
            cg4.m12477b(f3625a);
            return new C0575f(Typeface.createFromAsset(assetManager, str), oi2.m23799b(assetManager, str));
        } finally {
            cg4.m12479d();
        }
    }

    @mr2
    @hl3({hl3.C2354a.f13190e})
    /* renamed from: c */
    public static C0575f m4204c(@mr2 Typeface typeface) {
        try {
            cg4.m12477b(f3625a);
            return new C0575f(typeface, new ni2());
        } finally {
            cg4.m12479d();
        }
    }

    @mr2
    /* renamed from: d */
    public static C0575f m4205d(@mr2 Typeface typeface, @mr2 InputStream inputStream) throws IOException {
        try {
            cg4.m12477b(f3625a);
            return new C0575f(typeface, oi2.m23800c(inputStream));
        } finally {
            cg4.m12479d();
        }
    }

    @mr2
    /* renamed from: e */
    public static C0575f m4206e(@mr2 Typeface typeface, @mr2 ByteBuffer byteBuffer) throws IOException {
        try {
            cg4.m12477b(f3625a);
            return new C0575f(typeface, oi2.m23801d(byteBuffer));
        } finally {
            cg4.m12479d();
        }
    }

    /* renamed from: a */
    public final void mo4231a(ni2 ni2) {
        int K = ni2.mo21284K();
        for (int i = 0; i < K; i++) {
            xs0 xs0 = new xs0(this, i);
            Character.toChars(xs0.mo27072g(), this.f3629a, i * 2);
            mo4237k(xs0);
        }
    }

    @mr2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: f */
    public char[] mo4232f() {
        return this.f3629a;
    }

    @mr2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: g */
    public ni2 mo4233g() {
        return this.f3628a;
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: h */
    public int mo4234h() {
        return this.f3628a.mo21290S();
    }

    @mr2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: i */
    public C0576a mo4235i() {
        return this.f3627a;
    }

    @mr2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: j */
    public Typeface mo4236j() {
        return this.f3626a;
    }

    @hw4
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: k */
    public void mo4237k(@mr2 xs0 xs0) {
        k43.m19456m(xs0, "emoji metadata cannot be null");
        k43.m19445b(xs0.mo27068c() > 0, "invalid metadata codepoint length");
        this.f3627a.mo4240c(xs0, 0, xs0.mo27068c() - 1);
    }
}
