package br.com.posweb.webservice.entidades;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Produto {

	@Id
	private int id;

	private String descricao;

	private int codigo;

	private String categoria;

}
