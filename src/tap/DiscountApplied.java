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


public class DiscountApplied implements Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 428);

	public FixedDiscountValue fixedDiscountValue = null;
	public DiscountRate discountRate = null;
	
	public DiscountApplied() {
	}

	public DiscountApplied(byte[] code) {
		this.code = code;
	}

	public DiscountApplied(FixedDiscountValue fixedDiscountValue, DiscountRate discountRate) {
		this.fixedDiscountValue = fixedDiscountValue;
		this.discountRate = discountRate;
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
		if (discountRate != null) {
			codeLength += discountRate.encode(os, true);
			codeLength += BerLength.encodeLength(os, codeLength);
			if (withTag) {
				codeLength += tag.encode(os);
			}
			return codeLength;
		}
		
		if (fixedDiscountValue != null) {
			codeLength += fixedDiscountValue.encode(os, true);
			codeLength += BerLength.encodeLength(os, codeLength);
			if (withTag) {
				codeLength += tag.encode(os);
			}
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
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		BerLength length = new BerLength();
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		codeLength += length.decode(is);
		codeLength += berTag.decode(is);

		if (berTag.equals(FixedDiscountValue.tag)) {
			fixedDiscountValue = new FixedDiscountValue();
			codeLength += fixedDiscountValue.decode(is, false);
			if(!withTag && endingOK(is)) {
				return codeLength+2;
			} else {
				return codeLength;
			}
		}

		if (berTag.equals(DiscountRate.tag)) {
			discountRate = new DiscountRate();
			codeLength += discountRate.decode(is, false);
			if(!withTag && endingOK(is)) {
				return codeLength+2;
			} else {
				return codeLength;
			}
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
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

		if (fixedDiscountValue != null) {
			sb.append("fixedDiscountValue: ").append(fixedDiscountValue);
			return;
		}

		if (discountRate != null) {
			sb.append("discountRate: ").append(discountRate);
			return;
		}

		sb.append("<none>");
	}

}

