package lab9;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
  private int capacity;

  public BoundedWaitList(int capacity) {
    super();
    this.capacity = capacity;

  }

  public int getCapacity() {
    return capacity;

  }

  public void add(E element) {
    if (content.size() < capacity) {
      super.add(element);
    }
  }

  @Override
  public String toString() {
    return "BoundedWaitList:" + content + ". Capacity " + capacity;
  }
}
