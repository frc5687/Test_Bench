package org.frc5687.swerve.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import org.frc5687.swerve.util.OutliersContainer;

public class VictorMotors extends OutliersSubsystem {

    VictorSPX vic = new VictorSPX(1);
    public VictorMotors(OutliersContainer container) {
        super(container);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void updateDashboard() {
        // TODO Auto-generated method stub

    }

    public void setSpeed(){
        vic.set(ControlMode.PercentOutput, 0.25);
    }
}
