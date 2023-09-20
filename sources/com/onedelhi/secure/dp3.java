package com.onedelhi.secure;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0007\n\u0005\b20\u0001¨\u0006\t"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lcom/onedelhi/secure/wy0;", "body", "a", "(Landroid/database/sqlite/SQLiteDatabase;ZLcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class dp3 {
    /* renamed from: a */
    public static final <T> T m13264a(@vr2 SQLiteDatabase sQLiteDatabase, boolean z, @vr2 ec1<? super SQLiteDatabase, ? extends T> ec1) {
        jt1.m53777p(sQLiteDatabase, "<this>");
        jt1.m53777p(ec1, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T X = ec1.mo17094X(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return X;
        } finally {
            uq1.m67403d(1);
            sQLiteDatabase.endTransaction();
            uq1.m67402c(1);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Object m13265b(SQLiteDatabase sQLiteDatabase, boolean z, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        jt1.m53777p(sQLiteDatabase, "<this>");
        jt1.m53777p(ec1, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object X = ec1.mo17094X(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return X;
        } finally {
            uq1.m67403d(1);
            sQLiteDatabase.endTransaction();
            uq1.m67402c(1);
        }
    }
}
