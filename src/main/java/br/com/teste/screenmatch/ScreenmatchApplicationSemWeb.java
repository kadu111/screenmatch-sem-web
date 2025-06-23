//package br.com.teste.screenmatch;
//
//import br.com.teste.screenmatch.principal.Principal;
//import br.com.teste.screenmatch.repository.SerieRepository;
//import io.github.cdimascio.dotenv.Dotenv;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class ScreenmatchApplicationSemWeb implements CommandLineRunner {
//
//	@Autowired
//	private SerieRepository repositorio;
//
//	public static void main(String[] args) {
//		Dotenv dotenv = Dotenv.load();
//		dotenv.entries().forEach(entry ->
//				System.setProperty(entry.getKey(), entry.getValue())
//		);
//		SpringApplication.run(ScreenmatchApplicationSemWeb.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(repositorio);
//		principal.exibeMenu();
//	}
//}
