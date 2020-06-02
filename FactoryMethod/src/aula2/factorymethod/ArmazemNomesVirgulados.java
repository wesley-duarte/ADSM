package aula2.factorymethod;

import java.util.ArrayList;

public class ArmazemNomesVirgulados extends ArmazemNomes {

	public ArmazemNomesVirgulados(ArrayList<Nome> nomes) {
		super(nomes);
	}

	@Override
	protected CriadorDeNomes getCriador() {
		return new CriadorDeNomesVirgulados();
	}

}
