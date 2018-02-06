package org.usfirst.frc.team86.robot;

public class DriveStraight implements ICommand{
	
	public void DriveStraight (double feet) {
		this.feet = feet;
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
