package aula5.adsm.ex81.ex82;

import java.util.ArrayList;
import java.util.List;


public class NoticiarioAssina extends Noticiario {

	private List<Consumidor> consumidores = new ArrayList<Consumidor>();
	private Noticia noticia;
	ConsomeNoticia consumidor;


	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.noticia = new Noticia(textoNoticia, dia, mes, topico);
		this.notificarConsumidores();
		consumidor.consomeNoticia(textoNoticia, dia, mes, topico);

	}

	public void notificarConsumidores() {
		System.out.println("--- Notificando todos os consumidores ---");
		for (Consumidor consumidor : this.consumidores) {
			consumidor.update();
		}
		System.out.println("-----------------------------------------");
	}

	public void inscrever(Consumidor consumidor) {
		this.consumidores.add(consumidor);
		System.out.println(consumidor.getNome() + " se inscreveu ao Noticiario");
	}

	public Noticia getNoticia() {
		return this.noticia;
	}

	public NoticiarioAssina(ConsomeNoticia consumidor) {
		this.consumidor = consumidor;
	}

}
