package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

/**
 * @author fsdney
 */


@Data
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private double preco;
	public void setId(String id2) {
		// TODO Auto-generated method stub
		
	}
}
