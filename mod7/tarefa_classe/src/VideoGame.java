/**
 * @author Lucas.brito
 */
public class VideoGame {

    private String nomeDojogo;
    private int numeroDeJogadores;
    private boolean ligar;


//Get e Set da variavel nomeDoJogo
    public String getNomeDoJogo(){
        return nomeDojogo;
    }


    public void setNomeDoJogo(String nomeDojogo){
        this.nomeDojogo = nomeDojogo;
    }

//Get e Set da variavel NumeroDeJogares

    public int getNumeroDeJogadores(){
        return numeroDeJogadores;
    }


    public void setNumeroDeJogadores(int numeroDeJogadores){
        this.numeroDeJogadores = numeroDeJogadores;
    }

//Get e Set da variavel ligar

    public boolean getLigar(){
        return ligar;
    }

    public void setLigar(boolean ligar){
        this.ligar = ligar;
    }


    public void escolherJogo(String jogoEscolhido){
        setNomeDoJogo(jogoEscolhido);
    }

/**
 * verifica se o video  game esta ligado e mostra o jogo que esta sendo jogado
 * @param nomeDoJogo
 */
    public void jogar(String nomeDoJogo){
        if(getLigar() == true){
           System.out.print("Voce esta jogando: ");
           System.out.print(nomeDoJogo);
        }else{
            System.out.print("Precisa ligar o video game");
        }
    }
}
