/**
 * @author Lucas.brito
 */
public class App {
    public static void main(String[] args) throws Exception {

        VideoGame videogame = new VideoGame();
        videogame.setLigar(true);
        videogame.setNomeDoJogo("Street Fighter");

        videogame.jogar(videogame.getNomeDoJogo());
    }
}
