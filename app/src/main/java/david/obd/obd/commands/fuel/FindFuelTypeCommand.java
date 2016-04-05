package  david.obd.obd.commands.fuel;

import david.obd.obd.commands.ObdCommand;
import david.obd.obd.enums.AvailableCommandNames;
import david.obd.obd.enums.FuelType;


public class FindFuelTypeCommand extends ObdCommand {

    private int fuelType = 0;

    /**
     * Default ctor.
     */
    public FindFuelTypeCommand() {
        super("01 51");
    }

    /**
     * Copy ctor
     *
     * @param other a {@link com.github.pires.obd.commands.fuel.FindFuelTypeCommand} object.
     */
    public FindFuelTypeCommand(FindFuelTypeCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        fuelType = buffer.get(2);
    }

    /** {@inheritDoc} */
    @Override
    public String getFormattedResult() {
        try {
            return FuelType.fromValue(fuelType).getDescription();
        } catch (NullPointerException e) {
            return "-";
        }
    }

    /** {@inheritDoc} */
    @Override
    public String getCalculatedResult() {
        return String.valueOf(fuelType);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.FUEL_TYPE.getValue();
    }

}
