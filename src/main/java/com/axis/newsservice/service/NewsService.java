package com.axis.newsservice.service;

import java.util.List;

import com.axis.newsservice.entity.News;

public interface NewsService {

	News getNewsById(int newsId);
	List<News> getAllNews();
	void addNews(News news);
	void deleteNewsById(int newsId);
	void updateNewsById(int newsId, News news);
}
