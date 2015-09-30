package com.kcumendigital.redempresarial.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.kcumendigital.redempresarial.fragments.ContactoFragment;
import com.kcumendigital.redempresarial.fragments.DescriptionFragment;
import com.kcumendigital.redempresarial.fragments.NumberPageFragment;
import com.kcumendigital.redempresarial.fragments.PortafolioFragment;
import com.kcumendigital.redempresarial.models.Empresas;


/**
 * Created by asus on 29/09/2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    Empresas e;


    Integer count;
    public PagerAdapter(FragmentManager fm, Integer count, Empresas e) {
        super(fm);
        this.count = count;
        this.e = e;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                DescriptionFragment tab1 = new DescriptionFragment();
                tab1.init(e);
                return tab1;



            case 1:
                PortafolioFragment tab2 = new PortafolioFragment();
                tab2.init(e);
                return tab2;


            case 2:
                ContactoFragment tab3 = new ContactoFragment();
                tab3.init(e);
                return tab3;

            default:
                return null;



        }

    }

    @Override
    public int getCount() {
        return count;
    }
}
