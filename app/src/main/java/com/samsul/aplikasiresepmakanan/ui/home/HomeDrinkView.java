package com.samsul.aplikasiresepmakanan.ui.home;

import com.samsul.aplikasiresepmakanan.remote.model.Categories;
import com.samsul.aplikasiresepmakanan.remote.model.Drinks;

import java.util.List;

public interface HomeDrinkView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Drinks> drinks);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
