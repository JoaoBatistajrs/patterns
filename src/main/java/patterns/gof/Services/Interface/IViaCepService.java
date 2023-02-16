package patterns.gof.Services.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import patterns.gof.Model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface IViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
