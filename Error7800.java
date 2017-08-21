package com.example.komputer.epsonerrorcodes;

/**
 * Created by KOMPUTER on 2017-08-13.
 */

public class Error7800 {
    public static String check7800(String s){
        String output = "";
        switch(s)
        {
            case "0002": {
                output = "CR movement cycles reached the specified value.";
                break;
            }
            case "0008": {
                output = "The RTC backup battery run down or is not installed.";
                break;
            }
            case "0040": {
                output = "The pump counter reached the specified upper limit.";
                break;
            }
            case "0080": {
                output = "The date and time has not been set.";
                break;
            }
            case "0100": {
                output = "A momentary drop in voltage of the RTC backup battery";
                break;
            }
            case "0400": {
                output = "Pressure Pump counter reached the specified limit.";
                break;
            }
            case "00000101": {
                output = ("The CR Motor reached its end of life");
                break;
            }
            case "00010000": {
                output = ("PF Encoder check error");
                break;
            }
            case "00010001": {
                output = ("The PF Motor is out of step.");
                break;
            }
            case "00010002": {
                output = ("Overcurrent occurred on the PF Motor.");
                break;
            }
            case "00010003": {
                output = ("The PF Motor out of position time-out error");
                break;
            }
            case "00010004": {
                output = ("CR Encoder check error");
                break;
            }
            case "00010005": {
                output = ("CR Motor is out of step.");
                break;
            }
            case "00010007": {
                output = ("The CR Motor out of position time-out error");
                break;
            }
            case "00010008": {
                output = ("Servo interrupt watchdog time-out error");
                break;
            }
            case "00010009": {
                output = ("System interrupt watchdog time-out error");
                break;
            }
            case "0001000A": {
                output = ("Carriage home position detection error");
                break;
            }
            case "0001000a": {
                output = ("Carriage home position detection error");
                break;
            }
            case "0001000C": {
                output = ("PG home position detection error");
                break;
            }
            case "0001000c": {
                output = ("PG home position detection error");
                break;
            }
            case "00010014": {
                output = ("Failure of pressurizing");
                break;
            }
            case "0001001B": {
                output = ("Head driver (TG) temperature error");
                break;
            }
            case "0001001b": {
                output = ("Head driver (TG) temperature error");
                break;
            }
            case "0001001D": {
                output = ("CR servo parameter error");
                break;
            }
            case "0001001d": {
                output = ("CR servo parameter error");
                break;
            }
            case "0001001E": {
                output = ("PF servo parameter error");
                break;
            }
            case "0001001e": {
                output = ("PF servo parameter error");
                break;
            }
            case "00010020": {
                output = ("CSIC reading/writing error");
                break;
            }
            case "00010023": {
                output = ("RTC analyzing error");
                break;
            }
            case "00010026": {
                output = ("RTC communication error");
                break;
            }
            case "00010027": {
                output = ("Pressure pump micro air-leak error");
                break;
            }
            case "00010028": {
                output = ("Head error");
                break;
            }
            case "0001002A": {
                output = ("CR ASIC ECU error");
                break;
            }
            case "0001002a": {
                output = ("CR ASIC ECU error");
                break;
            }
            case "0001002D": {
                output = ("The Cleaning Unit reached its end of life.");
                break;
            }
            case "0001002d": {
                output = ("The Cleaning Unit reached its end of life.");
                break;
            }
            case "00010035": {
                output = ("Pump phase detection error");
                break;
            }
            case "000010036": {
                output = ("Type-B board installation error");
                break;
            }
            case "00010037": {
                output = ("Head thermistor error");
                break;
            }
            case "00010038": {
                output = ("Transistor thermistor error");
                break;
            }
            case "0001003E": {
                output = ("Pressure Sensor failure");
                break;
            }
            case "0001003e": {
                output = ("Pressure Sensor failure");
                break;
            }
            case "0001003F": {
                output = ("The Pressure Motor reached its end of life.");
                break;
            }
            case "0001003f": {
                output = ("The Pressure Motor reached its end of life.");
                break;
            }
            case "00010040": {
                output = ("Printing position error");
                break;
            }
            case "00020000": {
                output = ("NVRAM error");
                break;
            }
            case "00020002": {
                output = ("SDRAM error");
                break;
            }
            case "00020003": {
                output = ("Boot program sum error");
                break;
            }
            case "0002000A": {
                output = ("Program load error");
                break;
            }
            case "0002000a": {
                output = ("Program load error");
                break;
            }
            case "0002000B": {
                output = ("The internal memory is insufficient.");
                break;
            }
            case "0002000b": {
                output = ("The internal memory is insufficient.");
                break;
            }
            case "100000E0": {
                output = ("CPU address error (load)");
                break;
            }
            case "100000e0": {
                output = ("CPU address error (load)");
                break;
            }
            case "10000100": {
                output = ("CPU address error (store)");
                break;
            }
            case "10000180": {
                output = ("CPU reserved command code exception error");
                break;
            }
            case "100001A0": {
                output = ("CPU slot undefined command exception error");
                break;
            }
            case "100001a0": {
                output = ("CPU slot undefined command exception error");
                break;
            }
            case "100001C0": {
                output = ("The AC power is shut off.");
                break;
            }
            case "100001c0": {
                output = ("The AC power is shut off.");
                break;
            }
            case "100005C0": {
                output = ("CPU DMA address error");
                break;
            }
            case "100005c0": {
                output = ("CPU DMA address error");
                break;
            }
            default: {
                output = ("THERE IS NO SUCH ERROR");
                break;
            }

        }
        return output;

    }
}
