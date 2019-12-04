package com.pritesh.midterm_spacexdata_android.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pritesh.midterm_spacexdata_android.R;
import com.pritesh.midterm_spacexdata_android.databinding.ItemListContentBinding;
import com.pritesh.midterm_spacexdata_android.models.Launches;
import com.pritesh.midterm_spacexdata_android.ui.activities.LaunchesDetailActivity;
import com.pritesh.midterm_spacexdata_android.ui.activities.LaunchesListActivity;
import com.pritesh.midterm_spacexdata_android.ui.fragments.LaunchesDetailFragment;

import java.util.List;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

//https://www.androidhive.info/android-databinding-in-recyclerview-profile-screen/

public class LaunchesRecyclerViewAdapter extends RecyclerView.Adapter<LaunchesRecyclerViewAdapter.ViewHolder>
{
    private final LaunchesListActivity mParentActivity;
    private final List<Launches> mValues;
    private final boolean mTwoPane;
    private LayoutInflater layoutInflater;

    private final View.OnClickListener mOnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            Launches mLaunches = (Launches) view.getTag();
            if (mTwoPane)
            {
                Bundle arguments = new Bundle();
                arguments.putParcelable(LaunchesDetailFragment.ARG_ITEM_LAUNCH, mLaunches);
                LaunchesDetailFragment fragment = new LaunchesDetailFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.item_detail_container, fragment)
                        .commit();
            } else
            {
                Context context = view.getContext();
                Intent intent = new Intent(context, LaunchesDetailActivity.class);
                intent.putExtra(LaunchesDetailFragment.ARG_ITEM_LAUNCH, mLaunches);

                context.startActivity(intent);
            }
        }
    };

    public LaunchesRecyclerViewAdapter(LaunchesListActivity parent,
                                  List<Launches> items,
                                  boolean twoPane)
    {
        mValues = items;
        mParentActivity = parent;
        mTwoPane = twoPane;
    }

    @Override
    public LaunchesRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        if (layoutInflater == null)
        {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }

        ItemListContentBinding binding =
                DataBindingUtil.inflate(layoutInflater, R.layout.item_list_content, parent, false);

        return new LaunchesRecyclerViewAdapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(final LaunchesRecyclerViewAdapter.ViewHolder holder, int position)
    {
        final Launches mLaunches = mValues.get(position);
        holder.binding.setLaunch(mLaunches);
        holder.binding.setImageUrl(mLaunches.getLinks().getMissionPatchSmall());
        holder.binding.imgLaunch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (mTwoPane)
                {
                    Bundle arguments = new Bundle();
                    arguments.putParcelable(LaunchesDetailFragment.ARG_ITEM_LAUNCH, mLaunches);
                    LaunchesDetailFragment fragment = new LaunchesDetailFragment();
                    fragment.setArguments(arguments);
                    mParentActivity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.item_detail_container, fragment)
                            .commit();
                } else
                {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, LaunchesDetailActivity.class);
                    intent.putExtra(LaunchesDetailFragment.ARG_ITEM_LAUNCH, mLaunches);

                    context.startActivity(intent);
                }
            }
        });

        if (mLaunches.getLaunchSuccess())
        {
            //holder.binding.idText.setTextColor(Color.GREEN);
        }else
        {
            //holder.binding.idText.setTextColor(Color.RED);
        }
    }

    @Override
    public int getItemCount()
    {
        return mValues.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        private final ItemListContentBinding binding;

        ViewHolder(ItemListContentBinding binding)
        {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
