import java.lang.module.FindException;
import java.math.BigDecimal;
import java.util.Scanner;

import com.joao.tarefa.tp.controller.*;
import com.joao.tarefa.tp.model.*;
public class Exc {
	
	public static void main(String[] args) {
		MarcaController contMarca = new MarcaController();
		IngredienteController contIngrediente = new IngredienteController();
		AlimentoController contAlimento = new AlimentoController();
		
		//------------------------MARCA-------------------------------------------\\
		//Inserindo
		//Marca marca = new Marca();
		//marca.setNome("YOK");
		//System.out.println(contMarca.cadastrarMarca(marca));
		
		
		//Pesquisando todas as marcas
		//System.out.println(contMarca.findAllMarcas());
		
		//Pesquisando somente uma marca
		//System.out.println(contMarca.FindMarca(1));
		
		//Alterando Marca
		//Marca marca = new Marca();
		//marca.setId(2);
		//marca.setNome("Nestle");
		
		//cont.Update(marca);
		//System.out.println(contMarca.FindMarca(2));
		
		//Deletando Marca
		//cont.Delete(2);
		//System.out.println(contMarca.FindMarca(2));
		
		//--------------------------INGREDIENTE----------------------------------\\
		
		//Inserindo
		//Ingrediente ing = new Ingrediente();
		//ing.setNome("CLARAS EM NEVE");
		//System.out.println(contIngrediente.cadastrarIngrediente(ing));
		
		
		//Pesquisando todos os Ingredientes
		//System.out.println(contIngrediente.findAllIngredientes());
		
		//Pesquisando somente um ingrediente
		//System.out.println(contIngrediente.FindIngrediente(1));
		
		
		//Alterando um Ingrediente
		//Ingrediente ingre = new Ingrediente();
		//ingre.setId(1);
		//ingre.setNome("OVO");
		//contIngrediente.Update(ingre);
		
		//Deletando um ingrediente
		//System.out.println(contIngrediente.findAllIngredientes());
		//contIngrediente.Delete(7);
		//System.out.println(contIngrediente.findAllIngredientes());
		
		
		//-----------------------ALIMENTO------------------------------------------\\
		//Pesquisando todos os alimentos
		//System.out.println(contAlimento.findAllALimentos());
		
		
		//Pesquisando somente um alimento
		//System.out.println(contAlimento.findAlimento(1));
		
		//Deletando um Alimento
		//System.out.println(contAlimento.findAllALimentos());
		//contAlimento.Delete(1);
		//System.out.println(contAlimento.findAllALimentos());
		
		//Alterando um Alimento
		
		//System.out.println(contAlimento.findAllALimentos());
		//Alimento al = new Alimento();
		//al.setId(2);
		//al.setNome("FARINHA TEMPERADA");
		//al.setPrice(3.99);
		
		//contAlimento.Update(al);
		
		//System.out.println(contAlimento.findAllALimentos());
		
		//Cadastrar alimento
		//Alimento alimento = new Alimento();
		//alimento.setNome("FARINHA P/ CHURRASCO");
		//alimento.setPrice(4.99);
		//alimento.setIngrediente(contIngrediente.FindIngrediente(8));
		//alimento.setMarca(contMarca.FindMarca(1));
		
		//contAlimento.cadastrarAlimento(alimento);
		
		int opcaoMainMenu = 0;
		
		int opcaoMarcaMenu = 0;
		int opcaoIngredienteMenu = 0;
		int opcaoAlimentoMenu = 0;
		
		int idMarca = 0;
		int idIngrediente = 0;
		int idAlimento = 0;
		
		while(opcaoMainMenu != 4) {
			opcaoMainMenu = ShowMainMenu();
			switch (opcaoMainMenu) {
			case 1:
				//acessar Marca;
				System.out.println("Acessou Marca");
				
				while(opcaoMarcaMenu!=6) {
					opcaoMarcaMenu = ShowMarcaMenu();
					switch (opcaoMarcaMenu) {
					case 1:
						for(Marca i : contMarca.findAllMarcas()) {
							System.out.println(i);
						}
					break;
					case 2:
						//("PESQUISAR MARCA POR ID........");
						idMarca = 0;
						Scanner KeyboardMarcaPesqById = new Scanner(System.in);
						System.out.println("DIGITE O ID DA MARCA QUE DESEJA PESQUISAR: ");
						idMarca =  KeyboardMarcaPesqById.nextInt();
						System.out.println(contMarca.FindMarca(idMarca));
						idMarca = 0;
						break;
					
					case 3:
						//("ALTERAR MARCA........");
						idMarca = 0;
						Scanner KeyboardMarcaAlterarId = new Scanner(System.in);
						System.out.println("DIGITE O ID DA MARCA QUE DESEJA ALTERAR: ");
						idMarca = KeyboardMarcaAlterarId.nextInt();
						
						if (contMarca.FindMarca(idMarca) != null) {
							Scanner KeyboardMarcaAlterarNome = new Scanner(System.in);
							System.out.println("DIGITE O NOVO NOME DE " + contMarca.FindMarca(idMarca) + ": " );
							String nomeMarcaUp  = KeyboardMarcaAlterarNome.next();
							Marca m = new Marca();
							m.setId(idMarca);
							m.setNome(nomeMarcaUp);
							contMarca.Update(m);
							
						}else {
							
							System.out.println("MARCA INEXISTENTE........");
						}
					break;	
					
					case 4:
						//("DELETAR MARCA........");
						idMarca = 0;
						Scanner KeyboardMarcaDeletarId = new Scanner(System.in);
						System.out.println("DIGITE O ID DA MARCA QUE DESEJA EXCLUIR: ");
						idMarca = KeyboardMarcaDeletarId.nextInt();
						if(contMarca.FindMarca(idMarca) != null) {
							contMarca.Delete(idMarca);
							System.out.println("MARCA DELETADA COM SUCESSO!!!!!");
						}
						else {
							System.out.println("MARCA INEXISTENTE!!!!!!");
						}
	
					break;
					case 5:
						Scanner KeyboardMarcaCadastrar = new Scanner(System.in);
						System.out.println("DIGITE O NOME DA MARCA QUE DESEJA CADASTRAR: ");
						String Marcanome = KeyboardMarcaCadastrar.next();
						Marca mCadastro = new Marca();
						mCadastro.setNome(Marcanome);
						contMarca.cadastrarMarca(mCadastro);
						System.out.println("MARCA " + mCadastro.getNome() + " CADASTRADO(A) COM SUCESSO!!!");
						
					break;	
					default:
						System.out.println("DIGITE UMA OPÇÃO VALIDA!!!!!!");
					break;
					}
					
				}
				
				break;
			case 2:
				//acessar Ingrediente
				while(opcaoIngredienteMenu!=6) {
					opcaoIngredienteMenu = showIngredienteMenu();
					switch (opcaoIngredienteMenu) {
					case 1:
						//1.LISTAR TODOS OS INGREDIENTES
						for(Ingrediente i : contIngrediente.findAllIngredientes()) {
							System.out.println(i);
						}
					break;
					
					case 2:
						// 2.PESQUISAR INGREDIENTE POR ID
						idIngrediente = 0;
						Scanner KeyboardIngredientePesqById = new Scanner(System.in);
						System.out.println("DIGITE O ID DO INGREDIENTE QUE DESEJA PESQUISAR: ");
						idIngrediente = KeyboardIngredientePesqById.nextInt();
						System.out.println(contIngrediente.FindIngrediente(idIngrediente));
						idIngrediente = 0;
					break;
					
					case 3:
						// 3.ALTERAR INGREDIENTE 
						idIngrediente = 0;
						Scanner KeyboardIngredienteAlterarId = new Scanner(System.in);
						System.out.println("DIGITE O ID DO INGREDIENTE QUE DESEJA ALTERAR: ");
						idIngrediente = KeyboardIngredienteAlterarId.nextInt();
						
						if(contIngrediente.FindIngrediente(idIngrediente) !=null) {
							Scanner KeyboardIngredienteAlterarNome = new Scanner(System.in);
							System.out.println("DIGITE O NOVO NOME DE " + contIngrediente.FindIngrediente(idIngrediente) + ": ");
							String nomeIngreUp = KeyboardIngredienteAlterarNome.next();
							Ingrediente ing = new Ingrediente();
							ing.setId(idIngrediente);
							ing.setNome(nomeIngreUp);
							contIngrediente.Update(ing);
						}else {
							System.out.println("INGREDIENTE INEXISTENTE.............");
						}
					break;
					
					case 4:
						// 4.DELETAR INGREDIENTE
						idIngrediente = 0;
						Scanner KeyboardIngredienteDeletarId = new Scanner(System.in);
						System.out.println("DIGITE O ID DO INGREDIENTE QUE DESEJA EXCLUIR: ");
						idIngrediente = KeyboardIngredienteDeletarId.nextInt();
						if(contIngrediente.FindIngrediente(idIngrediente)!= null) {
							contIngrediente.Delete(idIngrediente);
							System.out.println("INGREDIENTE DELETADO COM SUCESSO!!!!");
							
						}else {
							System.out.println("INGREDIENTE INEXISTENTE!!!!!!!!!!!");
						}
					break;
					
					case 5:
						//5.CADASTRAR INGREDIENTE 
						Scanner KeyboardIngredienteCadastrar = new Scanner(System.in);
						System.out.println("DIGITE O NOME DO INGREDIENTE QUE DESEJA CADASTRAR: ");
						String IngreNome = KeyboardIngredienteCadastrar.next();
						Ingrediente ingCadastro = new Ingrediente();
						ingCadastro.setNome(IngreNome);
						contIngrediente.cadastrarIngrediente(ingCadastro);
						System.out.println("INGREDIENTE "+ ingCadastro.getNome()+" CADASTRADO COM SUCESSO!!!!!!");
						
					break;

					default:
					break;
					}
				}
				
				break;
			case 3:
				//acessar Alimento
				while(opcaoAlimentoMenu!=6) {
					opcaoAlimentoMenu = showAlimentoMenu();
					switch (opcaoAlimentoMenu) {
					
					case 1:
						//1.LISTAR TODOS OS ALIMENTOS
						for(Alimento i: contAlimento.findAllALimentos()) {
							System.out.println(i);
						}
						
					break;
					
					case 2:
						//2.PESQUISAR ALIMENTO POR ID 
						idAlimento = 0;
						Scanner KeyboardAlimentoPesqById = new Scanner(System.in);
						System.out.println("DIGITE O ID DO ALIMENTO QUE DESEJA EXCLUIR: ");
						idAlimento = KeyboardAlimentoPesqById.nextInt();
						System.out.println(contAlimento.findAlimento(idAlimento));
						idAlimento = 0;
					break;
					
					case 3:
						// 3.ALTERAR ALIMENTO
						
					break;
					
					case 4:
						// 4.DELETAR ALIMENTO
						idAlimento = 0;
						Scanner KeyboardAlimentoDeletarId = new Scanner(System.in);
						System.out.println("DIGITE O ID DO ALIMENTO QUE DESEJA EXLUIR: ");
						idAlimento = KeyboardAlimentoDeletarId.nextInt();
						if(contAlimento.findAlimento(idAlimento)!=null) {
							contAlimento.Delete(idAlimento);
							System.out.println("ALIMENTO DELETADO COM SUCESSO!!!!!");	
						}else {
							System.out.println("ALIMENTO INEXISTENTE!!!!!!");
						}
						
					break;
					
					case 5:
						// 5.CADASTRAR ALIMENTO
						Scanner KeyboardAlimentoCadastrar = new Scanner(System.in);
						
						System.out.println("DIGITE O NOME DO ALIMENTO QUE DESEJA CADASTRAR: ");
						String nomeAlimento = KeyboardAlimentoCadastrar.next();
						
						System.out.println("DIGITE O PREÇO DO ALIMENTO " + nomeAlimento + ": ");
						Double precoAlimento = KeyboardAlimentoCadastrar.nextDouble();
						
						System.out.println("DIGITE O ID DA MARCA DO ALIMENTO " + nomeAlimento + ": ");
						int idMarcaAlimento = KeyboardAlimentoCadastrar.nextInt();
						
						System.out.println("DIGITE O ID DO INGREDIENTE PRINCIPAL DO ALIMENTO " + nomeAlimento+ ": ");
						int idIngreAlimento = KeyboardAlimentoCadastrar.nextInt();
						
						Alimento alimentoCadastro = new Alimento();
						alimentoCadastro.setNome(nomeAlimento);
						alimentoCadastro.setPrice(precoAlimento);
						alimentoCadastro.setMarca(contMarca.FindMarca(idMarcaAlimento));
						alimentoCadastro.setIngrediente(contIngrediente.FindIngrediente(idIngreAlimento));
						
						contAlimento.cadastrarAlimento(alimentoCadastro);
						
					break;
					
					default:
						break;
					}
				}
			break;
			
			default:
			
			break;	
			}
		}
		
	}
	
