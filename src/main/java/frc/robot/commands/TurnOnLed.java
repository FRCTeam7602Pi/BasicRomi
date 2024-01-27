package frc.robot.commands;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Lights;

public class TurnOnLed extends Command {
  private final Lights lights;

  public TurnOnLed(Lights lights) {
    this.lights = lights;
    addRequirements(lights);
  }

  @Override
  public void initialize() {
    lights.turnOnRedLed();
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
