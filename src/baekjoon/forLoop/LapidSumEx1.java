package baekjoon.forLoop;
import java.io.*;

/*
 * 백준 15552번문제 예제 (210610기준)
 * https://www.acmicpc.net/source/29897705
 */
public class LapidSumEx1 {
	/**
	 * 입력 스트림으로부터 데이터를 바이트 단위로 읽어들이는 입력 클래스
	 * @author M4RO
	 */
	public static class MaroReader {
		/** 입력 스트림 */
		private final InputStream in;
		/** 입력 버퍼. 유효한 값의 범위 : 0x21 ~ 0x7E */
		private final byte[] buffer;
		/** 입력값의 범위가 자연수 범위인가? (0 < N)? */
		private final boolean isNatural;
		/** 입력 버퍼 크기 */
		private final int bSize;
		/** byte[]형 str 의 MAX Length */
		private final static int STR_MAX = 128;
		/**
		 * <code>strLen</code> : <code>str</code>의 유효값 길이를 저장할 변수
		 * <p><code>bufferIdx</code> : <code>buffer</code>의 인덱스 변수
		 * <p><code>readCnt</code> : <code>in.read()</code>의 리턴값 저장 (읽어들인 byte 의 개수)
		 */
		private int strLen, bufferIdx, readCnt;

		/** 디폴트 생성자 */
		public MaroReader() {
			this.bSize = 8192;
			this.buffer = new byte[bSize];
			this.in = System.in;
			this.isNatural = true;
		}

		/**
		 * 사용자 지정이 가능한 생성자
		 * @param sz 버퍼의 크기
		 * @param in 사용할 입력 스트림
		 * @param isNatural 입력값의 범위가 자연수면 true, 아니면 false.
		 */
		public MaroReader(int sz, InputStream in, boolean isNatural) {
			this.bSize = sz;
			this.buffer = new byte[sz];
			this.in = in;
			this.isNatural = isNatural;
		}

		/**
		 * 버퍼를 (다시) 채운다. 입력 스트림이 끝나서 <code>readCnt</code>의 값이 -1이라면 0번 인덱스에 -1 저장.
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
		 * @see java.io.InputStream#read()
		 */
		private void refill() throws IOException {
			readCnt = in.read(buffer, bufferIdx=0, bSize);
			if(readCnt == -1) buffer[0] = -1;
		}

		/**
		 * <code>bufferIdx</code>와 <code>readCnt</code>가 초기값이거나,<br>
		 * <code>bufferIdx</code>가 <code>readCnt</code>만큼 증가하였다면, 버퍼를 새로 채운다.
		 * @return 읽어들인 1바이트를 반환.
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
		 */
		private byte read() throws IOException {
			if(bufferIdx >= readCnt) refill();
			return buffer[bufferIdx++];
		}

		/**
		 * 숫자가 아닌 문자가 나올 때까지 지금까지 나온 숫자를 더한 뒤 반환한다.
		 * @return ret - 추출한 숫자
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
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
		 * 읽어들인 데이터가 0x21 ~ 0x7E 범위를 초과할 때까지 byte[]형 str 에 저장한 뒤 반환한다.
		 * @return str - byte[]형 문자열
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
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
	 * 출력 스트림에게 데이터를 바이트 단위로 내보내는 출력 클래스
	 * @author M4RO
	 */
	public static class MaroWriter {
		/** 출력 스트림 */
		private final OutputStream out; // 출력 스트림.
		/** byte[]형 출력버퍼 */
		private final byte[] buffer;
		/** 버퍼의 크기 */
		private final int bSize;
		/** 버퍼의 인덱스 */
		private int bufferIdx;

		/**
		 * 디폴트 생성자
		 */
		MaroWriter() {
			this.out = System.out;
			this.bSize = 8192;
			this.buffer = new byte[bSize];
		}

		/**
		 * 사용자 지정 가능한 생성자
		 */
		MaroWriter(int sz, OutputStream out) {
			this.out = out;
			this.bSize = sz;
			this.buffer = new byte[sz];
		}

		/**
		 * 전달받은 1 바이트를 버퍼에 저장하고, 버퍼가 꽉 차게 되면 버퍼를 비운다.
		 * @param b 출력할 1 byte
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
		 */
		public void write(byte b) throws IOException {
			if(bufferIdx == bSize) flushBuffer();
			buffer[bufferIdx++] = b;
		}

		/**
		 * 전달받은 int형 정수 i를 1자리씩 끊어가면서 tmp 배열에 저장하고,<br>
		 * 역순으로 write(byte b) 메소드를 호출한다.
		 * @param i 출력할 int형 정수
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
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
		 * 전달받은 long형 정수 l을 1자리씩 끊어가면서 tmp 배열에 저장하고,<br>
		 * 역순으로 write(byte b) 메소드를 호출한다.
		 * @param l 출력할 long형 정수
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
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
		 * 전달받은 byte[]형 arr을 1자리씩 끊어가면서 유효길이(length) 만큼<br>
		 * write(byte b) 메소드를 호출한다.
		 * @param str 출력할 byte[]형 str
		 * @param length str의 유효길이
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
		 */
		public void write(byte[] str, int length) throws IOException{
			for(int i=0; i<length; i++) write(str[i]);
		}

		/**
		 * 출력할 내용이 있다면 (bufferIdx가 0보다 크다면) flushBuffer() 호출 후 out.flush() 호출한다.
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
		 */
		public void flush() throws IOException {
			if(bufferIdx > 0) flushBuffer();
			out.flush();
		}

		/**
		 * 버퍼에 저장된 내용을 모두 out.write를 통해 출력하고, <code>bufferIdx</code>를 0으로 초기화한다.
		 * @throws IOException I/O 에러가 발생한다면 예외 발생.
		 */
		private void flushBuffer() throws IOException {
			out.write(buffer, 0, bufferIdx);
			bufferIdx = 0;
		}
		/** 개행문자 출력 */
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
