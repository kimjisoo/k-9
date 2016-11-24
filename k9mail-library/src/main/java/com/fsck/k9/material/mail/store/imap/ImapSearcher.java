package com.fsck.k9.material.mail.store.imap;


import java.io.IOException;
import java.util.List;

import com.fsck.k9.material.mail.MessagingException;


interface ImapSearcher {
    List<ImapResponse> search() throws IOException, MessagingException;
}
