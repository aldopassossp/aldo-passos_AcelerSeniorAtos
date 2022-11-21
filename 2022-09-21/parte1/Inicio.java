import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Inicio{
	
	public static void main(String [] args){
		
		Usuario usuario = new Usuario();
		String nomeDigitado;
		String senhaDigitada;
		
		String opcaoMenu = null;
		String opcaoSubMenu = null;
		
		Scanner entradaDados = new Scanner (System.in); // Objeto criado para receber dados atraves do console.
		
		List<Gerente> gerentes = new ArrayList<>();
        List<Coordenador> coordenadores = new ArrayList<>();
				
		System.out.println("Digite o Usuario:");
			nomeDigitado  = entradaDados.next();
		System.out.println("Digite a sua Senha:");
			senhaDigitada = entradaDados.next();
		
		boolean continuar = true;
			
		if(nomeDigitado.equals(usuario.getUsuario()) && senhaDigitada.equals(usuario.getSenha())){
			System.out.println("Login realizado com Sucesso!!!");
			while(continuar){
				System.out.println("Digite 1 para o Gerente:");
				System.out.println("Digite 2 para o Coordenador:");
				opcaoMenu = entradaDados.next();
				
				if(opcaoMenu.equals("1") || opcaoMenu.equals("2") || opcaoMenu.equals("3") ){
					
					switch(opcaoMenu){
						
						case "1":
							
							Gerente gerente = new Gerente(); //Objeto criado para o cadastro de gerentes
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
							//System.out.println("Nome do Gerente:" + gerente.getNome());
							//System.out.println("CPF do Gerente:" + gerente.getCpf());
							//System.out.println("Salário do Gerente:" + gerente.getSalarioLiquido());
							//System.out.println("Regional do Gerente:" + gerente.getRegional());
							//System.out.println("Meta da Regional:" + gerente.getMetaRegional());
							gerentes.add(gerente);
							
                            System.out.println("Digite 1 para cadastrar outro Gerente;");
							System.out.println("Digite 2 para listar os Gerentes;");
							System.out.println("Digite 3 para Encerrar");

                            opcaoSubMenu = entradaDados.next();

                            if(opcaoSubMenu.equals("1") || opcaoSubMenu.equals("2") || opcaoSubMenu.equals("3")){
                                switch(opcaoSubMenu){
                                    case "1":
                                        System.out.println("Cadastrar outro Gerente");
                                    break;

                                    case "2":
                                        for(Gerente gerenteLoja : gerentes){
                                            System.out.println("Nome do Gerente: " + gerenteLoja.getNome());
                                            System.out.println("Salario do Gerente c/ Desconto: " + gerenteLoja.getSalarioLiquido());
                                            System.out.println("Regional: " + gerenteLoja.getRegional());
                                            System.out.println("Meta Regional: " + gerenteLoja.getMetaRegional());
                                            System.out.println("================================================================");
                                        }
                                    break;

                                    case "3":
                                        System.out.println("Programa Encerrado ");
                                        continuar = false;
                                    break;
                                }


                            }else{
                                System.out.println("Opção Inválida");
                            }
							
						break;
										
						case "2":
							Coordenador coordenador = new Coordenador();
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
							//System.out.println("Nome do Coordenador:" + coordenador.getNome());
							//System.out.println("CPF do Coordenador:" + coordenador.getNome());
							//System.out.println("Salario do Coordenador:" + coordenador.getSalarioLiquido());
							//System.out.println("Loja do Coordenador:" + coordenador.getLoja());
							//System.out.println("Meta da Loja:" + coordenador.getMetaDaLoja());
							
                           coordenadores.add(coordenador);

                            System.out.println("Digite 1 para cadastrar outro Coordenador;");
							System.out.println("Digite 2 para listar os Coordenadores;");
							System.out.println("Digite 3 para Encerrar");

                            opcaoSubMenu = entradaDados.next();

                            if(opcaoSubMenu.equals("1") || opcaoSubMenu.equals("2") || opcaoSubMenu.equals("3")){
                                switch(opcaoSubMenu){
                                    case "1":
                                        System.out.println("Cadastrar outro Coordenador");
                                    break;

                                    case "2":
                                        for(Coordenador coordenadorLoja : coordenadores){
                                            System.out.println("Nome do Coordenador: " + coordenadorLoja.getNome());
                                            System.out.println("Salario do Coordenador c/ Desconto: " + coordenadorLoja.getSalarioLiquido());
                                            System.out.println("Loja: " + coordenadorLoja.getLoja());
                                            System.out.println("Meta da Loja: " + coordenadorLoja.getMetaDaLoja());
                                            System.out.println("================================================================");
                                        }
                                    break;

                                    case "3":
                                        System.out.println("Programa Encerrado ");
                                        continuar = false;
                                    break;
                                }


                            }else{
                                System.out.println("Opção Inválida");
                            }
						
						break;

                        case "3":
                            System.out.println("Programa Encerrado ");
                            continuar = false;
                        break;											
					}
								
				}else{
					
					System.out.println("Opcao incorreta");
								
				}
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