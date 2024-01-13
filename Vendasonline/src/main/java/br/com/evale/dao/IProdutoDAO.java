/**
 * 
 */
package br.com.dao;

import java.util.List;

import br.com.rpires.dao.generic.IGenericDAO;
import br.com.rpires.domain.Produto;

/**
 *
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
