package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name="ActuatorMotor")
public class Actuator extends OpMode{
    DcMotor leftActuatorMotor;
    DcMotor rightActuatorMotor;

    @Override
    public void init()
    {
        leftActuatorMotor = (DcMotor) hardwareMap.get("leftActuator");
        rightActuatorMotor = (DcMotor) hardwareMap.get("rightActuator");
    }

    @Override
    public void loop()
    {
        leftActuatorMotor.setPower(gamepad1.left_trigger);
        rightActuatorMotor.setPower(gamepad1.left_trigger);
        leftActuatorMotor.setPower(-gamepad1.right_trigger);
        rightActuatorMotor.setPower(-gamepad1.right_trigger);
    }
}
