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


public class ContentServiceUsed implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 352);

	public byte[] code = null;
	public ContentTransactionCode contentTransactionCode = null;
	public ContentTransactionType contentTransactionType = null;
	public ObjectType objectType = null;
	public TransactionDescriptionSupp transactionDescriptionSupp = null;
	public TransactionShortDescription transactionShortDescription = null;
	public TransactionDetailDescription transactionDetailDescription = null;
	public TransactionIdentifier transactionIdentifier = null;
	public TransactionAuthCode transactionAuthCode = null;
	public DataVolumeIncoming dataVolumeIncoming = null;
	public DataVolumeOutgoing dataVolumeOutgoing = null;
	public TotalDataVolume totalDataVolume = null;
	public ChargeRefundIndicator chargeRefundIndicator = null;
	public ContentChargingPoint contentChargingPoint = null;
	public ChargeInformationList chargeInformationList = null;
	public AdvisedChargeInformation advisedChargeInformation = null;
	
	public ContentServiceUsed() {
	}

	public ContentServiceUsed(byte[] code) {
		this.code = code;
	}

	public ContentServiceUsed(ContentTransactionCode contentTransactionCode, ContentTransactionType contentTransactionType, ObjectType objectType, TransactionDescriptionSupp transactionDescriptionSupp, TransactionShortDescription transactionShortDescription, TransactionDetailDescription transactionDetailDescription, TransactionIdentifier transactionIdentifier, TransactionAuthCode transactionAuthCode, DataVolumeIncoming dataVolumeIncoming, DataVolumeOutgoing dataVolumeOutgoing, TotalDataVolume totalDataVolume, ChargeRefundIndicator chargeRefundIndicator, ContentChargingPoint contentChargingPoint, ChargeInformationList chargeInformationList, AdvisedChargeInformation advisedChargeInformation) {
		this.contentTransactionCode = contentTransactionCode;
		this.contentTransactionType = contentTransactionType;
		this.objectType = objectType;
		this.transactionDescriptionSupp = transactionDescriptionSupp;
		this.transactionShortDescription = transactionShortDescription;
		this.transactionDetailDescription = transactionDetailDescription;
		this.transactionIdentifier = transactionIdentifier;
		this.transactionAuthCode = transactionAuthCode;
		this.dataVolumeIncoming = dataVolumeIncoming;
		this.dataVolumeOutgoing = dataVolumeOutgoing;
		this.totalDataVolume = totalDataVolume;
		this.chargeRefundIndicator = chargeRefundIndicator;
		this.contentChargingPoint = contentChargingPoint;
		this.chargeInformationList = chargeInformationList;
		this.advisedChargeInformation = advisedChargeInformation;
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
		if (advisedChargeInformation != null) {
			codeLength += advisedChargeInformation.encode(os, true);
		}
		
		if (chargeInformationList != null) {
			codeLength += chargeInformationList.encode(os, true);
		}
		
		if (contentChargingPoint != null) {
			codeLength += contentChargingPoint.encode(os, true);
		}
		
		if (chargeRefundIndicator != null) {
			codeLength += chargeRefundIndicator.encode(os, true);
		}
		
		if (totalDataVolume != null) {
			codeLength += totalDataVolume.encode(os, true);
		}
		
		if (dataVolumeOutgoing != null) {
			codeLength += dataVolumeOutgoing.encode(os, true);
		}
		
		if (dataVolumeIncoming != null) {
			codeLength += dataVolumeIncoming.encode(os, true);
		}
		
		if (transactionAuthCode != null) {
			codeLength += transactionAuthCode.encode(os, true);
		}
		
		if (transactionIdentifier != null) {
			codeLength += transactionIdentifier.encode(os, true);
		}
		
		if (transactionDetailDescription != null) {
			codeLength += transactionDetailDescription.encode(os, true);
		}
		
		if (transactionShortDescription != null) {
			codeLength += transactionShortDescription.encode(os, true);
		}
		
		if (transactionDescriptionSupp != null) {
			codeLength += transactionDescriptionSupp.encode(os, true);
		}
		
		if (objectType != null) {
			codeLength += objectType.encode(os, true);
		}
		
		if (contentTransactionType != null) {
			codeLength += contentTransactionType.encode(os, true);
		}
		
		if (contentTransactionCode != null) {
			codeLength += contentTransactionCode.encode(os, true);
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
			if (berTag.equals(ContentTransactionCode.tag)) {
				contentTransactionCode = new ContentTransactionCode();
				subCodeLength += contentTransactionCode.decode(is, false);
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
			if (berTag.equals(ContentTransactionType.tag)) {
				contentTransactionType = new ContentTransactionType();
				subCodeLength += contentTransactionType.decode(is, false);
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
			if (berTag.equals(ObjectType.tag)) {
				objectType = new ObjectType();
				subCodeLength += objectType.decode(is, false);
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
			if (berTag.equals(TransactionDescriptionSupp.tag)) {
				transactionDescriptionSupp = new TransactionDescriptionSupp();
				subCodeLength += transactionDescriptionSupp.decode(is, false);
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
			if (berTag.equals(TransactionShortDescription.tag)) {
				transactionShortDescription = new TransactionShortDescription();
				subCodeLength += transactionShortDescription.decode(is, false);
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
			if (berTag.equals(TransactionDetailDescription.tag)) {
				transactionDetailDescription = new TransactionDetailDescription();
				subCodeLength += transactionDetailDescription.decode(is, false);
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
			if (berTag.equals(TransactionIdentifier.tag)) {
				transactionIdentifier = new TransactionIdentifier();
				subCodeLength += transactionIdentifier.decode(is, false);
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
			if (berTag.equals(TransactionAuthCode.tag)) {
				transactionAuthCode = new TransactionAuthCode();
				subCodeLength += transactionAuthCode.decode(is, false);
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
			if (berTag.equals(DataVolumeIncoming.tag)) {
				dataVolumeIncoming = new DataVolumeIncoming();
				subCodeLength += dataVolumeIncoming.decode(is, false);
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
			if (berTag.equals(DataVolumeOutgoing.tag)) {
				dataVolumeOutgoing = new DataVolumeOutgoing();
				subCodeLength += dataVolumeOutgoing.decode(is, false);
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
			if (berTag.equals(TotalDataVolume.tag)) {
				totalDataVolume = new TotalDataVolume();
				subCodeLength += totalDataVolume.decode(is, false);
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
			if (berTag.equals(ChargeRefundIndicator.tag)) {
				chargeRefundIndicator = new ChargeRefundIndicator();
				subCodeLength += chargeRefundIndicator.decode(is, false);
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
			if (berTag.equals(ContentChargingPoint.tag)) {
				contentChargingPoint = new ContentChargingPoint();
				subCodeLength += contentChargingPoint.decode(is, false);
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
			if (berTag.equals(ChargeInformationList.tag)) {
				chargeInformationList = new ChargeInformationList();
				subCodeLength += chargeInformationList.decode(is, false);
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
			if (berTag.equals(AdvisedChargeInformation.tag)) {
				advisedChargeInformation = new AdvisedChargeInformation();
				subCodeLength += advisedChargeInformation.decode(is, false);
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
		if (berTag.equals(ContentTransactionCode.tag)) {
			contentTransactionCode = new ContentTransactionCode();
			subCodeLength += contentTransactionCode.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ContentTransactionType.tag)) {
			contentTransactionType = new ContentTransactionType();
			subCodeLength += contentTransactionType.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ObjectType.tag)) {
			objectType = new ObjectType();
			subCodeLength += objectType.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TransactionDescriptionSupp.tag)) {
			transactionDescriptionSupp = new TransactionDescriptionSupp();
			subCodeLength += transactionDescriptionSupp.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TransactionShortDescription.tag)) {
			transactionShortDescription = new TransactionShortDescription();
			subCodeLength += transactionShortDescription.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TransactionDetailDescription.tag)) {
			transactionDetailDescription = new TransactionDetailDescription();
			subCodeLength += transactionDetailDescription.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TransactionIdentifier.tag)) {
			transactionIdentifier = new TransactionIdentifier();
			subCodeLength += transactionIdentifier.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TransactionAuthCode.tag)) {
			transactionAuthCode = new TransactionAuthCode();
			subCodeLength += transactionAuthCode.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(DataVolumeIncoming.tag)) {
			dataVolumeIncoming = new DataVolumeIncoming();
			subCodeLength += dataVolumeIncoming.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(DataVolumeOutgoing.tag)) {
			dataVolumeOutgoing = new DataVolumeOutgoing();
			subCodeLength += dataVolumeOutgoing.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TotalDataVolume.tag)) {
			totalDataVolume = new TotalDataVolume();
			subCodeLength += totalDataVolume.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ChargeRefundIndicator.tag)) {
			chargeRefundIndicator = new ChargeRefundIndicator();
			subCodeLength += chargeRefundIndicator.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ContentChargingPoint.tag)) {
			contentChargingPoint = new ContentChargingPoint();
			subCodeLength += contentChargingPoint.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ChargeInformationList.tag)) {
			chargeInformationList = new ChargeInformationList();
			subCodeLength += chargeInformationList.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(AdvisedChargeInformation.tag)) {
			advisedChargeInformation = new AdvisedChargeInformation();
			subCodeLength += advisedChargeInformation.decode(is, false);
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
		if (contentTransactionCode != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("contentTransactionCode: ").append(contentTransactionCode);
			firstSelectedElement = false;
		}
		
		if (contentTransactionType != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("contentTransactionType: ").append(contentTransactionType);
			firstSelectedElement = false;
		}
		
		if (objectType != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("objectType: ").append(objectType);
			firstSelectedElement = false;
		}
		
		if (transactionDescriptionSupp != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("transactionDescriptionSupp: ").append(transactionDescriptionSupp);
			firstSelectedElement = false;
		}
		
		if (transactionShortDescription != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("transactionShortDescription: ").append(transactionShortDescription);
			firstSelectedElement = false;
		}
		
		if (transactionDetailDescription != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("transactionDetailDescription: ").append(transactionDetailDescription);
			firstSelectedElement = false;
		}
		
		if (transactionIdentifier != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("transactionIdentifier: ").append(transactionIdentifier);
			firstSelectedElement = false;
		}
		
		if (transactionAuthCode != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("transactionAuthCode: ").append(transactionAuthCode);
			firstSelectedElement = false;
		}
		
		if (dataVolumeIncoming != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dataVolumeIncoming: ").append(dataVolumeIncoming);
			firstSelectedElement = false;
		}
		
		if (dataVolumeOutgoing != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dataVolumeOutgoing: ").append(dataVolumeOutgoing);
			firstSelectedElement = false;
		}
		
		if (totalDataVolume != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("totalDataVolume: ").append(totalDataVolume);
			firstSelectedElement = false;
		}
		
		if (chargeRefundIndicator != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("chargeRefundIndicator: ").append(chargeRefundIndicator);
			firstSelectedElement = false;
		}
		
		if (contentChargingPoint != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("contentChargingPoint: ").append(contentChargingPoint);
			firstSelectedElement = false;
		}
		
		if (chargeInformationList != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("chargeInformationList: ");
			chargeInformationList.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (advisedChargeInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("advisedChargeInformation: ");
			advisedChargeInformation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

