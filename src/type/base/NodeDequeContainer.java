package type.base;

import java.util.Deque;

public interface NodeDequeContainer<E extends Node> {
    void addFirst(E node);
    E getFirst();
    Deque<E> getContainer();
}
