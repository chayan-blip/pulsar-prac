package org.apache.bookkeeper.mledger.impl;

import org.apache.bookkeeper.mledger.ManagerLedger;

public class ManagedLedgerImpl implements ManagedLedger {

    enum State {
        Open,
        Closed,
        Fenced
    }

    protected final BookKeeper bookKeeper;
    public ManagedLedgerImpl() {
    }

    // TODO: do it later...
    public void initialize() {
    }

    protected void initializeBookKeeper() {
    }
}