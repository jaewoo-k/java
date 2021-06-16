package baekjoon.forLoop;
import java.io.*;

/*
 * ���� 15552������ ���� (210610����)
 * https://www.acmicpc.net/source/29897705
 */
public class LapidSumEx1 {
	/**
	 * �Է� ��Ʈ�����κ��� �����͸� ����Ʈ ������ �о���̴� �Է� Ŭ����
	 * @author M4RO
	 */
	public static class MaroReader {
		/** �Է� ��Ʈ�� */
		private final InputStream in;
		/** �Է� ����. ��ȿ�� ���� ���� : 0x21 ~ 0x7E */
		private final byte[] buffer;
		/** �Է°��� ������ �ڿ��� �����ΰ�? (0 < N)? */
		private final boolean isNatural;
		/** �Է� ���� ũ�� */
		private final int bSize;
		/** byte[]�� str �� MAX Length */
		private final static int STR_MAX = 128;
		/**
		 * <code>strLen</code> : <code>str</code>�� ��ȿ�� ���̸� ������ ����
		 * <p><code>bufferIdx</code> : <code>buffer</code>�� �ε��� ����
		 * <p><code>readCnt</code> : <code>in.read()</code>�� ���ϰ� ���� (�о���� byte �� ����)
		 */
		private int strLen, bufferIdx, readCnt;

		/** ����Ʈ ������ */
		public MaroReader() {
			this.bSize = 8192;
			this.buffer = new byte[bSize];
			this.in = System.in;
			this.isNatural = true;
		}

		/**
		 * ����� ������ ������ ������
		 * @param sz ������ ũ��
		 * @param in ����� �Է� ��Ʈ��
		 * @param isNatural �Է°��� ������ �ڿ����� true, �ƴϸ� false.
		 */
		public MaroReader(int sz, InputStream in, boolean isNatural) {
			this.bSize = sz;
			this.buffer = new byte[sz];
			this.in = in;
			this.isNatural = isNatural;
		}

		/**
		 * ���۸� (�ٽ�) ä���. �Է� ��Ʈ���� ������ <code>readCnt</code>�� ���� -1�̶�� 0�� �ε����� -1 ����.
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 * @see java.io.InputStream#read()
		 */
		private void refill() throws IOException {
			readCnt = in.read(buffer, bufferIdx=0, bSize);
			if(readCnt == -1) buffer[0] = -1;
		}

		/**
		 * <code>bufferIdx</code>�� <code>readCnt</code>�� �ʱⰪ�̰ų�,<br>
		 * <code>bufferIdx</code>�� <code>readCnt</code>��ŭ �����Ͽ��ٸ�, ���۸� ���� ä���.
		 * @return �о���� 1����Ʈ�� ��ȯ.
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		private byte read() throws IOException {
			if(bufferIdx >= readCnt) refill();
			return buffer[bufferIdx++];
		}

		/**
		 * ���ڰ� �ƴ� ���ڰ� ���� ������ ���ݱ��� ���� ���ڸ� ���� �� ��ȯ�Ѵ�.
		 * @return ret - ������ ����
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		public int nextInt() throws IOException {
			int ret=0;
			byte b=read();
			while(b<=' ') b=read();
			if(isNatural) {
				ret=b-'0';
				while((b=read())>='0' && b<='9') ret=ret*10+b-'0';
				return ret;
			} else {
				boolean isNeg = b=='-';
				if(isNeg) b=read();
				do {
					ret=ret*10+b-'0';
				} while((b=read())>='0' && b<='9');
				return isNeg?-ret:ret;
			}
		}

		/**
		 * �о���� �����Ͱ� 0x21 ~ 0x7E ������ �ʰ��� ������ byte[]�� str �� ������ �� ��ȯ�Ѵ�.
		 * @return str - byte[]�� ���ڿ�
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		public byte[] nextString() throws IOException {
			byte[] str = new byte[STR_MAX];
			strLen = 0;
			byte b=read();
			if(b == -1) return null;
			str[strLen++]=b;
			while((b=read())>' ' && b<0x7F) str[strLen++]=b;
			return str;
		}
		public void close() throws IOException { if(in != null) in.close(); }
		public int getStrLen() { return strLen; }
	}
	/**
	 * ��� ��Ʈ������ �����͸� ����Ʈ ������ �������� ��� Ŭ����
	 * @author M4RO
	 */
	public static class MaroWriter {
		/** ��� ��Ʈ�� */
		private final OutputStream out; // ��� ��Ʈ��.
		/** byte[]�� ��¹��� */
		private final byte[] buffer;
		/** ������ ũ�� */
		private final int bSize;
		/** ������ �ε��� */
		private int bufferIdx;

