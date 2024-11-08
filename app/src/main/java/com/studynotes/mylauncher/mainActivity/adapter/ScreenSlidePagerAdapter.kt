package com.studynotes.mylauncher.mainActivity.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.studynotes.mylauncher.fragments.appDrawer.AppDrawerFragment
import com.studynotes.mylauncher.fragments.featured_widgets.FeaturedWidgetFragment
import com.studynotes.mylauncher.fragments.home.HomeScreenFragment

class ScreenSlidePagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
//            0 -> FeaturedWidgetFragment()
            0 -> HomeScreenFragment()
            1 -> AppDrawerFragment()
            else -> HomeScreenFragment()
        }
    }
}
