package com.axis.newsservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class News {

	@Id
	private int newsId;
	private String newsName;
	private String newsContent;
	private String newsFeedback;
	private String newsComments;
	
	public News() {
		
	}

	public News(int newsId, String newsName, String newsContent, String newsFeedback, String newsComments) {
		super();
		this.newsId = newsId;
		this.newsName = newsName;
		this.newsContent = newsContent;
		this.newsFeedback = newsFeedback;
		this.newsComments = newsComments;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getNewsName() {
		return newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getNewsFeedback() {
		return newsFeedback;
	}

	public void setNewsFeedback(String newsFeedback) {
		this.newsFeedback = newsFeedback;
	}

	public String getNewsComments() {
		return newsComments;
	}

	public void setNewsComments(String newsComments) {
		this.newsComments = newsComments;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsName=" + newsName + ", newsContent=" + newsContent + ", newsFeedback="
				+ newsFeedback + ", newsComments=" + newsComments + "]";
	}
	
	
}
