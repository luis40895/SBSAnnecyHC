package entities;

import utils.Coordinate;

public class Ride {

	private Coordinate startIntersection;
	
	private Coordinate finishIntersection;
	
	private int earliestStep;
	
	private int latestStep;
	
	private int id;

	public Coordinate getStartIntersection() {
		return startIntersection;
	}

	public void setStartIntersection(Coordinate startIntersection) {
		this.startIntersection = startIntersection;
	}

	public Coordinate getFinishIntersection() {
		return finishIntersection;
	}

	public void setFinishIntersection(Coordinate finishIntersection) {
		this.finishIntersection = finishIntersection;
	}

	public int getEarliestStep() {
		return earliestStep;
	}

	public void setEarliestStep(int earliestStep) {
		this.earliestStep = earliestStep;
	}

	public int getLatestStep() {
		return latestStep;
	}

	public void setLatestStep(int latestStep) {
		this.latestStep = latestStep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
