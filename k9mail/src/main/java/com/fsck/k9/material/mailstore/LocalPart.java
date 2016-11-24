package com.fsck.k9.material.mailstore;


public interface LocalPart {
    String getAccountUuid();
    long getId();
    long getSize();
    LocalMessage getMessage();
}
