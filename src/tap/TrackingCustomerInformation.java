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


public class TrackingCustomerInformation implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 298);

	public byte[] code = null;
	public TrackingCustomerIdList trackingCustomerIdList = null;
	public TrackingCustomerHomeIdList trackingCustomerHomeIdList = null;
	public TrackingCustomerLocList trackingCustomerLocList = null;
	public TrackingCustomerEquipment trackingCustomerEquipment = null;
	
	public TrackingCustomerInformation() {
	}

	public TrackingCustomerInformation(byte[] code) {
		this.code = code;
	}

	public TrackingCustomerInformation(TrackingCustomerIdList trackingCustomerIdList, TrackingCustomerHomeIdList trackingCustomerHomeIdList, TrackingCustomerLocList trackingCustomerLocList, TrackingCustomerEquipment trackingCustomerEquipment) {
		this.trackingCustomerIdList = trackingCustomerIdList;
		this.trackingCustomerHomeIdList = trackingCustomerHomeIdList;
		this.trackingCustomerLocList = trackingCustomerLocList;
		this.trackingCustomerEquipment = trackingCustomerEquipment;
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
		if (trackingCustomerEquipment != null) {
			codeLength += trackingCustomerEquipment.encode(os, true);
		}
		
		if (trackingCustomerLocList != null) {
			codeLength += trackingCustomerLocList.encode(os, true);
		}
		
		if (trackingCustomerHomeIdList != null) {
			codeLength += trackingCustomerHomeIdList.encode(os, true);
		}
		
		if (trackingCustomerIdList != null) {
			codeLength += trackingCustomerIdList.encode(os, true);
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
			if (berTag.equals(TrackingCustomerIdList.tag)) {
				trackingCustomerIdList = new TrackingCustomerIdList();
				subCodeLength += trackingCustomerIdList.decode(is, false);
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
			if (berTag.equals(TrackingCustomerHomeIdList.tag)) {
				trackingCustomerHomeIdList = new TrackingCustomerHomeIdList();
				subCodeLength += trackingCustomerHomeIdList.decode(is, false);
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
			if (berTag.equals(TrackingCustomerLocList.tag)) {
				trackingCustomerLocList = new TrackingCustomerLocList();
				subCodeLength += trackingCustomerLocList.decode(is, false);
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
			if (berTag.equals(TrackingCustomerEquipment.tag)) {
				trackingCustomerEquipment = new TrackingCustomerEquipment();
				subCodeLength += trackingCustomerEquipment.decode(is, false);
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
		if (berTag.equals(TrackingCustomerIdList.tag)) {
			trackingCustomerIdList = new TrackingCustomerIdList();
			subCodeLength += trackingCustomerIdList.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TrackingCustomerHomeIdList.tag)) {
			trackingCustomerHomeIdList = new TrackingCustomerHomeIdList();
			subCodeLength += trackingCustomerHomeIdList.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TrackingCustomerLocList.tag)) {
			trackingCustomerLocList = new TrackingCustomerLocList();
			subCodeLength += trackingCustomerLocList.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TrackingCustomerEquipment.tag)) {
			trackingCustomerEquipment = new TrackingCustomerEquipment();
			subCodeLength += trackingCustomerEquipment.decode(is, false);
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
		if (trackingCustomerIdList != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("trackingCustomerIdList: ");
			trackingCustomerIdList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (trackingCustomerHomeIdList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("trackingCustomerHomeIdList: ");
			trackingCustomerHomeIdList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (trackingCustomerLocList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("trackingCustomerLocList: ");
			trackingCustomerLocList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (trackingCustomerEquipment != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("trackingCustomerEquipment: ");
			trackingCustomerEquipment.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
