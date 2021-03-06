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


public class LocationService implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 297);

	public byte[] code = null;
	public RapFileSequenceNumber rapFileSequenceNumber = null;
	public RecEntityCode recEntityCode = null;
	public CallReference callReference = null;
	public TrackingCustomerInformation trackingCustomerInformation = null;
	public LCSSPInformation lCSSPInformation = null;
	public TrackedCustomerInformation trackedCustomerInformation = null;
	public LocationServiceUsage locationServiceUsage = null;
	public OperatorSpecInfoList operatorSpecInformation = null;
	
	public LocationService() {
	}

	public LocationService(byte[] code) {
		this.code = code;
	}

	public LocationService(RapFileSequenceNumber rapFileSequenceNumber, RecEntityCode recEntityCode, CallReference callReference, TrackingCustomerInformation trackingCustomerInformation, LCSSPInformation lCSSPInformation, TrackedCustomerInformation trackedCustomerInformation, LocationServiceUsage locationServiceUsage, OperatorSpecInfoList operatorSpecInformation) {
		this.rapFileSequenceNumber = rapFileSequenceNumber;
		this.recEntityCode = recEntityCode;
		this.callReference = callReference;
		this.trackingCustomerInformation = trackingCustomerInformation;
		this.lCSSPInformation = lCSSPInformation;
		this.trackedCustomerInformation = trackedCustomerInformation;
		this.locationServiceUsage = locationServiceUsage;
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
		
		if (locationServiceUsage != null) {
			codeLength += locationServiceUsage.encode(os, true);
		}
		
		if (trackedCustomerInformation != null) {
			codeLength += trackedCustomerInformation.encode(os, true);
		}
		
		if (lCSSPInformation != null) {
			codeLength += lCSSPInformation.encode(os, true);
		}
		
		if (trackingCustomerInformation != null) {
			codeLength += trackingCustomerInformation.encode(os, true);
		}
		
		if (callReference != null) {
			codeLength += callReference.encode(os, true);
		}
		
		if (recEntityCode != null) {
			codeLength += recEntityCode.encode(os, true);
		}
		
		if (rapFileSequenceNumber != null) {
			codeLength += rapFileSequenceNumber.encode(os, true);
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
			if (berTag.equals(RecEntityCode.tag)) {
				recEntityCode = new RecEntityCode();
				subCodeLength += recEntityCode.decode(is, false);
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
			if (berTag.equals(CallReference.tag)) {
				callReference = new CallReference();
				subCodeLength += callReference.decode(is, false);
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
			if (berTag.equals(TrackingCustomerInformation.tag)) {
				trackingCustomerInformation = new TrackingCustomerInformation();
				subCodeLength += trackingCustomerInformation.decode(is, false);
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
			if (berTag.equals(LCSSPInformation.tag)) {
				lCSSPInformation = new LCSSPInformation();
				subCodeLength += lCSSPInformation.decode(is, false);
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
			if (berTag.equals(TrackedCustomerInformation.tag)) {
				trackedCustomerInformation = new TrackedCustomerInformation();
				subCodeLength += trackedCustomerInformation.decode(is, false);
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
			if (berTag.equals(LocationServiceUsage.tag)) {
				locationServiceUsage = new LocationServiceUsage();
				subCodeLength += locationServiceUsage.decode(is, false);
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
		if (berTag.equals(RapFileSequenceNumber.tag)) {
			rapFileSequenceNumber = new RapFileSequenceNumber();
			subCodeLength += rapFileSequenceNumber.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(RecEntityCode.tag)) {
			recEntityCode = new RecEntityCode();
			subCodeLength += recEntityCode.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(CallReference.tag)) {
			callReference = new CallReference();
			subCodeLength += callReference.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TrackingCustomerInformation.tag)) {
			trackingCustomerInformation = new TrackingCustomerInformation();
			subCodeLength += trackingCustomerInformation.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(LCSSPInformation.tag)) {
			lCSSPInformation = new LCSSPInformation();
			subCodeLength += lCSSPInformation.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TrackedCustomerInformation.tag)) {
			trackedCustomerInformation = new TrackedCustomerInformation();
			subCodeLength += trackedCustomerInformation.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(LocationServiceUsage.tag)) {
			locationServiceUsage = new LocationServiceUsage();
			subCodeLength += locationServiceUsage.decode(is, false);
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
		if (rapFileSequenceNumber != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rapFileSequenceNumber: ").append(rapFileSequenceNumber);
			firstSelectedElement = false;
		}
		
		if (recEntityCode != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("recEntityCode: ").append(recEntityCode);
			firstSelectedElement = false;
		}
		
		if (callReference != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("callReference: ").append(callReference);
			firstSelectedElement = false;
		}
		
		if (trackingCustomerInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("trackingCustomerInformation: ");
			trackingCustomerInformation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (lCSSPInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lCSSPInformation: ");
			lCSSPInformation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (trackedCustomerInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("trackedCustomerInformation: ");
			trackedCustomerInformation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (locationServiceUsage != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("locationServiceUsage: ");
			locationServiceUsage.appendAsString(sb, indentLevel + 1);
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

