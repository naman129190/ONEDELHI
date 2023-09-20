package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.z91;
import java.io.IOException;
import java.io.InputStream;

@sj3(29)
@hl3({hl3.C2354a.LIBRARY_GROUP})
public class nk4 extends ok4 {
    /* renamed from: l */
    public static int m22916l(@mr2 FontStyle fontStyle, @mr2 FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @ts2
    /* renamed from: b */
    public Typeface mo18465b(Context context, z91.C4053d dVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (z91.C4054e eVar : dVar.mo27843a()) {
                try {
                    Font build = new Font.Builder(resources, eVar.mo27845b()).setWeight(eVar.mo27848e()).setSlant(eVar.mo27849f() ? 1 : 0).setTtcIndex(eVar.mo27846c()).setFontVariationSettings(eVar.mo27847d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(mo21352k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @ts2
    /* renamed from: c */
    public Typeface mo18466c(Context context, @ts2 CancellationSignal cancellationSignal, @mr2 aa1.C1675c[] cVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (aa1.C1675c cVar : cVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cVar.mo12878d(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(cVar.mo12879e()).setSlant(cVar.mo12880f() ? 1 : 0).setTtcIndex(cVar.mo12877c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(mo21352k(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public Typeface mo21350d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @ts2
    /* renamed from: e */
    public Typeface mo19657e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public aa1.C1675c mo21351h(aa1.C1675c[] cVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: k */
    public final Font mo21352k(@mr2 FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int l = m22916l(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int l2 = m22916l(fontStyle, font2.getStyle());
            if (l2 < l) {
                font = font2;
                l = l2;
            }
        }
        return font;
    }
}
