package com.samsul.aplikasiresepmakanan.ui.category;

import androidx.annotation.NonNull;

import com.samsul.aplikasiresepmakanan.common.Utils;
import com.samsul.aplikasiresepmakanan.remote.model.Meals;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoriesPresenter {
    private CategoriesView view;

    public CategoriesPresenter(CategoriesView view) {
        this.view = view;
    }

    void getMealByCategory(String category) {

        view.showLoading();
        Call<Meals> mealsCall = Utils.getApi().getMealbyCategory(category);
        mealsCall.enqueue(new Callback<Meals>() {
            @Override
            public void onResponse(@NonNull Call<Meals> call, @NonNull Response<Meals> response) {
                view.hideLoading();
                if (response.isSuccessful() && response.body() != null) {
                    view.setMeals(response.body().getMeals());
                } else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Meals> call,@NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });

    }
}
