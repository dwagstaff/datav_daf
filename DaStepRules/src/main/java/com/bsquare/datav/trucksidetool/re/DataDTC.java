/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;

/**
 * @author davew
 *
 */
public class DataDTC {
	public static String dtcCodes[] = {
			"P0016, Camshaft speed signal - Not corresponding with engine position"
			,"P0017, Crankshaft speed signal - Not corresponding with engine position"
			,"P0045, VTG turbocharger actuator - Position error or internal error"
			,"P0046, VTG turbocharger actuator - Position error or internal error"
			,"P0049, Turbo speed - Higher than overspeed limit"
			,"P0069, Inlet air pressure in inlet manifold - Data erratic, intermittent or incorrect, at ignition on"
			,"P006B, Exhaust gas pressure after BPV - Data erratic, intermittent or incorrect, at ignition on"
			,"P006C, Inlet air pressure before compressor - Data erratic, intermittent or incorrect, at ignition on"
			,"P0072, Ambient temperature - Voltage too low or short circuit to ground on ECU (D420) pin (C78)"
			,"P0073, Ambient temperature - Voltage too high or short circuit to supply on ECU (D420) pin (C78)"
			,"P0087, Fuel pressure - Data valid but too low, Most severe"
			,"P0088, Fuel pressure - Data valid but too high"
			,"P0093, Common rail fuel pressure - Sudden pressure drop"
			,"P0094, Common rail pump unit control - Incorrect"
			,"P0095, Intercooler temperature - Data erratic, intermittent or incorrect"
			,"P0097, Intercooler temperature - Voltage too low or short circuit to ground on ECU (D420) pin (C17)"
			,"P0098, Intercooler temperature - Voltage too high or short circuit to supply on ECU (D420) pin (C17)"
			,"P009A, Ambient temperature - Data erratic, intermittent, or incorrect"
			,"P009F, Common rail pressure release valve - Malfunction detected during check"
			,"P00B7, Coolant pump speed - Data valid but too low, when high speed is requested"
			,"P00BA, Common rail fuel pressure - Data valid but too low, Moderately severe"
			,"P0107, Inlet air pressure in inlet manifold - Voltage too low or short circuit to ground on ECU (D420) pin (A51)"
			,"P0108, Inlet air pressure in inlet manifold - Voltage too high or short circuit to supply on ECU (D420) pin (A51)"
			,"P0110, Inlet air temperature in inlet manifold - Data erratic, intermittent or incorrect, at ignition on"
			,"P0112, Inlet air temperature in inlet manifold - Voltage too low or short circuit to ground on ECU (D420) pin (A43)"
			,"P0113, Inlet air temperature in inlet manifold - Voltage too high or short circuit to supply on ECU (D420) pin (A43)"
			,"P0115, Engine coolant temperature - Data erratic, intermittent or incorrect during overrun, at ignition on"
			,"P0117, Engine coolant temperature - Voltage too low or short circuit to ground on ECU (D420) pin (A58)"
			,"P0118, Engine coolant temperature - Voltage too high or short circuit to supply on ECU (D420) pin (A58)"
			,"P011A, Coolant pump speed - Stalled pump detected"
			,"P0121, Accelerator pedal - Sticking pedal"
			,"P0127, Intercooler temperature - Data valid but too high, most severe"
			,"P0135, Lambda sensor heater - Current too low or open circuit on ECU (D420) pin (C46)"
			,"P0148, Fuel injection control - Malfunction detected"
			,"P0149, Fuel injection control - Malfunction detected"
			,"P0168, Fuel temperature - Data valid but too high, most severe"
			,"P0180, Fuel temperature - Data erratic, intermittent or incorrect, at ignition on"
			,"P0182, Fuel temperature - Voltage too low or short circuit to ground on ECU (D420) pin (A42)"
			,"P0183, Fuel temperature - Voltage too high or short circuit to supply on ECU (D420) pin (A42)"
			,"P0192, Common rail fuel pressure - Voltage too low or short circuit to ground on ECU (D420) pin (A52)"
			,"P0193, Common rail fuel pressure - Voltage too high or short circuit to supply on ECU (D420) pin (A52)"
			,"P0195, Engine oil temperature - Data erratic, intermittent or incorrect, at ignition on"
			,"P0197, Engine oil temperature - Voltage too low or short circuit to ground on ECU (D420) pin (C16)"
			,"P0198, Engine oil temperature - Voltage too high or short circuit to supply on ECU (D420) pin (C16)"
			,"P0201, Common rail pump unit 1 - Current too low or open circuit on ECU (D420) pin (A26) or pin (A25)"
			,"P0205, Common rail pump unit 2 - Current too low or open circuit on ECU (D420) pin (A27) or pin (A28)"
			,"P0216, Fuel injection control - Malfunction detected"
			,"P0217, Engine coolant temperature - Data valid but too high, most severe"
			,"P0219, Engine speed - Data valid but too high"
			,"P0221, CAN communication - Message (EEC2) out of range, Remote accelerator pedal position"
			,"P0261, Common rail pump unit 1 - Voltage too low or short circuit to ground on ECU (D420) pin (A25)"
			,"P0262, Common rail pump unit 1 - Voltage too high or short circuit to supply on ECU (D420) pin (A25)"
			,"P0263, Cylinder 1 - Torque contribution too low"
			,"P0266, Cylinder 2 - Torque contribution too low"
			,"P0269, Cylinder 3 - Torque contribution too low"
			,"P0272, Cylinder 4 - Torque contribution too low"
			,"P0273, Common rail pump unit 2 - Voltage too low or short circuit to ground on ECU (D420) pin (A28)"
			,"P0274, Common rail pump unit 2 - Voltage too high or short circuit to supply on ECU (D420) pin (A28)"
			,"P0275, Cylinder 5 - Torque contribution too low"
			,"P0278, Cylinder 6 - Torque contribution too low"
			,"P0298, Engine oil temperature - Data valid but too high, most severe"
			,"P0301, Cylinder 1 - Contribution too low or misfire"
			,"P0302, Cylinder 2 - Contribution too low or misfire"
			,"P0303, Cylinder 3 - Contribution too low or misfire"
			,"P0304, Cylinder 4 - Contribution too low or misfire"
			,"P0305, Cylinder 5 - Contribution too low or misfire"
			,"P0306, Cylinder 6 - Contribution too low or misfire"
			,"P0315, Cylinder unbalance - Detected"
			,"P0335, Crankshaft speed signal - Disturbed or no signal during engine operation"
			,"P0340, Camshaft speed signal - Disturbed or no signal during engine operation"
			,"P0341, Camshaft speed signal - Out of range during engine operation"
			,"P0407, EGR pressure difference - Voltage too low or short circuit to ground on ECU (D420) pin (C80)"
			,"P0408, EGR pressure difference - Voltage too high or short circuit to supply on ECU (D420) pin (C80)"
			,"P040B, EGR temperature - Data erratic, intermittent or incorrect, at ignition on"
			,"P040C, EGR temperature - Voltage too low or short circuit to ground on ECU (D420) pin (C9)"
			,"P040D, EGR temperature - Voltage too high or short circuit to supply on ECU (D420) pin (C9)"
			,"P0471, Exhaust gas pressure before turbine - Data erratic, intermittent or incorrect, at ignition on"
			,"P0472, Exhaust gas pressure before turbine - Voltage too low or short circuit to ground on ECU (D420) pin (C83)"
			,"P0473, Exhaust gas pressure before turbine - Voltage too high or short circuit to supply on ECU (D420) pin (C83)"
			,"P047C, Exhaust gas pressure after BPV - Voltage too low or short circuit to ground on ECU (D420) pin (C81)"
			,"P047D, Exhaust gas pressure after BPV - Voltage too high or short circuit to supply on ECU (D420) pin (C81)"
			,"P0480, Electronically controlled fan - Current too low or open circuit on ECU (D420) pin (C74)"
			,"P0486, EGR pressure difference - Data erratic, intermittent, or incorrect at ignition on"
			,"P0493, Fan speed control - Incorrect"
			,"P0501, Vehicle speed sensor - Data erratic, intermittent, or incorrect"
			,"P0502, Vehicle speed sensor - Voltage too low or short circuit to ground on ECU (D420) pin (B40)"
			,"P0503, Vehicle speed sensor - Out of range"
			,"P0513, Immobilizer - Not matched"
			,"P0522, Engine oil pressure - Voltage too low or short circuit to ground on ECU (D420) pin (C84)"
			,"P0523, Engine oil pressure - Voltage too high or short circuit to supply on ECU (D420) pin (C84)"
			,"P0524, Engine oil pressure - Data valid but too low, most severe"
			,"P0527, Fan speed - Data valid but too high"
			,"P0528, Fan speed - Data valid but too low"
			,"P0541, Grid heater - Voltage too low or short circuit to ground on ECU (D420) pin (C72) or pin (C49)"
			,"P0542, Grid heater - Voltage too high or short circuit to supply on ECU (D420) pin (C72) or pin (C49)"
			,"P0543, Grid heater - Current too low or open circuit on ECU (D420) pin (C72) or pin (C49)"
			,"P0562, PCI ECU power supply - Data valid but too low on ECU (D420) pin (B60) or pin (B61) or pin (B62)"
			,"P0563, PCI ECU power supply - Data valid but too high on ECU (D420) pin (B60) or pin (B61) or pin (B62)"
			,"P0567, CAN communication - Message (CCVS) out of range, Cruise Control Resume switch from vehicle control system"
			,"P0568, CAN communication - Message (CCVS) out of range, Cruise Control Set Switch from vehicle control system"
			,"P0571, CAN communication - Message (CCVS) out of range, Brake switch from vehicle control system"
			,"P060A, PCI ECU - Internal error"
			,"P060C, Internal ECU injector power generation - Malfunction"
			,"P061B, Fuel injection control - Malfunction"
			,"P062A, Common rail pump unit control - Incorrect"
			,"P062B, Internal ECU injector power generation - Voltage too high"
			,"P062D, Internal ECU injector power generation - Voltage too low"
			,"P0640, Grid heater relay - Voltage too high or short circuit to supply on ECU (D420) pin (C55)"
			,"P064F, Fuel injection control - Malfunction"
			,"P0650, Malfunction Indicator Lamp (MIL) - Current too low or open circuit on ECU (D420) pin (B23)"
			,"P0666, Internal ECU temperature - Data erratic, intermittent or incorrect, at ignition on"
			,"P0668, Internal ECU temperature - Internal error"
			,"P0669, Internal ECU temperature - Internal error"
			,"P0685, PCI ECU - Short circuit to ground on ECU (D420) pin (B3)"
			,"P0691, Electronically controlled fan - Voltage too low or short circuit to ground on ECU (D420) pin (C74)"
			,"P0692, Electronically controlled fan - Voltage too high or short circuit to supply on ECU (D420) pin (C74)"
			,"P0698, PCI ECU 5V sensor supply - Voltage too low or short circuit to ground"
			,"P0699, PCI ECU 5V sensor supply - Voltage too high or short circuit to supply"
			,"P06AD, Internal ECU temperature - Internal error"
			,"P06AE, Internal ECU temperature - Internal error"
			,"P0703, CAN communication - Message (EBC1) out of range, EBS brake switch from brake system"
			,"P081C, CAN communication - Message (CCVS_VIC) out of range, Park Brake Switch from vehicle control system"
			,"P0830, Clutch input signal - Data erratic, intermittent or incorrect"
			,"P0833, CAN communication - Message (CCVS) out of range, clutch switch from vehicle control system"
			,"P0865, CAN - Message (PROPB_AST) time-out from transmission system"
			,"P0A1F, PCI ECU power supply - Data valid but too low"
			,"P101C, BPV position - Incorrect"
			,"P101D, BPV position - Incorrect"
			,"P101E, BPV actuator position - Unable to reach target"
			,"P101F, BPV actuator current - Data valid but too high"
			,"P1020, BPV actuator - Internal error"
			,"P1021, BPV actuator - CAN communication error"
			,"P1022, BPV actuator - Internal error"
			,"P1023, BPV actuator temperature - Data valid but too high"
			,"P1024, BPV actuator power supply - Incorrect"
			,"P1025, BPV actuator position - Malfunction on sensor"
			,"P1026, BPV actuator - Out of calibration"
			,"P102A, Exhaust gas temperature after BPV - Voltage too high or short circuit to supply on ECU (D420) pin (C11)"
			,"P102B, Exhaust gas temperature after BPV - Voltage too low or short circuit to ground on ECU (D420) pin (C11)"
			,"P102C, VTG turbocharger turbine - Malfunction"
			,"P102F, BPV actuator temperature - Data erratic, intermittent or incorrect, at ignition on"
			,"P1030, EGR temperature - Data erratic, intermittent or incorrect, at ignition on"
			,"P1032, Vehicle speed sensor - Data erratic, intermittent or incorrect, at ignition on"
			,"P1039, Exhaust gas pressure after BPV - Data valid but too high"
			,"P103C, EGR control - Unable to reach target"
			,"P1040, Exhaust gas pressure after BPV - Data valid but too low"
			,"P1042, VTG turbocharger control - Incorrect"
			,"P1048, Air mass flow - Data valid but too high, during overrun"
			,"P1049, Air mass flow - Data valid but too low during overrun"
			,"P104B, Inlet air pressure in inlet manifold - Data valid but too high"
			,"P104C, Inlet air pressure in inlet manifold - Data valid but too low"
			,"P104D, Exhaust gas pressure before turbine - Data valid but too high"
			,"P104E, Exhaust gas pressure before turbine - Data valid but too low, during engine braking"
			,"P1050, Exhaust gas pressure after BPV - Data erratic, intermittent or incorrect"
			,"P1051, Grid heater - Data erratic, intermittent, or incorrect"
			,"P1053, Speed functions off switch - Data erratic, intermittent, or incorrect"
			,"P1054, Downhill speed control switches - Data erratic, intermittent or incorrect"
			,"P1055, Retarder switches - Data erratic, intermittent, or incorrect"
			,"P1057, Exhaust gas pressure before turbine - Data valid but too low"
			,"P1058, Inlet air pressure in inlet manifold - Data valid but too low"
			,"P1062, Cruise control switches - Data erratic, intermittent, or incorrect"
			,"P1086, Common rail fuel pressure - Increase too slow"
			,"P1087, Fuel pressure - Data valid but too low, moderately severe"
			,"P1088, Common rail fuel pressure - Data valid but too high"
			,"P1089, Common rail fuel pressure - Data valid but too high"
			,"P1090, Common rail fuel pressure - Data valid but too high"
			,"P1091, Common rail fuel pressure - Data erratic, intermittent or incorrect"
			,"P109C, Common rail pressure release valve - Current too low or open circuit on ECU (D420) pin (C4)"
			,"P109D, Common rail pressure release valve - Current too high on ECU (D420) pin (C4)"
			,"P1105, Engine protection system - Approaching engine shutdown"
			,"P1106, Engine protection system - Power derate active"
			,"P1110, Intercooler efficiency - Too low"
			,"P1115, Engine coolant temperature - Data valid but too high, moderately severe"
			,"P1122, Cruise control brake signal - Data erratic, intermittent, or incorrect"
			,"P1127, Intercooler temperature - Data valid but too high, moderately severe"
			,"P1128, Inlet air temperature in inlet manifold - Data valid but too high"
			,"P1133, Lambda sensor heater - Voltage too high or short circuit to supply on ECU (D420) pin (C46)"
			,"P1134, Lambda sensor heater - Voltage too low or short circuit to ground on ECU (D420) pin (C46)"
			,"P1135, Lambda sensor heater - Voltage too high or short circuit to supply on ECU (D420) pin (C46)"
			,"P1136, Lambda sensor heater - Voltage too low or short circuit to ground on ECU (D420) pin (C46)"
			,"P1137, Lambda sensor heater power supply - Incorrect"
			,"P1138, Lambda sensor heater - Voltage too low or short circuit to ground on ECU (D420) pin (C46)"
			,"P1139, Lambda sensor calibration - Malfunction"
			,"P113A, Lambda sensor temperature - Unable to reach target"
			,"P113B, Lambda sensor controller - Incorrect"
			,"P1158, Wheel speed, front axle, left - Data erratic, intermittent or incorrect"
			,"P1159, Wheel speed, front axle, right - Data erratic, intermittent or incorrect"
			,"P1160, Wheel speed, rear axle, left - Data erratic, intermittent or incorrect"
			,"P1161, Wheel speed, rear axle, right - Data erratic, intermittent or incorrect"
			,"P1162, CAN communication - Message (TCO1) out of range, vehicle speed from tachograph"
			,"P1163, CAN communication - Message (TCO1) out of range, vehicle speed from transmission system"
			,"P1167, Fuel temperature - Data valid but too high, least severe"
			,"P1168, Fuel temperature - Data valid but too high, moderately severe"
			,"P1180, Fuel temperature - Data valid but too high, moderately severe"
			,"P1191, Fuel filter - Clogged"
			,"P1194, Fuel filter - Very clogged"
			,"P1195, Common rail fuel pressure - Data erratic, intermittent or incorrect, at ignition on"
			,"P1196, Common rail fuel pressure - Data erratic, intermittent or incorrect, at ignition on"
			,"P1201, Injector solenoid valve cylinder 1 - Current too low or open circuit on ECU (D420) pin (A1) and/or pin (A2)"
			,"P1202, Injector solenoid valve cylinder 1 - Short circuit between ECU (D420) pin (A1) and pin (A2)"
			,"P1203, Injector solenoid valve cylinder 1 - Voltage too low or short circuit to ground on ECU (D420) pin (A1)"
			,"P1204, Injector solenoid valve cylinder 1 - Voltage too high or short circuit to supply on ECU (D420) pin (A1)"
			,"P1205, Injector solenoid valve cylinder 5 - Current too low or open circuit on ECU (D420) pin (A3) and/or pin (A4)"
			,"P1206, Injector solenoid valve cylinder 5 - Short circuit between ECU (D420) pin (A3) and pin (A4)"
			,"P1207, Injector solenoid valve cylinder 5 - Voltage too low or short circuit to ground on ECU (D420) pin (A4 )"
			,"P1208, Injector solenoid valve cylinder 5 - Voltage too high or short circuit to supply on ECU (D420) pin (A4 )"
			,"P1209, Injector solenoid valve cylinder 3 - Current too low or open circuit on ECU (D420) pin (A5) and/or pin (A6)"
			,"P1210, Injector solenoid valve cylinder 3 - Short circuit between ECU (D420) pin (A5) and pin (A6)"
			,"P1211, Injector solenoid valve cylinder 3 - Voltage too low or short circuit to ground on ECU (D420) pin (A5)"
			,"P1212, Injector solenoid valve cylinder 3 - Voltage too high or short circuit to supply on ECU (D420) pin (A5)"
			,"P1213, Injector solenoid valve cylinder 6 - Current too low or open circuit on ECU (D420) pin (A7) and/or pin (A8)"
			,"P1214, Injector solenoid valve cylinder 6 - Short circuit between ECU (D420) pin (A7) and pin (A8)"
			,"P1215, Injector solenoid valve cylinder 6 - Voltage too low or short circuit to ground on ECU (D420) pin (A8)"
			,"P1216, Injector solenoid valve cylinder 6 - Voltage too high or short circuit to supply on ECU (D420) pin (A8)"
			,"P1217, Injector solenoid valve cylinder 2 - Current too low or open circuit on ECU (D420) pin (A9) and/or pin (A10)"
			,"P1218, Injector solenoid valve cylinder 2 - Short circuit between ECU (D420) pin (A9) and pin (A10)"
			,"P1219, Injector solenoid valve cylinder 2 - Voltage too low or short circuit to ground on ECU (D420) pin (A9)"
			,"P1220, Injector solenoid valve cylinder 2 - Voltage too high or short circuit to supply on ECU (D420) pin (A9)"
			,"P1221, Injector solenoid valve cylinder 4 - Current too low or open circuit on ECU (D420) pin (A11) and/or pin (A12)"
			,"P1222, Injector solenoid valve cylinder 4 - Short circuit between ECU (D420) pin (A11) and pin (A12)"
			,"P1223, Injector solenoid valve cylinder 4 - Voltage too low or short circuit to ground on ECU (D420) pin (A12)"
			,"P1224, Injector solenoid valve cylinder 4 - Voltage too high or short circuit to supply on ECU (D420) pin (A12)"
			,"P1225, Injector solenoid valve cylinder 1, 2, or 3 - Voltage too low or short circuit to ground on ECU (D420) pin (A2) or pin (A10) or pin (A6)"
			,"P1226, Injector solenoid valve cylinder 1, 2, or 3 - Voltage too high or short circuit to supply on ECU (D420) pin (A2) or pin (A10) or pin (A6)"
			,"P1227, Injector solenoid valve cylinder 4, 5, or 6 - Voltage too low or short circuit to ground on ECU (D420) pin (A11) or pin (A3) or pin (A7)"
			,"P1228, Injector solenoid valve cylinder 4, 5, or 6 - Voltage too high or short circuit to supply on ECU (D420) pin (A11) or pin (A3) or pin (A7)"
			,"P1230, Common rail pump unit 1 - Short circuit between ECU (D420) pin (A25) and pin (A26)"
			,"P1234, Common rail pump unit 2 - Short circuit between ECU (D420) pin (A27) and pin (A28)"
			,"P1235, Turbo speed - Data erratic, intermittent, or incorrect"
			,"P1263, Cylinder 1 - Torque contribution too high"
			,"P1266, Cylinder 2 - Torque contribution too high"
			,"P1269, Cylinder 3 - Torque contribution too high"
			,"P1272, Cylinder 4 - Torque contribution too high"
			,"P1275, Cylinder 5 - Torque contribution too high"
			,"P1278, Cylinder 6 - Torque contribution too high"
			,"P127A, EGR pressure difference - Data valid but too low"
			,"P127B, EGR pressure difference - Data valid but too high"
			,"P127C, EGR pressure difference - Data erratic, intermittent, or incorrect"
			,"P128E, Common rail fuel pressure control - Incorrect"
			,"P128F, Common rail fuel pressure control - Incorrect"
			,"P1298, Engine oil temperature - Data valid but too high, moderately severe"
			,"P1301, Cylinder 1 - Intermittent misfire"
			,"P1302, Cylinder 5 - Intermittent misfire"
			,"P1303, Cylinder 3 - Intermittent misfire"
			,"P1304, Cylinder 6 - Intermittent misfire"
			,"P1305, Cylinder 2 - Intermittent misfire"
			,"P1306, Cylinder 4 - Intermittent misfire"
			,"P1335, Crankshaft speed signal - Disturbed or no signal during engine start"
			,"P1336, Crankshaft speed signal - Out of range during engine start"
			,"P1340, Camshaft speed signal - Disturbed or no signal during engine start"
			,"P1341, Camshaft speed signal - Out of range during engine start"
			,"P1350, VTG turbocharger actuator power supply - Internal error"
			,"P1351, VTG turbocharger actuator - Internal error"
			,"P1352, VTG turbocharger actuator learning - Malfunction detected"
			,"P1354, VTG turbocharger actuator power supply - Data valid but too low, Least severe"
			,"P1356, VTG turbocharger actuator temperature - Data valid but too high"
			,"P1400, EGR mass flow - Estimated EGR rate too high"
			,"P1401, Crankcase air pressure - Voltage too high or short circuit to supply on ECU (D420) pin (C5)"
			,"P1402, Crankcase air pressure - Voltage too low or short circuit to ground on ECU (D420) pin (C5)"
			,"P1403, Crankcase air pressure - Data erratic, intermittent or incorrect, at ignition on"
			,"P1404, Crankcase air pressure - Data erratic, intermittent or incorrect, at ignition on"
			,"P1407, Crankcase air pressure - Leakage detected"
			,"P1408, Crankcase air pressure - Data valid but too high, Moderately severe"
			,"P1409, EGR pressure - Data valid but too high"
			,"P140A, Crankcase ventilation module rotor speed - Data valid but too high"
			,"P140E, Crankcase ventilation module rotor speed - Data valid but too low, most severe"
			,"P1458, EGR temperature - Data erratic, intermittent, or incorrect"
			,"P1480, EGR valve module position - Unable to reach target"
			,"P1481, EGR valve module current - Data valid but too high"
			,"P1482, EGR valve module - Internal error"
			,"P1483, EGR valve module - CAN communication error"
			,"P1484, EGR valve module - Internal error"
			,"P1485, EGR valve module temperature - Data valid but too high"
			,"P1486, EGR valve module power supply - Incorrect"
			,"P1487, EGR valve module position - Malfunction on sensor"
			,"P1488, EGR valve module - Out of calibration"
			,"P1489, EGR valve - Stuck closed"
			,"P1490, EGR gas flow detected - while the EGR valve is closed"
			,"P1495, Engine protection system - Power derate active"
			,"P1496, Engine protection system - Protection mode, Active"
			,"P1497, EGR valve position - Incorrect"
			,"P1498, EGR valve position - Incorrect"
			,"P1501, Vehicle speed sensor - Current too low or open circuit on ECU (D420) pin (B40)"
			,"P1502, Vehicle speed sensor - Data erratic, intermittent or incorrect"
			,"P1503, Vehicle speed sensor - Voltage too high or short circuit to supply on ECU (D420) pin (B40)"
			,"P1504, Vehicle speed sensor - Data erratic, intermittent or incorrect"
			,"P1505, Vehicle speed sensor - Frequency out of range"
			,"P150F, Engine oil level - Data valid but too low, moderately severe"
			,"P1514, Aftertreatment system - DEF dosing malfunction detected"
			,"P1516, Aftertreatment system - Malfunction detected"
			,"P1517, Aftertreatment system - DEF quality malfunction detected"
			,"P1518, Aftertreatment system - Engine torque derate active"
			,"P1519, Aftertreatment system - DEF level low"
			,"P151A, Aftertreatment system - Vehicle speed limitation active"
			,"P151B, Aftertreatment system - Upcoming vehicle speed limitation warning"
			,"P151C, Aftertreatment system - DEF level too low"
			,"P151D, Aftertreatment system - DEF level very low"
			,"P151E, Aftertreatment system - DEF tank empty"
			,"P1524, Engine oil pressure - Data valid but too low, moderately severe"
			,"P1526, CAN communication - Message (CM1) out of range, requested percent fan speed from vehicle control system"
			,"P153B, Crankcase ventilation module rotor speed - Data valid but too low, least severe"
			,"P153C, Crankcase ventilation module rotor speed - Data valid but too high"
			,"P1560, Coolant level - Data valid but too low, moderately severe"
			,"P1563, PCI ECU power supply - Data valid but too low, most severe"
			,"P1564, Fuel pressure - Data erratic, intermittent or incorrect, at ignition on"
			,"P1565, Idle speed - Differs from the target idle speed"
			,"P1566, Idle speed control - Incorrect"
			,"P1568, Coolant pump clutch 1 - Short circuit to ground"
			,"P1569, Coolant pump clutch 1 - Short circuit to supply"
			,"P156A, Coolant pump clutch 1 - Current too low or open circuit"
			,"P156B, Coolant pump clutch 2 - Short circuit to ground"
			,"P156C, Coolant pump clutch 2 - Short circuit to supply"
			,"P156D, Coolant pump clutch 2 - Current too low or open circuit"
			,"P156E, Vehicle speed sensor - Voltage too low or short circuit to ground on ECU (D420) pin (B12)"
			,"P156F, Vehicle speed sensor - Voltage too high or short circuit to supply on ECU (D420) pin (B12)"
			,"P1570, Engine oil temperature - Data erratic, intermittent or incorrect, during engine warm-up"
			,"P1571, Engine oil temperature - Data erratic, intermittent, or incorrect"
			,"P1572, Inlet air temperature after compressor - Data erratic, intermittent, or incorrect"
			,"P1573, Inlet air temperature in inlet manifold - Data valid but too high"
			,"P1574, Exhaust gas pressure before turbine - Data erratic, intermittent or incorrect"
			,"P1580, Turbo speed - Data valid but too high"
			,"P1581, Turbo speed - Data valid but too low"
			,"P1601, PCI ECU - Internal error"
			,"P1602, PCI ECU - Software error"
			,"P160A, PCI ECU - Internal error"
			,"P1644, PCI ECU 5V sensor supply - Voltage too high or short circuit to supply"
			,"P1645, PCI ECU 5V sensor supply - Voltage too low or short circuit to ground"
			,"P1650, Red warning - Short circuit to ground or open circuit on ECU (D420) pin (B8)"
			,"P1652, Red warning - Short circuit to supply on ECU (D420) pin (B8)"
			,"P1653, Yellow warning - Short circuit to ground or open circuit on ECU (D420) pin (B4)"
			,"P1655, Yellow warning - Short circuit to supply on ECU (D420) pin (B4)"
			,"P1658, PCI ECU - Internal error"
			,"P1674, PCI ECU - Software error"
			,"P1675, PCI ECU - Software error"
			,"P1676, PCI ECU - Software error"
			,"P1677, PCI ECU - Software error"
			,"P1678, PCI ECU - Software error"
			,"P1679, PCI ECU - Internal error"
			,"P1681, PCI ECU - Software error"
			,"P1682, Engine oil level - Current too low or open circuit on ECU (D420) pin (B35)"
			,"P1687, Starter motor - Voltage too high or short circuit to supply on ECU (D420) pin (B16)"
			,"P1688, Starter motor - Voltage too low or short circuit to ground on ECU (D420) pin (B16)"
			,"P1693, Cold starting aid - Voltage too high or short circuit to supply on ECU (D420) pin (C72) or pin (C49)"
			,"P1694, Cold starting aid - Voltage too low or short circuit to ground on ECU (D420) pin (C72) or pin (C49)"
			,"P1698, PCI ECU 5V sensor supply - Voltage too low or short circuit to ground"
			,"P1699, PCI ECU 5V sensor supply - Voltage too high or short circuit to supply"
			,"P1704, Lambda - Data erratic, intermittent or incorrect, during overrun"
			,"P1705, Lambda response rate - Too low"
			,"P1706, Lambda response rate - Too high"
			,"P1707, Lambda - Data valid but too low"
			,"P1708, Lambda - Data valid but too high"
			,"P1709, Lambda - Data valid but too low during overrun"
			,"P170A, Lambda - Data valid but too low, most severe"
			,"P170B, Lambda - Data valid but too high, most severe"
			,"P170C, NOx sensor before catalyst response - Data erratic, intermittent or incorrect, during overrun"
			,"P170D, NOx sensor before catalyst response - Incorrect"
			,"P170E, NOx sensor before catalyst response - Incorrect"
			,"P170F, NOx concentration before catalyst - Data valid but too high during overrun"
			,"P1710, NOx concentration before catalyst - Data valid but too low"
			,"P1711, NOx concentration before catalyst - Data valid but too high"
			,"P1717, Exhaust gas temperature after BPV - Data erratic, intermittent or incorrect"
			,"P1718, EGR mass flow - Data valid but too high"
			,"P1719, EGR mass flow - Data valid but too low"
			,"P171B, EGR flow response - Decrease too slow"
			,"P171C, EGR flow response - Increase too slow"
			,"P171E, Air mass flow - Data valid but too high"
			,"P1722, BPV control - Data erratic, intermittent, or incorrect"
			,"P1723, Exhaust gas pressure before turbine - Data valid but too low"
			,"P1724, Exhaust gas pressure before turbine - Data valid but too high"
			,"P1726, Exhaust gas pressure before turbine - response too slow, on requested pressure"
			,"P1727, VTG turbocharger control - Data erratic, intermittent or incorrect"
			,"P1751, Malfunction Indicator Lamp (MIL) - Voltage too high or short circuit to supply on ECU (D420) pin (B23)"
			,"P1863, CAN communication - Message (PROPB_AST) out of range, Maneuvering Mode from transmission system"
			,"P1866, Exhaust gas pressure before turbine - Data valid but too high"
			,"P1867, Exhaust gas temperature after BPV - Data valid but too high"
			,"P1868, Ambient temperature - Data valid but too high"
			,"P1869, Fuel temperature - Data valid but too low"
			,"P1870, Crankcase air pressure - Data valid but too low"
			,"P1871, Pressure before turbocharger compressor (humidity sensor) - Data valid but too low"
			,"P1872, Pressure before turbocharger compressor (humidity sensor) - Data valid but too high"
			,"P1874, Temperature before turbocharger compressor (humidity sensor) - Data valid but too high"
			,"P1876, Ambient pressure - Data valid but too high"
			,"P2104, Engine protection system - Warning active"
			,"P2147, Common rail pump unit 1 - Voltage too low or short circuit to ground on ECU (D420) pin (A26)"
			,"P2148, Common rail pump unit 1 - Voltage too high or short circuit to supply on ECU (D420) pin (A26)"
			,"P2150, Common rail pump unit 2 - Voltage too low or short circuit to ground on ECU (D420) pin (A27)"
			,"P2151, Common rail pump unit 2 - Voltage too high or short circuit to supply on ECU (D420) pin (A27)"
			,"P2181, Engine coolant temperature - Does not match engine operating conditions"
			,"P2183, Engine coolant temperature - Data erratic, intermittent, or incorrect"
			,"P2199, Inlet air temperature before compressor - Data erratic, intermittent or incorrect, at ignition on"
			,"P2226, Internal ECU ambient pressure - Data erratic, intermittent or incorrect, at ignition on"
			,"P2228, Internal ECU ambient pressure - Malfunction"
			,"P2229, Internal ECU ambient pressure - Malfunction"
			,"P222C, Internal ECU ambient pressure - Internal error"
			,"P222D, Internal ECU ambient pressure - Internal error"
			,"P2237, Lambda - Open circuit on ECU (D420) pin (C45)"
			,"P2238, Lambda - Current too low on ECU (D420) pin (C45)"
			,"P2239, Lambda - Current too high on ECU (D420) pin (C45)"
			,"P2266, Water in fuel - Voltage too low or short circuit to ground on ECU (D420) pin (A49)"
			,"P2275, Water in fuel - Voltage too high or short circuit to supply on ECU (D420) pin (A49)"
			,"P228C, Common rail fuel pressure control - Incorrect"
			,"P228D, Common rail fuel pressure control - Incorrect"
			,"P228E, Common rail fuel pressure control - Incorrect"
			,"P228F, Common rail fuel pressure control - Incorrect"
			,"P2294, Common rail pressure release valve - Open circuit on ECU (D420) pin (C4) or pin (C26)"
			,"P2295, Common rail pressure release valve - Voltage too low or short circuit to ground on ECU (D420) pin (C4)"
			,"P2296, Common rail pressure release valve - Voltage too high or short circuit to supply on ECU (D420) pin (C4)"
			,"P229A, Common rail pressure release valve current - Too high"
			,"P229B, Common rail pressure release valve current - Too low"
			,"P229C, Common rail pressure release valve current - Data valid but too low"
			,"P229D, Common rail pressure release valve current - Data valid but too high"
			,"P2457, EGR temperature - Data valid but too high, most severe"
			,"P2458, CAN communication - Message (CM1) out of range, DPF regeneration switch from vehicle control system"
			,"P2459, CAN communication - Message (CM1) out of range, DPF regeneration switch from vehicle control system"
			,"P250A, Engine oil level - Data valid but too low, least severe"
			,"P250B, Engine oil level - Data erratic, intermittent or incorrect, at ignition on"
			,"P250C, Engine oil level - Voltage too low or short circuit to ground on ECU (D420) pin (B35)"
			,"P250D, Engine oil level - Open circuit on ECU (D420) pin (B35)"
			,"P250E, Engine oil level - Unlikely, difference too high"
			,"P250F, Engine oil level - Data valid but too low, most severe"
			,"P252F, Engine oil level - Data valid but too high, moderately severe"
			,"P253B, CAN communication - Message (PTO) out of range, Engine PTO governor set switch"
			,"P2541, Fuel pressure - Voltage too low or short circuit to ground on ECU (D420) pin (A50)"
			,"P2542, Fuel pressure - Voltage too high or short circuit to supply on ECU (D420) pin (A50)"
			,"P2558, Coolant level 1 - Voltage too low or short circuit to ground on ECU (D420) pin (C7)"
			,"P2559, Coolant level 1 - Voltage too high or short circuit to supply on ECU (D420) pin (C7)"
			,"P2560, Coolant level - Data valid but too low, most severe"
			,"P2563, VTG turbocharger actuator position - No or too slow movement"
			,"P2579, Turbo speed - Abnormal rate of change"
			,"P2580, Turbo speed - Data valid but too low, Least severe on ECU (D420) pin (C87)"
			,"P2581, Turbo speed - Data valid but too high, Least severe on ECU (D420) pin (C87)"
			,"P2600, Coolant pump - Open circuit on ECU (D420) pin (C1)"
			,"P2603, Coolant pump speed - Data valid but too high"
			,"P2604, Coolant pump - Voltage too high or short circuit to supply on ECU (D420) pin (C1)"
			,"P2605, Coolant pump - Voltage too low or short circuit to ground on ECU (D420) pin (C1)"
			,"P2609, Grid heater relay - Current too low or open circuit on ECU (D420) pin (C55)"
			,"P262B, PCI ECU power supply - Open circuit on ECU (D420) pin (B43)"
			,"P268A, Fuel injection control - Incorrect"
			,"P3003, PCI ECU power supply - Data valid but too low"
			,"P30B3, CAN - Message (AT1IG1) time-out from NOx sensor before catalyst"
			,"P3100, Coolant pump speed - Data valid but too high, when low speed is requested"
			,"P3101, Coolant pump speed - Data valid but too low, when low speed is requested"
			,"P3405, MX Engine Brake solenoid valve cylinder 1-3 - Current too low or open circuit on ECU (D420) pin (A17)"
			,"P3407, MX Engine Brake solenoid valve cylinder 1-3 - Voltage too low or short circuit to ground on ECU (D420) pin (A17)"
			,"P3408, MX Engine Brake solenoid valve cylinder 1-3 - Voltage too high or short circuit to supply on ECU (D420) pin (A17)"
			,"P3413, MX Engine Brake solenoid valve cylinder 2 - Current too low or open circuit on ECU (D420) pin (A16)"
			,"P3415, MX Engine Brake solenoid valve cylinder 2 - Voltage too low or short circuit to ground on ECU (D420) pin (A16)"
			,"P3416, MX Engine Brake solenoid valve cylinder 2 - Voltage too high or short circuit to supply on ECU (D420) pin (A16)"
			,"P3421, MX Engine Brake solenoid valve cylinder 3 - Current too low or open circuit on ECU (D420) pin (A24)"
			,"P3423, MX Engine Brake solenoid valve cylinder 3 - Voltage too low or short circuit to ground on ECU (D420) pin (A24)"
			,"P3424, MX Engine Brake solenoid valve cylinder 3 - Voltage too high or short circuit to supply on ECU (D420) pin (A24)"
			,"P3429, MX Engine Brake solenoid valve cylinder 4 - Current too low or open circuit on ECU (D420) pin (A21)"
			,"P3431, MX Engine Brake solenoid valve cylinder 4 - Voltage too low or short circuit to ground on ECU (D420) pin (A21)"
			,"P3432, MX Engine Brake solenoid valve cylinder 4 - Voltage too high or short circuit to supply on ECU (D420) pin (A21)"
			,"P3437, MX Engine Brake solenoid valve cylinder 5 - Current too low or open circuit on ECU (D420) pin (A13)"
			,"P3439, MX Engine Brake solenoid valve cylinder 5 - Voltage too low or short circuit to ground on ECU (D420) pin (A13)"
			,"P3440, MX Engine Brake solenoid valve cylinder 5 - Voltage too high or short circuit to supply on ECU (D420) pin (A13)"
			,"P3445, MX Engine Brake solenoid valve cylinder 4-6 - Current too low or open circuit on ECU (D420) pin (A20)"
			,"P3447, MX Engine Brake solenoid valve cylinder 4-6 - Voltage too low or short circuit to ground on ECU (D420) pin (A20)"
			,"P3448, MX Engine Brake solenoid valve cylinder 4-6 - Voltage too high or short circuit to supply on ECU (D420) pin (A20)"
			,"P3750, Exhaust gas temperature before DOC - Voltage too high or short circuit to supply"
			,"P3751, Exhaust gas temperature before DOC - Voltage too low or short circuit to ground"
			,"P3752, Exhaust gas temperature before DOC - Unlikely, not changing during operation"
			,"P3753, Exhaust gas temperature before DPF - Voltage too high or short circuit to supply"
			,"P3754, Exhaust gas temperature before DPF - Voltage too low or short circuit to ground"
			,"P3755, Exhaust gas temperature before DPF - Data erratic, intermittent, or incorrect, not changing during operation"
			,"P3756, Exhaust gas temperature after DPF - Voltage too high or short circuit to supply"
			,"P3757, Exhaust gas temperature after DPF - Voltage too low or short circuit to ground"
			,"P3758, Exhaust gas temperature after DPF - Data erratic, intermittent, or incorrect"
			,"P3759, Heater element PM sensor - Voltage too high or short circuit to supply, high side"
			,"P3760, Heater element PM sensor - Voltage too low or short circuit to ground, high side"
			,"P3761, Heater element PM sensor - Voltage too high or short circuit to supply, low side"
			,"P3762, DPF differential pressure - Voltage too high or short circuit to supply on ECU (D374) pin (A70)"
			,"P3763, DPF differential pressure - Voltage too low or short circuit to ground on ECU (D374) pin (A70)"
			,"P3764, DPF differential pressure - Data erratic, intermittent, or incorrect"
			,"P3765, DPF differential pressure - Data erratic, intermittent, or incorrect"
			,"P3766, DPF differential pressure - Voltage too high or short circuit to supply on ECU (D374) pin (B32)"
			,"P3767, DPF differential pressure - Voltage too low or short circuit to ground on ECU (D374) pin (B32)"
			,"P3768, DPF outlet pressure - Data erratic, intermittent or incorrect, At ignition on, on ECU (D374) pin (B32)"
			,"P3769, DPF outlet pressure - Data erratic, intermittent or incorrect, During operation, on ECU (D374) pin (B32)"
			,"P3770, DPF outlet pressure - Data erratic, intermittent or incorrect, at ignition on or during operation, on ECU (D374) pin (B32)"
			,"P3771, Heater element PM sensor - Voltage too low or short circuit to ground, Low side"
			,"P3772, PM sensor - Voltage too high or short circuit to supply"
			,"P3773, SCR catalyst efficiency - Compensation level too high"
			,"P3774, SCR catalyst efficiency - Compensation level too high"
			,"P3776, Diesel Oxidation Catalyst (DOC) efficiency - Data valid but too low"
			,"P3777, SCR catalyst - Compensation level too high"
			,"P3778, Diesel Oxidation Catalyst (DOC) - Not detected"
			,"P3779, Exhaust gas temperature before DPF - Data valid but too high, least severe"
			,"P3780, Exhaust gas temperature before DPF - Data valid but too high, most severe"
			,"P3781, Exhaust gas temperature before DOC - Data valid but too high, moderately severe"
			,"P3782, Exhaust gas temperature before DPF - Data valid but too high, moderately severe"
			,"P3783, Diesel Oxidation Catalyst (DOC) - Data valid but too high, moderately severe"
			,"P3784, Sensor circuit PM sensor - Voltage too high or short circuit to supply"
			,"P3785, Sensor circuit PM sensor - Voltage too low or short circuit to ground"
			,"P3786, Diesel Oxidation Catalyst (DOC) compensation level - Too high"
			,"P3787, Fuel dosing module - Used up all compensation"
			,"P3788, DPF filtration efficiency - Data valid but too low, moderately severe"
			,"P3789, Exhaust gas temperature after DPF - Data valid but too high, most severe"
			,"P3790, Diesel Particulate Filter (DPF) - Not detected"
			,"P3791, Diesel Particulate Filter (DPF) - Too frequent regeneration"
			,"P3792, Exhaust gas temperature after DPF - Data valid but too high, least severe"
			,"P3793, Exhaust gas temperature after DPF - Data valid but too high, moderately severe"
			,"P3794, Diesel Particulate Filter (DPF) - Differential pressure too high level, least severe"
			,"P3795, Exhaust gas temperature after DPF - Data valid but too high, moderately severe"
			,"P3796, Diesel Particulate Filter (DPF) - Soot level, most severe"
			,"P3797, Diesel Particulate Filter (DPF) - Soot level, least severe"
			,"P3798, Diesel Particulate Filter (DPF) - Soot level, moderately severe"
			,"P3799, DPF differential pressure - Insufficient for DPF regeneration"
			,"P3800, Diesel Particulate Filter (DPF) - Regeneration completed but insufficient"
			,"P3801, DPF regeneration switch - Used in soot level 1 or higher"
			,"P3802, Diesel Particulate Filter (DPF) - Filter severely damaged"
			,"P3803, PM sensor - Voltage too low or short circuit to ground"
			,"P3804, DPF regeneration switch - Timer-based regeneration inhibit"
			,"P3805, DPF active regeneration - Unable to perform due to system timeout"
			,"P3806, DPF regeneration switch - Data erratic, intermittent or incorrect"
			,"P3807, Diesel Particulate Filter (DPF) - Stationary regeneration aborted due to poor regeneration efficiency"
			,"P3808, Exhaust gas temperature before SCR catalyst - Voltage too high or short circuit to supply"
			,"P3809, Exhaust gas temperature before SCR catalyst - Voltage too low or short circuit to ground"
			,"P3810, Exhaust gas temperature before SCR catalyst - Temperature difference"
			,"P3811, PM sensor heater - Error, at startup"
			,"P3812, Exhaust gas temperature after SCR catalyst - Voltage too high or short circuit to supply"
			,"P3813, Exhaust gas temperature after SCR catalyst - Voltage too low or short circuit to ground"
			,"P3814, Exhaust gas temperature after SCR catalyst - Data erratic, intermittent, or incorrect"
			,"P3815, Sensor circuit PM sensor - Voltage too high"
			,"P3816, Exhaust gas temperature before SCR catalyst - Data erratic, intermittent, or incorrect"
			,"P3817, Exhaust gas temperature after SCR catalyst - Data valid but too high, most severe"
			,"P3818, SCR catalyst conversion efficiency - Too low"
			,"P3819, SCR catalyst efficiency - Degraded"
			,"P3820, Pump module - Dosing system degradation malfunction"
			,"P3821, PM sensor ECU - Temperature too high or too low "
			,"P3822, DEF quality - DEF concentration too low"
			,"P3824, DEF quality - DEF concentration too high"
			,"P3825, Exhaust gas temperature before SCR catalyst - Data valid but too high, moderately severe"
			,"P3826, Exhaust gas temperature after SCR catalyst - Data valid but too high, moderately severe"
			,"P3827, Exhaust gas temperature before SCR catalyst - Data valid but too high, most severe"
			,"P3828, Exhaust gas temperature after SCR catalyst - Data valid but too high, most severe"
			,"P3829, DEF tank level sensor - Persist, not valid"
			,"P3830, SCR catalyst - Not detected"
			,"P3831, Fuel shutoff valve - Voltage too low or short circuit to ground on ECU (D374) pin (B07)"
			,"P3832, Fuel shut-off valve - Short circuit to supply or open circuit on ECU (D374) pin (B07)"
			,"P3833, Fuel dosing valve - Current too low or open circuit on ECU (D374) pin (A05) or pin (A29)"
			,"P3834, Fuel shutoff valve - Data erratic, intermittent, or incorrect on ECU (D374) pin (B07)"
			,"P3835, Fuel shutoff valve - Not responding or out of adjustment on ECU (D374) pin (B07)"
			,"P3836, Fuel dosing valve - Leakage detected"
			,"P3837, Intake module fuel pressure - Data valid but too low, least severe"
			,"P3838, Intake module fuel pressure - Data erratic, intermittent, or incorrect, not changing during operation on ECU (D374) pin (A72)"
			,"P3839, Intake module fuel pressure - Voltage too high or short circuit to supply on ECU (D374) pin (A72)"
			,"P3840, Intake module fuel pressure - Voltage too low or short circuit to ground on ECU (D374) pin (A72)"
			,"P3841, Air shutoff valve - Stuck in closed position"
			,"P3842, Air shutoff valve - Voltage too low or short circuit to ground on ECU (D374) pin (A32)"
			,"P3843, Air shut-off valve - Short circuit to supply or open circuit on ECU (D374) pin (A32)"
			,"P3844, DEF dosing valve - Current too low or open circuit on ECU (D374) pin (A77) or pin (A53)"
			,"P3845, Pump module reverting valve - Voltage too low or short circuit to ground on ECU (D374) pin (B34)"
			,"P3846, Pump module reverting valve - Short circuit to supply or open circuit on ECU (D374) pin (B34)"
			,"P3847, Pump module pressure - Voltage too high or short circuit to supply on ECU (D374) pin (B45)"
			,"P3848, Pump module pressure - Voltage too low or short circuit to ground on ECU (D374) pin (B45)"
			,"P3849, Pump module temperature - Malfunction on sensor"
			,"P3850, Pump module temperature - Malfunction on sensor"
			,"P3851, Pump module temperature - Malfunction on sensor"
			,"P3852, Pump module temperature - Malfunction on sensor"
			,"P3853, Pump module - Failed to thaw"
			,"P3854, Pump module temperature - Malfunction on sensor"
			,"P3855, Pump module temperature - Malfunction on sensor"
			,"P3856, DEF pressure - Data valid but too high"
			,"P3857, DEF pressure - Data valid but too low"
			,"P3858, Pump module - Pressure stabilization failed"
			,"P3859, DEF dosing valve - Not responding or out of adjustment"
			,"P3860, Pump module temperature - Malfunction on sensor"
			,"P3861, Pump module temperature - Malfunction on sensor"
			,"P3862, CAN communication - timeout from aftertreatment system"
			,"P3863, NOx sensor before catalyst power supply - Incorrect"
			,"P3864, NOx sensor before catalyst - Short circuit or open circuit"
			,"P3865, NOx sensor before catalyst - Short circuit or open circuit"
			,"P3866, CAN communication - Message (AT1IGC1) timeout from NOx sensor before catalyst "
			,"P3867, Heater element NOx sensor before catalyst performance - Malfunction"
			,"P3868, Heater element NOx sensor before catalyst - Warm-up failed"
			,"P3869, NOx sensor before catalyst - Short circuit or open circuit"
			,"P3870, NOx sensor before catalyst - Power supply not correct"
			,"P3871, CAN communication - Message (AT1IGC1) timeout from NOx sensor before catalyst "
			,"P3872, CAN communication - Message timeout from SCR exhaust gas temperature sensors ECU"
			,"P3873, CAN communication - Message (AT1IOGC1) time-out from NOx sensor after catalyst"
			,"P3874, CAN communication - Message timeout from DOC/DPF temperature sensors ECU"
			,"P3875, EAS-3 ECU - Data lost due to incorrect power down"
			,"P3876, EAS-3 ECU - Internal error"
			,"P3877, NOx sensor before catalyst - Persist, not valid"
			,"P3878, Hydrocarbon storage - Level too high"
			,"P3879, Hydrocarbon storage - Level too high"
			,"P3880, Hydrocarbon storage - Drive off malfunction"
			,"P3881, NOx sensor before catalyst power supply - Incorrect"
			,"P3882, EAS-3 ECU - Voltage too high or short circuit to supply on ECU (D374) pin (B03)"
			,"P3883, EAS-3 ECU - Voltage too low or short circuit to ground on ECU (D374) pin (B03)"
			,"P3884, EAS-3 ECU power supply DEF pressure sensor - Voltage too high or short circuit to supply on ECU (D374) pin (B57)"
			,"P3885, EAS-3 ECU power supply DEF pressure sensor - Voltage too low or short circuit to ground on ECU (D374) pin (B57)"
			,"P3886, EAS-3 ECU power supply DOC/DPF pressure sensor - Voltage too high or short circuit to supply on ECU (D374) pin (B42)"
			,"P3887, EAS-3 ECU power supply DOC/DPF pressure sensor - Voltage too low or short circuit to ground on ECU (D374) pin (B42)"
			,"P3888, EAS-3 ECU power supply fuel intake module - Voltage too high or short circuit to supply on ECU (D374) pin (A89)"
			,"P3889, EAS-3 ECU power supply fuel intake module - Voltage too low or short circuit to ground on ECU (D374) pin (A89)"
			,"P3890, Tank heater valve - Short circuit to supply or open circuit on ECU (D374) pin (B47)"
			,"P3891, Tank heater valve - Voltage too low or short circuit to ground on ECU (D374) pin (B47)"
			,"P3892, DEF tank temperature - Not increased when commanded"
			,"P3893, DEF level - Short circuit to supply or open circuit"
			,"P3894, DEF level - Voltage too low or short circuit to ground"
			,"P3895, DEF tank temperature sensor - Short circuit to supply or open circuit"
			,"P3896, DPF filtration efficiency - Too much soot detected, on PM sensor"
			,"P3898, DEF tank heating - Failed to thaw"
			,"P3899, DEF tank temperature - Data erratic, intermittent or incorrect"
			,"P3900, DEF tank temperature sensor - Voltage too low or short circuit to ground"
			,"P3901, Pump module - Data erratic, intermittent or incorrect"
			,"P3902, Pump module heater relay - Voltage too low or short circuit to ground on ECU (D374) pin (B33)"
			,"P3903, Pump module heater relay - Short circuit to supply or open circuit on ECU (D374) pin (B33)"
			,"P3904, Pump module - Voltage too low or short circuit to ground on ECU (D374) pin (B48)"
			,"P3905, Pump module - Voltage too high or short circuit to supply on ECU (D374) pin (B48)"
			,"P3906, Pump module temperature - Malfunction on sensor"
			,"P3907, Pump module temperature - Malfunction on sensor"
			,"P3908, Pump module temperature - Malfunction on sensor"
			,"P3909, Pump module heater - Voltage too high or short circuit to supply"
			,"P3910, Pump module heater - Voltage too low or short circuit to ground"
			,"P3911, Pump module reverting valve - Malfunction"
			,"P3912, Pump module - Unable to prime"
			,"P3913, NOx sensor after catalyst - Data not rational, drifted low"
			,"P3914, NOx sensor after catalyst - Data not rational, drifted high"
			,"P3915, Heater element NOx sensor after catalyst - Warm-up failed"
			,"P3916, NOx sensor after catalyst - Data erratic, intermittent, or incorrect"
			,"P3917, Heater element NOx sensor after catalyst - Malfunction"
			,"P3918, NOx sensor after catalyst - NOx signal malfunction"
			,"P3919, DEF quality - Fluid type unknown from DEF quality sensor"
			,"P3920, DEF quality sensor - Temperature difference, Too high"
			,"P3921, CAN communication - timeout from NOx sensor after catalyst"
			,"P3922, NOx sensor after catalyst - Value not changing when expected"
			,"P3923, NOx sensor after catalyst power supply - Interrupted"
			,"P3924, NOx sensor after catalyst - Out of calibration"
			,"P3925, PM sensor temperature probe - Voltage too high or short circuit to supply"
			,"P3926, PM sensor temperature probe - Voltage too low or short circuit to ground"
			,"P3927, Heater element NOx sensor after catalyst performance - Malfunction"
			,"P3928, NOx sensor after catalyst - Data not rational, drifted high"
			,"P3929, NOx sensor after catalyst - Persist, not valid"
			,"P3930, Diesel Oxidation Catalyst (DOC) efficiency - Data valid but too low"
			,"P3931, DEF quality sensor ECU - Internal error"
			,"P3932, DEF quality sensor temperature - Voltage too high or short circuit to supply"
			,"P3933, DEF quality sensor temperature - Voltage too low or short circuit to ground"
			,"P3934, DEF quality sensor concentration - Voltage too high or short circuit to supply"
			,"P3935, DEF quality sensor concentration - Voltage too low or short circuit to ground"
			,"P3936, DEF tank sensor ECU - Temperature too high"
			,"P3937, DEF quality - Persist, not valid"
			,"P3938, Tank heater valve - Stuck in open position"
			,"P3940, CAN - Message time-out from DEF tank level sensor"
			,"P3941, DEF tank level sensor - Internal error"
			,"P3942, Exhaust gas temperature sensors DPF - Voltage too high or short circuit to supply"
			,"P3943, Exhaust gas temperature sensors DPF - Voltage too low or short circuit to ground"
			,"P3944, Exhaust gas temperature DPF - Data valid but too high"
			,"P3945, CAN communication - timeout from DOC/DPF temperature sensors ECU"
			,"P3946, Exhaust gas temperature sensors SCR - Voltage too high or short circuit to supply"
			,"P3947, Exhaust gas temperature sensors SCR - Voltage too low or short circuit to ground"
			,"P3948, Exhaust gas temperature sensors SCR - Data valid but too high"
			,"P3949, CAN - time-out from SCR exhaust gas temperature sensors ECU"
			,"P3950, Heater element NH3 sensor - Malfunction"
			,"P3951, Heater element NH3 sensor - Malfunction"
			,"P3952, Heater element NH3 sensor - Malfunction"
			,"P3953, Heater element NH3 sensor - Malfunction"
			,"P3954, Heater element NH3 sensor - Malfunction"
			,"P3955, Heater element NH3 sensor - Malfunction"
			,"P3956, Heater element NH3 sensor - Malfunction"
			,"P3957, Heater element NH3 sensor - Malfunction"
			,"P3958, NH3 sensor internal trim resistor - Malfunction"
			,"P3959, NH3 sensor internal trim resistor - Malfunction"
			,"P3960, NH3 sensor - Internal error"
			,"P3961, NH3 sensor - Internal error"
			,"P3962, NH3 sensor - Internal error"
			,"P3963, CAN - time-out from NH3 sensor"
			,"P3964, NH3 sensor - Internal error"
			,"P3965, NH3 sensor - Internal error"
			,"P3966, NH3 sensor - Internal error"
			,"P3967, NH3 sensor - Internal error"
			,"P3968, NH3 sensor - Internal error"
			,"P3969, NH3 sensor - Internal error"
			,"P3970, NH3 sensor power supply - Interrupted"
			,"P3971, Heater element NH3 sensor - Failed to maintain the operating temperature"
			,"P3972, Heater element NH3 sensor - Failed to maintain the operating temperature"
			,"P3973, Heater element NH3 sensor - Heating failed during warm-up"
			,"P3974, NH3 sensor - Signal incorrect"
			,"P3975, DEF pipe heating relay - Voltage too high or short circuit to supply on ECU (D374) pin (A08)"
			,"P3976, DEF pipe heating relay - Voltage too low or short circuit to ground on ECU (D374) pin (A08)"
			,"P3977, Heater element DEF inlet pipe - Short circuit to ground or open circuit on ECU (D374) pin (A04)"
			,"P3978, Heater element DEF inlet pipe - Short circuit to supply on ECU (D374) pin (A04)"
			,"P3979, Heater element DEF return pipe - Short circuit to ground or open circuit on ECU (D374) pin (A52)"
			,"P3980, Heater element DEF return pipe - Short circuit to supply on ECU (D374) pin (A52)"
			,"P3982, Exhaust gas temperature sensors SCR power supply - Interrupted"
			,"P3983, Exhaust gas temperature sensor before SCR catalyst - Sensor has been tampered with"
			,"P3984, CAN communication - timeout from vehicle control system"
			,"P3985, Pump module power supply - Voltage too high on ECU (D374) pin (B46)"
			,"P3986, Pump module power supply - Voltage too low on ECU (D374) pin (B46)"
			,"P3987, Exhaust gas temperature sensors DPF - Internal error"
			,"P3988, Exhaust gas temperature sensors SCR - Internal error"
			,"P3989, NH3 sensor - Value not changing when expected"
			,"P3990, Exhaust gas temperature sensors DPF power supply - Interrupted"
			,"P3991, DOC/DPF temperature sensors ECU - Software verification incorrect"
			,"P3992, SCR exhaust gas temperature sensors ECU - Software verification incorrect"
			,"P3993, Heater element DEF pressure pipe - Short circuit to ground or open circuit on ECU (D374) pin (A28)"
			,"P3994, Heater element DEF pressure pipe - Short circuit to supply on ECU (D374) pin (A28)"
			,"P3995, Fuel shutoff valve orifice - Plugged"
			,"P3996, DEF flow - Too low"
			,"P3997, DEF quality - Incorrect"
			,"U0011, CAN - Hardware or software malfunction on V-CAN2"
			,"U0101, CAN - Message (ETC1) time-out from transmission system"
			,"U0103, CAN - Message (ETC2) time-out from transmission system"
			,"U0104, CAN - Message (CCVS) time-out from vehicle control system"
			,"U0105, CAN - Message (TESTRUN_INFO) time-out from aftertreatment system"
			,"U0106, CAN - Message (CCVS_EBS) time-out from brake system"
			,"U0120, CAN - Message (ETC7) time-out from transmission system"
			,"U0129, CAN - Message (EBC1) time-out from brake system"
			,"U0133, CAN - Message (VDC1) time-out from brake system"
			,"U0141, CAN - Message (TCO1) time-out from tachograph"
			,"U0143, CAN - Message (EEC2) time-out"
			,"U0155, CAN - Message (PROBA_BBM_to_Eng) time-out from Body Builder Module"
			,"U0156, CAN - Message (PROPB VIC) time-out from vehicle control system"
			,"U0157, CAN - Message (AMB) time-out from vehicle control system"
			,"U0404, CAN communication - Message (ETC2) out of range, selected gear from transmission system"
			,"U1011, CAN - Hardware or software malfunction on E-CAN"
			,"U1013, CAN communication - Message (A1DOC) out of range, DOC intake gas temperature from aftertreatment system"
			,"U1014, CAN - Hardware or software malfunction on V-CAN1"
			,"U1015, CAN - Hardware or software malfunction on A-CAN"
			,"U1016, CAN - Message (A1DOC) time-out from aftertreatment system"
			,"U1048, VTG turbocharger actuator position - Incorrect"
			,"U1049, VTG turbocharger actuator position - Incorrect"
			,"U104C, VTG turbocharger actuator - CAN communication error"
			,"U1069, Inlet air pressure before compressor - Data erratic, intermittent or incorrect"
			,"U1070, CAN communication - Message (AMB) out of range, ambient temperature from vehicle control system"
			,"U1071, Inlet air humidity before compressor - Data erratic, intermittent or incorrect"
			,"U1073, Humidity sensor - CAN, Message time-out"
			,"U1074, Inlet air temperature before compressor - Data erratic, intermittent or incorrect"
			,"U1104, CAN - Message (ACC1) time-out from Advanced Emergency Braking System"
			,"U1105, CAN communication - Message (PROBA_BBM_to_Eng) out of range, engine stop from Body Builder Module"
			,"U1110, CAN - Message (RC_DR) time-out from retarder system"
			,"U1112, CAN - Message (SCR1) time-out from aftertreatment system"
			,"U1114, CAN - Message (AT1T1I) time-out, DEF tank information from aftertreatment system"
			,"U1118, CAN communication - Message (EXH_GAS_CORR) out of range, NOx after SCR reading stable from aftertreatment system"
			,"U111A, CAN communication - Message (EXH_GAS_CORR) out of range, engine out NOx reading stable from aftertreatment system"
			,"U111B, CAN communication - Message (EXH_GAS_CORR) out of range, O2 concentration before catalyst (corrected) from aftertreatment system"
			,"U111C, CAN communication - Message (EXH_GAS_CORR) out of range, engine out NOx corrected from aftertreatment system"
			,"U111D, CAN - Message (EXH_GAS_CORR) time-out from aftertreatment system"
			,"U1120, CAN - Message (TSC1_BE) time-out from brake system"
			,"U1122, CAN - Message (TSC1_TE) time-out from transmission system"
			,"U1124, CAN - Message (TSC1_VE) time-out from vehicle control system"
			,"U1126, CAN - Message (TSC1_SE) time-out from Body Builder Module"
			,"U112A, CAN - Message (ACM) time-out from aftertreatment system"
			,"U112C, CAN communication - Message (AT1FC1) out of range, Fuel Rate from aftertreatment system"
			,"U112D, CAN - Message (AT1FC1) time-out from aftertreatment system"
			,"U112F, CAN communication - Message (AT1HI) out of range, total fuel used from aftertreatment system"
			,"U1130, CAN communication - Message (AT1HI) out of range, distance between active DPF regenerations from aftertreatment system"
			,"U1132, CAN - Message (CM1) time-out from vehicle control system"
			,"U1134, CAN - Message (A1SCRDSR2) time-out from aftertreatment system"
			,"U1136, CAN - Message (HRW) time-out from brake system"
			,"U1137, CAN communication - Message (A1SCRDSI2) out of range, DEF pipe heater 4 state from aftertreatment system"
			,"U1138, CAN - Message (TSC_AE) time-out from brake system"
			,"U113A, CAN - Message (AT1HI) time-out from aftertreatment system"
			,"U113C, CAN communication - Message (A1SCRDSI2) out of range, DEF pipe heater 1 state from aftertreatment system"
			,"U113D, CAN - Message (A1SCRDSI2) time-out"
			,"U113F, CAN communication - Message (A1SCREGT) out of range, SCR catalyst outlet gas temperature from aftertreatment system"
			,"U1144, CAN - Message (TD) time-out from tachograph"
			,"U1145, CAN - Message (A1SCRRSI) time-out"
			,"U1147, CAN - Message (A1SCRRSI) time-out from aftertreatment system"
			,"U1149, CAN - Message (DCUST1) time-out from aftertreatment system"
			,"U114A, CAN - Message (A1SCREGT) time-out from aftertreatment system"
			,"U114D, CAN - Message (A1SCRDSI1) time-out from aftertreatment system"
			,"U1150, CAN - Message (EBC1) time-out from brake system"
			,"U1154, CAN - Message (B) time-out from brake system"
			,"U1159, VTG turbocharger actuator - CAN, Message time-out"
			,"U1160, VTG turbocharger actuator control - Data erratic, intermittent or incorrect"
			,"U1161, CAN - Message (A1SCRAI2) time-out from aftertreatment system"
			,"U1163, CAN communication - Message (A1SCRAI2) out of range, SCR intermediate NH3 from aftertreatment system"
			,"U1164, CAN communication - Message (A1SCRAI2) out of range, SCR intermediate NH3 reading stable from aftertreatment system"
			,"U1165, CAN - Message (AT1S) time-out from aftertreatment system"
			,"U1167, CAN communication - Message (AT1S) out of range, Soot load percent from aftertreatment system"
			,"U1168, CAN - Message (DPFC1) time-out from aftertreatment system"
			,"U1179, CAN communication - Message (PROPB_VIC) out of range"
			,"U117A, CAN - Message (A1SCREGT2) time-out from aftertreatment system"
			,"U117C, CAN communication - Message (A1SCREGT2) out of range, intermediate gas temperature from aftertreatment system"
			,"U1184, CAN communication - Message (CCVS) out of range, Cruise Control enable switch from vehicle control system"
			,"U1188, CAN communication - Message (EBC2) out of range, front axle speed from brake system"
			,"U1190, CAN - Message (ERC1_DR) time-out from retarder system"
			,"U1194, CAN - Message (DD) time-out from vehicle control system"
			,"U1198, CAN - Message (EBC2) time-out from brake system"
			,"U1208, CAN - Message (PTO) time-out from vehicle control system"
			,"U1404, CAN communication - Message (ETC2) out of range, Engaged gear from transmission system"
			,"U1406, CAN communication - Message (ACC1) out of range, Adaptive Cruise Control mode from Advanced Emergency Braking System"
			,"U1407, CAN communication - Message (ACC1) out of range, Adaptive Cruise Control set speed from Advanced Emergency Braking System"
			,"U1408, VTG turbocharger actuator status - Data erratic, intermittent or incorrect"
			,"U1409, VTG turbocharger actuator state - Data erratic, intermittent or incorrect"
			,"U140A, VTG turbocharger actuator effort - Data erratic, intermittent or incorrect"
			,"U142F, CAN communication - Message (ACM_to_Eng) out of range, estimated pre-DOC pressure from aftertreatment system"
			,"U1501, CAN communication - Message (TCO1) out of range, output shaft speed from tachograph"
			,"U1502, CAN communication - Message (TCO1) out of range, vehicle speed from tachograph"
			,"U153B, CAN communication - Message (PTO) out of range, engine PTO resume switch"
			,"U1544, CAN communication - Message (ERC1_DR) out of range, retarder torque actual percent from retarder system"
			,"U1545, CAN communication - Message (ERC1_DR) out of range, driver&apos;s demand retarder - Percent torque from retarder system"
			,"U1546, CAN communication - Message (ERC1_DR) out of range, intended retarder percent torque from retarder system"
			,"U1547, CAN communication - Message (ERC1_DR) out of range, retarder selection, non-engine from retarder system"
			,"U1548, CAN communication - Message (ETC1) out of range, Transmission output shaft speed from transmission system"
			,"U1549, CAN communication - Message (ETC1) out of range, Transmission torque converter lockup engaged from transmission system"
			,"U1550, CAN communication - Message (RC_DR) out of range, reference retarder torque from retarder system"
			,"U1551, CAN communication - Message (VDC1) out of range, rollover protection active (brake) from brake system"
			,"U1552, CAN communication - Message (VDC1) out of range, rollover protection active (engine) from brake system"
			,"U1553, CAN communication - Message (VDC1) out of range, yaw control active (brake) from brake system"
			,"U1554, CAN communication - Message (VDC1) out of range, yaw control active (engine) from brake system"
			,"U1562, CAN communication - Message (ACM_Limits) out of range, turbine outlet flow low target request from aftertreatment system"
			,"U1563, CAN communication - Message (ACM_Limits) out of range, turbine outlet flow low limit request from aftertreatment system"
			,"U1564, CAN communication - Message (ACM_Limits) out of range, turbine outlet temperature low target request from aftertreatment system"
			,"U1565, CAN communication - Message (ACM_Limits) out of range, turbine outlet temperature upper limit request from aftertreatment system"
			,"U1566, CAN - Message (ACM_LIMITS) time-out from aftertreatment system"
			,"U1571, EGR valve module - CAN, Message time-out"
			,"U1572, EGR valve module state - Data erratic, intermittent, or incorrect"
			,"U1573, EGR valve module position - Data erratic, intermittent, or incorrect"
			,"U1574, EGR valve module temperature - Data erratic, intermittent, or incorrect"
			,"U1575, EGR valve module effort - Data erratic, intermittent, or incorrect"
			,"U1577, BPV actuator - CAN, Message time-out"
			,"U1578, BPV actuator effort - Data erratic, intermittent, or incorrect"
			,"U1579, BPV actuator position - Data erratic, intermittent, or incorrect"
			,"U157A, BPV actuator state - Data erratic, intermittent, or incorrect"
			,"U157B, BPV actuator temperature - Data erratic, intermittent, or incorrect"
			,"U1700, CAN communication - Message (AT1T1I) out of range, DEF tank level from aftertreatment system"
			,"U1702, CAN communication - Message (AT1T1I) out of range, DEF tank heating from aftertreatment system"
			,"U1703, Remote pedal - Voltage too low or short circuit to ground"
			,"U1711, CAN - Message (AT1IMG) time-out from aftertreatment system"
			,"U1716, CAN - Message (AT1OG2) time-out from aftertreatment system"
			,"U1721, CAN - Message (VEP1) time-out from aftertreatment system"
			,"U1726, CAN - Message (AT1GP) time-out from aftertreatment system"
			,"U1728, CAN - Message (AT1OG1) time-out from aftertreatment system"
			,"U1730, CAN communication - Message (AT1OG1) out of range, NOx after SCR from aftertreatment system"
			,"U177B, Accelerator pedal 1 - Voltage too high or short circuit to supply on ECU (D420) pin (B41)"
			,"U177C, Accelerator pedal 1 - Voltage too low or short circuit to ground on ECU (D420) pin (B41)"
			,"U177D, Accelerator pedal sensor 1 duty cycle - Data valid but too high on ECU (D420) pin (B41)"
			,"U177E, Accelerator pedal sensor 1 duty cycle - Data valid but too low on ECU (D420) pin (B41)"
			,"U177F, Accelerator pedal 1 frequency - Data valid but too high on ECU (D420) pin (B41)"
			,"U1780, CAN - Message (TSC1 yye) time-out"
			,"U1781, CAN - Message (TSC_PE) time-out"
			,"U1785, CAN - Message (PROPB_EST) time-out from retarder system"
			,"U1787, CAN communication - Message (PROPB_EST) out of range, coolant temperature from retarder system"
			,"U1788, CAN communication - Message (PROPB_EST) not available, coolant temperature from retarder system"
			,"U1789, CAN communication - Message (PROBA_BBM_to_Eng) out of range, Starter Interrupt from Body Builder Module"
			,"U178A, CAN communication - Message (PROBA_BBM_to_Eng) out of range, ESC enable from Body Builder Module"
			,"U178B, CAN communication - Message (PROBA_BBM_to_Eng) out of range, ESC resume or set from Body Builder Module"
			,"U178C, CAN communication - Message (PROBA_BBM_to_Eng) out of range, ESC n variable from Body Builder Module"
			,"U178D, CAN communication - Message (PROBA_BBM_to_Eng) out of range, ESC n variable from Body Builder Module"
			,"U178E, CAN communication - Message (PROBA_BBM_to_Eng) out of range, application speed limiter switch 1 from Body Builder Module"
			,"U178F, CAN communication - Message (PROBA_BBM_to_Eng) out of range, ESC n2 from Body Builder Module"
			,"U1790, CAN communication - Message (PROBA_BBM_to_Eng) out of range, ESC n3 from Body Builder Module"
			,"U1791, CAN communication - Message (PROBA_BBM_to_Eng) out of range, application speed limiter switch 2 from Body Builder Module"
			,"U1792, CAN communication - Message (PROBA_BBM_to_Eng) out of range, throttle integration switch from Body Builder Module"
			,"U1793, CAN communication - Message (PROPB_AST) out of range, clutch switch from transmission system"
			,"U1794, CAN communication - Message (PROPB_AST) not available, clutch percent torque from transmission system"
			,"U1798, CAN communication - Message (EBC1) out of range, engine retarder selection from brake system"
			,"U1799, CAN communication - Message (TSC1 yye) data error"
			,"U179A, CAN communication - Message (TSC1_SE) data error from Body Builder Module"
			,"U179B, CAN communication - Message (TSC1_TE) data error from transmission system"
			,"U179C, CAN communication - Message (TSC1_VE) data error from vehicle control system"
			,"U179D, CAN communication - Message (TSC1 xxe) data error"
			,"U179E, CAN - Message (TSC1 xxe) time-out"
			,"U179F, CAN - Message (TSC1 HCE) time-out from aftertreatment system"
			,"U17A0, Accelerator pedal 1 frequency - Data valid but too low on ECU (D420) pin (B41)"
			,"U17A1, Accelerator pedal 2 - Voltage too high or short circuit to supply on ECU (D420) pin (B45)"
			,"U17A2, Accelerator pedal 2 - Voltage too low or short circuit to ground on ECU (D420) pin (B45)"
			,"U17A3, Accelerator pedal sensor 2 duty cycle - Data valid but too high on ECU (D420) pin (B45)"
			,"U17A4, Accelerator pedal sensor 2 duty cycle - Data valid but too low on ECU (D420) pin (B45)"
			,"U17A5, Accelerator pedal 2 frequency - Data valid but too high on ECU (D420) pin (B45)"
			,"U17A6, Accelerator pedal 2 frequency - Data valid but too low on ECU (D420) pin (B45)"
			,"U17A7, Accelerator pedal - Sensor 1 and 2 synchronization malfunction"
			,"U17A8, Accelerator pedal - Malfunction"
			,"U17A9, Accelerator pedal operation - Data erratic, intermittent or incorrect"
			,"U17B0, Water in fuel drain control - Short circuit to supply on ECU (D420) pin (A40)"
			,"U17B1, Water in fuel drain control - Short circuit to ground on ECU (D420) pin (A40)"
			,"U17B3, Water in fuel drain control - Short circuit to supply on ECU (D420) pin (A37)"
			,"U17B4, Water in fuel drain control - Short circuit to ground on ECU (D420) pin (A37)"
			,"U17B5, Water in fuel drain control - Current too low or open circuit on ECU (D420) pin (A37)"
			,"U17B6, CAN communication - Message (TSC1_AE) data error from brake system"
			,"U17B7, CAN communication - Message (TSC1_BE) data error from brake system"
			,"U17B8, CAN communication - Message (TSC1_HCE) data error from aftertreatment system"
			,"U17B9, CAN communication - Message (TSC1_PE) data error"
			,"U17BA, VTG turbocharger actuator temperature - Data erratic, intermittent or incorrect, at ignition on"
			,"U17C4, CAN - Message (TSC1 ACXR) time-out"
			,"U17C5, CAN - Message (TSC1_AXR) time-out"
			,"U17C6, CAN - Message (TSC1_DXR) time-out from retarder system"
			,"U17C7, CAN - Message (TSCI_TXR) time-out from transmission system"
			,"U17C8, CAN - Message (TSC1_VXR) time-out"
			,"U17C9, CAN - Message (TSC1_SXR) time-out"
			,"U17CA, CAN communication - Message (TSC1_AXCR) message checksum"
			,"U17CB, CAN communication - Message (TSC1_AXR) message count from brake system"
			,"U17CC, CAN communication - Message (TSC1_DXR) message count from retarder system"
			,"U17CD, CAN communication - Message (TSC_TXR) message count from transmission system"
			,"U17CE, CAN communication - Message (TSC1_VXR) message count"
			,"U17CF, CAN communication - Message (TSC1_SXR) message count"
			,"U17D0, CAN communication - Message (TSC1_AXCR) message checksum"
			,"U17D1, CAN communication - Message (TSC1_AXR) message checksum from brake system"
			,"U17D2, CAN communication - Message (TSC1_DXR) message checksum from retarder system"
			,"U17D3, CAN communication - Message (TSC_TXR) message checksum from transmission system"
			,"U17D4, CAN communication - Message (TSC1_VXR) message checksum"
			,"U17D5, CAN communication - Message (TSC1_SXR) message checksum"
			,"U17E4, Remote pedal - Voltage too high or short circuit to supply"
			,"U1802, VTG turbocharger actuator power supply - Data valid but too high"
			,"U1803, CAN communication - Message (ACC1) out of range, Forward Collision Warning from Advanced Emergency Braking System"
			,"U1805, CAN - Message (ACC2) time-out from vehicle control system"
			,"U1806, CAN communication - Message (ACM_to_Eng) out of range, soot level from aftertreatment system"
			,"U180A, CAN communication - Message (PTO) out of range, PTO governor state"
			,"U180B, CAN communication - Message (CCVS_VIC) out of range, cruise control pause switch from vehicle control system"
			,"U180C, CAN communication - Message (CVW) out of range, gross combination vehicle weight from brake system"
			,"U180E, CAN - Message (CVW) time-out from brake system"
			,"U1810, CAN - Message (EAS_EI_AECD) time-out from aftertreatment system"
			,"U1812, CAN - Message (EAS_SYS_INFO) time-out from aftertreatment system"
			,"U1813, CAN communication - Message (EBC1_EBS) out of range, ASR engine control active from brake system"
			,"U1814, CAN communication - Message (EBC1_CECU) out of range, ASR brake control active from brake system"
			,"U1815, CAN communication - Message (EBC2) out of range, relative speed, front axle, left wheel from brake system"
			,"U1816, CAN communication - Message (EBC2) out of range, relative speed, front axle, right wheel from brake system"
			,"U1817, CAN communication - Message (ETC1) not available, Transmission Shift In Process from transmission system"
			,"U1818, CAN communication - Message (ETC1) out of range, transmission shift in process from transmission system"
			,"U1819, CAN communication - Message (ETC1) not available, engine momentary overspeed enable from transmission system"
			,"U181A, CAN communication - Message (ETC1) out of range, engine momentary overspeed enable from transmission system"
			,"U181B, CAN communication - Message (ETC1) not available, progressive shift disable from transmission system"
			,"U181C, CAN communication - Message (ETC1) out of range, progressive shift disable from transmission system"
			,"U181D, CAN communication - Message (ETC7) not available, transmission engine crank enable from transmission system"
			,"U181E, CAN communication - Message (ETC7) out of range, transmission engine crank enable from transmission system"
			,"U181F, CAN communication - Message (PROPB_SW) out of range, cruise control set plus switch from steering wheel switches"
			,"U1820, CAN communication - Message (PROPB_SW) out of range, cruise control resume min switch from steering wheel switches"
			,"U1821, CAN communication - Message (PROPB_SW) out of range, speed functions off switch from steering wheel switches"
			,"U1822, CAN communication - Message (PROPB_SW) out of range, Downhill Speed Control Set Plus Switch from steering wheel switches"
			,"U1823, CAN communication - Message (PROPB_SW) out of range, Downhill Speed Control Resume Min Switch from steering wheel switches"
			,"U1824, CAN communication - Message (PROPB_SW) out of range, Variable Speed Limiter Set Switch from steering wheel switches"
			,"U1825, CAN - Message (PROPB_SW) rate too high from steering wheel switches"
			,"U1826, CAN - Message (PROPB_SW) time-out from steering wheel switches"
			,"U1827, CAN communication - Message (PROPB_VIC) not available, estimated engine parasitic losses from vehicle control system"
			,"U1828, CAN communication - Message (PROPB_VIC) out of range, estimated engine parasitic losses from vehicle control system"
			,"U1829 CAN communication - Message (PROPB_VIC) not available"
			,"U182A, CAN communication - Message (PROPB_VIC) out of range, secondary retarder switch from vehicle control system"
			,"U182C, CAN communication - Message (PROPB_VIC) out of range, km/h, miles/h switch from vehicle control system"
			,"U182E, CAN communication - Message (PROPB_VIC) not available, primary retarder by stalk on from vehicle control system"
			,"U1830, CAN communication - Message (PROPB_VIC) out of range, primary retarder by stalk off from vehicle control system"
			,"U1831, CAN communication - Message (PROPB_VIC) not available, primary retarder by foot on from vehicle control system"
			,"U1832, CAN communication - Message (PROPB_VIC) out of range, primary retarder by foot on from vehicle control system"
			,"U1833, CAN communication - Message (PROPB_VIC) out of range, requested percent coolant pump speed from vehicle control system"
			,"U1835, VTG turbocharger actuator - CAN, Message time-out"
			,"U1836, CAN communication - Message (PTO) out of range, engine remote PTO governor variable speed control switch"
			,"U1837, CAN communication - Message (PTO) out of range, engine remote PTO governor preprogrammed speed control switch"
			,"U1838, CAN communication - Message (PTO) out of range, engine PTO governor enable switch"
			,"U1839, CAN communication - Message (PTO) out of range, Remote PTO governor preprogrammed speed control switch #2"
			,"U183B, CAN communication - Message (TCFG2) out of range, transmission torque limit from transmission system"
			,"U183C, CAN communication - Message (TRF1) out of range, transmission oil temperature from transmission system"
			,"U183E, CAN - Message (TRF1) time-out from transmission system"
			,"U183F, CAN communication - Message (VDC1) out of range, VDC brake light request from brake system"
			,"U1841, CAN - Message (VDC2) time-out from brake system"
			,"U1843, CAN - Message (VDHR) time-out from tachograph"
			,"U1844, CAN communication - Message (AIR1) out of range, air compressor status from air supply system"
			,"U1846, CAN - Message (AIR1) time-out from air supply system"
			,"U1847, PCI ECU software verification - Incorrect"
			,"U1848, EAS-3 ECU software verification - Incorrect"
			,"U1849, NOx sensor before catalyst software verification - Incorrect"
			,"U184B, CAN - Message (TESTINHB_INF) time-out from aftertreatment system"
			,"U184D, CAN communication - PCI ECU cannot start up communication"
			,"U184E, CAN communication - Message (PROPB_SW) not available, speed functions off switch from steering wheel switches"
			,"U1850, NOx sensor after catalyst software verification - Incorrect"
			,"U1851, NH3 sensor software verification - Incorrect"
			,"U1852, VTG turbocharger actuator software verification - Incorrect"
			,"U1853, EGR valve module software verification - Incorrect"
			,"U1854, BPV actuator software verification - Incorrect"
			,"U1855, Catalytic convertor temperature sensors ECU software verification - Incorrect"
			,"U1856, DOC/DPF temperature sensors ECU software verification - Incorrect"
			,"U1858, A fault exists with the DECECU 11 CVN calculation"
			,"U185A, CAN - Message (A1DEFI) time-out from aftertreatment system"
			,"U185C, CAN communication - Message (A1DEFI) out of range, DEF property from aftertreatment system"
			,"U185E, CAN - Message (EPSI) time-out from aftertreatment system"
			,"U185F, CAN communication - Message (EPSI) out of range, PM sensor from aftertreatment system"
			,"U186F, CAN communication - Message (PROPB_SW) not available, variable speed limiter set switch from steering wheel switches"
			,"U1870, CAN - Message (PROPB_CECU) time-out from vehicle control system"
			,"U1872, CAN communication - Message (PROPB_CECU) out of range, soft-top speed limiter switch from vehicle control system"
			,"U1873, CAN communication - Message (ETC1) out of range, gear engaged from transmission system"
	};
	
