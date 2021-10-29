/* Team 5687 (C)2020-2021 */
package org.frc5687.swerve;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import org.frc5687.swerve.util.Gamepad;
import org.frc5687.swerve.util.OutliersProxy;

public class OI extends OutliersProxy {
    protected Gamepad _driverGamepad;
    protected Joystick _leftJoystick;
    protected Joystick _rightJoystick;

    protected Button _driverRightStickButton;


    public OI() {

    }

    @Override
    public void updateDashboard() {}
}
