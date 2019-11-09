package controller;

import java.sql.SQLException;

import model.dao.AlunoDao;
import model.dao.DataBaseUtil;
import model.obj.Aluno;

public class CadastroController {
	
	public static void main(String[] args) {
		try {
			System.out.println("Cadastrando aluno");
			cadastrarAluno();
		} catch (SQLException e) {
			System.out.println("Erro aluno");
			e.printStackTrace();
		}finally {
			try {
				System.out.println("fechando o banco");
				DataBaseUtil.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void cadastrarAluno() throws SQLException {
		Aluno a = new Aluno();
		a.setNome("Severo");
		a.setRa("66666666669");
		
		AlunoDao daoAluno = new AlunoDao();
		daoAluno.insert(a, a.getNome(),a.getRa());
	}
}
