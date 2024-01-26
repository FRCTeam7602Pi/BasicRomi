// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class ChargedUpAuton extends SequentialCommandGroup {
  /**
   * Auton mode from our 2023 robot.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public ChargedUpAuton(Drivetrain drivetrain) {
    addCommands(
        new PrintCommand("Starting Charged-Up Auton"),
        new DriveTime(-0.5, .5, drivetrain),
        new TurnDegrees(.5, 90, drivetrain),
        new DriveTime(1, 2, drivetrain));
  }
}
