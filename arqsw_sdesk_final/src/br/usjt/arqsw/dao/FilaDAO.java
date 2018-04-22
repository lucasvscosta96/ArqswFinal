package br.usjt.arqsw.dao;

import java.io.IOException;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.usjt.arqsw.entity.Fila;
/**
 * 
 * @author Lucas Vinicius de Souza Costa 201516438
 *
 */
@Repository
public class FilaDAO {
	@PersistenceContext
	EntityManager manager;
		
	@SuppressWarnings("unchecked")
	public List<Fila> listarFilas() throws IOException {
		return manager.createQuery("select f from Fila f").getResultList();
	}

	public Fila carregar(int id) throws IOException{
		return manager.find(Fila.class, id);
	}
	
}
