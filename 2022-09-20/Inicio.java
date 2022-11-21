

import java.util.Scanner;

public class Inicio{
	
	public static void main(String [] args){
		
		Usuario usuario = new Usuario();
		String nomeDigitado;
		String senhaDigitada;
		
		String opcaoMenu = null;
		
		Scanner entradaDados = new Scanner (System.in); // Objeto criado para receber dados atraves do console.
		
		Gerente gerente = new Gerente();
		Coordenador coordenador = new Coordenador();
				
		System.out.println("Digite o Usuario:");
			nomeDigitado  = entradaDados.next();
		System.out.println("Digite a sua Senha:");
			senhaDigitada = entradaDados.next();
			
		if(nomeDigitado.equals(usuario.getUsuario()) && senhaDigitada.equals(usuario.getSenha())){
			System.out.println("Login realizado com Sucesso!!!");
			System.out.println("Digite 1 para o Gerente:");
			System.out.println("Digite 2 para o Coordenador:");
			opcaoMenu = entradaDados.next();
			
			if(opcaoMenu.equals("1") || opcaoMenu.equals("2") ){
				System.out.println("Opcao correta");
				
				switch(opcaoMenu){
					
					case "1":
						
						//Estou Recebendo os dados atraves do console e armazenando no objeto gerente
						System.out.println("Digite o nome do Gerente:");
							gerente.setNome(entradaDados.next());
						System.out.println("Digite a hora Trabalhada:");
							gerente.setSalarioLiquido(gerente.calcularSalario(Double.parseDouble(entradaDados.next()),1));
						System.out.println("Digite o CPF do Gerente:");
							gerente.setCpf(entradaDados.next());
						System.out.println("Digite a REGIONAL do Gerente:");
							gerente.setRegional(entradaDados.next());
						System.out.println("Digite a META regional:");
							gerente.setMetaRegional(Double.parseDouble(entradaDados.next()));
							
						// Apresenta os dados no Controller
						System.out.println("Nome do Gerente:" + gerente.getNome());
						System.out.println("CPF do Gerente:" + gerente.getCpf());
						System.out.println("Salário do Gerente:" + gerente.getSalarioLiquido());
						System.out.println("Regional do Gerente:" + gerente.getRegional());
						System.out.println("Meta da Regional:" + gerente.getMetaRegional());
						
					break;
									
					case "2":
						System.out.println("Digite o nome do Coordenador:");
							coordenador.setNome(entradaDados.next());
						System.out.println("Digite o CPF do Coordenador:");
							coordenador.setCpf(entradaDados.next());
						System.out.println("Digite a hora Trabalhada:");
							coordenador.setSalarioLiquido(coordenador.calcularSalario(Double.parseDouble(entradaDados.next()),2));
						System.out.println("Digite a LOJA do Coordenador:");
							coordenador.setLoja(entradaDados.next());
						System.out.println("Digite a META da LOJA:");
							coordenador.setMetaDaLoja(Double.parseDouble(entradaDados.next()));
							
						// Apresenta os dados no Controller
						System.out.println("Nome do Coordenador:" + coordenador.getNome());
						System.out.println("CPF do Coordenador:" + coordenador.getNome());
						System.out.println("Salario do Coordenador:" + coordenador.getSalarioLiquido());
						System.out.println("Loja do Coordenador:" + coordenador.getLoja());
						System.out.println("Meta da Loja:" + coordenador.getMetaDaLoja());
						
					
					break;
										
				}
							
			}else{
				
				System.out.println("Opcao incorreta");
							
			}
			
		}else{
					
			if(nomeDigitado.equals(usuario.getUsuario()) || senhaDigitada.equals(usuario.getSenha())){
				if(nomeDigitado.equals(usuario.getUsuario())){
					System.out.println("Nome esta Correto mas  a senha esta Incorreta!!");	
				}
				if(senhaDigitada.equals(usuario.getSenha())){
					System.out.println("Senha esta Correta mas  o nome esta Incorreto!!");	
				}
				
			}else{
				System.out.println("Nome e senha Incorretos!!!");
				
			}
			
		}
			
	
	}
	
}