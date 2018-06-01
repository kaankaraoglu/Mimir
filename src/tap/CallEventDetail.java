/**
 * This class file was automatically generated by jASN1 v1.9.0 (http://www.openmuc.org)
 */

package tap;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class CallEventDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public MobileOriginatedCall mobileOriginatedCall = null;
	public MobileTerminatedCall mobileTerminatedCall = null;
	public SupplServiceEvent supplServiceEvent = null;
	public ServiceCentreUsage serviceCentreUsage = null;
	public GprsCall gprsCall = null;
	public ContentTransaction contentTransaction = null;
	public LocationService locationService = null;
	public MessagingEvent messagingEvent = null;
	public MobileSession mobileSession = null;
	
	public CallEventDetail() {
	}

	public CallEventDetail(byte[] code) {
		this.code = code;
	}

	public CallEventDetail(MobileOriginatedCall mobileOriginatedCall, MobileTerminatedCall mobileTerminatedCall, SupplServiceEvent supplServiceEvent, ServiceCentreUsage serviceCentreUsage, GprsCall gprsCall, ContentTransaction contentTransaction, LocationService locationService, MessagingEvent messagingEvent, MobileSession mobileSession) {
		this.mobileOriginatedCall = mobileOriginatedCall;
		this.mobileTerminatedCall = mobileTerminatedCall;
		this.supplServiceEvent = supplServiceEvent;
		this.serviceCentreUsage = serviceCentreUsage;
		this.gprsCall = gprsCall;
		this.contentTransaction = contentTransaction;
		this.locationService = locationService;
		this.messagingEvent = messagingEvent;
		this.mobileSession = mobileSession;
	}

	public int encode(OutputStream os) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (mobileSession != null) {
			codeLength += mobileSession.encode(os, true);
			return codeLength;
		}
		
		if (messagingEvent != null) {
			codeLength += messagingEvent.encode(os, true);
			return codeLength;
		}
		
		if (locationService != null) {
			codeLength += locationService.encode(os, true);
			return codeLength;
		}
		
		if (contentTransaction != null) {
			codeLength += contentTransaction.encode(os, true);
			return codeLength;
		}
		
		if (gprsCall != null) {
			codeLength += gprsCall.encode(os, true);
			return codeLength;
		}
		
		if (serviceCentreUsage != null) {
			codeLength += serviceCentreUsage.encode(os, true);
			return codeLength;
		}
		
		if (supplServiceEvent != null) {
			codeLength += supplServiceEvent.encode(os, true);
			return codeLength;
		}
		
		if (mobileTerminatedCall != null) {
			codeLength += mobileTerminatedCall.encode(os, true);
			return codeLength;
		}
		
		if (mobileOriginatedCall != null) {
			codeLength += mobileOriginatedCall.encode(os, true);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	private boolean endingOK(InputStream is) {
		int next = -1;
		int nextnext = -1;
		try {
			is.mark(1000);
			next = is.read();
			nextnext = is.read();
			if(next == nextnext && next == 0) {
				return true;
			}
			is.reset();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(MobileOriginatedCall.tag)) {
			mobileOriginatedCall = new MobileOriginatedCall();
			codeLength += mobileOriginatedCall.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(MobileTerminatedCall.tag)) {
			mobileTerminatedCall = new MobileTerminatedCall();
			codeLength += mobileTerminatedCall.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(SupplServiceEvent.tag)) {
			supplServiceEvent = new SupplServiceEvent();
			codeLength += supplServiceEvent.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(ServiceCentreUsage.tag)) {
			serviceCentreUsage = new ServiceCentreUsage();
			codeLength += serviceCentreUsage.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(GprsCall.tag)) {
			gprsCall = new GprsCall();
			codeLength += gprsCall.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(ContentTransaction.tag)) {
			contentTransaction = new ContentTransaction();
			codeLength += contentTransaction.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(LocationService.tag)) {
			locationService = new LocationService();
			codeLength += locationService.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(MessagingEvent.tag)) {
			messagingEvent = new MessagingEvent();
			codeLength += messagingEvent.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(MobileSession.tag)) {
			mobileSession = new MobileSession();
			codeLength += mobileSession.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream os = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(os);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (mobileOriginatedCall != null) {
			sb.append("mobileOriginatedCall: ");
			mobileOriginatedCall.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (mobileTerminatedCall != null) {
			sb.append("mobileTerminatedCall: ");
			mobileTerminatedCall.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (supplServiceEvent != null) {
			sb.append("supplServiceEvent: ");
			supplServiceEvent.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (serviceCentreUsage != null) {
			sb.append("serviceCentreUsage: ");
			serviceCentreUsage.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (gprsCall != null) {
			sb.append("gprsCall: ");
			gprsCall.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (contentTransaction != null) {
			sb.append("contentTransaction: ");
			contentTransaction.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (locationService != null) {
			sb.append("locationService: ");
			locationService.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (messagingEvent != null) {
			sb.append("messagingEvent: ");
			messagingEvent.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (mobileSession != null) {
			sb.append("mobileSession: ");
			mobileSession.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

