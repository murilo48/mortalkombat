
package mortalkombat;

public class Xbox {

    public static void main(String[] args) {
         Reptile avatar = new Reptile();
        
        avatar.setSocoforte(" Y ");
        avatar.setSocofraco(" X ");
        avatar.setChuteforte(" A ");
        avatar.setChutefraco(" B ");
        avatar.setDefesa("L2 e R2");
        avatar.setEspecial("L1 e R1");
  
        System.out.println("---------------       XBOX    ----------------  ");
        System.out.println("\n------------Configurações de Botões Reptile -----------");
        System.out.println(" Soco Forte: " + avatar.getSocoforte());
        System.out.println(" Soco Fraco: " + avatar.getSocofraco());
        System.out.println(" Chute Forte: " + avatar.getChuteforte() );
        System.out.println(" Chute Fraco: "  + avatar.getChutefraco());
        System.out.println(" Defesa: " + avatar.getDefesa());
        System.out.println(" Especial: " + avatar.getEspecial() );
        System.out.println(" Todos os personagens começam com a vida em " + avatar.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Invisivel: "  +  avatar.invisivel());
        System.out.println("Ácido: " + avatar.acido());
        System.out.println("Bola Rápida: " + avatar.bolarapida());
        System.out.println("Bola Lenta: " + avatar.bolalenta());
        System.out.println("Combo 1: " + avatar.combo1());
        System.out.println("Combo 2: " + avatar.combo2() );
        System.out.println("Fatalyty 1: " + avatar.fatality());
        System.out.println("Fatality 2: " + avatar.fatality1());
        
        Scorpion p1 = new Scorpion();
        
        p1.setSocoforte(" Y ");
        p1.setSocofraco(" X ");
        p1.setChuteforte(" A ");
        p1.setChutefraco(" B ");
        p1.setDefesa("L2 e R2");
        p1.setEspecial("L1 eR1");
        
         System.out.println("---------------       XBOX    ----------------  ");
        System.out.println("\n------------Configurações de Botões  -----------");
        System.out.println(" Soco Forte: " + p1.getSocoforte());
        System.out.println(" Soco Fraco: " + p1.getSocofraco());
        System.out.println(" Chute Forte: " + p1.getChuteforte() );
        System.out.println(" Chute Fraco: "  + p1.getChutefraco());
        System.out.println(" Defesa: " + p1.getDefesa());
        System.out.println(" Especial: " + p1.getEspecial() );
        System.out.println(" Todos os personagens começam com a vida em " + p1.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Spetar: "  + p1.spear() );
        System.out.println("Derrubar: " + p1.takedown() );
        System.out.println("Teleporte: " + p1.teleport());
        System.out.println("Combo 1: " + p1.combo1());
        System.out.println("Combo 2: " + p1.combo2());
        System.out.println("Fatalyty 1: " + p1.fatality1());
        System.out.println("Fatality 2: " + p1.fatality2());
    
    }

    }
    

