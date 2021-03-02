package com.samsul.aplikasiresepmakanan.remote.api;

import com.samsul.aplikasiresepmakanan.remote.model.Categories;
import com.samsul.aplikasiresepmakanan.remote.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodsApi {

    //https://www.themealdb.com/api/json/v2/1/latest.php <-diambil disini
    @GET("latest.php")
    Call<Meals> getMeal();

    //https://www.themealdb.com/api/json/v1/1/categories.php <- diambil disini
    @GET("categories.php")
    Call<Categories> getCategories();

    //example https://themealdb.com/api/json/v2/1/filter.php?c=Beef <-diambil disini
    @GET("filter.php")
    Call<Meals> getMealbyCategory(@Query("c") String category);

    @GET("search.php")
    Call<Meals> getMealByName(@Query("s") String mealName);




}
