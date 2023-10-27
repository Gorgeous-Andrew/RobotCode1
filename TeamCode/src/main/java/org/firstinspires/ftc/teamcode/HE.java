package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class HE extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        DcMotor backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
        DcMotor frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
        DcMotor backRightMotor = hardwareMap.dcMotor.get("backRightMotor");



        telemetry.addLine("hello");
        telemetry.addLine("hello");
        telemetry.addLine("hello");
        telemetry.addLine("hello");




        telemetry.update();


        telemetry.addLine("a");
//        telemetry.update();


        waitForStart();
        telemetry.addLine("test");
        telemetry.update();




        while (opModeIsActive()) {
            //
            if (gamepad1.a) {
                frontRightMotor.setPower(1);
                frontLeftMotor.setPower(1);
                backRightMotor.setPower(1);
                backLeftMotor.setPower(1);
            }
            else {
                frontRightMotor.setPower(0);
                frontLeftMotor.setPower(0);
                backRightMotor.setPower(0);
                backLeftMotor.setPower(0);
            }
        }

    }
}
