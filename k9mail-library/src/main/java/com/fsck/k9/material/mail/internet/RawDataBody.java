package com.fsck.k9.material.mail.internet;


import com.fsck.k9.material.mail.Body;


/**
 * See {@link MimeUtility#decodeBody(Body)}
 */
public interface RawDataBody extends Body {
    String getEncoding();
}
