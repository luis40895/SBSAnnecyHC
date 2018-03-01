package utils;

import java.util.List;

public class EnvParameters {

	private int nbRows;

	private int nbColumns;

	private int nbVehicles;

	private int nbRides;

	private int nbBonus;

	private int nbSteps;

	private List<Integer> params;

	public EnvParameters(List<Integer> pParams) {
		this.params = pParams;
		setParams(pParams);
	}

	private void setParams(List<Integer> pParams) {
		nbRows = pParams.get(0);
		nbColumns = pParams.get(1);
		nbVehicles = pParams.get(2);
		nbRides = pParams.get(3);
		nbBonus = pParams.get(4);
		nbSteps = pParams.get(5);
		
	}

	public int getParameter(String parameterName) {

		if (parameterName == "rows") {
			return this.nbRows;
		}

		if (parameterName == "columns") {
			return this.nbColumns;
		}

		if (parameterName == "vehicles") {
			return this.nbVehicles;
		}

		if (parameterName == "rides") {
			return this.nbRides;
		}

		if (parameterName == "bonus") {
			return this.nbBonus;
		}

		if (parameterName == "steps") {
			return this.nbSteps;
		}
		
		else return 0;

	}

	public int getNbRows() {
		return nbRows;
	}

	public void setNbRows(int nbRows) {
		this.nbRows = nbRows;
	}

	public int getNbColumns() {
		return nbColumns;
	}

	public void setNbColumns(int nbColumns) {
		this.nbColumns = nbColumns;
	}

	public int getNbVehicles() {
		return nbVehicles;
	}

	public void setNbVehicles(int nbVehicles) {
		this.nbVehicles = nbVehicles;
	}

	public int getNbRides() {
		return nbRides;
	}

	public void setNbRides(int nbRides) {
		this.nbRides = nbRides;
	}

	public int getNbBonus() {
		return nbBonus;
	}

	public void setNbBonus(int nbBonus) {
		this.nbBonus = nbBonus;
	}

	public int getNbSteps() {
		return nbSteps;
	}

	public void setNbSteps(int nbSteps) {
		this.nbSteps = nbSteps;
	}

}
