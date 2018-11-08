package loac.com.loacapp.fragments;

import android.media.Image;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

import loac.com.loacapp.R;
import loac.com.loacapp.adapters.ViewPagerAdapter;

public class home extends Fragment{

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = (ViewPager) myView.findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) myView.findViewById(R.id.SliderDots);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(myView.getContext());

        viewPager.setAdapter(viewPagerAdapter);


        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){
            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

           params.setMargins(8,0,8,0);

           sliderDotspanel.addView(dots[i],params);
        }

        dots[0].setImageDrawable(getResources().getDrawable(R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                for(int j = 0; j < dotscount; j++){

                    dots[j].setImageDrawable(getResources().getDrawable(R.drawable.nonactive_dot));

                }

                dots[i].setImageDrawable(getResources().getDrawable(R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimeTask(), 2000, 4000);

        return myView;
    }


    public class MyTimeTask extends TimerTask{

        @Override
        public void run() {

            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    } else if(viewPager.getCurrentItem() == 1){
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });

        }
    }
}
