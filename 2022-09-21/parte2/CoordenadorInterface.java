import java.util.List;
import java.util.ArrayList;

public interface CoordenadorInterface{
	
	public boolean salvarCoordenador(Coordenador coordenador); //salvar
	public List<Coordenador> listarCoordenador();
	public boolean deletarCoordenador(String id);
	
}