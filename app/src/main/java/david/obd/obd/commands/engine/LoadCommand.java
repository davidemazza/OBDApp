package david.obd.obd.commands.engine;

import david.obd.obd.commands.PercentageObdCommand;
import david.obd.obd.enums.AvailableCommandNames;

public class LoadCommand extends PercentageObdCommand {

    /**
     * <p>Constructor for LoadCommand.</p>
     */
    public LoadCommand() {
        super("01 04");
    }

    /**
     * <p>Constructor for LoadCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.engine.LoadCommand} object.
     */
    public LoadCommand(LoadCommand other) {
        super(other);
    }

    /*
     * (non-Javadoc)
     *
     * @see pt.lighthouselabs.obd.commands.ObdCommand#getName()
     */
    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.ENGINE_LOAD.getValue();
    }

}
