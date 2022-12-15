package demo_reskill;

public interface AbstractCommonMethod<T> {

    T generateRandom();

    void doSomething(T param);

    void saveToDb(T t);
}
