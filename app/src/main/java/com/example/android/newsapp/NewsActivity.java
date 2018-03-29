package com.example.android.newsapp;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<News>> {
    private static String USGS_REQUEST_URL;
    private NewsAdapter mAdapter;
    private TextView mEmptyTextView;
    private ProgressBar mProgressBar;

    private static final int EARTHQUAKE_LOADER_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Bundle b = getIntent().getExtras();

        USGS_REQUEST_URL = b.getString("url");

        ListView newsListView = (ListView) findViewById(R.id.list);
        mEmptyTextView = findViewById(R.id.text_empty_view);
        mProgressBar = findViewById(R.id.loading_spinner);

        newsListView.setEmptyView(mEmptyTextView);

        mAdapter = new NewsAdapter(this, new ArrayList<>());
        newsListView.setAdapter(mAdapter);
        newsListView.setOnItemClickListener((adapterView, view, position, l) -> {
            News currentNews = mAdapter.getItem(position);

            Uri newsUri = Uri.parse(currentNews.getUrlArticle());

            Intent websiteIntent = new Intent(Intent.ACTION_VIEW, newsUri);
            startActivity(websiteIntent);
        });
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();

            loaderManager.initLoader(EARTHQUAKE_LOADER_ID, null, this);
        } else {
            View loadingIndicator = findViewById(R.id.loading_spinner);
            loadingIndicator.setVisibility(View.GONE);
            mEmptyTextView.setText(R.string.no_internet_connection);
        }

    }

    @Override
    public Loader<List<News>> onCreateLoader(int id, Bundle args) {
        return new NewsLoader(this, USGS_REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<News>> loader, List<News> news) {
        mProgressBar.setVisibility(View.GONE);
        mEmptyTextView.setText(R.string.empty_text);
        mAdapter.clear();

        if (news != null && !news.isEmpty()) {
            mAdapter.addAll(news);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<News>> loader) {
        mAdapter.clear();
    }
}
