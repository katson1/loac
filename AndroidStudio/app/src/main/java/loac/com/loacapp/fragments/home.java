package loac.com.loacapp.fragments;

import android.support.annotation.Nullable;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import loac.com.loacapp.R;
import loac.com.loacapp.adapters.ViewPagerAdapter;

public class home extends Fragment{

//    ViewPager viewPager;
//    private ImageView[] dots;
    View myView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_home, container, false);

//        viewPager = (ViewPager) myView.findViewById(R.id.viewPager);
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(myView.getContext());
//        viewPager.setAdapter(viewPagerAdapter);





        return myView;
    }


}