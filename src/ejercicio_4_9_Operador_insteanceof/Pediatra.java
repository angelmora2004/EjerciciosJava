package ejercicio_4_9_Operador_insteanceof;

/**
 * @author Angel Mora
 */

public class Pediatra extends Medico {

	enum tipologia {
		NEUROLOGO, PSICOLOGO
	};

	tipologia tipo;

	void setTipología(tipologia tipo) {
		this.tipo = tipo;
	}

	tipologia getTipologia() {
		return tipo;
	}

}
