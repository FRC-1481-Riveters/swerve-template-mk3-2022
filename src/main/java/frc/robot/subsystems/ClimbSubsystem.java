package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.CANCoder;

import static frc.robot.Constants.*;

public class ClimbSubsystem extends SubsystemBase 
{
    TalonSRX climb6Motor = new TalonSRX(CLIMB_6_MOTOR); 
    TalonSRX climb10Motor = new TalonSRX(CLIMB_10_MOTOR); 
    TalonSRX climb15Motor = new TalonSRX(CLIMB_15_MOTOR); 
    CANCoder climb6Encoder = new  CANCoder(CLIMB_6_ENCODER);
    CANCoder climb10Encoder = new  CANCoder(CLIMB_10_ENCODER);
    CANCoder climb15Encoder = new  CANCoder(CLIMB_15_ENCODER);


    public void setClimb6Speed(double value){
        climb6Motor.set(ControlMode.PercentOutput, value);
    }

    
    public void setClimb10Speed(double value){
        climb10Motor.set(ControlMode.PercentOutput, value);
    }

        
    public void setClimb15Speed(double value){
        climb15Motor.set(ControlMode.PercentOutput, value);
    }
}

