package frc.robot.commands;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.Command;

public class TurnOnLed extends Command {
  private final OnBoardIO onboardio;

  public TurnOnLed(OnBoardIO onboardio) {
    this.onboardio = onboardio;
  }

  @Override
  public void initialize() {
    System.out.println("initialize");
  }

  @Override
  public void execute() {
    System.out.println("execute");
    onboardio.setRedLed(true);
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("end (interrupted " + interrupted + ")");
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