	public static String dtcClassifications[] = {
			"Plausibility","P0016",
			"Plausibility","P0017",
			"Plausibility","P0027",
			"Plausibility","P0045",
			"Plausibility","P0046",
			"Plausibility","P0049",
			"Plausibility","P0069",
			"Plausibility","P006B",
			"Plausibility","P006C",
			"Plausibility","P0071",
			"Rationality","P0072",
			"Rationality","P0073",
			"Rationality","P0075",
			"Plausibility","P0076",
			"Rationality","P0077",
			"Rationality","P0079",
			"Rationality","P0080",
			"Plausibility","P0087",
			"Plausibility","P0088",
			"Plausibility","P0093",
			"Plausibility","P0094",
			"Plausibility","P0095",
			"Plausibility","P0096",
			"Rationality","P0097",
			"Rationality","P0098",
			"Plausibility","P009A",
			"Plausibility","P009F",
			"Plausibility","P00B7",
			"Plausibility","P00BA",
			"Rationality","P0107",
			"Rationality","P0108",
			"Plausibility","P0110",
			"Rationality","P0112",
			"Rationality","P0113",
			"Plausibility","P0115",
			"Plausibility","P0116",
			"Rationality","P0117",
			"Rationality","P0118",
			"Plausibility","P011A",
			"Plausibility","P0121",
			"Plausibility","P0127",
			"Plausibility","P0128",
			"Plausibility","P0130",
			"Plausibility","P0135",
			"Plausibility","P0148",
			"Plausibility","P0149",
			"Plausibility","P0168",
			"Plausibility","P0180",
			"Rationality","P0182",
			"Rationality","P0183",
			"Rationality","P018C",
			"Rationality","P018D",
			"Rationality","P0192",
			"Rationality","P0193",
			"Plausibility","P0195",
			"Rationality","P0197",
			"Rationality","P0198",
			"Rationality","P0201",
			"Rationality","P0202",
			"Rationality","P0203",
			"Rationality","P0204",
			"Rationality","P0205",
			"Rationality","P0206",
			"Plausibility","P0216",
			"Plausibility","P0217",
			"Plausibility","P0219",
			"Communication","P0221",
			"Rationality","P0261",
			"Rationality","P0262",
			"Plausibility","P0263",
			"Rationality","P0264",
			"Rationality","P0265",
			"Plausibility","P0266",
			"Rationality","P0267",
			"Rationality","P0268",
			"Plausibility","P0269",
			"Rationality","P0270",
			"Rationality","P0271",
			"Plausibility","P0272",
			"Rationality","P0273",
			"Rationality","P0274",
			"Plausibility","P0275",
			"Rationality","P0276",
			"Rationality","P0277",
			"Plausibility","P0278",
			"Plausibility","P0281",
			"Plausibility","P0284",
			"Plausibility","P0287",
			"Plausibility","P0290",
			"Plausibility","P0293",
			"Plausibility","P0296",
			"Plausibility","P0298",
			"Plausibility","P029A",
			"Plausibility","P029C",
			"Plausibility","P029E",
			"Plausibility","P02A0",
			"Plausibility","P02A2",
			"Plausibility","P02A4",
			"Plausibility","P02A6",
			"Plausibility","P02A8",
			"Plausibility","P02AA",
			"Plausibility","P02AC",
			"Plausibility","P02AE",
			"Plausibility","P02B0",
			"Plausibility","P02CC",
			"Plausibility","P02CD",
			"Plausibility","P02CE",
			"Plausibility","P02CF",
			"Plausibility","P02D0",
			"Plausibility","P02D1",
			"Plausibility","P02D2",
			"Plausibility","P02D3",
			"Plausibility","P02D4",
			"Plausibility","P02D5",
			"Plausibility","P02D6",
			"Plausibility","P02D7",
			"Plausibility","P0300",
			"Plausibility","P0301",
			"Plausibility","P0302",
			"Plausibility","P0303",
			"Plausibility","P0304",
			"Plausibility","P0305",
			"Plausibility","P0306",
			"Plausibility","P0315",
			"Plausibility","P0335",
			"Plausibility","P0336",
			"Plausibility","P0340",
			"Plausibility","P0341",
			"Plausibility","P0403",
			"Plausibility","P0404",
			"Rationality","P0405",
			"Rationality","P0406",
			"Rationality","P0407",
			"Rationality","P0408",
			"Plausibility","P040B",
			"Rationality","P040C",
			"Rationality","P040D",
			"Plausibility","P040F",
			"Communication","P0420",
			"Communication","P0460",
			"Plausibility","P0471",
			"Rationality","P0472",
			"Rationality","P0473",
			"Rationality","P047C",
			"Rationality","P047D",
			"Rationality","P0480",
			"Plausibility","P0486",
			"Plausibility","P0488",
			"Rationality","P0489",
			"Rationality","P0490",
			"Plausibility","P0493",
			"Plausibility","P0501",
			"Rationality","P0502",
			"Plausibility","P0503",
			"Plausibility","P0505",
			"Plausibility","P0513",
			"Rationality","P0521",
			"Rationality","P0522",
			"Rationality","P0523",
			"Plausibility","P0524",
			"Plausibility","P0527",
			"Plausibility","P0528",
			"Rationality","P0541",
			"Rationality","P0542",
			"Rationality","P0543",
			"Plausibility","P0562",
			"Plausibility","P0563",
			"Communication","P0567",
			"Communication","P0568",
			"Communication","P0571",
			"Plausibility","P060A",
			"Plausibility","P060C",
			"Plausibility","P0611",
			"Plausibility","P061B",
			"Plausibility","P062A",
			"Plausibility","P062B",
			"Plausibility","P062D",
			"Rationality","P0640",
			"Rationality","P0642",
			"Rationality","P0643",
			"Plausibility","P064F",
			"Rationality","P0650",
			"Rationality","P0652",
			"Rationality","P0653",
			"Plausibility","P0666",
			"Plausibility","P0668",
			"Plausibility","P0669",
			"Rationality","P0685",
			"Rationality","P0691",
			"Rationality","P0692",
			"Rationality","P0698",
			"Rationality","P0699",
			"Plausibility","P06AD",
			"Plausibility","P06AE",
			"Communication","P0703",
			"Communication","P081C",
			"Plausibility","P0830",
			"Communication","P0833",
			"Rationality","P0865",
			"Communication","P0866",
			"Rationality","P0A00",
			"Rationality","P0A01",
			"Rationality","P0A02",
			"Rationality","P0A03",
			"Rationality","P0A04",
			"Rationality","P0A05",
			"Rationality","P0A06",
			"Rationality","P0A07",
			"Rationality","P0A08",
			"Rationality","P0A0A",
			"Rationality","P0A0B",
			"Rationality","P0A10",
			"Rationality","P0A11",
			"Rationality","P0A12",
			"Rationality","P0A13",
			"Plausibility","P0A1F",
			"Rationality","P0A20",
			"Rationality","P0A21",
			"Rationality","P0A22",
			"Rationality","P0A30",
			"Rationality","P0A31",
			"Rationality","P0A32",
			"Rationality","P0A33",
			"Rationality","P0A34",
			"Rationality","P0A35",
			"Rationality","P0A36",
			"Rationality","P0A40",
			"Rationality","P0A41",
			"Rationality","P0A42",
			"Rationality","P0A43",
			"Rationality","P0A50",
			"Rationality","P0A51",
			"Rationality","P0A52",
			"Rationality","P0A53",
			"Rationality","P0A58",
			"Rationality","P0A59",
			"Rationality","P0A5A",
			"Rationality","P0A60",
			"Rationality","P0A61",
			"Rationality","P0A62",
			"Rationality","P0A63",
			"Rationality","P0A64",
			"Rationality","P0A65",
			"Rationality","P0A66",
			"Plausibility","P101C",
			"Plausibility","P101D",
			"Plausibility","P101E",
			"Plausibility","P101F",
			"Plausibility","P1020",
			"Rationality","P1021",
			"Plausibility","P1022",
			"Plausibility","P1023",
			"Plausibility","P1024",
			"Plausibility","P1025",
			"Plausibility","P1026",
			"Plausibility","P1027",
			"Plausibility","P1028",
			"Plausibility","P1029",
			"Rationality","P102A",
			"Rationality","P102B",
			"Plausibility","P102C",
			"Plausibility","P102D",
			"Plausibility","P102E",
			"Plausibility","P102F",
			"Plausibility","P1030",
			"Plausibility","P1031",
			"Plausibility","P1032",
			"Rationality","P1037",
			"Rationality","P1038",
			"Plausibility","P1039",
			"Plausibility","P103A",
			"Plausibility","P103B",
			"Plausibility","P103C",
			"Plausibility","P103D",
			"Plausibility","P103E",
			"Plausibility","P103F",
			"Plausibility","P1040",
			"Plausibility","P1042",
			"Plausibility","P1043",
			"Plausibility","P1044",
			"Plausibility","P1045",
			"Plausibility","P1046",
			"Plausibility","P1047",
			"Plausibility","P1048",
			"Plausibility","P1049",
			"Plausibility","P104A",
			"Plausibility","P104B",
			"Plausibility","P104C",
			"Plausibility","P104D",
			"Plausibility","P104E",
			"Plausibility","P104F",
			"Plausibility","P1050",
			"Plausibility","P1051",
			"Plausibility","P1053",
			"Plausibility","P1054",
			"Plausibility","P1055",
			"Plausibility","P1057",
			"Plausibility","P1058",
			"Plausibility","P1062",
			"Plausibility","P1081",
			"Plausibility","P1086",
			"Plausibility","P1087",
			"Plausibility","P1088",
			"Plausibility","P1089",
			"Rationality","P108A",
			"Plausibility","P1090",
			"Plausibility","P1091",
			"Rationality","P109C",
			"Rationality","P109D",
			"Event","P1105",
			"Event","P1106",
			"Plausibility","P1110",
			"Plausibility","P1111",
			"Plausibility","P1115",
			"Plausibility","P1122",
			"Plausibility","P1127",
			"Plausibility","P1128",
			"Rationality","P1133",
			"Rationality","P1134",
			"Rationality","P1135",
			"Rationality","P1136",
			"Plausibility","P1137",
			"Rationality","P1138",
			"Plausibility","P1139",
			"Plausibility","P113A",
			"Plausibility","P113B",
			"Plausibility","P1158",
			"Plausibility","P1159",
			"Plausibility","P1160",
			"Plausibility","P1161",
			"Communication","P1162",
			"Communication","P1163",
			"Plausibility","P1167",
			"Plausibility","P1168",
			"Plausibility","P1171",
			"Plausibility","P1172",
			"Plausibility","P1180",
			"Plausibility","P1181",
			"Rationality","P118A",
			"Plausibility","P1191",
			"Plausibility","P1194",
			"Plausibility","P1195",
			"Plausibility","P1196",
			"Plausibility","P1197",
			"Rationality","P1201",
			"Rationality","P1202",
			"Rationality","P1203",
			"Rationality","P1204",
			"Rationality","P1205",
			"Rationality","P1206",
			"Rationality","P1207",
			"Rationality","P1208",
			"Rationality","P1209",
			"Rationality","P1210",
			"Rationality","P1211",
			"Rationality","P1212",
			"Rationality","P1213",
			"Rationality","P1214",
			"Rationality","P1215",
			"Rationality","P1216",
			"Rationality","P1217",
			"Rationality","P1218",
			"Rationality","P1219",
			"Rationality","P1220",
			"Rationality","P1221",
			"Rationality","P1222",
			"Rationality","P1223",
			"Rationality","P1224",
			"Rationality","P1225",
			"Rationality","P1226",
			"Rationality","P1227",
			"Rationality","P1228",
			"Rationality","P1230",
			"Rationality","P1234",
			"Plausibility","P1235",
			"Rationality","P1238",
			"Rationality","P1242",
			"Rationality","P1246",
			"Rationality","P1250",
			"Plausibility","P1263",
			"Plausibility","P1266",
			"Plausibility","P1269",
			"Plausibility","P1272",
			"Plausibility","P1275",
			"Plausibility","P1278",
			"Plausibility","P127A",
			"Plausibility","P127B",
			"Plausibility","P127C",
			"Plausibility","P1280",
			"Plausibility","P1281",
			"Plausibility","P1282",
			"Plausibility","P1283",
			"Plausibility","P1284",
			"Plausibility","P1285",
			"Plausibility","P1286",
			"Plausibility","P1287",
			"Plausibility","P1288",
			"Plausibility","P1289",
			"Plausibility","P128A",
			"Plausibility","P128E",
			"Plausibility","P128F",
			"Plausibility","P1298",
			"Plausibility","P12CD",
			"Plausibility","P12CF",
			"Plausibility","P12D1",
			"Plausibility","P12D3",
			"Plausibility","P12D5",
			"Plausibility","P12D7",
			"Plausibility","P1300",
			"Plausibility","P1301",
			"Plausibility","P1302",
			"Plausibility","P1303",
			"Plausibility","P1304",
			"Plausibility","P1305",
			"Plausibility","P1306",
			"Plausibility","P1335",
			"Plausibility","P1336",
			"Plausibility","P1340",
			"Plausibility","P1341",
			"Plausibility","P1350",
			"Plausibility","P1351",
			"Plausibility","P1352",
			"Plausibility","P1354",
			"Plausibility","P1356",
			"Rationality","P138A",
			"Plausibility","P1400",
			"Rationality","P1401",
			"Rationality","P1402",
			"Plausibility","P1403",
			"Plausibility","P1404",
			"Rationality","P1405",
			"Rationality","P1406",
			"Plausibility","P1407",
			"Plausibility","P1408",
			"Plausibility","P1409",
			"Plausibility","P140A",
			"Plausibility","P140B",
			"Rationality","P140C",
			"Rationality","P140D",
			"Plausibility","P140E",
			"Plausibility","P140F",
			"Rationality","P141C",
			"Rationality","P141D",
			"Plausibility","P1457",
			"Plausibility","P1458",
			"Plausibility","P1480",
			"Plausibility","P1481",
			"Plausibility","P1482",
			"Rationality","P1483",
			"Plausibility","P1484",
			"Plausibility","P1485",
			"Plausibility","P1486",
			"Plausibility","P1487",
			"Plausibility","P1488",
			"Plausibility","P1489",
			"Rationality","P148A",
			"Plausibility","P1490",
			"Plausibility","P1493",
			"Plausibility","P1494",
			"Event","P1495",
			"Event","P1496",
			"Plausibility","P1497",
			"Plausibility","P1498",
			"Rationality","P1501",
			"Plausibility","P1502",
			"Rationality","P1503",
			"Plausibility","P1504",
			"Plausibility","P1505",
			"Plausibility","P150F",
			"Plausibility","P1513",
			"Plausibility","P1514",
			"Plausibility","P1515",
			"Plausibility","P1516",
			"Plausibility","P1517",
			"Event","P1518",
			"Event","P1519",
			"Event","P151A",
			"Event","P151B",
			"Event","P151C",
			"Event","P151D",
			"Event","P151E",
			"Event","P151F",
			"Plausibility","P1523",
			"Plausibility","P1524",
			"Communication","P1526",
			"Plausibility","P1529",
			"Plausibility","P153A",
			"Plausibility","P153B",
			"Plausibility","P153C",
			"Plausibility","P1556",
			"Rationality","P1558",
			"Rationality","P1559",
			"Plausibility","P1560",
			"Plausibility","P1563",
			"Plausibility","P1564",
			"Plausibility","P1565",
			"Plausibility","P1566",
			"Plausibility","P1567",
			"Rationality","P1568",
			"Rationality","P1569",
			"Rationality","P156A",
			"Rationality","P156B",
			"Rationality","P156C",
			"Rationality","P156D",
			"Rationality","P156E",
			"Rationality","P156F",
			"Plausibility","P1570",
			"Plausibility","P1571",
			"Plausibility","P1572",
			"Plausibility","P1573",
			"Plausibility","P1574",
			"Plausibility","P1580",
			"Plausibility","P1581",
			"Rationality","P158A",
			"Plausibility","P1601",
			"Plausibility","P1602",
			"Plausibility","P160A",
			"Rationality","P1644",
			"Rationality","P1645",
			"Rationality","P1650",
			"Rationality","P1652",
			"Rationality","P1653",
			"Rationality","P1655",
			"Plausibility","P1658",
			"Plausibility","P1674",
			"Plausibility","P1675",
			"Plausibility","P1676",
			"Plausibility","P1677",
			"Plausibility","P1678",
			"Plausibility","P1679",
			"Plausibility","P1681",
			"Plausibility","P1682",
			"Rationality","P1683",
			"Rationality","P1684",
			"Rationality","P1686",
			"Rationality","P1687",
			"Rationality","P1688",
			"Rationality","P1693",
			"Rationality","P1694",
			"Rationality","P1698",
			"Rationality","P1699",
			"Plausibility","P1704",
			"Plausibility","P1705",
			"Plausibility","P1706",
			"Plausibility","P1707",
			"Plausibility","P1708",
			"Plausibility","P1709",
			"Plausibility","P170A",
			"Plausibility","P170B",
			"Plausibility","P170C",
			"Plausibility","P170D",
			"Plausibility","P170E",
			"Plausibility","P170F",
			"Plausibility","P1710",
			"Plausibility","P1711",
			"Plausibility","P1717",
			"Plausibility","P1718",
			"Plausibility","P1719",
			"Plausibility","P171B",
			"Plausibility","P171C",
			"Plausibility","P171D",
			"Plausibility","P171E",
			"Plausibility","P171F",
			"Plausibility","P1721",
			"Plausibility","P1722",
			"Plausibility","P1723",
			"Plausibility","P1724",
			"Plausibility","P1726",
			"Plausibility","P1727",
			"Plausibility","P1729",
			"Rationality","P1751",
			"Rationality","P1839",
			"Rationality","P1840",
			"Rationality","P1841",
			"Rationality","P1842",
			"Rationality","P1845",
			"Rationality","P1846",
			"Rationality","P1847",
			"Rationality","P1848",
			"Rationality","P1849",
			"Rationality","P1850",
			"Rationality","P1851",
			"Rationality","P1852",
			"Rationality","P1853",
			"Rationality","P1854",
			"Rationality","P1855",
			"Rationality","P1856",
			"Rationality","P1857",
			"Rationality","P1858",
			"Rationality","P1859",
			"Rationality","P1860",
			"Rationality","P1861",
			"Rationality","P1862",
			"Communication","P1863",
			"Plausibility","P1864",
			"Plausibility","P1865",
			"Plausibility","P1866",
			"Plausibility","P1867",
			"Plausibility","P1868",
			"Plausibility","P1869",
			"Plausibility","P1870",
			"Plausibility","P1871",
			"Plausibility","P1872",
			"Plausibility","P1873",
			"Plausibility","P1874",
			"Plausibility","P1875",
			"Plausibility","P1876",
			"Rationality","P1877",
			"Rationality","P1905",
			"Rationality","P1906",
			"Rationality","P1907",
			"Rationality","P1908",
			"Rationality","P1909",
			"Event","P2104",
			"Event","P2105",
			"Rationality","P2147",
			"Rationality","P2148",
			"Rationality","P2150",
			"Rationality","P2151",
			"Rationality","P2169",
			"Rationality","P2170",
			"Rationality","P2171",
			"Plausibility","P2181",
			"Plausibility","P2183",
			"Rationality","P2184",
			"Rationality","P2185",
			"Plausibility","P2199",
			"Plausibility","P2226",
			"Plausibility","P2227",
			"Plausibility","P2228",
			"Plausibility","P2229",
			"Plausibility","P222C",
			"Plausibility","P222D",
			"Rationality","P2237",
			"Rationality","P2238",
			"Rationality","P2239",
			"Rationality","P2264",
			"Rationality","P2266",
			"Rationality","P2275",
			"Plausibility","P228C",
			"Plausibility","P228D",
			"Plausibility","P228E",
			"Plausibility","P228F",
			"Rationality","P2294",
			"Rationality","P2295",
			"Rationality","P2296",
			"Plausibility","P229A",
			"Plausibility","P229B",
			"Plausibility","P229C",
			"Plausibility","P229D",
			"Rationality","P2425",
			"Plausibility","P2457",
			"Communication","P2458",
			"Communication","P2459",
			"Rationality","P245C",
			"Rationality","P245D",
			"Plausibility","P2507",
			"Plausibility","P250A",
			"Plausibility","P250B",
			"Rationality","P250C",
			"Rationality","P250D",
			"Plausibility","P250E",
			"Plausibility","P250F",
			"Plausibility","P252F",
			"Plausibility","P2530",
			"Communication","P253B",
			"Rationality","P2541",
			"Rationality","P2542",
			"Rationality","P2544",
			"Rationality","P2558",
			"Rationality","P2559",
			"Plausibility","P2560",
			"Plausibility","P2563",
			"Plausibility","P2579",
			"Plausibility","P2580",
			"Plausibility","P2581",
			"Rationality","P2600",
			"Plausibility","P2602",
			"Plausibility","P2603",
			"Rationality","P2604",
			"Rationality","P2605",
			"Rationality","P2609",
			"Rationality","P262B",
			"Plausibility","P268A",
			"Plausibility","P268C",
			"Plausibility","P268D",
			"Plausibility","P268E",
			"Plausibility","P268F",
			"Plausibility","P2690",
			"Plausibility","P2691",
			"Plausibility","P3003",
			"Rationality","P30B3",
			"Plausibility","P3100",
			"Plausibility","P3101",
			"Rationality","P3103",
			"Rationality","P3405",
			"Rationality","P3405",
			"Rationality","P3407",
			"Rationality","P3407",
			"Rationality","P3408",
			"Rationality","P3408",
			"Rationality","P3413",
			"Rationality","P3415",
			"Rationality","P3416",
			"Rationality","P3421",
			"Rationality","P3423",
			"Rationality","P3424",
			"Rationality","P3429",
			"Rationality","P3431",
			"Rationality","P3432",
			"Rationality","P3437",
			"Rationality","P3439",
			"Rationality","P3440",
			"Rationality","P3445",
			"Rationality","P3445",
			"Rationality","P3447",
			"Rationality","P3447",
			"Rationality","P3448",
			"Rationality","P3448",
			"Rationality","P3750",
			"Rationality","P3751",
			"Plausibility","P3752",
			"Rationality","P3753",
			"Rationality","P3754",
			"Plausibility","P3755",
			"Rationality","P3756",
			"Rationality","P3757",
			"Plausibility","P3758",
			"Rationality","P3759",
			"Rationality","P3760",
			"Rationality","P3761",
			"Rationality","P3762",
			"Rationality","P3763",
			"Plausibility","P3764",
			"Plausibility","P3765",
			"Rationality","P3766",
			"Rationality","P3767",
			"Plausibility","P3768",
			"Plausibility","P3769",
			"Plausibility","P3770",
			"Rationality","P3771",
			"Rationality","P3772",
			"Plausibility","P3773",
			"Plausibility","P3774",
			"Plausibility","P3775",
			"Plausibility","P3776",
			"Plausibility","P3777",
			"Plausibility","P3778",
			"Plausibility","P3779",
			"Plausibility","P3780",
			"Plausibility","P3781",
			"Plausibility","P3782",
			"Plausibility","P3783",
			"Rationality","P3784",
			"Rationality","P3785",
			"Plausibility","P3786",
			"Plausibility","P3787",
			"Plausibility","P3788",
			"Plausibility","P3789",
			"Plausibility","P3790",
			"Plausibility","P3791",
			"Plausibility","P3792",
			"Plausibility","P3793",
			"Plausibility","P3794",
			"Plausibility","P3795",
			"Rationality","P3796",
			"Rationality","P3797",
			"Rationality","P3798",
			"Plausibility","P3799",
			"Plausibility","P3800",
			"Rationality","P3801",
			"Plausibility","P3802",
			"Rationality","P3803",
			"Rationality","P3804",
			"Plausibility","P3805",
			"Rationality","P3805",
			"Plausibility","P3806",
			"Plausibility","P3807",
			"Rationality","P3808",
			"Rationality","P3809",
			"Plausibility","P3810",
			"Rationality","P3811",
			"Rationality","P3812",
			"Rationality","P3813",
			"Plausibility","P3814",
			"Plausibility","P3815",
			"Rationality","P3815",
			"Plausibility","P3816",
			"Plausibility","P3817",
			"Plausibility","P3818",
			"Plausibility","P3819",
			"Plausibility","P3820",
			"Plausibility","P3821",
			"Plausibility","P3821",
			"Plausibility","P3822",
			"Plausibility","P3823",
			"Plausibility","P3824",
			"Plausibility","P3825",
			"Plausibility","P3826",
			"Plausibility","P3827",
			"Plausibility","P3828",
			"Plausibility","P3829",
			"Plausibility","P3830",
			"Rationality","P3831",
			"Rationality","P3832",
			"Rationality","P3833",
			"Plausibility","P3834",
			"Plausibility","P3835",
			"Plausibility","P3836",
			"Plausibility","P3837",
			"Plausibility","P3838",
			"Rationality","P3839",
			"Rationality","P3840",
			"Plausibility","P3841",
			"Rationality","P3842",
			"Rationality","P3843",
			"Rationality","P3844",
			"Rationality","P3845",
			"Rationality","P3846",
			"Rationality","P3847",
			"Rationality","P3848",
			"Rationality","P3849",
			"Rationality","P3850",
			"Rationality","P3850",
			"Rationality","P3851",
			"Rationality","P3852",
			"Rationality","P3852",
			"Plausibility","P3853",
			"Rationality","P3854",
			"Rationality","P3855",
			"Plausibility","P3856",
			"Plausibility","P3857",
			"Plausibility","P3858",
			"Plausibility","P3859",
			"Rationality","P3860",
			"Rationality","P3861",
			"Rationality","P3862",
			"Rationality","P3863",
			"Rationality","P3864",
			"Rationality","P3865",
			"Rationality","P3866",
			"Rationality","P3867",
			"Plausibility","P3868",
			"Rationality","P3869",
			"Rationality","P3870",
			"Rationality","P3871",
			"Rationality","P3872",
			"Rationality","P3873",
			"Rationality","P3874",
			"Plausibility","P3875",
			"Rationality","P3876",
			"Plausibility","P3877",
			"Plausibility","P3878",
			"Plausibility","P3879",
			"Plausibility","P3880",
			"Rationality","P3881",
			"Rationality","P3882",
			"Rationality","P3883",
			"Rationality","P3884",
			"Rationality","P3885",
			"Rationality","P3886",
			"Rationality","P3887",
			"Rationality","P3888",
			"Rationality","P3889",
			"Rationality","P3890",
			"Rationality","P3891",
			"Plausibility","P3892",
			"Rationality","P3893",
			"Rationality","P3894",
			"Rationality","P3895",
			"Plausibility","P3896",
			"Plausibility","P3897",
			"Plausibility","P3898",
			"Plausibility","P3899",
			"Rationality","P3900",
			"Plausibility","P3901",
			"Rationality","P3902",
			"Rationality","P3903",
			"Rationality","P3904",
			"Rationality","P3905",
			"Plausibility","P3906",
			"Plausibility","P3907",
			"Plausibility","P3908",
			"Rationality","P3909",
			"Rationality","P3910",
			"Plausibility","P3911",
			"Plausibility","P3912",
			"Plausibility","P3913",
			"Plausibility","P3914",
			"Plausibility","P3915",
			"Plausibility","P3916",
			"Rationality","P3917",
			"Plausibility","P3918",
			"Plausibility","P3919",
			"Plausibility","P3920",
			"Rationality","P3921",
			"Plausibility","P3922",
			"Rationality","P3923",
			"Plausibility","P3924",
			"Rationality","P3925",
			"Rationality","P3926",
			"Rationality","P3927",
			"Plausibility","P3928",
			"Plausibility","P3929",
			"Plausibility","P3930",
			"Rationality","P3931",
			"Rationality","P3932",
			"Rationality","P3933",
			"Rationality","P3934",
			"Rationality","P3935",
			"Plausibility","P3936",
			"Plausibility","P3937",
			"Plausibility","P3938",
			"Rationality","P3940",
			"Rationality","P3941",
			"Rationality","P3942",
			"Rationality","P3943",
			"Plausibility","P3944",
			"Rationality","P3945",
			"Rationality","P3946",
			"Rationality","P3947",
			"Plausibility","P3948",
			"Rationality","P3949",
			"Rationality","P3950",
			"Plausibility","P3950",
			"Rationality","P3951",
			"Rationality","P3951",
			"Rationality","P3952",
			"Rationality","P3952",
			"Rationality","P3953",
			"Plausibility","P3953",
			"Rationality","P3954",
			"Rationality","P3954",
			"Rationality","P3955",
			"Rationality","P3955",
			"Rationality","P3956",
			"Rationality","P3956",
			"Rationality","P3957",
			"Rationality","P3957",
			"Rationality","P3958",
			"Plausibility","P3958",
			"Rationality","P3959",
			"Plausibility","P3959",
			"Rationality","P3960",
			"Plausibility","P3960",
			"Rationality","P3961",
			"Plausibility","P3961",
			"Rationality","P3962",
			"Plausibility","P3962",
			"Rationality","P3963",
			"Plausibility","P3963",
			"Rationality","P3964",
			"Rationality","P3965",
			"Rationality","P3966",
			"Rationality","P3966",
			"Rationality","P3967",
			"Rationality","P3967",
			"Rationality","P3968",
			"Plausibility","P3968",
			"Rationality","P3969",
			"Rationality","P3970",
			"Plausibility","P3970",
			"Plausibility","P3971",
			"Plausibility","P3971",
			"Plausibility","P3972",
			"Plausibility","P3972",
			"Plausibility","P3973",
			"Plausibility","P3973",
			"Plausibility","P3974",
			"Plausibility","P3974",
			"Rationality","P3975",
			"Rationality","P3976",
			"Rationality","P3977",
			"Rationality","P3978",
			"Rationality","P3979",
			"Rationality","P3980",
			"Plausibility","P3981",
			"Rationality","P3982",
			"Plausibility","P3983",
			"Rationality","P3984",
			"Rationality","P3985",
			"Rationality","P3986",
			"Rationality","P3987",
			"Rationality","P3988",
			"Plausibility","P3989",
			"Plausibility","P3989",
			"Rationality","P3990",
			"Plausibility","P3991",
			"Plausibility","P3992",
			"Rationality","P3993",
			"Rationality","P3994",
			"Plausibility","P3995",
			"Plausibility","P3996",
			"Plausibility","P3997",
			"Communication","U0011",
			"Rationality","U0101",
			"Rationality","U0103",
			"Rationality","U0104",
			"Rationality","U0105",
			"Rationality","U0106",
			"Communication","U0115",
			"Rationality","U0120",
			"Rationality","U0129",
			"Rationality","U0133",
			"Rationality","U0141",
			"Rationality","U0143",
			"Rationality","U0155",
			"Rationality","U0156",
			"Rationality","U0157",
			"Rationality","U0291",
			"Communication","U0404",
			"Communication","U0405",
			"Communication","U0406",
			"Communication","U0418",
			"Communication","U0431",
			"Communication","U1005",
			"Communication","U1010",
			"Communication","U1011",
			"Communication","U1013",
			"Communication","U1014",
			"Communication","U1015",
			"Rationality","U1016",
			"Communication","U1017",
			"Plausibility","U1047",
			"Plausibility","U1048",
			"Plausibility","U1049",
			"Rationality","U104C",
			"Plausibility","U1069",
			"Communication","U1070",
			"Plausibility","U1071",
			"Rationality","U1072",
			"Rationality","U1073",
			"Plausibility","U1074",
			"Communication","U1101",
			"Communication","U1103",
			"Rationality","U1104",
			"Communication","U1105",
			"Rationality","U1110",
			"Communication","U1111",
			"Rationality","U1112",
			"Rationality","U1114",
			"Communication","U1115",
			"Communication","U1116",
			"Communication","U1117",
			"Communication","U1118",
			"Communication","U111A",
			"Communication","U111B",
			"Communication","U111C",
			"Rationality","U111D",
			"Communication","U111E",
			"Communication","U111F",
			"Rationality","U1120",
			"Rationality","U1122",
			"Rationality","U1124",
			"Rationality","U1126",
			"Communication","U1129",
			"Rationality","U112A",
			"Communication","U112B",
			"Communication","U112C",
			"Rationality","U112D",
			"Communication","U112E",
			"Communication","U112F",
			"Communication","U1130",
			"Communication","U1131",
			"Rationality","U1132",
			"Communication","U1133",
			"Rationality","U1134",
			"Communication","U1135",
			"Rationality","U1136",
			"Communication","U1137",
			"Rationality","U1138",
			"Communication","U1139",
			"Rationality","U113A",
			"Communication","U113B",
			"Communication","U113C",
			"Rationality","U113D",
			"Communication","U113E",
			"Communication","U113F",
			"Communication","U1140",
			"Communication","U1142",
			"Communication","U1143",
			"Rationality","U1144",
			"Rationality","U1145",
			"Communication","U1146",
			"Rationality","U1147",
			"Communication","U1148",
			"Rationality","U1149",
			"Rationality","U114A",
			"Communication","U114B",
			"Communication","U114C",
			"Rationality","U114D",
			"Communication","U114E",
			"Communication","U114F",
			"Rationality","U1150",
			"Communication","U1153",
			"Rationality","U1154",
			"Communication","U1155",
			"Communication","U1156",
			"Communication","U1157",
			"Rationality","U1158",
			"Rationality","U1159",
			"Plausibility","U1160",
			"Rationality","U1161",
			"Communication","U1162",
			"Communication","U1163",
			"Communication","U1164",
			"Rationality","U1165",
			"Communication","U1166",
			"Communication","U1167",
			"Rationality","U1168",
			"Communication","U1169",
			"Communication","U1179",
			"Rationality","U117A",
			"Communication","U117B",
			"Communication","U117C",
			"Communication","U1184",
			"Communication","U1188",
			"Communication","U1189",
			"Rationality","U1190",
			"Communication","U1192",
			"Communication","U1193",
			"Rationality","U1194",
			"Communication","U1197",
			"Rationality","U1198",
			"Communication","U1207",
			"Rationality","U1208",
			"Communication","U1291",
			"Communication","U1404",
			"Communication","U1405",
			"Communication","U1406",
			"Communication","U1407",
			"Plausibility","U1408",
			"Plausibility","U1409",
			"Plausibility","U140A",
			"Communication","U142F",
			"Communication","U1501",
			"Communication","U1502",
			"Communication","U153B",
			"Communication","U1544",
			"Communication","U1545",
			"Communication","U1546",
			"Communication","U1547",
			"Communication","U1548",
			"Communication","U1549",
			"Communication","U1550",
			"Communication","U1551",
			"Communication","U1552",
			"Communication","U1553",
			"Communication","U1554",
			"Communication","U1562",
			"Communication","U1563",
			"Communication","U1564",
			"Communication","U1565",
			"Rationality","U1566",
			"Communication","U1567",
			"Rationality","U1570",
			"Rationality","U1571",
			"Plausibility","U1572",
			"Plausibility","U1573",
			"Plausibility","U1574",
			"Plausibility","U1575",
			"Rationality","U1576",
			"Rationality","U1577",
			"Plausibility","U1578",
			"Plausibility","U1579",
			"Plausibility","U157A",
			"Plausibility","U157B",
			"Rationality","U157C",
			"Rationality","U157D",
			"Plausibility","U157E",
			"Plausibility","U157F",
			"Plausibility","U1580",
			"Plausibility","U1581",
			"Communication","U1645",
			"Communication","U1700",
			"Communication","U1701",
			"Communication","U1702",
			"Rationality","U1703",
			"Communication","U1710",
			"Rationality","U1711",
			"Communication","U1712",
			"Communication","U1715",
			"Rationality","U1716",
			"Communication","U1717",
			"Communication","U1720",
			"Rationality","U1721",
			"Communication","U1722",
			"Communication","U1725",
			"Rationality","U1726",
			"Communication","U1727",
			"Rationality","U1728",
			"Communication","U1729",
			"Communication","U1730",
			"Rationality","U1775",
			"Rationality","U1776",
			"Rationality","U1777",
			"Rationality","U1778",
			"Rationality","U177B",
			"Rationality","U177C",
			"Plausibility","U177D",
			"Plausibility","U177E",
			"Plausibility","U177F",
			"Rationality","U1780",
			"Rationality","U1781",
			"Rationality","U1782",
			"Rationality","U1783",
			"Rationality","U1784",
			"Rationality","U1785",
			"Communication","U1786",
			"Communication","U1787",
			"Communication","U1788",
			"Communication","U1789",
			"Communication","U178A",
			"Communication","U178B",
			"Communication","U178C",
			"Communication","U178D",
			"Communication","U178E",
			"Communication","U178F",
			"Communication","U1790",
			"Communication","U1791",
			"Communication","U1792",
			"Communication","U1793",
			"Communication","U1794",
			"Communication","U1797",
			"Communication","U1798",
			"Communication","U1799",
			"Communication","U179A",
			"Communication","U179B",
			"Communication","U179C",
			"Communication","U179D",
			"Rationality","U179E",
			"Rationality","U179F",
			"Plausibility","U17A0",
			"Rationality","U17A1",
			"Rationality","U17A2",
			"Plausibility","U17A3",
			"Plausibility","U17A4",
			"Plausibility","U17A5",
			"Plausibility","U17A6",
			"Rationality","U17A7",
			"Plausibility","U17A8",
			"Plausibility","U17A9",
			"Rationality","U17AA",
			"Rationality","U17AB",
			"Rationality","U17AC",
			"Rationality","U17AD",
			"Rationality","U17AE",
			"Rationality","U17AF",
			"Rationality","U17B0",
			"Rationality","U17B1",
			"Rationality","U17B2",
			"Rationality","U17B3",
			"Rationality","U17B4",
			"Rationality","U17B5",
			"Communication","U17B6",
			"Communication","U17B7",
			"Communication","U17B8",
			"Communication","U17B9",
			"Plausibility","U17BA",
			"Rationality","U17C4",
			"Rationality","U17C5",
			"Rationality","U17C6",
			"Rationality","U17C7",
			"Rationality","U17C8",
			"Rationality","U17C9",
			"Communication","U17CA",
			"Communication","U17CB",
			"Communication","U17CC",
			"Communication","U17CD",
			"Communication","U17CE",
			"Communication","U17CF",
			"Communication","U17D0",
			"Communication","U17D1",
			"Communication","U17D2",
			"Communication","U17D3",
			"Communication","U17D4",
			"Communication","U17D5",
			"Rationality","U17D6",
			"Rationality","U17D7",
			"Rationality","U17D8",
			"Rationality","U17D9",
			"Rationality","U17DA",
			"Rationality","U17DB",
			"Rationality","U17DC",
			"Rationality","U17DD",
			"rationality","U17DE",
			"Rationality","U17DF",
			"Rationality","U17E0",
			"Rationality","U17E1",
			"Rationality","U17E2",
			"Rationality","U17E3",
			"Rationality","U17E4",
			"Rationality","U17E5",
			"Rationality","U17E6",
			"Rationality","U17E7",
			"Rationality","U17E8",
			"Rationality","U17E9",
			"Rationality","U17EA",
			"Rationality","U17EB",
			"Rationality","U17EC",
			"Rationality","U17ED",
			"Rationality","U17EE",
			"Rationality","U17EF",
			"Rationality","U17F0",
			"Rationality","U17F1",
			"Rationality","U17F2",
			"Rationality","U17F3",
			"Communication","U1801",
			"Plausibility","U1802",
			"Communication","U1803",
			"Communication","U1804",
			"Rationality","U1805",
			"Communication","U1806",
			"Communication","U1807",
			"Communication","U180A",
			"Communication","U180B",
			"Communication","U180C",
			"Communication","U180D",
			"Rationality","U180E",
			"Communication","U180F",
			"Rationality","U1810",
			"Communication","U1811",
			"Rationality","U1812",
			"Communication","U1813",
			"Communication","U1814",
			"Communication","U1815",
			"Communication","U1816",
			"Communication","U1817",
			"Communication","U1818",
			"Communication","U1819",
			"Communication","U181A",
			"Communication","U181B",
			"Communication","U181C",
			"Communication","U181D",
			"Communication","U181E",
			"Communication","U181F",
			"Communication","U1820",
			"Communication","U1821",
			"Communication","U1822",
			"Communication","U1823",
			"Communication","U1824",
			"Communication","U1825",
			"Rationality","U1826",
			"Communication","U1827",
			"Communication","U1828",
			"Communication","U1829",
			"Communication","U182A",
			"Communication","U182B",
			"Communication","U182C",
			"Communication","U182D",
			"Communication","U182E",
			"Communication","U182F",
			"Communication","U1830",
			"Communication","U1831",
			"Communication","U1832",
			"Communication","U1833",
			"Rationality","U1834",
			"Rationality","U1835",
			"Communication","U1836",
			"Communication","U1837",
			"Communication","U1838",
			"Communication","U1839",
			"Communication","U183A",
			"Communication","U183B",
			"Communication","U183C",
			"Communication","U183D",
			"Rationality","U183E",
			"Communication","U183F",
			"Communication","U1840",
			"Rationality","U1841",
			"Communication","U1842",
			"Rationality","U1843",
			"Communication","U1844",
			"Communication","U1845",
			"Rationality","U1846",
			"Plausibility","U1847",
			"Plausibility","U1848",
			"Plausibility","U1849",
			"Rationality","U184B",
			"Communication","U184C",
			"Communication","U184D",
			"Communication","U184E",
			"Plausibility","U1850",
			"Plausibility","U1851",
			"Plausibility","U1852",
			"Plausibility","U1853",
			"Plausibility","U1854",
			"Plausibility","U1855",
			"Plausibility","U1856",
			"Plausibility","U1857",
			"Plausibility","U1858",
			"Plausibility","U1859",
			"Rationality","U185A",
			"Communication","U185B",
			"Communication","U185C",
			"Communication","U185D",
			"Rationality","U185E",
			"Communication","U185F",
			"Plausibility","U1860",
			"Plausibility","U1861",
			"Plausibility","U1862",
			"Plausibility","U1863",
			"Communication","U186F",
			"Rationality","U1870",
			"Communication","U1871",
			"Communication","U1872",
			"Communication","U1873",
			"Communication","U1874",
			"Communication","U1875",
			"Communication","U1876",
			"Communication","U1877",
			"Communication","U1878",
			"Communication","U1879",
			"Communication","U1880",
			"Communication","U1890",
			"Communication","U1891",
			"Rationality","U1892",
			"Communication","U1893",
			"Communication","U1894",
			"Communication","U1895",
			"Communication","U1896",
			"Communication","U1897",
			"Communication","U1898",
			"Communication","U1899",
			"Rationality","U1900",
			"Communication","U1901",
			"Communication","U1902",
			"Rationality","U190A",
			"Rationality","U190B"
	};
}
