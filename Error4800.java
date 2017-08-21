package com.example.komputer.epsonerrorcodes;

/**
 * Created by KOMPUTER on 2017-08-13.
 */

public class Error4800 {
    public static String check4800(String s) {
        String output = "";
        switch (s) {
            case "0002": {
                output = "CR movement cycles has reached predetermined value";
                break;
            }
            case "0008": {
                output = "RTC backup battery shut off";
                break;
            }
            case "0040": {
                output = "Pump counter has reached predetermined amount.";
                break;
            }
            case "0080": {
                output = "Date is not set";
                break;
            }
            case "0088": {
                output = "RTC backup battery is not installed.";
                break;
            }
            case "0100": {
                output = "RTC backup battery pressure is temporally low.";
                break;
            }
            case "0200": {
                output = "ASF paper feeding has reached predetermined value.";
                break;
            }
            case "00000101": {
                output = "CR Motor life";
                break;
            }
            case "00010000": {
                output = "PF Motor Encoder check error";
                break;
            }
            case "00010001": {
                output = "PF Motor out of step";
                break;
            }
            case "00010002": {
                output = "PF Motor over current";
                break;
            }
            case "00010003": {
                output = "PF Motor in-position time-out";
                break;
            }
            case "00010004": {
                output = "CR Motor Encoder check error";
                break;
            }
            case "00010005": {
                output = "CR Motor out of step";
                break;
            }
            case "00010006": {
                output = "CR Motor over current";
                break;
            }
            case "00010007": {
                output = "CR Motor in-position time-out";
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
                output = "CR axis detection error";
                break;
            }
            case "0001000C": {
                output = "PG axis detection error";
                break;
            }
            case "0001000F": {
                output = "CR Motor PWM output faulty";
                break;
            }
            case "00010010": {
                output = "PF Motor PWM output faulty";
                break;
            }
            case "00010012": {
                output = "CR overload (high sensitivity) error";
                break;
            }
            case "00010013": {
                output = "PR overload (high sensitivity) error";
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
            case "0001002D": {
                output = "Cleaning Unit work life error";
                break;
            }
            case "0001002F": {
                output = "360 DPI writing time out error";
                break;
            }
            case "00010030": {
                output = "Multi Sensor failure";
                break;
            }
            case "00010031": {
                output = "ASF phase detection error";
                break;
            }
            case "00010032": {
                output = "ASF drive switch error";
                break;
            }
            case "00010033": {
                output = "Eject phase detection error";
                break;
            }
            case "00010034": {
                output = "Eject movement error";
                break;
            }
            case "00010035": {
                output = "Pump phase detection error";
                break;
            }
            case "00010036": {
                output = "Type-B board installation error";
                break;
            }
            case "00010037": {
                output = "Head thermistor error";
                break;
            }
            case "00010038": {
                output = "Transistor thermistor error";
                break;
            }
            case "00010039": {
                output = "PG adjustment value incorrect overwrite error";
                break;
            }
            case "0001003A": {
                output = "PG adjustment value outside range error";
                break;
            }
            case "0001003B": {
                output = "Cutter installation error 1";
                break;
            }
            case "0001003C": {
                output = "Cutter installation error 2";
                break;
            }
            case "0001003D": {
                output = "Cutter installation error 3";
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
            case "100001C0": {
                output = "AC disruption";
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
            case "0003xxxx": {
                output = "Debug error code";
                break;
            }
            case "0Dxxxxxx": {
                output = "Debug error code";
                break;
            }
            case "0Exxxxxx": {
                output = "RTC timer off error";
                break;
            }
            default: {
                output = ("THERE IS NO SUCH ERROR");
                break;
            }


        }//switch
        return output;
    }//check()
}//class
