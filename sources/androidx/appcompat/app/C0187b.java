package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.onedelhi.secure.C3110p2;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.b */
public class C0187b {

    /* renamed from: a */
    public static final String f793a = "ActionBarDrawerToggleHC";

    /* renamed from: a */
    public static final int[] f794a = {16843531};

    /* renamed from: androidx.appcompat.app.b$a */
    public static class C0188a {

        /* renamed from: a */
        public ImageView f795a;

        /* renamed from: a */
        public Method f796a;

        /* renamed from: b */
        public Method f797b;

        public C0188a(Activity activity) {
            try {
                this.f796a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f797b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(C3110p2.f18293d);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.f795a = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Drawable m1308a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f794a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: b */
    public static C0188a m1309b(C0188a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C0188a(activity);
        }
        if (aVar.f796a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f797b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.w(f793a, "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public static C0188a m1310c(Activity activity, Drawable drawable, int i) {
        C0188a aVar = new C0188a(activity);
        if (aVar.f796a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f796a.invoke(actionBar, new Object[]{drawable});
                aVar.f797b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.w(f793a, "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else {
            ImageView imageView = aVar.f795a;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(f793a, "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }
}
