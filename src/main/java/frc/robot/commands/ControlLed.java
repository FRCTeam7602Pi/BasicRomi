package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

public class ControlLed extends Command {
  private final boolean button;

  public ControlLed(boolean button) {
    this.button = button;
  }

  @Override
  public void initialize() {
    System.out.println("initialize");
    status();
  }

  @Override
  public void execute() {
    System.out.println("execute");
    status();
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("end (interrupted " + interrupted + ")");
    status();
  }

  @Override
  public boolean isFinished() {
    return true;
  }

  public void status() {
    System.out.println("button state " + button);
  }
}
