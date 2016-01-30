package dk.cphbusiness.ja.generics.v3;

import java.util.Collections;
import java.util.Iterator;

public interface Path<T> extends Iterable<T> {
  static final Path EMPTY = new Empty();
  T getFirst();
  Path<T> getRest();
  boolean isEmpty();
  
  class Empty implements Path {

    @Override
    public Object getFirst() {
      throw new UnsupportedOperationException("Empty path has no first");
      }

    @Override
    public Path getRest() {
      throw new UnsupportedOperationException("Empty path has no rest");
      }

    @Override
    public boolean isEmpty() { return true; }
    
    @Override
    public Iterator iterator() { 
      return Collections.emptyIterator();
      }

    }
  
  }