	public static int ShowMainMenu() {
		int optMain = 0;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("############################################################");
		System.out.println("#------------------------MENU PRINCIPAL--------------------#");
		System.out.println("#                       1.ACESSAR MARCA                    #");
		System.out.println("#                       2.ACESSAR INGREDIENTE              #");
		System.out.println("#                       3.ACESSAR ALIMENTO                 #");
		System.out.println("#                       4.SAIR                             #");
		System.out.println("#----------------------------------------------------------#");
		System.out.println("############################################################");
		optMain = Keyboard.nextInt();
		return optMain;
	}
	public static int ShowMarcaMenu() {

		int optMarca = 0;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("############################################################");
		System.out.println("#------------------------MENU DE MARCA---------------------#");
		System.out.println("#                       1.LISTAR TODAS AS MARCAS           #");
		System.out.println("#                       2.PESQUISAR MARCA POR ID           #");
		System.out.println("#                       3.ALTERAR MARCA                    #");
		System.out.println("#                       4.DELETAR MARCA                    #");
		System.out.println("#                       5.CADASTRAR MARCA                  #");
		System.out.println("#                       6.SAIR                             #");
		System.out.println("#----------------------------------------------------------#");
		System.out.println("############################################################");
		optMarca = Keyboard.nextInt();
		return optMarca;
	}
	public static int showIngredienteMenu() {
		int optIngrediente = 0;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("############################################################");
		System.out.println("#---------------------MENU DE INGREDIENTE------------------#");
		System.out.println("#                     1.LISTAR TODOS OS INGREDIENTES       #");
		System.out.println("#                     2.PESQUISAR INGREDIENTE POR ID       #");
		System.out.println("#                     3.ALTERAR INGREDIENTE                #");
		System.out.println("#                     4.DELETAR INGREDIENTE                #");
		System.out.println("#                     5.CADASTRAR INGREDIENTE              #");
		System.out.println("#                     6.SAIR                               #");
		System.out.println("#----------------------------------------------------------#");
		System.out.println("############################################################");
		optIngrediente = Keyboard.nextInt();
		return optIngrediente;
	}
	public static int showAlimentoMenu() {
		int optAlimento = 0;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("############################################################");
		System.out.println("#---------------------MENU DE ALIMENTO---------------------#");
		System.out.println("#                     1.LISTAR TODOS OS ALIMENTOS          #");
		System.out.println("#                     2.PESQUISAR ALIMENTO POR ID          #");
		System.out.println("#                     3.ALTERAR ALIMENTO                   #");
		System.out.println("#                     4.DELETAR ALIMENTO                   #");
		System.out.println("#                     5.CADASTRAR ALIMENTO                 #");
		System.out.println("#                     6.SAIR                               #");
		System.out.println("#----------------------------------------------------------#");
		System.out.println("############################################################");
		optAlimento = Keyboard.nextInt();
		return optAlimento;
		
	}
	

}
