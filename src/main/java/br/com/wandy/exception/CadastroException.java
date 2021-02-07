package br.com.wandy.exception;

public class CadastroException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1556952987872342011L;
	
	public CadastroException(Long id) {
		super("Cadastro nãao encontrado");
	}

}
