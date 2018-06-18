package ${package};

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.musala.atmosphere.client.Builder;
import com.musala.atmosphere.client.Device;
import com.musala.atmosphere.client.Screen;
import com.musala.atmosphere.client.util.Server;
import com.musala.atmosphere.commons.cs.deviceselection.DeviceSelector;
import com.musala.atmosphere.commons.cs.deviceselection.DeviceSelectorBuilder;
import com.musala.atmosphere.commons.cs.deviceselection.DeviceType;
import com.musala.atmosphere.commons.exceptions.DeviceNotFoundException;

/*
 * The @Server annotation is used to annotate the user's test class with the IP and port for connection with the server,
 * and retry limit to connect. Don't change the annotation variables if you are running a local server with the default
 * configuration.
 * If you decided to omit the @Server annotation then the config.propertioes settings(in the current project's directory)
 * will be used for the server connection.
 */
@Server(ip = "localhost", port = 8025, connectionRetryLimit = 0)
public class AtmosphereSampleTest {
    // replace with the package name of your test application
    private static final String PACKAGE_NAME = "com.android.vending";

    private static final int MIN_API = 19;

    private static Builder testBuilder;

    private static Device testDevice;

    // holds a device screen information
    private static Screen testScreen;

    @BeforeClass
    public static void setUp() {
        testBuilder = Builder.getInstance();
        DeviceSelectorBuilder selectorBuilder = new DeviceSelectorBuilder();
        DeviceSelector deviceSelector = selectorBuilder.deviceType(DeviceType.DEVICE_PREFERRED).minApi(MIN_API).build();

        testDevice = testBuilder.getDevice(deviceSelector);

        testScreen = testDevice.getActiveScreen();
    }

    @Test
    public void sampleTest() {
        // starts an application by a package name
        testDevice.startApplication(PACKAGE_NAME);

        //
        // You can write your test code here
        // Usage documentation: https://github.com/MusalaSoft/atmosphere-docs/tree/master/usage
        //
    }

    @AfterClass
    public static void after() throws DeviceNotFoundException {
        testDevice.forceStopProcess(PACKAGE_NAME);
        testBuilder.releaseDevice(testDevice);
    }

}