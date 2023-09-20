package com.onedelhi.secure;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.onedelhi.secure.hl3;

public final class ss0 {

    /* renamed from: a */
    public int f20497a;

    /* renamed from: a */
    public final C3537b f20498a;

    /* renamed from: b */
    public int f20499b;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.ss0$a */
    public static class C3536a extends C3537b {

        /* renamed from: a */
        public final EditText f20500a;

        /* renamed from: a */
        public final at0 f20501a;

        public C3536a(@mr2 EditText editText, boolean z) {
            this.f20500a = editText;
            at0 at0 = new at0(editText, z);
            this.f20501a = at0;
            editText.addTextChangedListener(at0);
            editText.setEditableFactory(ts0.getInstance());
        }

        /* renamed from: a */
        public KeyListener mo24524a(@ts2 KeyListener keyListener) {
            if (keyListener instanceof ws0) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new ws0(keyListener);
        }

        /* renamed from: b */
        public boolean mo24525b() {
            return this.f20501a.mo13267d();
        }

        /* renamed from: c */
        public InputConnection mo24526c(@mr2 InputConnection inputConnection, @mr2 EditorInfo editorInfo) {
            return inputConnection instanceof us0 ? inputConnection : new us0(this.f20500a, inputConnection, editorInfo);
        }

        /* renamed from: d */
        public void mo24527d(int i) {
            this.f20501a.mo13268f(i);
        }

        /* renamed from: e */
        public void mo24528e(boolean z) {
            this.f20501a.mo13269g(z);
        }

        /* renamed from: f */
        public void mo24529f(int i) {
            this.f20501a.mo13270h(i);
        }
    }

    /* renamed from: com.onedelhi.secure.ss0$b */
    public static class C3537b {
        @ts2
        /* renamed from: a */
        public KeyListener mo24524a(@ts2 KeyListener keyListener) {
            return keyListener;
        }

        /* renamed from: b */
        public boolean mo24525b() {
            return false;
        }

        /* renamed from: c */
        public InputConnection mo24526c(@mr2 InputConnection inputConnection, @mr2 EditorInfo editorInfo) {
            return inputConnection;
        }

        /* renamed from: d */
        public void mo24527d(int i) {
        }

        /* renamed from: e */
        public void mo24528e(boolean z) {
        }

        /* renamed from: f */
        public void mo24529f(int i) {
        }
    }

    public ss0(@mr2 EditText editText) {
        this(editText, true);
    }

    public ss0(@mr2 EditText editText, boolean z) {
        this.f20497a = Integer.MAX_VALUE;
        this.f20499b = 0;
        k43.m19456m(editText, "editText cannot be null");
        this.f20498a = new C3536a(editText, z);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: a */
    public int mo24516a() {
        return this.f20499b;
    }

    @ts2
    /* renamed from: b */
    public KeyListener mo24517b(@ts2 KeyListener keyListener) {
        return this.f20498a.mo24524a(keyListener);
    }

    /* renamed from: c */
    public int mo24518c() {
        return this.f20497a;
    }

    /* renamed from: d */
    public boolean mo24519d() {
        return this.f20498a.mo24525b();
    }

    @ts2
    /* renamed from: e */
    public InputConnection mo24520e(@ts2 InputConnection inputConnection, @mr2 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f20498a.mo24526c(inputConnection, editorInfo);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo24521f(int i) {
        this.f20499b = i;
        this.f20498a.mo24527d(i);
    }

    /* renamed from: g */
    public void mo24522g(boolean z) {
        this.f20498a.mo24528e(z);
    }

    /* renamed from: h */
    public void mo24523h(@js1(from = 0) int i) {
        k43.m19453j(i, "maxEmojiCount should be greater than 0");
        this.f20497a = i;
        this.f20498a.mo24529f(i);
    }
}
