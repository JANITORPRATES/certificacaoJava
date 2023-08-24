package scr.OCPGUIACOMPLETO.outro;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTeste {
	
	
	public static void main(String[] args) {
		OptionalTeste optinal = new OptionalTeste();
		ContaClienteNonPersoPJDTO conta1 = optinal. new ContaClienteNonPersoPJDTO(1L, 1);
		ContaClienteNonPersoPJDTO conta2 = optinal. new ContaClienteNonPersoPJDTO(2L, 2);
		ContaClienteNonPersoPJDTO conta3 = optinal. new ContaClienteNonPersoPJDTO(3L, 3);
		ContaClienteNonPersoPJDTO conta4 = optinal. new ContaClienteNonPersoPJDTO(4L, null);
		
		List<ContaClienteNonPersoPJDTO> lista = Arrays.asList(conta1, conta2, conta3, conta4);
		
		lista = lista.stream().filter(
				c ->{
					Optional<Integer> optionalInteger = Optional.ofNullable(c.getCodigoCliente());
					System.out.println(optionalInteger);
					if(optionalInteger.isPresent()) {
						//return c.getCodigoCliente().equals(4);
						return optionalInteger.get().equals(4);
					}
							
					return false;
					
					//return optionalInteger.equals(4);
				
				})
				.collect(Collectors.toList());
		
		System.out.println(lista);
	}
	

	
	class ContaClienteNonPersoPJDTO {
		
		private Long cpf;
		private Integer codigoCliente;
		
		public ContaClienteNonPersoPJDTO(Long cpf, Integer codigoCliente) {
			this.cpf = cpf;
			this.codigoCliente = codigoCliente;
		}
		
		
		public Long getCpf() {
			return cpf;
		}
		public void setCpf(Long cpf) {
			this.cpf = cpf;
		}
		public Integer getCodigoCliente() {
			return codigoCliente;
		}
		public void setCodigoCliente(Integer codigoCliente) {
			this.codigoCliente = codigoCliente;
		}


		@Override
		public String toString() {
			return "ContaClienteNonPersoPJDTO [codigoCliente=" + codigoCliente + "]";
		}
		
		
		
		
	}
}
