// 20301107 Liu Jiayao 2021.4.12
public class PairExtendedAgain <F, S, T, F1> extends PairExtended<F, S, T>{
    //Create PairExtendedAgain(F, S, T, F1) generic class by extending PairExtended(F, S, T)
    F1 fourth;
    PairExtendedAgain(F f, S s, T t, F1 f1){
        super(f,s,t);
        fourth = f1;
    }

    public F1 getFourth(){
        return fourth;
    }
}
