package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C0646f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ua1 {

    /* renamed from: a */
    public final C0646f<?> f21295a;

    public ua1(C0646f<?> fVar) {
        this.f21295a = fVar;
    }

    @mr2
    /* renamed from: b */
    public static ua1 m29221b(@mr2 C0646f<?> fVar) {
        return new ua1((C0646f) k43.m19456m(fVar, "callbacks == null"));
    }

    @ts2
    /* renamed from: A */
    public Fragment mo25497A(@mr2 String str) {
        return this.f21295a.f3860a.mo4612r0(str);
    }

    @mr2
    /* renamed from: B */
    public List<Fragment> mo25498B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f21295a.f3860a.mo4629x0();
    }

    /* renamed from: C */
    public int mo25499C() {
        return this.f21295a.f3860a.mo4626w0();
    }

    @mr2
    /* renamed from: D */
    public FragmentManager mo25500D() {
        return this.f21295a.f3860a;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    /* renamed from: E */
    public j62 mo25501E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    /* renamed from: F */
    public void mo25502F() {
        this.f21295a.f3860a.mo4585h1();
    }

    @ts2
    /* renamed from: G */
    public View mo25503G(@ts2 View view, @mr2 String str, @mr2 Context context, @mr2 AttributeSet attributeSet) {
        return this.f21295a.f3860a.mo4521I0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    /* renamed from: H */
    public void mo25504H() {
    }

    @Deprecated
    /* renamed from: I */
    public void mo25505I(@ts2 Parcelable parcelable, @ts2 wa1 wa1) {
        this.f21295a.f3860a.mo4508D1(parcelable, wa1);
    }

    @Deprecated
    /* renamed from: J */
    public void mo25506J(@ts2 Parcelable parcelable, @ts2 List<Fragment> list) {
        this.f21295a.f3860a.mo4508D1(parcelable, new wa1(list, (Map<String, wa1>) null, (Map<String, gu4>) null));
    }

    @Deprecated
    /* renamed from: K */
    public void mo25507K(@SuppressLint({"UnknownNullness"}) ty3<String, j62> ty3) {
    }

    /* renamed from: L */
    public void mo25508L(@ts2 Parcelable parcelable) {
        C0646f<?> fVar = this.f21295a;
        if (fVar instanceof hu4) {
            fVar.f3860a.mo4511E1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @ts2
    @Deprecated
    /* renamed from: M */
    public ty3<String, j62> mo25509M() {
        return null;
    }

    @ts2
    @Deprecated
    /* renamed from: N */
    public wa1 mo25510N() {
        return this.f21295a.f3860a.mo4514F1();
    }

    @ts2
    @Deprecated
    /* renamed from: O */
    public List<Fragment> mo25511O() {
        wa1 F1 = this.f21295a.f3860a.mo4514F1();
        if (F1 == null || F1.mo26473b() == null) {
            return null;
        }
        return new ArrayList(F1.mo26473b());
    }

    @ts2
    /* renamed from: P */
    public Parcelable mo25512P() {
        return this.f21295a.f3860a.mo4519H1();
    }

    /* renamed from: a */
    public void mo25513a(@ts2 Fragment fragment) {
        C0646f<?> fVar = this.f21295a;
        fVar.f3860a.mo4605p(fVar, fVar, fragment);
    }

    /* renamed from: c */
    public void mo25514c() {
        this.f21295a.f3860a.mo4506D();
    }

    /* renamed from: d */
    public void mo25515d(@mr2 Configuration configuration) {
        this.f21295a.f3860a.mo4512F(configuration);
    }

    /* renamed from: e */
    public boolean mo25516e(@mr2 MenuItem menuItem) {
        return this.f21295a.f3860a.mo4515G(menuItem);
    }

    /* renamed from: f */
    public void mo25517f() {
        this.f21295a.f3860a.mo4517H();
    }

    /* renamed from: g */
    public boolean mo25518g(@mr2 Menu menu, @mr2 MenuInflater menuInflater) {
        return this.f21295a.f3860a.mo4520I(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo25519h() {
        this.f21295a.f3860a.mo4523J();
    }

    /* renamed from: i */
    public void mo25520i() {
        this.f21295a.f3860a.mo4526K();
    }

    /* renamed from: j */
    public void mo25521j() {
        this.f21295a.f3860a.mo4529L();
    }

    /* renamed from: k */
    public void mo25522k(boolean z) {
        this.f21295a.f3860a.mo4532M(z);
    }

    /* renamed from: l */
    public boolean mo25523l(@mr2 MenuItem menuItem) {
        return this.f21295a.f3860a.mo4537O(menuItem);
    }

    /* renamed from: m */
    public void mo25524m(@mr2 Menu menu) {
        this.f21295a.f3860a.mo4540P(menu);
    }

    /* renamed from: n */
    public void mo25525n() {
        this.f21295a.f3860a.mo4546R();
    }

    /* renamed from: o */
    public void mo25526o(boolean z) {
        this.f21295a.f3860a.mo4549S(z);
    }

    /* renamed from: p */
    public boolean mo25527p(@mr2 Menu menu) {
        return this.f21295a.f3860a.mo4552T(menu);
    }

    @Deprecated
    /* renamed from: q */
    public void mo25528q() {
    }

    /* renamed from: r */
    public void mo25529r() {
        this.f21295a.f3860a.mo4557V();
    }

    /* renamed from: s */
    public void mo25530s() {
        this.f21295a.f3860a.mo4559W();
    }

    /* renamed from: t */
    public void mo25531t() {
        this.f21295a.f3860a.mo4563Y();
    }

    @Deprecated
    /* renamed from: u */
    public void mo25532u() {
    }

    @Deprecated
    /* renamed from: v */
    public void mo25533v() {
    }

    @Deprecated
    /* renamed from: w */
    public void mo25534w() {
    }

    @Deprecated
    /* renamed from: x */
    public void mo25535x(boolean z) {
    }

    @Deprecated
    /* renamed from: y */
    public void mo25536y(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
    }

    /* renamed from: z */
    public boolean mo25537z() {
        return this.f21295a.f3860a.mo4584h0(true);
    }
}
