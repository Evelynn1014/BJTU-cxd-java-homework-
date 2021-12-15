//20301107 Liu jiayao 2020.4.14
public class Adler32 implements Checksum {

    private int value = 1;

    /*
     * BASE is the largest prime number smaller than 65536
     * NMAX is the largest n such that 255n(n+1)/2 + (n+1)(BASE-1) <= 2^32-1
     */
    private static final int BASE = 65521;
    private static final int NMAX = 5552;

    /**
     * Update current Adler-32 checksum given the specified byte.
     */
    public void update(int b) {
        int s1 = value & 0xffff;
        int s2 = (value >> 16) & 0xffff;
        s1 += b & 0xff;
        s2 += s1;
        value = ((s2 % BASE) << 16) | (s1 % BASE);
    }

    /**
     * Update current Adler-32 checksum given the specified byte array.
     */
    public void update(byte[] b, int off, int len) {
        int s1 = value & 0xffff;
        int s2 = (value >> 16) & 0xffff;

        while (len > 0) {
            int k = len < NMAX ? len : NMAX;
            len -= k;
            while (k-- > 0) {
                s1 += b[off++] & 0xff;
                s2 += s1;
            }
            s1 %= BASE;
            s2 %= BASE;
        }
        value = (s2 << 16) | s1;
    }

    /**
     * Reset Adler-32 checksum to initial value.
     */
    public void reset() {
        value = 1;
    }

    /**
     * Returns current checksum value.
     */
    public long getValue() {
        return (long)value & 0xffffffff;
    }
}