package com.eShop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QuestionOptions {

	private Long questionOptionId;
	private Long questionId;
	private String optionText;
	
	@Id
	@GeneratedValue
	public Long getQuestionOptionId() {
		return questionOptionId;
	}
	public void setQuestionOptionId(Long questionOptionId) {
		this.questionOptionId = questionOptionId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getOptionText() {
		return optionText;
	}
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	
}
