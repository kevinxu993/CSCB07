package lab9;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E> {

  public UnfairWaitList() {
    super();
  }

  public void remove(E element) {
    content.remove(element);
  }

  public void moveToBack(E element) {
    E e = element;
    if (content.remove(element) == true) {
      content.add(e);
    }
  }

}
