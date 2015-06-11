
package mortalkombat;

public class Scorpion {
  private  String socoforte;
  private  String socofraco;
  private  String chuteforte;
  private  String chutefraco;
  private  String defesa;
  private  String agarra;
  private  String especial;
  private Integer vida;
  private String airdeamon;
  
  public Scorpion(){
  this.socoforte = null;
  this.socofraco = null;
  this.chuteforte = null;
  this.chutefraco = null;
  this.defesa = null;
  this.agarra = null;
  this.especial = null;
  this.vida = 100;
  }

    public Integer getVida() {
        return this.vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
  
  
  
  public String getSocoforte() {
        return this.socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return this.chutefraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return this.chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return this.chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return this.defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return this.agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return this.especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
 
    public String spear() {
        return "Trás, Trás " + socofraco;
    }

    public String takedown() {
        return "Baixo, Frente, " + chutefraco;
    }

    public String teleport() {
        return "Baixo,Trás , " + chutefraco;
    }


    public String combo1() {
        return "Esquerda,Baixo, " + socofraco + " , " + socoforte;
    }

    public String combo2() {
        return chutefraco + " , " + chutefraco + " , " + socoforte;
    }

    public String fatality1() {
        return "Frente, Baixo , Frente, " + socoforte + " Encostado no inimigo. ";
    }

    public String fatality2() {
        return "Trás, Frete, Trás,  " + chuteforte + "Encostado no inimigo. ";
    }

    private String airdeamon() {
        return "Trás, Trás" + socoforte + "Encostado no inimigo. ";
    }

}
