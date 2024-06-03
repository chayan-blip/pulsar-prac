package org.apache.bookkeeper.mledger.impl;

import java.util.logging.Logger; 
import org.apache.bookkeeper.mledger.ManagerLedger;

public class ManagedLedgerImpl implements ManagedLedger {


    // this is the central repository of ledgers being managed
    protected MetaStore centralRecordStore;
    protected List<ManagedCursor> waitingManagedCursors;
    protected List<ManagedCursor> 
    public ManagedLedgerImpl() {
    }

    // TODO: do it later.... stub
    public void initialize() {
    }

    // Start the Bookkeeper store unless it exists
    public void initializeBookKeeper() {
        
    }
}