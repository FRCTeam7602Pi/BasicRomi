package frc.robot.commands;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Lights;

public class TurnOffLed extends Command {
  private final Lights lights;

  public TurnOffLed(Lights lights) {
    this.lights = lights;
    addRequirements(lights);
  }

  @Override
  public void initialize() {
    lights.turnOffRedLed();
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
