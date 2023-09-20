package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class a42 extends Fragment {

    /* renamed from: n */
    public static final int f8705n = 16711681;

    /* renamed from: o */
    public static final int f8706o = 16711682;

    /* renamed from: p */
    public static final int f8707p = 16711683;

    /* renamed from: a */
    public final Handler f8708a = new Handler();

    /* renamed from: a */
    public View f8709a;

    /* renamed from: a */
    public final AdapterView.OnItemClickListener f8710a = new C1647b();

    /* renamed from: a */
    public ListAdapter f8711a;

    /* renamed from: a */
    public ListView f8712a;

    /* renamed from: a */
    public TextView f8713a;

    /* renamed from: a */
    public CharSequence f8714a;

    /* renamed from: a */
    public final Runnable f8715a = new C1646a();

    /* renamed from: b */
    public View f8716b;

    /* renamed from: b */
    public boolean f8717b;

    /* renamed from: c */
    public View f8718c;

    /* renamed from: com.onedelhi.secure.a42$a */
    public class C1646a implements Runnable {
        public C1646a() {
        }

        public void run() {
            ListView listView = a42.this.f8712a;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: com.onedelhi.secure.a42$b */
    public class C1647b implements AdapterView.OnItemClickListener {
        public C1647b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            a42.this.mo12687A((ListView) adapterView, view, i, j);
        }
    }

    /* renamed from: A */
    public void mo12687A(@mr2 ListView listView, @mr2 View view, int i, long j) {
    }

    @mr2
    /* renamed from: D */
    public final ListAdapter mo12688D() {
        ListAdapter r = mo12696r();
        if (r != null) {
            return r;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    /* renamed from: E */
    public void mo12689E(@ts2 CharSequence charSequence) {
        mo12695q();
        TextView textView = this.f8713a;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f8714a == null) {
                this.f8712a.setEmptyView(this.f8713a);
            }
            this.f8714a = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    /* renamed from: G */
    public void mo12690G(@ts2 ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f8711a != null;
        this.f8711a = listAdapter;
        ListView listView = this.f8712a;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f8717b && !z2) {
                if (requireView().getWindowToken() != null) {
                    z = true;
                }
                mo12692L(true, z);
            }
        }
    }

    /* renamed from: I */
    public void mo12691I(boolean z) {
        mo12692L(z, true);
    }

    /* renamed from: L */
    public final void mo12692L(boolean z, boolean z2) {
        mo12695q();
        View view = this.f8716b;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f8717b != z) {
            this.f8717b = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f8718c.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f8718c.clearAnimation();
                }
                this.f8716b.setVisibility(8);
                this.f8718c.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f8718c.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f8718c.clearAnimation();
            }
            this.f8716b.setVisibility(0);
            this.f8718c.setVisibility(8);
        }
    }

    /* renamed from: N */
    public void mo12693N(boolean z) {
        mo12692L(z, false);
    }

    /* renamed from: O */
    public void mo12694O(int i) {
        mo12695q();
        this.f8712a.setSelection(i);
    }

    @ts2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f8706o);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f8707p);
        TextView textView = new TextView(requireContext);
        textView.setId(f8705n);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.f8708a.removeCallbacks(this.f8715a);
        this.f8712a = null;
        this.f8717b = false;
        this.f8718c = null;
        this.f8716b = null;
        this.f8709a = null;
        this.f8713a = null;
        super.onDestroyView();
    }

    public void onViewCreated(@mr2 View view, @ts2 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo12695q();
    }

    /* renamed from: q */
    public final void mo12695q() {
        if (this.f8712a == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f8712a = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(f8705n);
                    this.f8713a = textView;
                    if (textView == null) {
                        this.f8709a = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f8716b = view.findViewById(f8706o);
                    this.f8718c = view.findViewById(f8707p);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f8712a = listView;
                        View view2 = this.f8709a;
                        if (view2 == null) {
                            CharSequence charSequence = this.f8714a;
                            if (charSequence != null) {
                                this.f8713a.setText(charSequence);
                                listView = this.f8712a;
                                view2 = this.f8713a;
                            }
                        }
                        listView.setEmptyView(view2);
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f8717b = true;
                this.f8712a.setOnItemClickListener(this.f8710a);
                ListAdapter listAdapter = this.f8711a;
                if (listAdapter != null) {
                    this.f8711a = null;
                    mo12690G(listAdapter);
                } else if (this.f8716b != null) {
                    mo12692L(false, false);
                }
                this.f8708a.post(this.f8715a);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    @ts2
    /* renamed from: r */
    public ListAdapter mo12696r() {
        return this.f8711a;
    }

    @mr2
    /* renamed from: s */
    public ListView mo12697s() {
        mo12695q();
        return this.f8712a;
    }

    /* renamed from: w */
    public long mo12698w() {
        mo12695q();
        return this.f8712a.getSelectedItemId();
    }

    /* renamed from: y */
    public int mo12699y() {
        mo12695q();
        return this.f8712a.getSelectedItemPosition();
    }
}
