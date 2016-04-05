package  david.obd.obd.commands.fuel;

import david.obd.obd.commands.PercentageObdCommand;
import david.obd.obd.enums.AvailableCommandNames;


public class FuelLevelCommand extends PercentageObdCommand {

    /**
     * <p>Constructor for FuelLevelCommand.</p>
     */
    public FuelLevelCommand() {
        super("01 2F");
    }

    /** {@inheritDoc} */
    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        percentage = 100.0f * buffer.get(2) / 255.0f;
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.FUEL_LEVEL.getValue();
    }

    /**
     * <p>getFuelLevel.</p>
     *
     * @return a float.
     */
    public float getFuelLevel() {
        return percentage;
    }

}
