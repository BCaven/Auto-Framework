package org.usfirst.frc.team86.robot;

public class TurnTo implements ICommand {
private double degrees;
	public void TurnTo(double degrees) {
		this.degrees = degrees;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean done() {
		// TODO Auto-generated method stub
		return false;
	}
}
