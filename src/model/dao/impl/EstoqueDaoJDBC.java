package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dao.EstoqueDao;
import model.entities.Estoque;

public class EstoqueDaoJDBC implements EstoqueDao{

	private Connection conn;
	public EstoqueDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Estoque obj) {
		PreparedStatement st = null;
		try {
		/*	st = conn.prepareStatement(
					"INSERT INTO Department "
					+ "(Name) "
					+ "VALUES "
					+ "(?)",
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getName());
		*/	

			
			st = conn.prepareStatement("INSERT INTO Estoque "
			+ "(codigo, barras, fabricante, descricao, categoria, qtde, "
			+ "precoc, unidade, precov, fornece1, obs, local) "
			+ "VALUES (000022255, 00022255548, 'fabricante', 'descricao', 1, 15, 15.25, 'UN-', 35.50, 2, 'observação', 'prateleira do meio')",
			Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getDescricao());
			
			
			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}
			else {
				System.out.println("No rows affected!");
			}

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}



	}
/*
	@Override
	public void update(Estoque obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("UPDATE department SET Name = ? WHERE id = ?");
			st.setString(1, obj.getName());
			st.setInt(2, obj.getId());
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
	}
*/
	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM department WHERE ID = ?");
			st.setInt(1, id);
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public Estoque findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT estoque.* FROM estoque WHERE estoque.Id = ?");
			st.setInt(1, id);

			rs = st.executeQuery();

			if (rs.next()) {
				Estoque est = instantiateEstoque(rs);
				return est;
			}
			return null;

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}


	}
	private Estoque instantiateEstoque(ResultSet rs) throws SQLException {
		Estoque est = new Estoque();
		est.setId(rs.getInt(1));
		est.setCodigo(rs.getString("codigo"));
		est.setBarras(rs.getString("barras"));
		est.setDescricao(rs.getString("Descricao"));
		est.setQtde(rs.getInt("qtde"));
		est.setUnidade(rs.getString("unidade"));
		est.setPrecov(rs.getDouble("precov"));
		est.setLocal(rs.getString("local"));
		return est;
	}

	@Override
	public List<Estoque> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT Estoque.* FROM estoque ORDER BY id");

			rs = st.executeQuery();

			List<Estoque> list = new ArrayList<>();
			Map<Integer, Estoque> map = new HashMap<>();

			while (rs.next()) {

				Estoque est = map.get(rs.getInt(1));
				if (est == null) {
					est = instantiateEstoque(rs);
					map.put(rs.getInt(1), est);
				}

				Estoque obj = instantiateEstoque(rs);
				list.add(obj);

			}
			return list;

		}catch ( SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
/*
	@Override
	public void insert(Estoque obj) {
		// TODO Auto-generated method stub
		
	}
*/
	@Override
	public void update(Estoque obj) {
		// TODO Auto-generated method stub
		
	}
}
