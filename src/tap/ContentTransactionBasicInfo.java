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


public class ContentTransactionBasicInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 304);

	public byte[] code = null;
	public RapFileSequenceNumber rapFileSequenceNumber = null;
	public OrderPlacedTimeStamp orderPlacedTimeStamp = null;
	public RequestedDeliveryTimeStamp requestedDeliveryTimeStamp = null;
	public ActualDeliveryTimeStamp actualDeliveryTimeStamp = null;
	public TotalTransactionDuration totalTransactionDuration = null;
	public TransactionStatus transactionStatus = null;
	
	public ContentTransactionBasicInfo() {
	}

	public ContentTransactionBasicInfo(byte[] code) {
		this.code = code;
	}

	public ContentTransactionBasicInfo(RapFileSequenceNumber rapFileSequenceNumber, OrderPlacedTimeStamp orderPlacedTimeStamp, RequestedDeliveryTimeStamp requestedDeliveryTimeStamp, ActualDeliveryTimeStamp actualDeliveryTimeStamp, TotalTransactionDuration totalTransactionDuration, TransactionStatus transactionStatus) {
		this.rapFileSequenceNumber = rapFileSequenceNumber;
		this.orderPlacedTimeStamp = orderPlacedTimeStamp;
		this.requestedDeliveryTimeStamp = requestedDeliveryTimeStamp;
		this.actualDeliveryTimeStamp = actualDeliveryTimeStamp;
		this.totalTransactionDuration = totalTransactionDuration;
		this.transactionStatus = transactionStatus;
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
		if (transactionStatus != null) {
			codeLength += transactionStatus.encode(os, true);
		}
		
		if (totalTransactionDuration != null) {
			codeLength += totalTransactionDuration.encode(os, true);
		}
		
		if (actualDeliveryTimeStamp != null) {
			codeLength += actualDeliveryTimeStamp.encode(os, true);
		}
		
		if (requestedDeliveryTimeStamp != null) {
			codeLength += requestedDeliveryTimeStamp.encode(os, true);
		}
		
		if (orderPlacedTimeStamp != null) {
			codeLength += orderPlacedTimeStamp.encode(os, true);
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
			if (berTag.equals(OrderPlacedTimeStamp.tag)) {
				orderPlacedTimeStamp = new OrderPlacedTimeStamp();
				subCodeLength += orderPlacedTimeStamp.decode(is, false);
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
			if (berTag.equals(RequestedDeliveryTimeStamp.tag)) {
				requestedDeliveryTimeStamp = new RequestedDeliveryTimeStamp();
				subCodeLength += requestedDeliveryTimeStamp.decode(is, false);
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
			if (berTag.equals(ActualDeliveryTimeStamp.tag)) {
				actualDeliveryTimeStamp = new ActualDeliveryTimeStamp();
				subCodeLength += actualDeliveryTimeStamp.decode(is, false);
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
			if (berTag.equals(TotalTransactionDuration.tag)) {
				totalTransactionDuration = new TotalTransactionDuration();
				subCodeLength += totalTransactionDuration.decode(is, false);
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
			if (berTag.equals(TransactionStatus.tag)) {
				transactionStatus = new TransactionStatus();
				subCodeLength += transactionStatus.decode(is, false);
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
		
		if (berTag.equals(OrderPlacedTimeStamp.tag)) {
			orderPlacedTimeStamp = new OrderPlacedTimeStamp();
			subCodeLength += orderPlacedTimeStamp.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(RequestedDeliveryTimeStamp.tag)) {
			requestedDeliveryTimeStamp = new RequestedDeliveryTimeStamp();
			subCodeLength += requestedDeliveryTimeStamp.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ActualDeliveryTimeStamp.tag)) {
			actualDeliveryTimeStamp = new ActualDeliveryTimeStamp();
			subCodeLength += actualDeliveryTimeStamp.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TotalTransactionDuration.tag)) {
			totalTransactionDuration = new TotalTransactionDuration();
			subCodeLength += totalTransactionDuration.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TransactionStatus.tag)) {
			transactionStatus = new TransactionStatus();
			subCodeLength += transactionStatus.decode(is, false);
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
		
		if (orderPlacedTimeStamp != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("orderPlacedTimeStamp: ");
			orderPlacedTimeStamp.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (requestedDeliveryTimeStamp != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("requestedDeliveryTimeStamp: ");
			requestedDeliveryTimeStamp.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (actualDeliveryTimeStamp != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("actualDeliveryTimeStamp: ");
			actualDeliveryTimeStamp.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (totalTransactionDuration != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("totalTransactionDuration: ").append(totalTransactionDuration);
			firstSelectedElement = false;
		}
		
		if (transactionStatus != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("transactionStatus: ").append(transactionStatus);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

