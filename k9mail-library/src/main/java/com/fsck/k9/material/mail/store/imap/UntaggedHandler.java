package com.fsck.k9.material.mail.store.imap;

interface UntaggedHandler {
    void handleAsyncUntaggedResponse(ImapResponse response);
}
