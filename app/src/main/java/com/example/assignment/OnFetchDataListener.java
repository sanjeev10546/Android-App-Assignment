package com.example.assignment;

import com.example.assignment.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFatchData(List<NewsHeadlines>list,String massage);
    void onError(String message);
}
