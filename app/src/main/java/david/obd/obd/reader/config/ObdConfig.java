package david.obd.obd.reader.config;

import java.util.ArrayList;

import david.obd.obd.commands.ObdCommand;
import david.obd.obd.commands.SpeedCommand;
import david.obd.obd.commands.control.DistanceMILOnCommand;
import david.obd.obd.commands.control.DtcNumberCommand;
import david.obd.obd.commands.control.EquivalentRatioCommand;
import david.obd.obd.commands.control.IgnitionMonitorCommand;
import david.obd.obd.commands.control.ModuleVoltageCommand;
import david.obd.obd.commands.control.TimingAdvanceCommand;
import david.obd.obd.commands.control.TroubleCodesCommand;
import david.obd.obd.commands.control.VinCommand;
import david.obd.obd.commands.engine.AbsoluteLoadCommand;
import david.obd.obd.commands.engine.LoadCommand;
import david.obd.obd.commands.engine.MassAirFlowCommand;
import david.obd.obd.commands.engine.OilTempCommand;
import david.obd.obd.commands.engine.RPMCommand;
import david.obd.obd.commands.engine.RuntimeCommand;
import david.obd.obd.commands.engine.ThrottlePositionCommand;
import david.obd.obd.commands.fuel.AirFuelRatioCommand;
import david.obd.obd.commands.fuel.ConsumptionRateCommand;
import david.obd.obd.commands.fuel.FindFuelTypeCommand;
import david.obd.obd.commands.fuel.FuelLevelCommand;
import david.obd.obd.commands.fuel.FuelTrimCommand;
import david.obd.obd.commands.fuel.WidebandAirFuelRatioCommand;
import david.obd.obd.commands.pressure.BarometricPressureCommand;
import david.obd.obd.commands.pressure.FuelPressureCommand;
import david.obd.obd.commands.pressure.FuelRailPressureCommand;
import david.obd.obd.commands.pressure.IntakeManifoldPressureCommand;
import david.obd.obd.commands.temperature.AirIntakeTemperatureCommand;
import david.obd.obd.commands.temperature.AmbientAirTemperatureCommand;
import david.obd.obd.commands.temperature.EngineCoolantTemperatureCommand;
import david.obd.obd.enums.FuelTrim;

/**
 */
public final class ObdConfig {

    public static ArrayList<ObdCommand> getCommands() {
        ArrayList<ObdCommand> cmds = new ArrayList<>();

        // Control
        cmds.add(new ModuleVoltageCommand());
        cmds.add(new EquivalentRatioCommand());
        cmds.add(new DistanceMILOnCommand());
        cmds.add(new DtcNumberCommand());
        cmds.add(new TimingAdvanceCommand());
        cmds.add(new TroubleCodesCommand());
        cmds.add(new VinCommand());
        cmds.add(new IgnitionMonitorCommand());
        cmds.add(new TroubleCodesCommand());

        // Engine
        cmds.add(new LoadCommand());
        cmds.add(new RPMCommand());
        cmds.add(new RuntimeCommand());
        cmds.add(new MassAirFlowCommand());
        cmds.add(new ThrottlePositionCommand());
        cmds.add(new AbsoluteLoadCommand());
        cmds.add(new OilTempCommand());


        // Fuel
        cmds.add(new FindFuelTypeCommand());
        cmds.add(new ConsumptionRateCommand());
        cmds.add(new FuelLevelCommand());
        cmds.add(new FuelTrimCommand(FuelTrim.LONG_TERM_BANK_1));
        cmds.add(new FuelTrimCommand(FuelTrim.LONG_TERM_BANK_2));
        cmds.add(new FuelTrimCommand(FuelTrim.SHORT_TERM_BANK_1));
        cmds.add(new FuelTrimCommand(FuelTrim.SHORT_TERM_BANK_2));
        cmds.add(new AirFuelRatioCommand());
        cmds.add(new WidebandAirFuelRatioCommand());

        // Pressure
        cmds.add(new BarometricPressureCommand());
        cmds.add(new FuelPressureCommand());
        cmds.add(new FuelRailPressureCommand());
        cmds.add(new IntakeManifoldPressureCommand());

        // Temperature
        cmds.add(new AirIntakeTemperatureCommand());
        cmds.add(new AmbientAirTemperatureCommand());
        cmds.add(new EngineCoolantTemperatureCommand());

        // Misc
        cmds.add(new SpeedCommand());

        return cmds;
    }
}
