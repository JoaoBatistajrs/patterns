package patterns.gof.Services.Interface;

import patterns.gof.Model.Cliente;

public interface IClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}
