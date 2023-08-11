package br.com.projetoapi.produtos.controller;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/produtos")
public class ProdutosController {
	
	//Retorna uma lista de produtos (Método: GET)
	@SuppressWarnings("unchecked")
	@GetMapping
	public JSONObject getListProdutos () {
		//Cria uma referência para um objeto do tipo JSON
		JSONObject dadosProduto = new JSONObject();
		
		//Cria um JSON para um produto
		dadosProduto.put("nome", "Mouse");
		dadosProduto.put("descricao", "Mouse preto RGB");
		dadosProduto.put("qtde", "50");
		dadosProduto.put("valor_unitario", "90.30");
		
		return dadosProduto;
	}
	
	//Recebe um novo produto para salvar no BD
	@PostMapping
	@RequestStatus(HttpStatus.CREATED)
	public void setNovoProduto (@RequestBody JSONObject dadosBody) {
		System.out.println(dadosBody);
	}
}
