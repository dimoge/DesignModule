import java.util.List;

/**
 * 具体的 -- 迭代器角色，仅仅是角色
 */
public class ConcreteIterator implements Iterator {
    private List list = null;
    private int index;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
