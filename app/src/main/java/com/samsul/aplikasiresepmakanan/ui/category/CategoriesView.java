package com.samsul.aplikasiresepmakanan.ui.category;

import com.samsul.aplikasiresepmakanan.remote.model.Meals;

import java.util.List;

public interface CategoriesView {
    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
