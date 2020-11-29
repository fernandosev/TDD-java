import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class Main {
	
	@SuppressWarnings("deprecation")
	@Test
	public void main() {
        Usuario joao = new Usuario("João", "joao@email.com", "(69) 99200-0000");
        Usuario jose = new Usuario("José", "jose@email.com", "(69) 99200-0001");
        Usuario maria = new Usuario("Maria", "maria@email.com", "(69) 99200-0002");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.addLance(new Lance(joao, 300.0));
        leilao.addLance(new Lance(jose, 400.0));
        leilao.addLance(new Lance(maria, 500.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        Assert.assertEquals(500, leiloeiro.getMaiorLance(), 0.00001);
        Assert.assertEquals(300, leiloeiro.getMenorLance(), 0.00001);
    }

}
