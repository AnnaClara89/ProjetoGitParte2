import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senai.anna.domain.Cliente;
import com.senai.anna.domain.Estado;
import com.senai.anna.domain.enums.TipoCliente;
import com.senai.anna.repositories.ClienteRepository;
import com.senai.anna.repositories.EstadoRepository;
@SpringBootApplication
public class AnnaAplication implements CommandLineRunner { 

	@Autowired
    private EstadoRepository estadoRepository; 
	@Autowired 
	private ClienteRepository clienteRepository; 
	public static void main(String[] args) {
		SpringApplication.run(AnnaAplication.class, args); 
	} 
	@Override
	public void run(String... args ) throws Exception {
		Estado est1 = new Estado(null ,"São Paulo", null); 
		Estado est2 = new Estado(null ,"Rio de Janeiro", null);
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
	
	Cliente cli = new Cliente(null, "Anna Clara Ribeiro", "85694123789", "naclararibs89@gmail.com" , TipoCliente.PESSOAFISICA );
	cli.getTelefones().addAll(Arrays.asList("987123544", "96547710" ));
	clienteRepository.saveAll(Arrays.asList(cli));
	}
	}
