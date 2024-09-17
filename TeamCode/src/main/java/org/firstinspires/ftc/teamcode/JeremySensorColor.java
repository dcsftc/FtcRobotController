package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

@Autonomous(name="JeremyColor")
public class JeremySensorColor extends LinearOpMode{

    public ColorSensor colorSensor;


    @Override
    public  void runOpMode() throws InterruptedException {

        colorSensor = hardwareMap.colorSensor.get("JeremyColor");

        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {

            if (colorSensor.red() > 20) {

            }
            telemetry.addData("red: ", colorSensor.red());
            telemetry.addData("green: ", colorSensor.green());
            telemetry.addData("blue: ", colorSensor.blue());
            telemetry.addData("alpha: ", colorSensor.alpha());
            telemetry.update();
        }
    }}



