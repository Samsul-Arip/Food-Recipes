/*
* samsul aripin*/

package com.samsul.aplikasiresepmakanan.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.samsul.aplikasiresepmakanan.remote.model.Categories;
import com.samsul.aplikasiresepmakanan.ui.category.CategoriesFragment;

import java.util.List;

public class ViewPagerCategoryAdapter extends FragmentPagerAdapter {

    private List<Categories.Category> categories;

    public ViewPagerCategoryAdapter(@NonNull FragmentManager fm, List<Categories.Category> categories) {
        super(fm);
        this.categories = categories;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        CategoriesFragment categoriesFragment = new CategoriesFragment();
        Bundle b =new Bundle();
        b.putString("EXTRA_DATA_NAME", categories.get(position).getStrCategory());
        b.putString("EXTRA_DATA_DESC", categories.get(position).getStrCategoryDescription());
        b.putString("EXTRA_DATA_IMAGE", categories.get(position).getStrCategoryThumb());
        categoriesFragment.setArguments(b);

        return categoriesFragment;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

     @Override
     public CharSequence getPageTitle(int position){
        return categories.get(position).getStrCategory();
     }
}
