import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		String login, nome, email, segredo, segredo2;
		int user, opcao, selecao1;
		
		Scanner ler = new Scanner(System.in);
		
		try {
			System.out.println("1- Para se cadastrar 2- Se você já é cadastrado");
			user = ler.nextInt();
			
			if (user != 1 && user != 2 ) {
				System.out.println("/nErro!/n");
				System.out.println("Fim do programa");
				System.exit(0);
			}
			switch (user) {
			case 1:
				System.out.println("Digite seu nome:");
				nome = ler.next();
				
				System.out.println("Digite seu email:");
				email = ler.next();
				
				System.out.println("Digite uma senha");
				segredo = ler.next();
				
				System.out.println("Confirme sua senha");
				segredo2 = ler.next();
				
				if (segredo.equals(segredo2)) {
					System.out.println("Cadastro realizado com sucesso!");
				} else {
					System.out.println("As senhas não conferem, verifique e tente novamente!");
					
					System.out.println("Digite uma senha alfanumérica:");
					segredo = ler.next();

					System.out.println("Confirme a senha:");
					segredo2 = ler.next();
					if (!segredo.equals(segredo2)) {
						System.out.println("/nErro!/n");
						System.out.println("/nFim do programa");
						System.exit(0);
				} else {
					System.out.println("Cadastro realizado com sucesso!");
				}
			}
				break;
				
			case 2: 
			{
				System.out.println("Digite seu email: ");
				login = ler.next();
				System.out.println("Digite sua senha: ");
				login = ler.next();
				System.out.println();
			}
			break;
		}
			System.out.println("Bem vindo");
			System.out.println("Escolha a modalidade do titulo");
			
			
			//Inicio da estrutura.
			ArrayList<Titulos> titulosFemininos = new ArrayList<Titulos>();
			
			Titulos tituloFem2010 = new Titulos();
			tituloFem2010.setNome("Hou Yifan");
			tituloFem2010.setIdade("16");
			tituloFem2010.setPais("China");
			tituloFem2010.setRating(2650);
			
			Titulos tituloFem2011 = new Titulos();
			tituloFem2011.setNome("Hou Yifan");
			tituloFem2011.setIdade("17");
			tituloFem2011.setPais("China");
			tituloFem2011.setRating(2650);
			
			Titulos tituloFem2012 = new Titulos();
			tituloFem2012.setNome("Hou Yifan");
			tituloFem2012.setIdade("18");
			tituloFem2012.setPais("China");
			tituloFem2012.setRating(2650);
			
			Titulos tituloFem2013 = new Titulos();
			tituloFem2013.setNome("Anna Ushenina");
			tituloFem2013.setIdade("28");
			tituloFem2013.setPais("Ucrania");
			tituloFem2013.setRating(2423);
			
			Titulos tituloFem2014 = new Titulos();
			tituloFem2014.setNome("Hou Yifan");
			tituloFem2014.setIdade("20");
			tituloFem2014.setPais("China");
			tituloFem2014.setRating(2650);
			
			Titulos tituloFem2015 = new Titulos();
			tituloFem2015.setNome("Hou Yifan");
			tituloFem2015.setIdade("21");
			tituloFem2015.setPais("China");
			tituloFem2015.setRating(2650);
			
			Titulos tituloFem2016 = new Titulos();
			tituloFem2016.setNome("Mariya Muzychuk");
			tituloFem2016.setIdade("24");
			tituloFem2016.setPais("Ucrania");
			tituloFem2016.setRating(2540);
			
			Titulos tituloFem2017 = new Titulos();
			tituloFem2017.setNome("Hou Yifan");
			tituloFem2017.setIdade("16");
			tituloFem2017.setPais("China");
			tituloFem2017.setRating(2650);
			
			titulosFemininos.add(tituloFem2010);
			titulosFemininos.add(tituloFem2011);
			titulosFemininos.add(tituloFem2012);
			titulosFemininos.add(tituloFem2013);
			titulosFemininos.add(tituloFem2014);
			titulosFemininos.add(tituloFem2015);
			titulosFemininos.add(tituloFem2016);
			titulosFemininos.add(tituloFem2017);
			
			
			
			ArrayList<Titulos> titulosMasculinos = new ArrayList<Titulos>();
			
			Titulos tituloMas2010 = new Titulos();
			tituloMas2010.setNome("Viswanathan Anand");
			tituloMas2010.setIdade("41");
			tituloMas2010.setPais("India");
			tituloMas2010.setRating(2753);
			
			Titulos tituloMas2011 = new Titulos();
			tituloMas2011.setNome("Peter Svidler");
			tituloMas2011.setIdade("35");
			tituloMas2011.setPais("Russia");
			tituloMas2011.setRating(2683);
			
			Titulos tituloMas2012 = new Titulos();
			tituloMas2012.setNome("Viswanathan Anand");
			tituloMas2012.setIdade("43");
			tituloMas2012.setPais("India");
			tituloMas2012.setRating(2753);
			
			Titulos tituloMas2013 = new Titulos();
			tituloMas2013.setNome("Magnus Carlsen");
			tituloMas2013.setIdade("23");
			tituloMas2013.setPais("Noruega");
			tituloMas2013.setRating(2863);
			
			Titulos tituloMas2014 = new Titulos();
			tituloMas2014.setNome("Magnus Carlsen ");
			tituloMas2014.setIdade("24");
			tituloMas2014.setPais("Noruega");
			tituloMas2014.setRating(2863);
			
			Titulos tituloMas2015 = new Titulos();
			tituloMas2015.setNome("Magnus Carlsen ");
			tituloMas2015.setIdade("25");
			tituloMas2015.setPais("Noruega");
			tituloMas2015.setRating(2863);
			
			Titulos tituloMas2016 = new Titulos();
			tituloMas2016.setNome("Magnus Carlsen ");
			tituloMas2016.setIdade("26");
			tituloMas2016.setPais("Noruega");
			tituloMas2016.setRating(2863);
			
			Titulos tituloMas2017 = new Titulos();
			tituloMas2017.setNome("Levon Aronian");
			tituloMas2017.setIdade("35");
			tituloMas2017.setPais("Armenio");
			tituloMas2017.setRating(2775);
			
			Titulos tituloMas2018 = new Titulos();
			tituloMas2018.setNome("Magnus Carlsen ");
			tituloMas2018.setIdade("28");
			tituloMas2018.setPais("Noruega");
			tituloMas2018.setRating(2863);
			
			Titulos tituloMas2019 = new Titulos();
			tituloMas2019.setNome("Magnus Carlsen ");
			tituloMas2019.setIdade("26");
			tituloMas2019.setPais("Noruega");
			tituloMas2019.setRating(2863);
			
			titulosMasculinos.add(tituloMas2010);
			titulosMasculinos.add(tituloMas2011);
			titulosMasculinos.add(tituloMas2012);
			titulosMasculinos.add(tituloMas2013);
			titulosMasculinos.add(tituloMas2014);
			titulosMasculinos.add(tituloMas2015);
			titulosMasculinos.add(tituloMas2016);
			titulosMasculinos.add(tituloMas2017);
			titulosMasculinos.add(tituloMas2018);
			titulosMasculinos.add(tituloMas2019);
			
			//Final da estrutura.
			
			//Inicio do questionario
			do {
				System.out.println("Escolha a modalidade do titulo de xadrez:");
				System.out.println("1- Feminino 2- masculino");
				opcao = ler.nextInt();
				
				if (opcao != 1 && opcao != 2) {
					System.out.println("Opção invalida. Erro!");
					System.exit(0);
				}
				Titulos tituloEscolhido = new Titulos();
				
				switch (opcao) {
				case 1: {
					System.out.println("Escolha o ano: /n");
					System.out.println("1- 2010 /n");
					System.out.println("2- 2011 /n");
					System.out.println("3- 2012 /n");
					System.out.println("4- 2013 /n");
					System.out.println("5- 2014 /n");
					System.out.println("6- 2015 /n");
					System.out.println("7- 2016 /n");
					System.out.println("8- 2017 /n");
				}
				selecao1 = ler.nextInt();
				if (selecao1 != 1 && selecao1 != 2 && selecao1 != 3 && selecao1 != 4 && selecao1 != 5 && selecao1 != 6 && selecao1 != 7 && selecao1 != 8) {
					System.out.println("Erro!");
					System.exit(0);
				}
				if (selecao1 == 1) {
					tituloEscolhido = titulosFemininos.get(0);
					mostrarTitulo(tituloEscolhido);
				} else if (selecao1 == 2) {
					tituloEscolhido = titulosFemininos.get(1);
					mostrarTitulo(tituloEscolhido);
				} else if (selecao1 == 3) {
					tituloEscolhido = titulosFemininos.get(2);
					mostrarTitulo(tituloEscolhido);
				}else if (selecao1 == 4) {
					tituloEscolhido = titulosFemininos.get(3);
					mostrarTitulo(tituloEscolhido);
				}else if (selecao1 == 5) {
					tituloEscolhido = titulosFemininos.get(4);
					mostrarTitulo(tituloEscolhido);
				}else if (selecao1 == 6) {
					tituloEscolhido = titulosFemininos.get(5);
					mostrarTitulo(tituloEscolhido);
				}else if (selecao1 == 7) {
					tituloEscolhido = titulosFemininos.get(6);
					mostrarTitulo(tituloEscolhido);
				}else if (selecao1 == 8) {
					tituloEscolhido = titulosFemininos.get(7);
					mostrarTitulo(tituloEscolhido);
				}
				break;
				case 2: 
					
					System.out.println("Escolha o ano: /n");
					System.out.println("1- 2010 /n");
					System.out.println("2- 2011 /n");
					System.out.println("3- 2012 /n");
					System.out.println("4- 2013 /n");
					System.out.println("5- 2014 /n");
					System.out.println("6- 2015 /n");
					System.out.println("7- 2016 /n");
					System.out.println("8- 2017 /n"); 
					System.out.println("9- 2018 /n");
					System.out.println("10- 2019 /n");
					
					selecao1 = ler.nextInt();
					if (selecao1 != 1 && selecao1 != 2 && selecao1 != 3 && selecao1 != 4 && selecao1 != 5 && selecao1 != 6 && selecao1 != 7 && selecao1 != 8  && selecao1 != 9 && selecao1 != 10) {
						System.out.println("Erro!");
						System.exit(0);
						}
					
					if (selecao1 == 1) {
						tituloEscolhido = titulosMasculinos.get(0);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 2) {
						tituloEscolhido = titulosMasculinos.get(1);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 3) {
						tituloEscolhido = titulosMasculinos.get(2);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 4) {
						tituloEscolhido = titulosMasculinos.get(3);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 5) {
						tituloEscolhido = titulosMasculinos.get(4);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 6) {
						tituloEscolhido = titulosMasculinos.get(5);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 7) {
						tituloEscolhido = titulosMasculinos.get(6);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 8) {
						tituloEscolhido = titulosMasculinos.get(7);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 9) {
						tituloEscolhido = titulosMasculinos.get(8);
						mostrarTitulo(tituloEscolhido);
						}else if (selecao1 == 10) {
						tituloEscolhido = titulosMasculinos.get(9);
						mostrarTitulo(tituloEscolhido);
						}
					break;	
				}
			}
		}
	}
	static void mostrarTitulo(Titulos titulos) {
		System.out.println("/n" + titulos.getNome() + "/n" + titulos.getIdade() + "/n" + titulos.getPais() + "/n"
				+ titulos.getRating() + "anos/n");
}
}
