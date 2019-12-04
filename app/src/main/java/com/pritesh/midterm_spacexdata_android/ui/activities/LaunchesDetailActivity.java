package com.pritesh.midterm_spacexdata_android.ui.activities;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.pritesh.midterm_spacexdata_android.R;
import com.pritesh.midterm_spacexdata_android.models.Launches;
import com.pritesh.midterm_spacexdata_android.ui.fragments.LaunchesDetailFragment;

import androidx.appcompat.widget.Toolbar;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class LaunchesDetailActivity extends AppCompatActivity
{

    private Launches mLaunch;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launches_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent mIntent = new Intent(LaunchesDetailActivity.this, WebViewActivity.class);
                mIntent.putExtra(WebViewActivity.ARG_WEB_LINK, mLaunch.getLinks().getWikipedia());
                //startActivity(mIntent);
                //Snackbar.make(view, " 555 Replace with your own detail action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                if(mLaunch.getLinks().getFlickrImages().size() == 0)
                {
                    Toast.makeText(LaunchesDetailActivity.this, "No More Images", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent mIntentImage = new Intent(LaunchesDetailActivity.this, ImageSliderActivity.class);
                    mIntentImage.putStringArrayListExtra(ImageSliderActivity.ARG_IMAGE_ARRAY, (ArrayList<String>) mLaunch.getLinks().getFlickrImages());
                    startActivity(mIntentImage);
                }
            }
        });

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null)
        {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            mLaunch = (Launches) getIntent().getParcelableExtra(LaunchesDetailFragment.ARG_ITEM_LAUNCH);
            arguments.putParcelable(LaunchesDetailFragment.ARG_ITEM_LAUNCH, mLaunch);
            LaunchesDetailFragment fragment = new LaunchesDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.item_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            navigateUpTo(new Intent(this, LaunchesListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
