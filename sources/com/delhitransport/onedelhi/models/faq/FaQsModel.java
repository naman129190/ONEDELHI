package com.delhitransport.onedelhi.models.faq;

import java.util.ArrayList;

public class FaQsModel {
    public String CategoryTitle;
    public ArrayList<FAQs> faQs;

    public FaQsModel(String str, ArrayList<FAQs> arrayList) {
        this.CategoryTitle = str;
        this.faQs = arrayList;
    }

    public String getCategoryTitle() {
        return this.CategoryTitle;
    }

    public ArrayList<FAQs> getFaQsModels() {
        return this.faQs;
    }

    public void setCategoryTitle(String str) {
        this.CategoryTitle = str;
    }

    public void setFaQsModels(ArrayList<FAQs> arrayList) {
        this.faQs = arrayList;
    }
}
