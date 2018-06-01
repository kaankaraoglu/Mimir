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


public class CamelServiceUsed implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 57);

	public byte[] code = null;
	public CamelServiceLevel camelServiceLevel = null;
	public CamelServiceKey camelServiceKey = null;
	public DefaultCallHandlingIndicator defaultCallHandling = null;
	public ExchangeRateCode exchangeRateCode = null;
	public TaxInformationList taxInformation = null;
	public DiscountInformation discountInformation = null;
	public CamelInvocationFee camelInvocationFee = null;
	public ThreeGcamelDestination threeGcamelDestination = null;
	public CseInformation cseInformation = null;
	
	public CamelServiceUsed() {
	}

	public CamelServiceUsed(byte[] code) {
		this.code = code;
	}

	public CamelServiceUsed(CamelServiceLevel camelServiceLevel, CamelServiceKey camelServiceKey, DefaultCallHandlingIndicator defaultCallHandling, ExchangeRateCode exchangeRateCode, TaxInformationList taxInformation, DiscountInformation discountInformation, CamelInvocationFee camelInvocationFee, ThreeGcamelDestination threeGcamelDestination, CseInformation cseInformation) {
		this.camelServiceLevel = camelServiceLevel;
		this.camelServiceKey = camelServiceKey;
		this.defaultCallHandling = defaultCallHandling;
		this.exchangeRateCode = exchangeRateCode;
		this.taxInformation = taxInformation;
		this.discountInformation = discountInformation;
		this.camelInvocationFee = camelInvocationFee;
		this.threeGcamelDestination = threeGcamelDestination;
		this.cseInformation = cseInformation;
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
		if (cseInformation != null) {
			codeLength += cseInformation.encode(os, true);
		}
		
		if (threeGcamelDestination != null) {
			codeLength += threeGcamelDestination.encode(os, true);
		}
		
		if (camelInvocationFee != null) {
			codeLength += camelInvocationFee.encode(os, true);
		}
		
		if (discountInformation != null) {
			codeLength += discountInformation.encode(os, true);
		}
		
		if (taxInformation != null) {
			codeLength += taxInformation.encode(os, true);
		}
		
		if (exchangeRateCode != null) {
			codeLength += exchangeRateCode.encode(os, true);
		}
		
		if (defaultCallHandling != null) {
			codeLength += defaultCallHandling.encode(os, true);
		}
		
		if (camelServiceKey != null) {
			codeLength += camelServiceKey.encode(os, true);
		}
		
		if (camelServiceLevel != null) {
			codeLength += camelServiceLevel.encode(os, true);
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
			if (berTag.equals(CamelServiceLevel.tag)) {
				camelServiceLevel = new CamelServiceLevel();
				subCodeLength += camelServiceLevel.decode(is, false);
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
			if (berTag.equals(CamelServiceKey.tag)) {
				camelServiceKey = new CamelServiceKey();
				subCodeLength += camelServiceKey.decode(is, false);
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
			if (berTag.equals(DefaultCallHandlingIndicator.tag)) {
				defaultCallHandling = new DefaultCallHandlingIndicator();
				subCodeLength += defaultCallHandling.decode(is, false);
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
			if (berTag.equals(ExchangeRateCode.tag)) {
				exchangeRateCode = new ExchangeRateCode();
				subCodeLength += exchangeRateCode.decode(is, false);
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
			if (berTag.equals(TaxInformationList.tag)) {
				taxInformation = new TaxInformationList();
				subCodeLength += taxInformation.decode(is, false);
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
			if (berTag.equals(DiscountInformation.tag)) {
				discountInformation = new DiscountInformation();
				subCodeLength += discountInformation.decode(is, false);
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
			if (berTag.equals(CamelInvocationFee.tag)) {
				camelInvocationFee = new CamelInvocationFee();
				subCodeLength += camelInvocationFee.decode(is, false);
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
			if (berTag.equals(ThreeGcamelDestination.tag)) {
				threeGcamelDestination = new ThreeGcamelDestination();
				subCodeLength += threeGcamelDestination.decode(is, false);
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
			if (berTag.equals(CseInformation.tag)) {
				cseInformation = new CseInformation();
				subCodeLength += cseInformation.decode(is, false);
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
		if (berTag.equals(CamelServiceLevel.tag)) {
			camelServiceLevel = new CamelServiceLevel();
			subCodeLength += camelServiceLevel.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(CamelServiceKey.tag)) {
			camelServiceKey = new CamelServiceKey();
			subCodeLength += camelServiceKey.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(DefaultCallHandlingIndicator.tag)) {
			defaultCallHandling = new DefaultCallHandlingIndicator();
			subCodeLength += defaultCallHandling.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ExchangeRateCode.tag)) {
			exchangeRateCode = new ExchangeRateCode();
			subCodeLength += exchangeRateCode.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(TaxInformationList.tag)) {
			taxInformation = new TaxInformationList();
			subCodeLength += taxInformation.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(DiscountInformation.tag)) {
			discountInformation = new DiscountInformation();
			subCodeLength += discountInformation.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(CamelInvocationFee.tag)) {
			camelInvocationFee = new CamelInvocationFee();
			subCodeLength += camelInvocationFee.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(ThreeGcamelDestination.tag)) {
			threeGcamelDestination = new ThreeGcamelDestination();
			subCodeLength += threeGcamelDestination.decode(is, false);
			if (subCodeLength == totalLength+2) { subCodeLength-=2; is.reset(); }
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(CseInformation.tag)) {
			cseInformation = new CseInformation();
			subCodeLength += cseInformation.decode(is, false);
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
		if (camelServiceLevel != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("camelServiceLevel: ").append(camelServiceLevel);
			firstSelectedElement = false;
		}
		
		if (camelServiceKey != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("camelServiceKey: ").append(camelServiceKey);
			firstSelectedElement = false;
		}
		
		if (defaultCallHandling != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("defaultCallHandling: ").append(defaultCallHandling);
			firstSelectedElement = false;
		}
		
		if (exchangeRateCode != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("exchangeRateCode: ").append(exchangeRateCode);
			firstSelectedElement = false;
		}
		
		if (taxInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("taxInformation: ");
			taxInformation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (discountInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("discountInformation: ");
			discountInformation.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (camelInvocationFee != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("camelInvocationFee: ").append(camelInvocationFee);
			firstSelectedElement = false;
		}
		
		if (threeGcamelDestination != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("threeGcamelDestination: ");
			threeGcamelDestination.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (cseInformation != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cseInformation: ").append(cseInformation);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

