// Uma interface n�o pode ter nada de concreto - apenas as assinaturas dos m�todos
// Contrato Autentic�vel
	// Quem assina esse contrato, precisa implementar
		// m�todo setSenha
		// m�todo autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
