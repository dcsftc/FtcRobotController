package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="ServeJeremy")
public class Servo_1 extends LinearOpMode{

    public Servo servo;
    ElapsedTime timer;

    @Override
    public  void runOpMode() {

        servo = hardwareMap.servo.get("ServeJeremy");
        timer = new ElapsedTime();
        waitForStart();
        timer.reset();

        while (opModeIsActive()) {
            if (timer.seconds() > 2) {
                servo.setPosition(1);
                if (timer.seconds() > 4)
                    timer.reset();
            } else {

                servo.setPosition(0);
            }
        }

    }

    }
