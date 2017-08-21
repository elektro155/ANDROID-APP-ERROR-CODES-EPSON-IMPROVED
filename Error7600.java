package com.example.komputer.epsonerrorcodes;

/**
 * Created by KOMPUTER on 2017-08-13.
 */

public class Error7600 {
    public static String check7600(String s) {
        String output = "";
        switch (s) {
            case "0040": {
                output = "Cleaning unit is nearing the end of life.";
                break;
            }
            case "0002": {
                output = "Carriage motor is nearing the end of life.";
                break;
            }
            case "0008": {
                output = "RTC backup battery is empty.";
                break;
            }
            case "0020": {
                output = "The number of shots (per nozzle) reaches the limit .";
                break;
            }
            case "0088": {
                output = "The RTC backup battery is not installed.";
                break;
            }
            case "0080": {
                output = "Data is not specified.";
                break;
            }
            case "0100": {
                output = "RTC backup battery is dropped instantaneously.";
                break;
            }
            case "00000101": {
                output = "CR motor life";
                break;
            }
            case "00010000": {
                output = "PF motor encoder check error";
                break;
            }
            case "00010001": {
                output = "PF motor out of step";
                break;
            }
            case "00010002": {
                output = "PF motor overcurrent";
                break;
            }
            case "00010003": {
                output = "PF motor in-position time-out";
                break;
            }
            case "00010004": {
                output = "CR motor encoder check error";
                break;
            }
            case "00010005": {
                output = "CR motor out of step";
                break;
            }
            case "00010006": {
                output = "CR motor overcurrent";
                break;
            }
            case "00010007": {
                output = "CR motor in-position time-out";
                break;
            }
            case "00010008": {
                output = "Servo interrupt watchdog time-out";
                break;
            }
            case "00010009": {
                output = "System interrupt watchdog time-out";
                break;
            }
            case "0001000A": {
                output = "CR home position sensor error";
                break;
            }
            case "0001000B": {
                output = "PF home position sensor error";
                break;
            }
            case "0001000C": {
                output = "Head slide (PG) home position sensor error";
                break;
            }
            case "0001000F": {
                output = "CR motor PWM output faulty";
                break;
            }
            case "00010010": {
                output = "PF motor PWM output faulty";
                break;
            }
            case "0001001B": {
                output = "Head driver (TG) temperature error";
                break;
            }
            case "0001001D": {
                output = "CR servo parameter error";
                break;
            }
            case "0001001E": {
                output = "PF servo parameter error";
                break;
            }
            case "00010020": {
                output = "CSIC reed/right error";
                break;
            }
            case "00010022": {
                output = "Ink type error (setting on printer body side)";
                break;
            }
            case "00010023": {
                output = "RTC analysis error";
                break;
            }
            case "00010025": {
                output = "CSIC ROM communication error";
                break;
            }
            case "00010026": {
                output = "RTC communication error";
                break;
            }
            case "00010028": {
                output = "Head error";
                break;
            }
            case "00010029": {
                output = "Unidentified NMI";
                break;
            }
            case "0001002A": {
                output = "CR ASIC ECU error";
                break;
            }
            case "0001002B": {
                output = "PF ASIC ECU error";
                break;
            }
            case "00020000": {
                output = "NVRAM error";
                break;
            }
            case "00020002": {
                output = "SDRAM error";
                break;
            }
            case "00020003": {
                output = "BOOT program SUM error";
                break;
            }
            case "00020004": {
                output = "NVRAM error (3K)";
                break;
            }
            case "00020005": {
                output = "NVRAM error (32K)";
                break;
            }
            case "00020009": {
                output = "Flash memory SUM error";
                break;
            }
            case "0002000A": {
                output = "Program load error";
                break;
            }
            case "0002000B": {
                output = "Internal memory shortage error";
                break;
            }
            case "0002000C": {
                output = "Review error";
                break;
            }
            case "100000E0": {
                output = "CPU address error (load misalignment)";
                break;
            }
            case "10000100": {
                output = "CPU address error (storage misalignment)";
                break;
            }
            case "10000180": {
                output = "CPU reserve command code exception error";
                break;
            }
            case "100001A0": {
                output = "CPU slot illegal command exception error";
                break;
            }
            case "100005C0": {
                output = "CPU DMA address error";
                break;
            }
            case "10000xxx": {
                output = "CPU error";
                break;
            }
            default: {
                output = ("THERE IS NO SUCH ERROR");
                break;
            }

        }//switch
        return output;
    }//check()

}
