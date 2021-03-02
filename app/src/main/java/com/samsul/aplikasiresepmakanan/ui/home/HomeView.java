package com.samsul.aplikasiresepmakanan.ui.home;

import com.samsul.aplikasiresepmakanan.remote.model.Categories;
import com.samsul.aplikasiresepmakanan.remote.model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);

}
