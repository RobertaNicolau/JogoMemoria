
package jogomemoria.model;

public class PecaTabuleiro {
  private int numero;
  private int idImagem;
  private int linha;
  private int coluna;
  private boolean virado;

   public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     public int getIdImagem() {
        return idImagem;
    }

    
    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }
  
    public int getLinha() {
        return linha;
    }

    
    public void setLinha(int linha) {
        this.linha = linha;
    }

    
    public int getColuna() {
        return coluna;
    }

    
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    /**
     * @return the virado
     */
    public boolean isVirado() {
        return virado;
    }

    /**
     * @param virado the virado to set
     */
    public void setVirado(boolean virado) {
        this.virado = virado;
    }
}
