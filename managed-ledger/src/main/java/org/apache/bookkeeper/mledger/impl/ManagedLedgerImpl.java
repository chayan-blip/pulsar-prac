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

    public void initialize() {
    }

    protected void initializeBookKeeper() {
    }
}