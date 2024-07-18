package org.apache.bookkeeper.mledger.impl;

import org.apache.bookkeeper.mledger.ManagerLedger;

public class ManagedLedgerImpl implements ManagedLedger {

    enum State {
        None,
        LedgerOpened,
        ClosingLedger, // Closing Current Ledger
        ClosedLedger,  // Current ledger has been closed and there's no pending 
                       // operation
        CreatingLedger, // Creating a new Ledger
        Closed, // ManagedLedger has been closed
        Fenced, // A managed ledger is fenced when there is some concurrent
                // access from a different session/machine. In this state the 
                // managed ledger will throw an exception for all operations, since
                // the new instance will take over
    }

    protected final BookKeeper bookKeeper;
    public ManagedLedgerImpl() {
    }

    public void initialize() {
    }

    protected void initializeBookKeeper() {
    }
}