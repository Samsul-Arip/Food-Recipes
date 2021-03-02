package com.samsul.aplikasiresepmakanan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.samsul.aplikasiresepmakanan.R;
import com.samsul.aplikasiresepmakanan.remote.model.Drinks;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ViewPagerHeaderDrinksAdapter extends PagerAdapter {

    private List<Drinks> meals;
    private Context context;
    private static ClickListener clickListener;

    public ViewPagerHeaderDrinksAdapter(List<Drinks> meals, Context context) {
        this.meals = meals;
        this.context = context;
    }

    @Override
    public int getCount() {
        return meals.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(
                R.layout.item_view_pager_header,
                container,
                false
        );

        ImageView mealThumb = view.findViewById(R.id.mealThumb);
        TextView mealName = view.findViewById(R.id.mealName);

        String strMealThumb = meals.get(position).getStrdrinkthumb();
        Picasso.get().load(strMealThumb).into(mealThumb);

        String strMealName = meals.get(position).getStrdrink();
        mealName.setText(strMealName);

        view.setOnClickListener(v -> clickListener.onClick(v, position));

        container.addView(view, 0);
        return view;
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        ViewPagerHeaderDrinksAdapter.clickListener = clickListener;
    }

    public interface ClickListener {
        void onClick(View view, int position);
    }
}
