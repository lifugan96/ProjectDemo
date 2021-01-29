package com.glf.rxjavademo.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.glf.rxjavademo.fragment.HomePagerFragment;
import com.glf.rxjavademo.model.domain.Categories;

import java.util.ArrayList;
import java.util.List;

public class HomePagerAdapter extends FragmentPagerAdapter {

    List<Categories.DataBean> categorieList = new ArrayList<>();

    public HomePagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return categorieList.get(position).getTitle();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        HomePagerFragment homePagerFragment = new HomePagerFragment();
        return homePagerFragment;
    }

    @Override
    public int getCount() {
        return categorieList.size();
    }

    public void setCategories(Categories categories) {
        categorieList.clear();
        List<Categories.DataBean> data = categories.getData();
        categorieList.addAll(data);
        notifyDataSetChanged();
    }
}
