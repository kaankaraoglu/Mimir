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


public class MobileSession implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 434);

	public byte[] code = null;
	public MobileSessionService mobileSessionService = null;
	public ChargedParty chargedParty = null;
	public RapFileSequenceNumber rapFileSequenceNumber = null;
	public SimToolkitIndicator simToolkitIndicator = null;
	public GeographicalLocation geographicalLocation = null;
	public LocationArea locationArea = null;
	public CellId cellId = null;
	public EventReference eventReference = null;
	public RecEntityCodeList recEntityCodeList = null;
	public ServiceStartTimestamp serviceStartTimestamp = null;
	public CauseForTerm causeForTerm = null;
	public TotalCallEventDuration totalCallEventDuration = null;
	public NonChargedParty nonChargedParty = null;
	public RequestedDestination requestedDestination = null;
	public SessionChargeInfoList sessionChargeInfoList = null;
	public OperatorSpecInfoList operatorSpecInformation = null;
	
	public MobileSession() {
	}

	public MobileSession(byte[] code) {
		this.code = code;
	}

	public MobileSession(MobileSessionService mobileSessionService, ChargedParty chargedParty, RapFileSequenceNumber rapFileSequenceNumber, SimToolkitIndicator simToolkitIndicator, GeographicalLocation geographicalLocation, LocationArea locationArea, CellId cellId, EventReference eventReference, RecEntityCodeList recEntityCodeList, ServiceStartTimestamp serviceStartTimestamp, CauseForTerm causeForTerm, TotalCallEventDuration totalCallEventDuration, NonChargedParty nonChargedParty, RequestedDestination requestedDestination, SessionChargeInfoList sessionChargeInfoList, OperatorSpecInfoList operatorSpecInformation) {
		this.mobileSessionService = mobileSessionService;
		this.chargedParty = chargedParty;
		this.rapFileSequenceNumber = rapFileSequenceNumber;
		this.simToolkitIndicator = simToolkitIndicator;
		this.geographicalLocation = geographicalLocation;
		this.locationArea = locationArea;
		this.cellId = cellId;
		this.eventReference = eventReference;
		this.recEntityCodeList = recEntityCodeList;
		this.serviceStartTimestamp = serviceStartTimestamp;
		this.causeForTerm = causeForTerm;
		this.totalCallEventDuration = totalCallEventDuration;
		this.nonChargedParty = nonChargedParty;
		this.requestedDestination = requestedDestination;
		this.sessionChargeInfoList = sessionChargeInfoList;
		this.operatorSpecInformation = operatorSpecInformation;
	}

	public int encode(OutputStream os) throws IOException {
		return encode(os, true);
	}

	public int encode(OutputStream os, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			if (withTag) {
				return tag.encode(os) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (operatorSpecInformation != null) {
			codeLength += operatorSpecInformation.encode(os, true);
		}
		
		if (sessionChargeInfoList != null) {
			codeLength += sessionChargeInfoList.encode(os, true);
		}
		
		if (requestedDestination != null) {
			codeLength += requestedDestination.encode(os, true);
		}
		
		if (nonChargedParty != null) {
			codeLength += nonChargedParty.encode(os, true);
		}
		
		if (totalCallEventDuration != null) {
			codeLength += totalCallEventDuration.encode(os, true);
		}
		
		if (causeForTerm != null) {
			codeLength += causeForTerm.encode(os, true);
		}
		
		if (serviceStartTimestamp != null) {
			codeLength += serviceStartTimestamp.encode(os, true);
		}
		
		if (recEntityCodeList != null) {
			codeLength += recEntityCodeList.encode(os, true);
		}
		
		if (eventReference != null) {
			codeLength += eventReference.encode(os, true);
		}
		
		if (cellId != null) {
			codeLength += cellId.encode(os, true);
		}
		
		if (locationArea != null) {
			codeLength += locationArea.encode(os, true);
		}
		
		if (geographicalLocation != null) {
			codeLength += geographicalLocation.encode(os, true);
		}
		
		if (simToolkitIndicator != null) {
			codeLength += simToolkitIndicator.encode(os, true);
		}
		
		if (rapFileSequenceNumber != null) {
			codeLength += rapFileSequenceNumber.encode(os, true);
		}
		
		if (chargedParty != null) {
			codeLength += chargedParty.encode(os, true);
		}
		
		if (mobileSessionService != null) {
			codeLength += mobileSessionService.encode(os, true);
		}
		
		codeLength += BerLength.encodeLength(os, codeLength);

		if (withTag) {
			codeLength += tag.encode(os);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		if (totalLength == -1) {
			subCodeLength += berTag.decode(is);

			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(MobileSessionService.tag)) {
				mobileSessionService = new MobileSessionService();
				subCodeLength += mobileSessionService.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(ChargedParty.tag)) {
				chargedParty = new ChargedParty();
				subCodeLength += chargedParty.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(RapFileSequenceNumber.tag)) {
				rapFileSequenceNumber = new RapFileSequenceNumber();
				subCodeLength += rapFileSequenceNumber.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(SimToolkitIndicator.tag)) {
				simToolkitIndicator = new SimToolkitIndicator();
				subCodeLength += simToolkitIndicator.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(GeographicalLocation.tag)) {
				geographicalLocation = new GeographicalLocation();
				subCodeLength += geographicalLocation.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(LocationArea.tag)) {
				locationArea = new LocationArea();
				subCodeLength += locationArea.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(CellId.tag)) {
				cellId = new CellId();
				subCodeLength += cellId.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(EventReference.tag)) {
				eventReference = new EventReference();
				subCodeLength += eventReference.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(RecEntityCodeList.tag)) {
				recEntityCodeList = new RecEntityCodeList();
				subCodeLength += recEntityCodeList.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(ServiceStartTimestamp.tag)) {
				serviceStartTimestamp = new ServiceStartTimestamp();
				subCodeLength += serviceStartTimestamp.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(CauseForTerm.tag)) {
				causeForTerm = new CauseForTerm();
				subCodeLength += causeForTerm.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(TotalCallEventDuration.tag)) {
				totalCallEventDuration = new TotalCallEventDuration();
				subCodeLength += totalCallEventDuration.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(NonChargedParty.tag)) {
				nonChargedParty = new NonChargedParty();
				subCodeLength += nonChargedParty.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(RequestedDestination.tag)) {
				requestedDestination = new RequestedDestination();
				subCodeLength += requestedDestination.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(SessionChargeInfoList.tag)) {
				sessionChargeInfoList = new SessionChargeInfoList();
				subCodeLength += sessionChargeInfoList.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(OperatorSpecInfoList.tag)) {
				operatorSpecInformation = new OperatorSpecInfoList();
				subCodeLength += operatorSpecInformation.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			int nextByte = is.read();
			if (berTag.tagNumber != 0 || berTag.tagClass != 0 || berTag.primitive != 0
			|| nextByte != 0) {
				if (nextByte == -1) {
					throw new EOFException("Unexpected end of input stream.");
				}
				throw new IOException("Decoded sequence has wrong end of contents octets");
			}
			codeLength += subCodeLength + 1;
			return codeLength;
		}

		codeLength += totalLength;

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(MobileSessionService.tag)) {
			mobileSessionService = new MobileSessionService();
			subCodeLength += mobileSessionService.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ChargedParty.tag)) {
			chargedParty = new ChargedParty();
			subCodeLength += chargedParty.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(RapFileSequenceNumber.tag)) {
			rapFileSequenceNumber = new RapFileSequenceNumber();
			subCodeLength += rapFileSequenceNumber.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(SimToolkitIndicator.tag)) {
			simToolkitIndicator = new SimToolkitIndicator();
			subCodeLength += simToolkitIndicator.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(GeographicalLocation.tag)) {
			geographicalLocation = new GeographicalLocation();
			subCodeLength += geographicalLocation.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(LocationArea.tag)) {
			locationArea = new LocationArea();
			subCodeLength += locationArea.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(CellId.tag)) {
			cellId = new CellId();
			subCodeLength += cellId.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(EventReference.tag)) {
			eventReference = new EventReference();
			subCodeLength += eventReference.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(RecEntityCodeList.tag)) {
			recEntityCodeList = new RecEntityCodeList();
			subCodeLength += recEntityCodeList.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ServiceStartTimestamp.tag)) {
			serviceStartTimestamp = new ServiceStartTimestamp();
			subCodeLength += serviceStartTimestamp.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(CauseForTerm.tag)) {
			causeForTerm = new CauseForTerm();
			subCodeLength += causeForTerm.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TotalCallEventDuration.tag)) {
			totalCallEventDuration = new TotalCallEventDuration();
			subCodeLength += totalCallEventDuration.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(NonChargedParty.tag)) {
			nonChargedParty = new NonChargedParty();
			subCodeLength += nonChargedParty.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(RequestedDestination.tag)) {
			requestedDestination = new RequestedDestination();
			subCodeLength += requestedDestination.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(SessionChargeInfoList.tag)) {
			sessionChargeInfoList = new SessionChargeInfoList();
			subCodeLength += sessionChargeInfoList.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(OperatorSpecInfoList.tag)) {
			operatorSpecInformation = new OperatorSpecInfoList();
			subCodeLength += operatorSpecInformation.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream os = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(os, false);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		boolean firstSelectedElement = true;
		if (mobileSessionService != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("mobileSessionService: ").append(mobileSessionService);
			firstSelectedElement = false;
		}
		
		if (chargedParty != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("chargedParty: ");
			chargedParty.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (rapFileSequenceNumber != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rapFileSequenceNumber: ").append(rapFileSequenceNumber);
			firstSelectedElement = false;
		}
		
		if (simToolkitIndicator != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("simToolkitIndicator: ").append(simToolkitIndicator);
			firstSelectedElement = false;
		}
		
		if (geographicalLocation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("geographicalLocation: ");
			geographicalLocation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (locationArea != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("locationArea: ").append(locationArea);
			firstSelectedElement = false;
		}
		
		if (cellId != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cellId: ").append(cellId);
			firstSelectedElement = false;
		}
		
		if (eventReference != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("eventReference: ").append(eventReference);
			firstSelectedElement = false;
		}
		
		if (recEntityCodeList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("recEntityCodeList: ");
			recEntityCodeList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (serviceStartTimestamp != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("serviceStartTimestamp: ");
			serviceStartTimestamp.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (causeForTerm != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("causeForTerm: ").append(causeForTerm);
			firstSelectedElement = false;
		}
		
		if (totalCallEventDuration != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("totalCallEventDuration: ").append(totalCallEventDuration);
			firstSelectedElement = false;
		}
		
		if (nonChargedParty != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nonChargedParty: ");
			nonChargedParty.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (requestedDestination != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("requestedDestination: ");
			requestedDestination.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (sessionChargeInfoList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sessionChargeInfoList: ");
			sessionChargeInfoList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (operatorSpecInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("operatorSpecInformation: ");
			operatorSpecInformation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

