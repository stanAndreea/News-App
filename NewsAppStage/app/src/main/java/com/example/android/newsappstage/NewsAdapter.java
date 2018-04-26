package com.example.android.newsappstage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_news, parent, false);
        }
        News newsCurrent = getItem(position);

        TextView nameArticle = listItemView.findViewById(R.id.name_article);
        nameArticle.setText(newsCurrent.getNameArticle());

        TextView sectionArticle = listItemView.findViewById(R.id.section_name);
        sectionArticle.setText(newsCurrent.getSectionName());

        TextView nameAuthor = listItemView.findViewById(R.id.author_name);
        nameAuthor.setText(newsCurrent.getNameAuthor());

        String dateTime = newsCurrent.getDatePublished();
        String[] dateAndTime = dataFormater(dateTime);

        TextView dataArticle = listItemView.findViewById(R.id.date);
        dataArticle.setText(dateAndTime[0]);

        TextView timeArticle = listItemView.findViewById(R.id.time);
        timeArticle.setText(dateAndTime[1]);


        return listItemView;
    }

    private String[] dataFormater(String dateTime) {
        String[] dateAndTimeSplit = dateTime.replace("T", " ").replace("Z", " ").trim().split(" ");

        return dateAndTimeSplit;
    }
}
