package com.pritesh.midterm_spacexdata_android.ui.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.pritesh.midterm_spacexdata_android.R;
import com.pritesh.midterm_spacexdata_android.adapters.LaunchesRecyclerViewAdapter;
import com.pritesh.midterm_spacexdata_android.models.Launches;
import com.pritesh.midterm_spacexdata_android.network.SpacexApiClient;
import com.pritesh.midterm_spacexdata_android.network.SpacexApiInterface;

import java.util.List;

/**
 * An activity representing a list of Items. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link LaunchesDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class LaunchesListActivity extends AppCompatActivity
{

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launches_list);

        getAllLaunches();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        if (findViewById(R.id.item_detail_container) != null)
        {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        mRecyclerView = findViewById(R.id.item_list);

    }

    private void getAllLaunches()
    {
        SpacexApiInterface apiService =
                SpacexApiClient.getClient().create(SpacexApiInterface.class);

        Call<List<Launches>> apiServiceData = apiService.getLaunches();
        apiServiceData.enqueue(new Callback<List<Launches>>()
        {
            @Override
            public void onResponse(Call<List<Launches>> call, Response<List<Launches>> response)
            {
                Log.d("TOTAL", String.valueOf(response.body().size()));
                mRecyclerView.setAdapter(new LaunchesRecyclerViewAdapter(LaunchesListActivity.this, response.body(), mTwoPane));
            }

            @Override
            public void onFailure(Call<List<Launches>> call, Throwable t)
            {
                Log.d("TOTAL ERROR", t.getMessage());
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.mnuList)
        {
            Intent mIntent = new Intent(this, SplashActivity.class);
            startActivity(mIntent);
        }
        return super.onOptionsItemSelected(item);
    }

}
