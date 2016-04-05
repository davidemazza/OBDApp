package david.obd.obd.reader.io;

public interface ObdProgressListener {

    void stateUpdate(final ObdCommandJob job);

}