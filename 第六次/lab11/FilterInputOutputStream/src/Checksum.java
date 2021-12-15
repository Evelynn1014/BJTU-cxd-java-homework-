//20301107 Liu jiayao 2020.4.14
public interface Checksum {
    /**
     * Updates the current checksum with the specified byte.
     */
    public void update(int b);

    /**
     * Updates the current checksum with the specified array of bytes.
     */
    public void update(byte[] b, int off, int len);

    /**
     * Returns the current checksum value.
     */
    public long getValue();

    /**
     * Resets the checksum to its initial value.
     */
    public void reset();
}