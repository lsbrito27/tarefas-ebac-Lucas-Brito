public class Cliente{
    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEnderco(String endereco){
        this.endereco = endereco;
    }


/**
 * 
 * @param endereco
 * @deprecated
 * @see void cadastrarEndeco(String endereco, int count)
 */
    public void cadastrarEndeco(String endereco){
        setEnderco(endereco);
    }

    public void cadastrarEndeco(String endereco, int count){
        setEnderco(endereco);
    }
}
