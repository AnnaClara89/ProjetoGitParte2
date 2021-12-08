package   com.senai.anna ;

import   java.util.Arrays ;

import   org.springframework.beans.factory.annotation.Autowired ;
import   org.springframework.boot.CommandLineRunner ;
import   org.springframework.boot.SpringApplication ;
import   org.springframework.boot.autoconfigure.SpringBootApplication ;

import   com.senai.anna.domain.Cidade ;
import   com.senai.anna.domain.Cliente ;
import   com.senai.anna.domain.Endereco ;
import   com.senai.anna.domain.Estado ;
import   com.senai.anna.domain.enums.TipoCliente ;
import   com.senai.anna.repositories.CidadeRepository ;
import   com.senai.anna.repositories.ClienteRepository ;
import   com.senai.anna.repositories.EstadoRepository ;
@SpringBootApplication
public   class   AnnaAplication   implementa CommandLineRunner {

	@Autowired
private   EstadoRepository estadoRepository;
	@Autowired 
private   ClienteRepository clienteRepository;
	
	@Autowired
	private   ClienteRepository   ClienteRepository ;
	
	@Autowired
	  com privado . senai . anna . repositórios .  EnderecoRepository   EnderecoRepository ;
	
	@Autowired
	privado   CidadeRepository cidadeRepository;
	public   static   void   main ( String [] args ) {
		SpringApplication  . executar ( AnnaAplication  . classe, args);
	} 
	@Sobrepor
	public   void   run ( String ... args ) throws   Exception {
		Estado est1 =   novo   Estado (nulo, " São Paulo " , nulo);
		Estado est2 =   novo   Estado (nulo, " Minas Gerais " , nulo);
		estadoRepository . saveAll ( Arrays  . asList (est1, est2));
		
		Cidade c1 =   nova   Cidade (nulo, " São Paulo " , est1);
		Cidade c2 =   nova   Cidade ( null , " Uberlândia " , est2);
		cidadeRepository . saveAll ( Arrays  . asList (c1, c2));
		
	
	Cliente cli =   novo   Cliente (nulo, " Anna Clara Ribeiro " , " 85694123789 " , " naclararibs89@gmail.com " , TipoCliente  .  PESSOAFISICA );
	cli . getTelefones () . addAll ( Arrays  . asList ( " 987123544 " , " 96547710 " ));
	clienteRepository . saveAll ( Arrays  . asList (cli));
	
	Endereco e1 =   novo   Endereco (nulo, " Rua Da Amora " , " 12 " , "  " , " São Sebastião " , " 63918754 " , cli, c1);
	
	cli . getEnderecos () . addAll ( Arrays  . asList (e1));
	
	EnderecoRepository  . saveAll ( Arrays  . asList (e1));
	}
	public   ClienteRepository   getClienteRepository () {
		return   ClienteRepository ;
	}
	public   void   setClienteRepository ( ClienteRepository   clienteRepository ) {
		ClienteRepository   = clienteRepository;
	}
	}