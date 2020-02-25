/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.VictorSPX;
//import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import frc.robot.Constants;

public class Color_Wheel_Subsystem extends SubsystemBase {
  /**
   * Creates a new Intake_Subsystem.
   */
  private final PWMVictorSPX color_Wheel = new PWMVictorSPX(Constants.VICTORSPX_COLOR_WHEEL);
  //private final VictorSPX intake_2 = new VictorSPX(Constants.VICTORSPX_INTAKE_2);

  private final DoubleSolenoid piston_Color_Wheel = new DoubleSolenoid(Constants.DOUBLESOLENOID_2, Constants.DOUBLESOLENOID_2_REVERSE);
  //private final DoubleSolenoid piston_2 = new DoubleSolenoid(Constants.CAN_DOUBLESOLENOID_2_LEFT, Constants.CAN_DOUBLESOLENOID_2_RIGHT);
  public Color_Wheel_Subsystem() {

  }

  //public void Intake() {
    //color_Wheel.set(1);;
    //intake_2.set(ControlMode.PercentOutput, -1);

  //}
  //public void Intake_Stop() {
    //color_Wheel.set(0);
    //intake_2.set(ControlMode.PercentOutput, 0);
  //}
  public void Piston_Color_Wheel_Out() {
    piston_Color_Wheel.set(Value.kForward);
    //piston_2.set(Value.kForward);
  }
  public void Piston_Color_Wheel_In() {
    piston_Color_Wheel.set(Value.kReverse);
    //piston_2.set(Value.kReverse);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
