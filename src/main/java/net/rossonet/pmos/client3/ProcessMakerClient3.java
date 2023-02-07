package net.rossonet.pmos.client3;

import org.apache.axis2.AxisFault;

/**
 * documention: https://wiki.processmaker.com/3.3/ProcessMaker_WSDL_Web_Services
 * demo server: https://processi.bottegaio.net/sys/en/neoclassic/
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub;

public class ProcessMakerClient3 {

	private ProcessMakerServiceStub client = null;

	public void connect() throws ProcessMakerClient3Exception {
		if (client == null) {
			try {
				client = new ProcessMakerServiceStub();
			} catch (final AxisFault e) {
				new ProcessMakerClient3Exception(e);
			}
		} else {
			throw new ProcessMakerClient3Exception("client already connected");
		}
	}

	public void disconnect() throws ProcessMakerClient3Exception {
		if (client != null) {
			try {
				client.cleanup();
			} catch (final AxisFault e) {
				new ProcessMakerClient3Exception(e);
			}
		} else {
			throw new ProcessMakerClient3Exception("client already disconnected");
		}
	}

}
