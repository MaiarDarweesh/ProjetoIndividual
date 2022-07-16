import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		String login, nome = null, email, segredo, segredo2; //pq aqui eu precisei cirar a variavel para o nome?
		int user, opcao, selecao1;
		char resposta;
		Scanner ler = new Scanner(System.in);

		try {
			System.out.println("1- Para se cadastrar 2- Se voc� j� � cadastrado");
			user = ler.nextInt();

			if (user != 1 && user != 2) {
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
					System.out.println("As senhas n�o conferem, verifique e tente novamente!");

					System.out.println("Digite uma senha alfanum�rica:");
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

			case 2: {
				System.out.println("Qual o seu nome?");
				nome = ler.next();
				System.out.println("Digite seu email: ");
				email = ler.next();
				System.out.println("Digite sua senha: ");
				segredo = ler.next();
			}
				break;
			}
			System.out.println("Ol� " + nome + " Bem vindo no LichesCampe�es! \nEsse projeto consiste em te mostrar as campe�s ou campe�es do xadrez mundial.");

			// Inicio da estrutura.
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
			tituloMas2019.setNome("Magnus Carlsen");
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
			
			ArrayList<Titulos> titulosBrasileirosMasculinos = new ArrayList<Titulos>();

			Titulos tituloBraMas2010 = new Titulos();
			tituloBraMas2010.setNome("Giovanni Vescovi");
			tituloBraMas2010.setIdade("32");
			tituloBraMas2010.setRating(2606);
			
			Titulos tituloBraMas2011 = new Titulos();
			tituloBraMas2011.setNome("Rafael Leit�o");
			tituloBraMas2011.setIdade("32");
			tituloBraMas2011.setRating(2592);
			
			Titulos tituloBraMas2012 = new Titulos();
			tituloBraMas2012.setNome("Krikor Mekhitarian");
			tituloBraMas2012.setIdade("26");
			tituloBraMas2012.setRating(2554);
			
			Titulos tituloBraMas2013 = new Titulos();
			tituloBraMas2013.setNome("Rafael Leit�o");
			tituloBraMas2013.setIdade("34");
			tituloBraMas2013.setRating(2592);
			
			Titulos tituloBraMas2014 = new Titulos();
			tituloBraMas2014.setNome("Rafael Leit�o");
			tituloBraMas2014.setIdade("35");
			tituloBraMas2014.setRating(2592);
			
			Titulos tituloBraMas2015 = new Titulos();
			tituloBraMas2015.setNome("Krikor Mekhitarian");
			tituloBraMas2015.setIdade("26");
			tituloBraMas2015.setRating(2554);
			
			Titulos tituloBraMas2016 = new Titulos();
			tituloBraMas2016.setNome("Everaldo Matsuura");
			tituloBraMas2016.setIdade("46");
			tituloBraMas2016.setRating(2451);
			
			Titulos tituloBraMas2017 = new Titulos();
			tituloBraMas2017.setNome("Alexandr Fier");
			tituloBraMas2017.setIdade("29");
			tituloBraMas2017.setRating(2560);
			
			Titulos tituloBraMas2018 = new Titulos();
			tituloBraMas2018.setNome("Roberto Junio Brito Molina");
			tituloBraMas2018.setIdade("33");
			tituloBraMas2018.setRating(2434);
			
			Titulos tituloBraMas2019 = new Titulos();
			tituloBraMas2019.setNome("Alexandr Fier");
			tituloBraMas2019.setIdade("31");
			tituloBraMas2019.setRating(2560);
			
			Titulos tituloBraMas2020 = new Titulos();
			tituloBraMas2020.setNome("Luis Paulo Supi");
			tituloBraMas2020.setIdade("24");
			tituloBraMas2020.setRating(2572);
			
			titulosBrasileirosMasculinos.add(tituloBraMas2010);
			titulosBrasileirosMasculinos.add(tituloBraMas2011);
			titulosBrasileirosMasculinos.add(tituloBraMas2012);
			titulosBrasileirosMasculinos.add(tituloBraMas2013);
			titulosBrasileirosMasculinos.add(tituloBraMas2014);
			titulosBrasileirosMasculinos.add(tituloBraMas2015);
			titulosBrasileirosMasculinos.add(tituloBraMas2016);
			titulosBrasileirosMasculinos.add(tituloBraMas2017);
			titulosBrasileirosMasculinos.add(tituloBraMas2018);
			titulosBrasileirosMasculinos.add(tituloBraMas2019);
			titulosBrasileirosMasculinos.add(tituloBraMas2020);
			
			ArrayList<Titulos> titulosBrasileirosFemininos = new ArrayList<Titulos>();
			
			Titulos tituloBraFem2010 = new Titulos();
			tituloBraFem2010.setNome("Vanessa Feliciano");
			tituloBraFem2010.setIdade("20");
			tituloBraFem2010.setRating(2290);
			
			Titulos tituloBraFem2011 = new Titulos();
			tituloBraFem2011.setNome("Art�mis Cruz");
			tituloBraFem2011.setIdade("16");
			tituloBraFem2011.setRating(0000);
			
			Titulos tituloBraFem2012 = new Titulos();
			tituloBraFem2012.setNome("Juliana Terao");
			tituloBraFem2012.setIdade("21");
			tituloBraFem2012.setRating(2311);
			
			Titulos tituloBraFem2013 = new Titulos();
			tituloBraFem2013.setNome("Vanessa Feliciano");
			tituloBraFem2013.setIdade("23");
			tituloBraFem2013.setRating(2290);
			
			Titulos tituloBraFem2014 = new Titulos();
			tituloBraFem2014.setNome("Vanessa Feliciano");
			tituloBraFem2014.setIdade("24");
			tituloBraFem2014.setRating(2290);
			
			Titulos tituloBraFem2015 = new Titulos();
			tituloBraFem2015.setNome("Juliana Terao");
			tituloBraFem2015.setIdade("24");
			tituloBraFem2015.setRating(2311);
			
			Titulos tituloBraFem2016 = new Titulos();
			tituloBraFem2016.setNome("Juliana Terao");
			tituloBraFem2016.setIdade("25");
			tituloBraFem2016.setRating(2311);
			
			Titulos tituloBraFem2017 = new Titulos();
			tituloBraFem2017.setNome("Juliana Terao");
			tituloBraFem2017.setIdade("26");
			tituloBraFem2017.setRating(2311);
			
			Titulos tituloBraFem2018 = new Titulos();
			tituloBraFem2018.setNome("Juliana Terao");
			tituloBraFem2018.setIdade("27");
			tituloBraFem2018.setRating(2311);
			
			Titulos tituloBraFem2019 = new Titulos();
			tituloBraFem2019.setNome("Juliana Terao");
			tituloBraFem2019.setIdade("28");
			tituloBraFem2019.setRating(2311);
			
			Titulos tituloBraFem2020 = new Titulos();
			tituloBraFem2020.setNome("Julia Alboredo");
			tituloBraFem2020.setIdade("27");
			tituloBraFem2020.setRating(2217);
			
			titulosBrasileirosFemininos.add(tituloBraFem2010);
			titulosBrasileirosFemininos.add(tituloBraFem2011);
			titulosBrasileirosFemininos.add(tituloBraFem2012);
			titulosBrasileirosFemininos.add(tituloBraFem2013);
			titulosBrasileirosFemininos.add(tituloBraFem2014);
			titulosBrasileirosFemininos.add(tituloBraFem2015);
			titulosBrasileirosFemininos.add(tituloBraFem2016);
			titulosBrasileirosFemininos.add(tituloBraFem2017);
			titulosBrasileirosFemininos.add(tituloBraFem2018);
			titulosBrasileirosFemininos.add(tituloBraFem2019);
			titulosBrasileirosFemininos.add(tituloBraFem2020);
			// Final da estrutura.

			// Inicio do questionario
			do {

				System.out.println("\nEscolha a modalidade do titulo de xadrez:");
				System.out.println("1-Mundial Feminino \n2-Mundial masculino \n3-Brasileiro Masculino \n4-Brasileiro Feminino");
				opcao = ler.nextInt();

				if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 ) {
					System.out.println("Op��o invalida. Erro!");
					System.exit(0);
				}
				Titulos tituloEscolhido = new Titulos();

				switch (opcao) {
				case 1: {
					System.out.println("Escolha o ano: ");
					System.out.println("1- 2010");
					System.out.println("2- 2011");
					System.out.println("3- 2012");
					System.out.println("4- 2013");
					System.out.println("5- 2014");
					System.out.println("6- 2015");
					System.out.println("7- 2016");
					System.out.println("8- 2017");
				}
					selecao1 = ler.nextInt();
					if (selecao1 != 1 && selecao1 != 2 && selecao1 != 3 && selecao1 != 4 && selecao1 != 5
							&& selecao1 != 6 && selecao1 != 7 && selecao1 != 8) {
						System.out.println("Erro!");
						System.exit(0);
					}
					if (selecao1 == 1) {
						tituloEscolhido = titulosFemininos.get(0);
						mostrarTituloFe(tituloEscolhido);
					} else if (selecao1 == 2) {
						tituloEscolhido = titulosFemininos.get(1);
						mostrarTituloFe(tituloEscolhido);
					} else if (selecao1 == 3) {
						tituloEscolhido = titulosFemininos.get(2);
						mostrarTituloFe(tituloEscolhido);
					} else if (selecao1 == 4) {
						tituloEscolhido = titulosFemininos.get(3);
						mostrarTituloFe(tituloEscolhido);
					} else if (selecao1 == 5) {
						tituloEscolhido = titulosFemininos.get(4);
						mostrarTituloFe(tituloEscolhido);
					} else if (selecao1 == 6) {
						tituloEscolhido = titulosFemininos.get(5);
						mostrarTituloFe(tituloEscolhido);
					} else if (selecao1 == 7) {
						tituloEscolhido = titulosFemininos.get(6);
						mostrarTituloFe(tituloEscolhido);
					} else if (selecao1 == 8) {
						tituloEscolhido = titulosFemininos.get(7);
						mostrarTituloFe(tituloEscolhido);
					}
					break;
				case 2:

					System.out.println("Escolha o ano:");
					System.out.println("1- 2010");
					System.out.println("2- 2011");
					System.out.println("3- 2012");
					System.out.println("4- 2013");
					System.out.println("5- 2014");
					System.out.println("6- 2015");
					System.out.println("7- 2016");
					System.out.println("8- 2017");
					System.out.println("9- 2018");
					System.out.println("10- 2019");

					selecao1 = ler.nextInt();
					if (selecao1 != 1 && selecao1 != 2 && selecao1 != 3 && selecao1 != 4 && selecao1 != 5
							&& selecao1 != 6 && selecao1 != 7 && selecao1 != 8 && selecao1 != 9 && selecao1 != 10) {
						System.out.println("Erro!");
						System.exit(0);
					}

					if (selecao1 == 1) {
						tituloEscolhido = titulosMasculinos.get(0);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 2) {
						tituloEscolhido = titulosMasculinos.get(1);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 3) {
						tituloEscolhido = titulosMasculinos.get(2);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 4) {
						tituloEscolhido = titulosMasculinos.get(3);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 5) {
						tituloEscolhido = titulosMasculinos.get(4);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 6) {
						tituloEscolhido = titulosMasculinos.get(5);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 7) {
						tituloEscolhido = titulosMasculinos.get(6);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 8) {
						tituloEscolhido = titulosMasculinos.get(7);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 9) {
						tituloEscolhido = titulosMasculinos.get(8);
						mostrarTituloMas(tituloEscolhido);
					} else if (selecao1 == 10) {
						tituloEscolhido = titulosMasculinos.get(9);
						mostrarTituloMas(tituloEscolhido);
					}
					
				case 3: {
					System.out.println("Escolha o ano: ");
					System.out.println("1- 2010");
					System.out.println("2- 2011");
					System.out.println("3- 2012");
					System.out.println("4- 2013");
					System.out.println("5- 2014");
					System.out.println("6- 2015");
					System.out.println("7- 2016");
					System.out.println("8- 2017");
					System.out.println("9- 2018");
					System.out.println("10- 2019");
					System.out.println("11- 2020");
				}
				selecao1 = ler.nextInt();
				if (selecao1 != 1 && selecao1 != 2 && selecao1 != 3 && selecao1 != 4 && selecao1 != 5
						&& selecao1 != 6 && selecao1 != 7 && selecao1 != 8 && selecao1 != 9 && selecao1 != 10 && selecao1 != 11) {
					System.out.println("Erro!");
					System.exit(0);
				}
				if (selecao1 == 1) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(0);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 2) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(1);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 3) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(2);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 4) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(3);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 5) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(4);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 6) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(5);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 7) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(6);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 8) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(7);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 9) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(8);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				} else if (selecao1 == 10) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(9);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				}else if (selecao1 == 11) {
					tituloEscolhido = titulosBrasileirosMasculinos.get(10);
					mostrarTituloBrasileiroMasculino(tituloEscolhido);
				}
				case 4: 
					System.out.println("Escolha o ano: ");
					System.out.println("1- 2010");
					System.out.println("2- 2011");
					System.out.println("3- 2012");
					System.out.println("4- 2013");
					System.out.println("5- 2014");
					System.out.println("6- 2015");
					System.out.println("7- 2016");
					System.out.println("8- 2017");
					System.out.println("9- 2018");
					System.out.println("10- 2019");
					System.out.println("11- 2020");
					selecao1 = ler.nextInt();
					if (selecao1 != 1 && selecao1 != 2 && selecao1 != 3 && selecao1 != 4 && selecao1 != 5
							&& selecao1 != 6 && selecao1 != 7 && selecao1 != 8 && selecao1 != 9 && selecao1 != 10 && selecao1 != 11) {
						System.out.println("Erro!");
						System.exit(0);
					}if (selecao1 == 1) {
						tituloEscolhido = titulosBrasileirosFemininos.get(0);
						mostrarTituloBrasileiroMasculino(tituloEscolhido);
					} else if (selecao1 == 2) {
						tituloEscolhido = titulosBrasileirosFemininos.get(1);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 3) {
						tituloEscolhido = titulosBrasileirosFemininos.get(2);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 4) {
						tituloEscolhido = titulosBrasileirosFemininos.get(3);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 5) {
						tituloEscolhido = titulosBrasileirosFemininos.get(4);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 6) {
						tituloEscolhido = titulosBrasileirosFemininos.get(5);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 7) {
						tituloEscolhido = titulosBrasileirosFemininos.get(6);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 8) {
						tituloEscolhido = titulosBrasileirosFemininos.get(7);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 9) {
						tituloEscolhido = titulosBrasileirosFemininos.get(8);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					} else if (selecao1 == 10) {
						tituloEscolhido = titulosBrasileirosFemininos.get(9);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					}else if (selecao1 == 11) {
						tituloEscolhido = titulosBrasileirosFemininos.get(10);
						mostrarTituloBrasileiroFeminino(tituloEscolhido);
					}
				}
				System.out.println("Deseja ver outro titulo? 'S' para sim e 'N' para ver outro titulo.");
				resposta = ler.next().charAt(0);

			} while (resposta != 'n' && resposta != 'N');
			System.out.println("Obrigado volte sempre");
			ler.close();

		} catch (Exception erro) {
			System.out.println("\nERRO!" + erro + "\n\nFIM DO PROGRAMA! POR FAVOR, TENTE NOVAMENTE.");
		}
	}

	static void mostrarTituloMas(Titulos titulos) {
		System.out
				.println("O campe�o foi: " + titulos.getNome() + "\n" + titulos.getIdade() + " anos de idade \n"
						+ titulos.getPais() + " � pa�s de nacionalidade \n" + titulos.getRating() + " de rating");
	}

	static void mostrarTituloFe(Titulos titulos) {
		System.out.println("A campe� foi a: " + titulos.getNome() + "\n" + titulos.getIdade() + " anos de idade \n"
						+ titulos.getPais() + " � pa�s de nacionalidade \n" + titulos.getRating() + " de rating");
	}
	static void mostrarTituloBrasileiroMasculino(Titulos titulos) {
		System.out.println("O campe�o foi o: " + titulos.getNome() + "\n" + titulos.getIdade() + " anos de idade \n"
						+ titulos.getRating() + " de rating");
	}
	static void mostrarTituloBrasileiroFeminino(Titulos titulos) {
		System.out.println("A campe� foi a: " + titulos.getNome() + "\n" + titulos.getIdade() + " anos de idade \n"
						+ titulos.getRating() + " de rating");
	}
}
