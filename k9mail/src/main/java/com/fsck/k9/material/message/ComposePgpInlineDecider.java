package com.fsck.k9.material.message;


import java.util.List;

import com.fsck.k9.material.crypto.MessageDecryptVerifier;
import com.fsck.k9.material.mail.Message;
import com.fsck.k9.material.mail.Part;


public class ComposePgpInlineDecider {
    public boolean shouldReplyInline(Message localMessage) {
        // TODO more criteria for this? maybe check the User-Agent header?
        return messageHasPgpInlineParts(localMessage);
    }

    private boolean messageHasPgpInlineParts(Message localMessage) {
        List<Part> inlineParts = MessageDecryptVerifier.findPgpInlineParts(localMessage);
        return !inlineParts.isEmpty();
    }
}
