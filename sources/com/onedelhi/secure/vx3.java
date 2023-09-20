package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "action", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class vx3 {
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public static final void m30530a(@vr2 SharedPreferences sharedPreferences, boolean z, @vr2 ec1<? super SharedPreferences.Editor, un4> ec1) {
        jt1.m53777p(sharedPreferences, "<this>");
        jt1.m53777p(ec1, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        jt1.m53776o(edit, "editor");
        ec1.mo17094X(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m30531b(SharedPreferences sharedPreferences, boolean z, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        jt1.m53777p(sharedPreferences, "<this>");
        jt1.m53777p(ec1, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        jt1.m53776o(edit, "editor");
        ec1.mo17094X(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
