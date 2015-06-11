
package mortalkombat;

public class Playtation {

    public static void main(String[] args) {
                Reptile boneco2 = new Reptile();
        
        boneco2.setSocoforte(" Triangulo ");
        boneco2.setSocofraco(" Quadrado ");
        boneco2.setChuteforte(" X ");    
        boneco2.setChutefraco(" Bolinha ");
        boneco2.setDefesa(" L2 e R2 ");
        boneco2.setEspecial("L1 e R1 ");     
      
        System.out.println("---------------  PLAYSTATION -----------------  ");
        System.out.println("\n------------Configurações de Botões-----------");
        System.out.println(" Soco Forte: " + boneco2.getSocoforte());
        System.out.println(" Soco Fraco: " + boneco2.getSocofraco());
        System.out.println(" Chute Forte: " + boneco2.getChuteforte() );
        System.out.println(" Chute Fraco: "  + boneco2.getChutefraco());
        System.out.println(" Defesa: " + boneco2.getDefesa());
        System.out.println(" Especial: " + boneco2.getEspecial() );
        System.out.println(" Todos os personagens começam com a vida em " + boneco2.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Invisivel: "  +  boneco2.invisivel());
        System.out.println("Ácido: " + boneco2.acido());
        System.out.println("Bola Rápida: " + boneco2.bolarapida());
        System.out.println("Bola Lenta: " + boneco2.bolalenta());
        System.out.println("Combo 1: " + boneco2.combo1());
        System.out.println("Combo 2: " + boneco2.combo2() );
        System.out.println("Fatalyty 1: " + boneco2.fatality());
        System.out.println("Fatality 2: " + boneco2.fatality1());
    }
    }
    
