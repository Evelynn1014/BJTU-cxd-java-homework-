// 20301107 Liu Jiayao 2021.4.12
public class PairExtended <F, S, T> extends Pair<F, S> {

    T third;

    /** Creates a new instance of PairExtended */
    PairExtended(F f, S s, T t){
        super(f, s);
        third = t;
    }

    public T getThird(){
        return third;
    }
}