package com.axis.newsservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.newsservice.entity.News;
import com.axis.newsservice.exception.NewsNotFoundException;
import com.axis.newsservice.repository.NewsRepository;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsRepository newsRepository;

	@Override
	public News getNewsById(int newsId) {
		Optional<News> newsOpt=newsRepository.findById(newsId);
		if(!newsOpt.isPresent())
			throw new NewsNotFoundException("News not found by News Id "+newsId);
		return newsOpt.get();
	}

	@Override
	public List<News> getAllNews() {
		return (List<News>) newsRepository.findAll();
	}

	@Override
	public void addNews(News news) {
		newsRepository.save(news);

	}

	@Override
	public void deleteNewsById(int newsId) {
		Optional<News> newsOpt=newsRepository.findById(newsId);
		if(!newsOpt.isPresent())
			throw new NewsNotFoundException("News not found by News Id "+newsId);
		newsRepository.deleteById(newsId);

	}
	
	@Transactional
	@Override
	public void updateNewsById(int newsId, News news) {
		newsRepository.updateNewsInfo(news.getNewsName(),
									news.getNewsContent(),
									news.getNewsFeedback(),
									news.getNewsComments(), 
									news.getNewsId());

	}

}
