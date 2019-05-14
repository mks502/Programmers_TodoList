package com.todolist.mks.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Todo Entity
@Entity 
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Todo {
	//JPA 권장에 따른 생성키
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Long tid;
	String title;
	String content;
}