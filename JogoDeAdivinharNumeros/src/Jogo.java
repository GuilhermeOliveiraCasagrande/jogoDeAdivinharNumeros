import javax.swing.JOptionPane;

public class Jogo {

	public static void main(String[] args) {
		int numero = (int) (Math.random() * 100 + 1); //Escolhe o n�mero
		int respUser = 0;
		int tentativas = 5;
		
		for(int i =0; i < tentativas; i++) {
			//Tamanho da janela = null -> default
			//Mensagem =  "Advinhe um n�mero entre 1 e 100"
			//T�tulo = "Jogo de adivinha��o"
			//�cone = 1 -> bolinha com i
			
			System.out.println(i);
			String response = JOptionPane.showInputDialog(null,
	                "Advinhe um n�mero entre 1 e 100" , "Jogo de adivinha��o", 1);
	            respUser = Integer.parseInt(response); //Transforma a resposta do usu�rio em int
	            
	            //showMessageDialog() mostra um di�logo
	            JOptionPane.showMessageDialog(null, ""+ determineGuess(respUser, numero, tentativas));
	            tentativas++; //Mais uma tentativa
		}

	}
	
	//Determina se a resposta est� correta
	public static String determineGuess(int respUser, int numero, int tentativas) {
		if(respUser < numero) {
			return "voc� errou!! O n�mero � maior";
		} else if(respUser > numero){
			return "voc� errou!! O numero � menor";
		} else {
			return "voc� acertou em " + tentativas + " tentativas!!";
		}
	}

}
