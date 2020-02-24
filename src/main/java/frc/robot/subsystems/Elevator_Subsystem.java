/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.RobotContainer;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.PWMVictorSPX;
//import edu.wpi.first.wpilibj2.command.button.Button;

public class Elevator_Subsystem extends SubsystemBase {
  /**
   * Creates a new Shooter_Subsystem.
   */
  private final PWMVictorSPX elevator = new PWMVictorSPX(Constants.VICTORSPX_ELEVATOR);

  // private final TalonSRX shooter_1 = new TalonSRX(Constants.TALONSRX_SHOOT_2);
  public Elevator_Subsystem() {
    
  }

  @Override
  public void periodic() {

  }
  public void Elevator_Up() {
    double elevator_speed = -1;
    elevator.set(elevator_speed);
  }

  public void Elevator_Down() {
    double elevator_speed = 1;
    elevator.set(elevator_speed);
  }

  public void Elevator_Stop() {
    elevator.set(0);
  }
}
