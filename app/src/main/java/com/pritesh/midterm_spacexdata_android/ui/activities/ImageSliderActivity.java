package com.pritesh.midterm_spacexdata_android.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.pritesh.midterm_spacexdata_android.R;
import com.pritesh.midterm_spacexdata_android.models.Launches;

import java.util.List;

public class ImageSliderActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener
{
    private SliderLayout mDemoSlider;
    private Launches mLaunches;
    public static final String ARG_IMAGE_ARRAY = "images";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);

        mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        if(getIntent().hasExtra(ARG_IMAGE_ARRAY))
        {
            List<String> images = getIntent().getStringArrayListExtra(ARG_IMAGE_ARRAY);
            int i = 1;
            for (String url : images)
            {
                TextSliderView textSliderView = new TextSliderView(this);
                textSliderView
                        .description( (i++) + " of " + images.size())
                        .image(url);

                mDemoSlider.addSlider(textSliderView);
            }

            mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
            mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
            mDemoSlider.setCustomAnimation(new DescriptionAnimation());
            mDemoSlider.setDuration(4000);
            mDemoSlider.addOnPageChangeListener(this);
        }

    }

    @Override
    public void onSliderClick(BaseSliderView slider)
    {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
    {

    }

    @Override
    public void onPageSelected(int position)
    {

    }

    @Override
    public void onPageScrollStateChanged(int state)
    {

    }

    @Override
    protected void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }
}
