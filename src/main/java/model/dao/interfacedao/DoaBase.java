package model.dao.interfacedao;

import java.sql.SQLException;

public abstract interface DoaBase<T>{

	public void insert(T o,String...txt) throws SQLException;
	
}
