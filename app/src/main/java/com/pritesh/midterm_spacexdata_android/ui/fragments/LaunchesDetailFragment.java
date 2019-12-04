package com.pritesh.midterm_spacexdata_android.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.pritesh.midterm_spacexdata_android.R;
import com.pritesh.midterm_spacexdata_android.databinding.LaunchesDetailBinding;
import com.pritesh.midterm_spacexdata_android.models.Launches;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class LaunchesDetailFragment extends Fragment
{
    public static final String ARG_ITEM_LAUNCH = "item_launch";
    private Launches mLaunch;
    public LaunchesDetailFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_LAUNCH))
        {
            mLaunch = (Launches) getArguments().getParcelable(ARG_ITEM_LAUNCH);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null)
            {
                appBarLayout.setTitle(mLaunch.getMissionName());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        LaunchesDetailBinding mLaunchesDetailBinding = DataBindingUtil.inflate(
                inflater, R.layout.launches_detail, container, false);
        View rootView = mLaunchesDetailBinding.getRoot();
        mLaunchesDetailBinding.setLaunch(mLaunch);
        mLaunchesDetailBinding.setImageUrl(mLaunch.getLinks().getMissionPatch());



        return rootView;
    }
}
