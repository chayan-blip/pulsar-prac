package org.apache.bookkeeper.mledger;

public interface ManagerLedger {
    String getName();

    Position addEntry(int [] byte) throws InterruptedException;
    
    ManagedCursor openCursor(String name, InitialPosition initialPosition) throws InterruptedException;

    void DeleteCursor(String name) throws InterruptedException;

    void removeWaitingCursor(ManagedCursor cursor) throws InterruptedException;

    Iterable<ManagedCursor> getCursors();

    Iterable<ManagedCursor> getActiveCursors();
}
