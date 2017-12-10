package com.example.dhani.menutab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dhani.menutab.TabFragment1;
import com.example.dhani.menutab.TabFragment2;
import com.example.dhani.menutab.TabFragment3;

/**
 * Created by Dhani on 10/16/2017.
 */

public	class	PagerAdapter	extends FragmentStatePagerAdapter {
    int	mNumOfTabs;
    public	PagerAdapter(FragmentManager fm, int	NumOfTabs)	{
        super(fm);
        this.mNumOfTabs	=	NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch	(position)	{
            case	0:
                return	new TabFragment1();
            case	1:
                return	new TabFragment2();
            case	2:
                return	new TabFragment3();
            default:
                return	null;
        }
    }

    @Override
    public int getCount() {
        return	mNumOfTabs;
    }

}