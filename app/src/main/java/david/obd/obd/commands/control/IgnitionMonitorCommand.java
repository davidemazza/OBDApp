package david.obd.obd.commands.control;

/**
 * Created by david on 25/03/2016.
 */

import david.obd.obd.commands.ObdCommand;
import david.obd.obd.enums.AvailableCommandNames;

public class IgnitionMonitorCommand extends ObdCommand {

    private boolean ignitionOn = false;

    /**
     * Default ctor.
     */
    public IgnitionMonitorCommand() {
        super("AT IGN");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link IgnitionMonitorCommand} object.
     */
    public IgnitionMonitorCommand(IgnitionMonitorCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        final String result = getResult();
        ignitionOn = result.equalsIgnoreCase("ON");
    }

    @Override
    public String getFormattedResult() {
        return getResult();
    }

    @Override
    public String getName() {
        return AvailableCommandNames.IGNITION_MONITOR.getValue();
    }

    @Override
    public String getCalculatedResult() {
        return getResult();
    }

    @Override
    protected void fillBuffer() {
    }

    public boolean isIgnitionOn() {
        return ignitionOn;
    }
}


