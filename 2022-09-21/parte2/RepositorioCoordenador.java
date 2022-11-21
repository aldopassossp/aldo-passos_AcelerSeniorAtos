import java.util.List;
import java.util.ArrayList;
public class RepositorioCoordenador implements CoordenadorInterface{
	
	private List<Coordenador> listaCoordenador = new ArrayList<>();
	
	public boolean salvarCoordenador(Coordenador coordenador){
		
		int idContador;
		idContador = listaCoordenador.size()+1;
		String id = Integer.toString(idContador);
		coordenador.setId(id);
		
		try{
			listaCoordenador.add(coordenador);
		}catch(Exception e){
			System.out.println("Erro ao salvar dados!");
			return false;
		}
		
		return true;
	}
	
	public List<Coordenador> listarCoordenador(){
		return this.listaCoordenador;
	}
	
	public boolean deletarCoordenador(String id){
		boolean resposta = false;
		
		Coordenador coordenadorRemover = new Coordenador();
		
		for(Coordenador coordenador : listaCoordenador){
			if(coordenador.getId().equals(id)){
				coordenadorRemover = coordenador;
			}			
		}	
		
		try{
			listaCoordenador.remove(coordenadorRemover);
			resposta = true;
		}catch(Exception e){
			System.out.println("Erro ao remover!");
		}
		
		
		return resposta;
	}
	
	public boolean alterarCoordenador(Coordenador coordenadorNovo){
		
		Coordenador coordenadorNovoTemp = new Coordenador();
		Coordenador coordenadorAtualTemp = new Coordenador();
		
		for(Coordenador coodenadorAtual : listaCoordenador){
			if(coodenadorAtual.getId().equals(coordenadorNovo.getId())){
				coordenadorAtualTemp = coodenadorAtual;
				coordenadorNovoTemp = coordenadorNovo;
				
			}
			
		}
		
		try{
			listaCoordenador.remove(coordenadorAtualTemp);
			listaCoordenador.add(coordenadorNovoTemp);
			return true;
		}catch(Exception e){
			System.out.println("Erro ao salvar dados!");
		}
		
		return false;
		
	}
	
}