package model.dao;

import java.sql.SQLException;

import model.dao.interfacedao.DoaBase;
import model.obj.Aluno;

public class AlunoDao extends DataBaseUtil implements DoaBase{

	
	public void insert(Object o, String...txt) throws SQLException {
		getConnection();
		setPrepareStatement("INSERT INTO aluno (nome, ra) VALUES (?, ?)");
		getPreparedStatement().setString(1, txt[0]);
		getPreparedStatement().setString(2, txt[1]);
		getPreparedStatement().executeUpdate();
		closeAll();
	}

	
		

		
}
