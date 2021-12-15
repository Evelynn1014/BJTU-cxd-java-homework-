//20301107 Liu jiayao 2020.4.14

import java.io.*;
//Write ChangeToUpperCaseOutputStream class, which extends FilterWriter or FilterOutputStream.
public class ChangeToUpperCaseOutputStream extends FilterOutputStream {
    private Checksum cksum;

    public ChangeToUpperCaseOutputStream(OutputStream out, Checksum cksum) {
        super(out);
        this.cksum = cksum;
    }

    public void write(int b) throws IOException {
        out.write(b);
        cksum.update(b);
    }

    public void write(byte[] b) throws IOException {
        out.write(b, 0, b.length);
        cksum.update(b, 0, b.length);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        out.write(b, off, len);
        cksum.update(b, off, len);
    }

    public Checksum getChecksum() {
        return cksum;
    }
}
