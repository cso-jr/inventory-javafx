package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.EstoqueDao;
import model.entities.Estoque;

public class EstoqueService {

	
	private EstoqueDao dao = DaoFactory.createEstoqueDao();
	
	public List<Estoque> findAll(){
		/*
		List<Estoque> list = new ArrayList<Estoque>();
		
		list.add(new Estoque(null, "Cod452187", "Bar35137", "descricao do produto 1", 1, "UN-", 12.52, "Prateleira do meio"));
		list.add(new Estoque(null, "Cod455555", "Bar356187468", "descricao do produto 2", 1, "UN-", 12.52, "Prateleira do meio"));
		list.add(new Estoque(null, "Cod400001", "Bar35137468741", "descricao do produto 3", 1, "UN-", 12.52, "Prateleira do meio"));
		
		return list;
		*/
		return dao.findAll();
		
	}
	
	
}
