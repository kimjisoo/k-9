package com.fsck.k9.material.mailstore;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.fsck.k9.material.mail.Body;
import com.fsck.k9.material.mail.MessagingException;
import com.fsck.k9.material.mail.internet.RawDataBody;
import com.fsck.k9.material.mail.internet.SizeAware;


public class BinaryMemoryBody implements Body, RawDataBody, SizeAware {
    private final byte[] data;
    private final String encoding;

    public BinaryMemoryBody(byte[] data, String encoding) {
        this.data = data;
        this.encoding = encoding;
    }

    @Override
    public String getEncoding() {
        return encoding;
    }

    @Override
    public InputStream getInputStream() throws MessagingException {
        return new ByteArrayInputStream(data);
    }

    @Override
    public void setEncoding(String encoding) throws MessagingException {
        throw new RuntimeException("nope"); //FIXME
    }

    @Override
    public void writeTo(OutputStream out) throws IOException, MessagingException {
        out.write(data);
    }

    @Override
    public long getSize() {
        return data.length;
    }
}
