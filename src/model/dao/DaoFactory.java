package model.dao;

import db.DB;
import model.dao.impl.EstoqueDaoJDBC;

public class DaoFactory {
/*
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());

	}

	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());

	}
*/
	public static EstoqueDao createEstoqueDao() {
		return new EstoqueDaoJDBC(DB.getConnection());
	}
	
	
}
