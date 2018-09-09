package com.eShop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserQuestionnair {

	private Long userQuestionnairId;
	private Long userId;
	private Long questionId;
	private Long questionOptionId;
	
	@Id
	@GeneratedValue
	public Long getUserQuestionnairId() {
		return userQuestionnairId;
	}
	public void setUserQuestionnairId(Long userQuestionnairId) {
		this.userQuestionnairId = userQuestionnairId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public Long getQuestionOptionId() {
		return questionOptionId;
	}
	public void setQuestionOptionId(Long questionOptionId) {
		this.questionOptionId = questionOptionId;
	}
	
}
