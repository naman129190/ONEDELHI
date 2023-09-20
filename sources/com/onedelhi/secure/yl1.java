package com.onedelhi.secure;

import android.text.Html;
import android.text.Spanned;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\b\u001a\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\b¨\u0006\u000b"}, d2 = {"", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "a", "option", "c", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class yl1 {
    @vr2
    /* renamed from: a */
    public static final Spanned m32473a(@vr2 String str, int i, @ss2 Html.ImageGetter imageGetter, @ss2 Html.TagHandler tagHandler) {
        jt1.m53777p(str, "<this>");
        Spanned b = xl1.m31529b(str, i, imageGetter, tagHandler);
        jt1.m53776o(b, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b;
    }

    /* renamed from: b */
    public static /* synthetic */ Spanned m32474b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        jt1.m53777p(str, "<this>");
        Spanned b = xl1.m31529b(str, i, imageGetter, tagHandler);
        jt1.m53776o(b, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b;
    }

    @vr2
    /* renamed from: c */
    public static final String m32475c(@vr2 Spanned spanned, int i) {
        jt1.m53777p(spanned, "<this>");
        String c = xl1.m31530c(spanned, i);
        jt1.m53776o(c, "toHtml(this, option)");
        return c;
    }

    /* renamed from: d */
    public static /* synthetic */ String m32476d(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        jt1.m53777p(spanned, "<this>");
        String c = xl1.m31530c(spanned, i);
        jt1.m53776o(c, "toHtml(this, option)");
        return c;
    }
}
