package com.delhitransport.onedelhi.models.faq;

public class CategoryModel {
    public String category;
    public String key;

    public CategoryModel(String str, String str2) {
        this.category = str;
        this.key = str2;
    }

    public String getCategory() {
        return this.category;
    }

    public String getKey() {
        return this.key;
    }

    public void setCategory(String str) {
        this.category = str;
    }
}
