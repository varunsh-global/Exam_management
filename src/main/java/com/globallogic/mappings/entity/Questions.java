package com.globallogic.mappings.entity;


import javax.persistence.*;

@Entity
@Table(name="Questions")
public class Questions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column
	String question;
	
	@Column
	String answer;

	public Questions() {
		super();
	}

	public Questions(long id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
