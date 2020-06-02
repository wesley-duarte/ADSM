package aula5.adsm.ex81.ex82;

public class Teste {

	public static void main(String[] args) {

		ConsomeNoticia agregadorTopico = new AgregadorTopico("Games");
		ConsomeNoticia agregadorMensal = new AgregadorMensal();

		NoticiarioAssina noticiario = new NoticiarioAssina(agregadorTopico);
		noticiario.notificaNoticia("Ubisoft divulga v�deo com tour em VR pela Notre-Dame", 10, 03, "Games");
		new Consumidor("Carlos Eduardo", noticiario);
		noticiario.notificaNoticia("Competi��es oficiais de Valorant n�o mostrar�o sangue dos personagens", 10, 02, "Games");
		noticiario.notificaNoticia("Dublador de Reno, de Final Fantasy VII, morre aos 55 anos", 03, 04, "Games");
		noticiario.notificaNoticia("Dragon Ball Z: Kakarot receber� modo Card Game em nova atualiza��o", 15, 04, "Games");
		noticiario.notificaNoticia("Mortal Kombat: A Vingan�a de Scorpion est� dispon�vel digitalmente no Brasil", 16, 04, "Games");
		noticiario.notificaNoticia("Free Fire: Evento de P�scoa oferece roupas raras e chance de ganhar 19.999 dimas", 16, 04, "Games");
		noticiario.notificaNoticia("Resident Evil 3 chega a mais de 2 milh�es de c�pias vendidas em 5 dias", 13, 04, "Games");
		new Consumidor("Erika Guedes", noticiario);
		noticiario.notificaNoticia("Assassin's Creed 2 est� gratuito para PC", 14, 04, "Games");
		new Consumidor("Ericson Guedes", noticiario);
		noticiario.notificaNoticia("M�dicos preveem que Brasil n�o volta ao normal antes de agosto", 14, 04, "Sa�de");
		noticiario.notificaNoticia("Xiaomi lan�a purificador de ar capaz de eliminar o v�rus H1N1.", 15, 04, "T�cnologia");
		noticiario.notificaNoticia("Remasteriza��o de Call of Duty: Modern Warfare 3 j� est� pronta", 10, 04, "Games");
		noticiario.notificaNoticia("Voc� sabia? Big Brother Brasil j� teve seu pr�prio game para PC", 04, 04, "Games");


		noticiario = new NoticiarioAssina(agregadorMensal);
		new Consumidor("Anderson", noticiario);
		noticiario.notificaNoticia("M�dicos preveem que Brasil n�o volta ao normal antes de agosto", 14, 03, "Sa�de");
		noticiario.notificaNoticia("Xiaomi lan�a purificador de ar capaz de eliminar o v�rus H1N1.", 15, 03, "T�cnologia");
		noticiario.notificaNoticia("Remasteriza��o de Call of Duty: Modern Warfare 3 j� est� pronta", 10, 04, "Games");
		noticiario.notificaNoticia("Voc� sabia? Big Brother Brasil j� teve seu pr�prio game para PC", 04, 04, "Games");
		noticiario.notificaNoticia("Competi��es oficiais de Valorant n�o mostrar�o sangue dos personagens", 10, 04, "Games");
		noticiario.notificaNoticia("Dublador de Reno, de Final Fantasy VII, morre aos 55 anos", 03, 04, "Games");
		noticiario.notificaNoticia("Dragon Ball Z: Kakarot receber� modo Card Game em nova atualiza��o", 15, 04, "Games");
		noticiario.notificaNoticia("Mortal Kombat: A Vingan�a de Scorpion est� dispon�vel digitalmente no Brasil", 16, 04, "Games");
		noticiario.notificaNoticia("Free Fire: Evento de P�scoa oferece roupas raras e chance de ganhar 19.999 dimas", 16, 04, "Games");
		noticiario.notificaNoticia("Resident Evil 3 chega a mais de 2 milh�es de c�pias vendidas em 5 dias", 13, 05, "Games");
	}

}
