package org.apache.bookkeeper.mledger.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger; 
import org.apache.bookkeeper.mledger.ManagerLedger;

public class ManagedLedgerImpl implements ManagedLedger {


    // this is the central repository of ledgers being managed
    protected MetaStore centralRecordStore;
    protected final NavigableMap<Long, LedgerInfo> ledgers = ConcurrentSkipListMap<>();
    protected List<ManagedCursor> waitingManagedCursors;
    protected List<ManagedCursor> 
    public ManagedLedgerImpl() {
    }

    // TODO: do it later...
    public void initialize() {
    }

    // Start the Bookkeeper store unless it exists
    protected void initializeBookKeeper() {
        // Calculate the total size of the ledgers
        List<Long> emptyLedgersToBeDeleted = Collections.synchronizedList(new ArrayList<>());

        Iterator<LedgerInfo> iterator = ledgers.values().iterator();
        int TotalLedgerSize = 0;
        while(iterator.hasNext()) {
            LedgerInfo li = iterator.next();
            TotalLedgerSize += li.getSize();
            if (li.getNumberOfEntries() == 0) {
                emptyLedgersToBeDeleted.add(li.getLedgerId());
                iterator.remove();
            }

        }
    }
}