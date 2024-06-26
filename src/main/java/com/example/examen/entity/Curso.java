package com.example.examen.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "curso")
public class Curso {

	private ObjectId _id;
	private int idCurso;
	private String nombre;

}
