package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.onedelhi.secure.C4048z8;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w24;

public class InitializationProvider extends ContentProvider {
    public final int delete(@mr2 Uri uri, @ts2 String str, @ts2 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @ts2
    public final String getType(@mr2 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @ts2
    public final Uri insert(@mr2 Uri uri, @ts2 ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new w24("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            C4048z8.m32904e(context).mo27834a();
            return true;
        }
    }

    @ts2
    public final Cursor query(@mr2 Uri uri, @ts2 String[] strArr, @ts2 String str, @ts2 String[] strArr2, @ts2 String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(@mr2 Uri uri, @ts2 ContentValues contentValues, @ts2 String str, @ts2 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
