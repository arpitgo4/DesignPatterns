package iteratorPattern;

/**
 * Created by arpit on 12/2/16.
 */

/**
 * Iterator pattern is very commonly used design pattern in Java and .Net programming
 * environment. This pattern is used to get a way to access the elements of a collection
 * object in sequential manner without any need to know its underlying representation.
 *
 * Iterator pattern falls under behavioral pattern category.
 */

public class Main {

    public static void main(String[] args){
        NameRepository<String> repository = new NameRepository<>();
        repository.add("Arpit");
        repository.add("Parth");
        MyIterator myIterator = repository.getIterator();
        while(myIterator.hasNext())
            System.out.println(myIterator.next());
    }

}
