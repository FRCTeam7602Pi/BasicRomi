package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Lights extends SubsystemBase {
    private final OnBoardIO onboardio;

    public Lights(OnBoardIO onboardio) {
        this.onboardio = onboardio;
    }

    public void turnOnRedLed() {
        onboardio.setRedLed(true);
    }

    public void turnOffRedLed() {
        onboardio.setRedLed(false);
    }
}
