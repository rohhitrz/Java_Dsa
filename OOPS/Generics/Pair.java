package OOPS.Generics;
Generics are used when we dont want to tell the data type.
public class Pair<T> {
    private T first;
    private T second;

    Pair(T first, T second){
        this.first=first;
        this.second=second;
    }

    public T getFirst(){
        return first;
    }

    public  void setFirst(T first){
        this.first=first;
    }
    public void setSecond(T second){
        this.second=second;
    }

    public T getSecond(){
        return  second;
    }
}
