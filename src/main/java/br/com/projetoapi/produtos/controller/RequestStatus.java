package br.com.projetoapi.produtos.controller;

import org.springframework.http.HttpStatus;

public @interface RequestStatus {

	HttpStatus value();

}