		/**
		 * ����Ʈ ������
		 */
		MaroWriter() {
			this.out = System.out;
			this.bSize = 8192;
			this.buffer = new byte[bSize];
		}

		/**
		 * ����� ���� ������ ������
		 */
		MaroWriter(int sz, OutputStream out) {
			this.out = out;
			this.bSize = sz;
			this.buffer = new byte[sz];
		}

		/**
		 * ���޹��� 1 ����Ʈ�� ���ۿ� �����ϰ�, ���۰� �� ���� �Ǹ� ���۸� ����.
		 * @param b ����� 1 byte
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		public void write(byte b) throws IOException {
			if(bufferIdx == bSize) flushBuffer();
			buffer[bufferIdx++] = b;
		}

		/**
		 * ���޹��� int�� ���� i�� 1�ڸ��� ����鼭 tmp �迭�� �����ϰ�,<br>
		 * �������� write(byte b) �޼ҵ带 ȣ���Ѵ�.
		 * @param i ����� int�� ����
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		public void write(int i) throws IOException {
			byte[] tmp = new byte[11];
			int idx = 0;
			boolean isNeg = i<0;
			if(i==0) tmp[idx++] = '0';
			else while(i!=0) {
				int t=i%10;
				tmp[idx++] = (byte)('0'+(t<0?-t:t));
				i/=10;
			}
			if(isNeg) tmp[idx++] = '-';
			for(int j=idx-1; j>=0; j--) write(tmp[j]);
		}

		/**
		 * ���޹��� long�� ���� l�� 1�ڸ��� ����鼭 tmp �迭�� �����ϰ�,<br>
		 * �������� write(byte b) �޼ҵ带 ȣ���Ѵ�.
		 * @param l ����� long�� ����
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		public void write(long l) throws IOException {
			byte[] tmp = new byte[20];
			int idx = 0;
			boolean isNeg = l<0;
			if(l==0) tmp[idx++] = '0';
			else while(l!=0) {
				long t=l%10;
				tmp[idx++] = (byte)('0'+(t<0?-t:t));
				l/=10;
			}
			if(isNeg) tmp[idx++] = '-';
			for(int j=idx-1; j>=0; j--) write(tmp[j]);
		}

		/**
		 * ���޹��� byte[]�� arr�� 1�ڸ��� ����鼭 ��ȿ����(length) ��ŭ<br>
		 * write(byte b) �޼ҵ带 ȣ���Ѵ�.
		 * @param str ����� byte[]�� str
		 * @param length str�� ��ȿ����
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		public void write(byte[] str, int length) throws IOException{
			for(int i=0; i<length; i++) write(str[i]);
		}

		/**
		 * ����� ������ �ִٸ� (bufferIdx�� 0���� ũ�ٸ�) flushBuffer() ȣ�� �� out.flush() ȣ���Ѵ�.
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		public void flush() throws IOException {
			if(bufferIdx > 0) flushBuffer();
			out.flush();
		}

		/**
		 * ���ۿ� ����� ������ ��� out.write�� ���� ����ϰ�, <code>bufferIdx</code>�� 0���� �ʱ�ȭ�Ѵ�.
		 * @throws IOException I/O ������ �߻��Ѵٸ� ���� �߻�.
		 */
		private void flushBuffer() throws IOException {
			out.write(buffer, 0, bufferIdx);
			bufferIdx = 0;
		}
		/** ���๮�� ��� */
		public void newLine() throws IOException{ write((byte)'\n'); }
		public void close() throws IOException { if(out != null) out.close(); }
	}
	public static void main(String[] args) throws IOException {
		LapidSumEx1.MaroReader mr = new LapidSumEx1.MaroReader(65536, System.in, true);
		LapidSumEx1.MaroWriter mw = new LapidSumEx1.MaroWriter(65536, System.out);
		int n = mr.nextInt();
		for(int i=0; i<n; i++) {
			int a = mr.nextInt();
			int b = mr.nextInt();
			mw.write(a+b);
			mw.newLine();
		}
		mw.flush();
	}
}
