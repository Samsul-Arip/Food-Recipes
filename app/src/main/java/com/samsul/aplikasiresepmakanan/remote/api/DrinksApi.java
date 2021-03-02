package com.samsul.aplikasiresepmakanan.remote.api;

import com.samsul.aplikasiresepmakanan.remote.model.Categories;
import com.samsul.aplikasiresepmakanan.remote.model.DrinkResponse;
import com.samsul.aplikasiresepmakanan.remote.model.Drinks;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DrinksApi {

    //https://www.themealdb.com/api/json/v2/1/latest.php <-diambil disini
    @GET("latest.php")
    Call<DrinkResponse> getMeal();

    //https://www.thecocktaildb.com/api/json/v1/1/list.php?c=list <-diambil disini
    @GET("popular.php")
    Call<Categories> getPopular();

    //example https://themealdb.com/api/json/v2/1/filter.php?c=Beef <-diambil disini
    @GET("filter.php")
    Call<Drinks> getMealByCategory(@Query("c") String category);

    //example https://themealdb.com/api/json/v2/1/search.php?c=Beef <-diambil disini
    @GET("search.php")
    Call<Drinks> getMealByName(@Query("s") String mealName);
}
