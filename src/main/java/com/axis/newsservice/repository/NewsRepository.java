package com.axis.newsservice.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.axis.newsservice.entity.News;

public interface NewsRepository extends CrudRepository<News, Integer>{
	
	@Modifying
	@Query("update News set newsName=?1, newsContent=?2, newsFeedback=?3, newsComments=?4 where newsId=?5")
	void updateNewsInfo(String newsName,String newsContent,String newsFeedback,String newsComments,int newsId);

}
