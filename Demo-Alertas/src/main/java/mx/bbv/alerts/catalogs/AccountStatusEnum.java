package mx.bbv.alerts.catalogs;

/*
 * CATÁLOGO PARA ETIQUETAR EL GRADO DE RIESGO
 * */
public enum AccountStatusEnum {
	UNKNOWN(0), UNLOCK(1), LOCK(2);

	private int id;

	AccountStatusEnum (int id) {
		this.id = id;
	}

	/**
	 * @see Metodo para evaluar el valor del enum de un numerico
	 * @param id
	 * @return
	 */
	public static AccountStatusEnum fromInt(int id) {

		if (id == UNLOCK.id)
			return UNLOCK;
		else if (id == LOCK.id)
			return LOCK;
		else
			return UNKNOWN;
	}

	/**
	 * @see MEtodo para obtener su valor numerico 
	 * @return
	 */
	public int toInt() {
		return this.id;
	}

}
