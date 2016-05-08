package iteratorPattern;

import java.util.Vector;

/**
 * Created by arpit on 12/2/16.
 */
public class NameRepository<T> implements Container {

    private MyIterator myIterator;
    private Vector<T> names;
    private int index;

    void add(T name){
        names.add(name);
    }

    public NameRepository() {
        index = 0;
        this.names = new Vector<>();
        myIterator = new MyIterator() {
            @Override
            public boolean hasNext() {
                return (index < names.size());
            }

            @Override
            public T next() {
                return names.get(index++);
            }
        };
    }

    @Override
    public MyIterator getIterator() {
        return myIterator;
    }
}
