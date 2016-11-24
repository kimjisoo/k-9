package com.fsck.k9.material.mailstore;

import com.fsck.k9.material.mail.Message;

public interface MessageRemovalListener {
    public void messageRemoved(Message message);
}
