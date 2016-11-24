package com.fsck.k9.material.mailstore.migrations;


import java.util.List;

import android.content.Context;

import com.fsck.k9.material.Account;
import com.fsck.k9.material.mail.Flag;
import com.fsck.k9.material.mailstore.LocalStore;
import com.fsck.k9.material.preferences.Storage;


/**
 * Helper to allow accessing classes and methods that aren't visible or accessible to the 'migrations' package
 */
public interface MigrationsHelper {
    LocalStore getLocalStore();
    Storage getStorage();
    Account getAccount();
    Context getContext();
    String serializeFlags(List<Flag> flags);
}
